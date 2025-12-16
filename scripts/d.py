import tkinter as tk
from tkinter import ttk, filedialog, messagebox
from PIL import Image, ImageTk
import io
import struct
import os


class ResourceFile:
    """Парсер и редактор формата ресурсов из Java ME игры"""
    
    def __init__(self):
        self.header = b'\x00\x00\x00\x00'  # 4 байта заголовка
        self.resources = []  # Список байтовых данных ресурсов
        self.filepath = None
    
    def load(self, filepath):
        """Загрузить файл ресурсов"""
        with open(filepath, 'rb') as f:
            data = f.read()
        
        self.filepath = filepath
        self.resources = []
        
        # Читаем заголовок (4 байта)
        self.header = data[0:4]
        pos = 4
        
        # Читаем количество ресурсов (4 байта, Little-Endian)
        count = struct.unpack('<I', data[pos:pos+4])[0]
        pos += 4
        
        # Читаем таблицу смещений (count + 1 записей)
        num_offsets = count + 1
        offsets = []
        for i in range(num_offsets):
            offset = struct.unpack('<I', data[pos:pos+4])[0]
            offsets.append(offset)
            pos += 4
        
        # Извлекаем ресурсы
        base_offset = offsets[0]
        for i in range(count):
            start = offsets[i]
            
            # Определяем конец ресурса
            # Если следующее смещение = 0, берём смещение через одно
            if i + 1 < len(offsets) and offsets[i + 1] != 0:
                end = offsets[i + 1]
            elif i + 2 < len(offsets):
                end = offsets[i + 2]
            else:
                end = start
            
            size = end - start
            if size > 0:
                res_data = data[pos + (start - base_offset):pos + (end - base_offset)]
                self.resources.append(res_data)
            else:
                self.resources.append(b'')
        
        return len(self.resources)
    
    def save(self, filepath):
        """Сохранить файл ресурсов"""
        output = io.BytesIO()
        
        # Записываем заголовок
        output.write(self.header)
        
        # Записываем количество ресурсов
        count = len(self.resources)
        output.write(struct.pack('<I', count))
        
        # Вычисляем смещения
        # Начало данных = заголовок(4) + count(4) + таблица смещений((count+1)*4)
        data_start = 4 + 4 + (count + 1) * 4
        
        offsets = []
        current_offset = data_start
        for res in self.resources:
            offsets.append(current_offset)
            current_offset += len(res)
        offsets.append(current_offset)  # Конечное смещение
        
        # Записываем таблицу смещений
        for offset in offsets:
            output.write(struct.pack('<I', offset))
        
        # Записываем данные ресурсов
        for res in self.resources:
            output.write(res)
        
        # Сохраняем в файл
        with open(filepath, 'wb') as f:
            f.write(output.getvalue())
        
        self.filepath = filepath
    
    def get_resource(self, index):
        """Получить ресурс по индексу"""
        if 0 <= index < len(self.resources):
            return self.resources[index]
        return None
    
    def set_resource(self, index, data):
        """Установить данные ресурса"""
        if 0 <= index < len(self.resources):
            self.resources[index] = data
    
    def add_resource(self, data=b''):
        """Добавить новый ресурс"""
        self.resources.append(data)
        return len(self.resources) - 1
    
    def delete_resource(self, index):
        """Удалить ресурс"""
        if 0 <= index < len(self.resources):
            del self.resources[index]
    
    def get_resource_type(self, index):
        """Определить тип ресурса по сигнатуре"""
        data = self.get_resource(index)
        if not data or len(data) < 8:
            return "empty" if not data else "unknown"
        
        # PNG signature
        if data[:8] == b'\x89PNG\r\n\x1a\n':
            return "png"
        # JPEG
        if data[:2] == b'\xff\xd8':
            return "jpeg"
        # MIDI
        if data[:4] == b'MThd':
            return "midi"
        # Проверяем на внутренний формат с изображениями
        if len(data) > 16:
            # Пробуем распарсить как контейнер изображений
            try:
                img_count = struct.unpack('<I', data[0:4])[0]
                if 0 < img_count < 100:  # Разумное количество
                    return "image_pack"
            except:
                pass
        
        return "binary"


class ResourceEditorApp:
    def __init__(self, root):
        self.root = root
        self.root.title("J2ME Resource Editor - /d file")
        self.root.geometry("1000x700")
        
        self.resource_file = ResourceFile()
        self.current_index = -1
        self.preview_image = None
        
        self.setup_ui()
        self.setup_menu()
    
    def setup_menu(self):
        menubar = tk.Menu(self.root)
        self.root.config(menu=menubar)
        
        file_menu = tk.Menu(menubar, tearoff=0)
        menubar.add_cascade(label="Файл", menu=file_menu)
        file_menu.add_command(label="Открыть...", command=self.open_file, accelerator="Ctrl+O")
        file_menu.add_command(label="Сохранить", command=self.save_file, accelerator="Ctrl+S")
        file_menu.add_command(label="Сохранить как...", command=self.save_file_as)
        file_menu.add_separator()
        file_menu.add_command(label="Выход", command=self.root.quit)
        
        edit_menu = tk.Menu(menubar, tearoff=0)
        menubar.add_cascade(label="Редактирование", menu=edit_menu)
        edit_menu.add_command(label="Добавить ресурс", command=self.add_resource)
        edit_menu.add_command(label="Удалить ресурс", command=self.delete_resource)
        
        self.root.bind('<Control-o>', lambda e: self.open_file())
        self.root.bind('<Control-s>', lambda e: self.save_file())
    
    def setup_ui(self):
        # Главный контейнер
        main_paned = ttk.PanedWindow(self.root, orient=tk.HORIZONTAL)
        main_paned.pack(fill=tk.BOTH, expand=True, padx=5, pady=5)
        
        # Левая панель - список ресурсов
        left_frame = ttk.Frame(main_paned)
        main_paned.add(left_frame, weight=1)
        
        # Заголовок списка
        ttk.Label(left_frame, text="Ресурсы:", font=('Arial', 10, 'bold')).pack(anchor=tk.W)
        
        # Список с прокруткой
        list_frame = ttk.Frame(left_frame)
        list_frame.pack(fill=tk.BOTH, expand=True, pady=5)
        
        scrollbar = ttk.Scrollbar(list_frame)
        scrollbar.pack(side=tk.RIGHT, fill=tk.Y)
        
        self.resource_list = tk.Listbox(list_frame, yscrollcommand=scrollbar.set, 
                                         font=('Consolas', 10), selectmode=tk.SINGLE)
        self.resource_list.pack(side=tk.LEFT, fill=tk.BOTH, expand=True)
        scrollbar.config(command=self.resource_list.yview)
        
        self.resource_list.bind('<<ListboxSelect>>', self.on_select_resource)
        
        # Кнопки под списком
        btn_frame = ttk.Frame(left_frame)
        btn_frame.pack(fill=tk.X, pady=5)
        
        ttk.Button(btn_frame, text="Экспорт", command=self.export_resource).pack(side=tk.LEFT, padx=2)
        ttk.Button(btn_frame, text="Импорт", command=self.import_resource).pack(side=tk.LEFT, padx=2)
        ttk.Button(btn_frame, text="Экспорт всех", command=self.export_all).pack(side=tk.LEFT, padx=2)
        
        # Правая панель - просмотр
        right_frame = ttk.Frame(main_paned)
        main_paned.add(right_frame, weight=2)
        
        # Информация о ресурсе
        info_frame = ttk.LabelFrame(right_frame, text="Информация")
        info_frame.pack(fill=tk.X, pady=5)
        
        self.info_text = tk.Text(info_frame, height=4, font=('Consolas', 9))
        self.info_text.pack(fill=tk.X, padx=5, pady=5)
        
        # Предпросмотр изображения
        preview_frame = ttk.LabelFrame(right_frame, text="Предпросмотр")
        preview_frame.pack(fill=tk.BOTH, expand=True, pady=5)
        
        # Канвас с прокруткой
        canvas_frame = ttk.Frame(preview_frame)
        canvas_frame.pack(fill=tk.BOTH, expand=True)
        
        self.preview_canvas = tk.Canvas(canvas_frame, bg='#2d2d2d')
        self.preview_canvas.pack(side=tk.LEFT, fill=tk.BOTH, expand=True)
        
        v_scroll = ttk.Scrollbar(canvas_frame, orient=tk.VERTICAL, command=self.preview_canvas.yview)
        v_scroll.pack(side=tk.RIGHT, fill=tk.Y)
        
        h_scroll = ttk.Scrollbar(preview_frame, orient=tk.HORIZONTAL, command=self.preview_canvas.xview)
        h_scroll.pack(fill=tk.X)
        
        self.preview_canvas.configure(xscrollcommand=h_scroll.set, yscrollcommand=v_scroll.set)
        
        # Hex-просмотр
        hex_frame = ttk.LabelFrame(right_frame, text="Hex-данные (первые 256 байт)")
        hex_frame.pack(fill=tk.X, pady=5)
        
        self.hex_text = tk.Text(hex_frame, height=8, font=('Consolas', 9), wrap=tk.NONE)
        self.hex_text.pack(fill=tk.X, padx=5, pady=5)
        
        hex_scroll = ttk.Scrollbar(hex_frame, orient=tk.HORIZONTAL, command=self.hex_text.xview)
        hex_scroll.pack(fill=tk.X)
        self.hex_text.config(xscrollcommand=hex_scroll.set)
        
        # Статусбар
        self.status_var = tk.StringVar(value="Откройте файл ресурсов...")
        status_bar = ttk.Label(self.root, textvariable=self.status_var, relief=tk.SUNKEN)
        status_bar.pack(fill=tk.X, side=tk.BOTTOM)
    
    def open_file(self):
        filepath = filedialog.askopenfilename(
            title="Открыть файл ресурсов",
            filetypes=[("Все файлы", "*.*"), ("Data file", "*.d")]
        )
        if filepath:
            try:
                count = self.resource_file.load(filepath)
                self.update_resource_list()
                self.status_var.set(f"Загружено: {filepath} ({count} ресурсов)")
                self.root.title(f"J2ME Resource Editor - {os.path.basename(filepath)}")
            except Exception as e:
                messagebox.showerror("Ошибка", f"Не удалось открыть файл:\n{e}")
    
    def save_file(self):
        if self.resource_file.filepath:
            try:
                self.resource_file.save(self.resource_file.filepath)
                self.status_var.set(f"Сохранено: {self.resource_file.filepath}")
                messagebox.showinfo("Успех", "Файл успешно сохранён!")
            except Exception as e:
                messagebox.showerror("Ошибка", f"Не удалось сохранить файл:\n{e}")
        else:
            self.save_file_as()
    
    def save_file_as(self):
        filepath = filedialog.asksaveasfilename(
            title="Сохранить как",
            defaultextension="",
            filetypes=[("Все файлы", "*.*"), ("Data file", "*.d")]
        )
        if filepath:
            try:
                self.resource_file.save(filepath)
                self.status_var.set(f"Сохранено: {filepath}")
                self.root.title(f"J2ME Resource Editor - {os.path.basename(filepath)}")
                messagebox.showinfo("Успех", "Файл успешно сохранён!")
            except Exception as e:
                messagebox.showerror("Ошибка", f"Не удалось сохранить файл:\n{e}")
    
    def update_resource_list(self):
        self.resource_list.delete(0, tk.END)
        for i, res in enumerate(self.resource_file.resources):
            res_type = self.resource_file.get_resource_type(i)
            size = len(res)
            self.resource_list.insert(tk.END, f"[{i:03d}] {res_type:12s} {size:>8} bytes")
    
    def on_select_resource(self, event):
        selection = self.resource_list.curselection()
        if not selection:
            return
        
        index = selection[0]
        self.current_index = index
        self.show_resource(index)
    
    def show_resource(self, index):
        data = self.resource_file.get_resource(index)
        res_type = self.resource_file.get_resource_type(index)
        
        # Обновляем информацию
        self.info_text.delete(1.0, tk.END)
        info = f"Индекс: {index}\n"
        info += f"Размер: {len(data)} байт\n"
        info += f"Тип: {res_type}\n"
        if data:
            info += f"Сигнатура: {data[:16].hex(' ')}"
        self.info_text.insert(1.0, info)
        
        # Обновляем hex
        self.hex_text.delete(1.0, tk.END)
        hex_view = self.format_hex(data[:256])
        self.hex_text.insert(1.0, hex_view)
        
        # Обновляем предпросмотр
        self.preview_canvas.delete("all")
        self.preview_image = None
        
        if res_type in ("png", "jpeg"):
            self.show_image_preview(data)
        elif res_type == "image_pack":
            self.show_image_pack_preview(data)
    
    def show_image_preview(self, data):
        try:
            img = Image.open(io.BytesIO(data))
            
            # Масштабируем если слишком большое
            max_size = 500
            if img.width > max_size or img.height > max_size:
                ratio = min(max_size / img.width, max_size / img.height)
                new_size = (int(img.width * ratio), int(img.height * ratio))
                img_display = img.resize(new_size, Image.NEAREST)
            else:
                # Увеличиваем маленькие изображения для лучшей видимости
                if img.width < 100 and img.height < 100:
                    scale = max(2, min(8, 200 // max(img.width, img.height)))
                    new_size = (img.width * scale, img.height * scale)
                    img_display = img.resize(new_size, Image.NEAREST)
                else:
                    img_display = img
            
            self.preview_image = ImageTk.PhotoImage(img_display)
            self.preview_canvas.create_image(10, 10, anchor=tk.NW, image=self.preview_image)
            self.preview_canvas.create_text(10, img_display.height + 20, anchor=tk.NW,
                                           text=f"Оригинал: {img.width}x{img.height}, Режим: {img.mode}",
                                           fill='white')
            self.preview_canvas.config(scrollregion=(0, 0, img_display.width + 20, img_display.height + 50))
        except Exception as e:
            self.preview_canvas.create_text(10, 10, anchor=tk.NW, 
                                           text=f"Ошибка загрузки изображения:\n{e}",
                                           fill='red')
    
    def show_image_pack_preview(self, data):
        """Показать пакет изображений (внутренний формат)"""
        try:
            # Парсим внутренний формат
            pos = 0
            img_count = struct.unpack('<I', data[pos:pos+4])[0]
            pos += 4
            
            # Читаем смещения
            offsets = []
            for i in range(img_count + 2):
                offset = struct.unpack('<I', data[pos:pos+4])[0]
                offsets.append(offset)
                pos += 4
            
            # Пытаемся найти и показать изображения
            y_offset = 10
            images = []
            
            bitmask = offsets[0]
            base = offsets[1]
            
            for i in range(img_count):
                start = offsets[i + 1] - base + pos
                end = offsets[i + 2] - base + pos
                
                if start < len(data) and end <= len(data) and end > start:
                    img_data = data[start:end]
                    if img_data[:8] == b'\x89PNG\r\n\x1a\n':
                        img = Image.open(io.BytesIO(img_data))
                        
                        scale = max(1, min(4, 100 // max(img.width, img.height, 1)))
                        img_display = img.resize((img.width * scale, img.height * scale), Image.NEAREST)
                        
                        photo = ImageTk.PhotoImage(img_display)
                        images.append(photo)
                        
                        self.preview_canvas.create_image(10, y_offset, anchor=tk.NW, image=photo)
                        self.preview_canvas.create_text(img_display.width + 20, y_offset, anchor=tk.NW,
                                                       text=f"Frame {i}: {img.width}x{img.height}",
                                                       fill='white')
                        y_offset += img_display.height + 10
            
            self.preview_image = images  # Сохраняем ссылки
            self.preview_canvas.config(scrollregion=(0, 0, 400, y_offset + 20))
            
        except Exception as e:
            self.preview_canvas.create_text(10, 10, anchor=tk.NW,
                                           text=f"Ошибка парсинга пакета:\n{e}",
                                           fill='orange')
    
    def format_hex(self, data):
        """Форматировать данные в hex-вид"""
        lines = []
        for i in range(0, len(data), 16):
            chunk = data[i:i+16]
            hex_part = ' '.join(f'{b:02X}' for b in chunk)
            ascii_part = ''.join(chr(b) if 32 <= b < 127 else '.' for b in chunk)
            lines.append(f'{i:08X}  {hex_part:<48}  {ascii_part}')
        return '\n'.join(lines)
    
    def export_resource(self):
        if self.current_index < 0:
            messagebox.showwarning("Внимание", "Выберите ресурс для экспорта")
            return
        
        data = self.resource_file.get_resource(self.current_index)
        res_type = self.resource_file.get_resource_type(self.current_index)
        
        # Определяем расширение
        ext_map = {"png": ".png", "jpeg": ".jpg", "midi": ".mid", "image_pack": ".dat"}
        ext = ext_map.get(res_type, ".bin")
        
        filepath = filedialog.asksaveasfilename(
            title="Экспорт ресурса",
            defaultextension=ext,
            initialfile=f"resource_{self.current_index:03d}{ext}",
            filetypes=[("Все файлы", "*.*")]
        )
        if filepath:
            with open(filepath, 'wb') as f:
                f.write(data)
            self.status_var.set(f"Экспортировано: {filepath}")
    
    def export_all(self):
        """Экспортировать все ресурсы"""
        if not self.resource_file.resources:
            messagebox.showwarning("Внимание", "Нет ресурсов для экспорта")
            return
        
        folder = filedialog.askdirectory(title="Выберите папку для экспорта")
        if folder:
            ext_map = {"png": ".png", "jpeg": ".jpg", "midi": ".mid", "image_pack": ".dat"}
            
            for i, data in enumerate(self.resource_file.resources):
                res_type = self.resource_file.get_resource_type(i)
                ext = ext_map.get(res_type, ".bin")
                filepath = os.path.join(folder, f"resource_{i:03d}{ext}")
                
                with open(filepath, 'wb') as f:
                    f.write(data)
            
            self.status_var.set(f"Экспортировано {len(self.resource_file.resources)} ресурсов в {folder}")
            messagebox.showinfo("Успех", f"Экспортировано {len(self.resource_file.resources)} ресурсов")
    
    def import_resource(self):
        if self.current_index < 0:
            messagebox.showwarning("Внимание", "Выберите ресурс для замены")
            return
        
        filepath = filedialog.askopenfilename(
            title="Импорт ресурса",
            filetypes=[("Изображения", "*.png *.jpg *.jpeg"), ("Все файлы", "*.*")]
        )
        if filepath:
            with open(filepath, 'rb') as f:
                data = f.read()
            
            old_size = len(self.resource_file.get_resource(self.current_index))
            self.resource_file.set_resource(self.current_index, data)
            self.update_resource_list()
            self.resource_list.selection_set(self.current_index)
            self.show_resource(self.current_index)
            self.status_var.set(f"Импортировано: {filepath} ({old_size} -> {len(data)} байт)")
    
    def add_resource(self):
        filepath = filedialog.askopenfilename(
            title="Добавить ресурс",
            filetypes=[("Все файлы", "*.*")]
        )
        if filepath:
            with open(filepath, 'rb') as f:
                data = f.read()
            
            index = self.resource_file.add_resource(data)
            self.update_resource_list()
            self.resource_list.selection_set(index)
            self.status_var.set(f"Добавлен ресурс {index}")
    
    def delete_resource(self):
        if self.current_index < 0:
            messagebox.showwarning("Внимание", "Выберите ресурс для удаления")
            return
        
        if messagebox.askyesno("Подтверждение", f"Удалить ресурс {self.current_index}?"):
            self.resource_file.delete_resource(self.current_index)
            self.update_resource_list()
            self.current_index = -1
            self.preview_canvas.delete("all")
            self.status_var.set("Ресурс удалён")


def main():
    root = tk.Tk()
    app = ResourceEditorApp(root)
    root.mainloop()


if __name__ == "__main__":
    main()