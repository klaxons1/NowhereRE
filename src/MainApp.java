import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class MainApp extends MIDlet {
   public MainApp() {
      if (Class_1d4.var_5e == null) {
         Class_1d4.var_5e = new Class_1d4(this);
         Class_1d4.sub_36();
         Class_1d4.var_9d = null;
      }

   }

   public void startApp() {
      if (Class_1d4.var_9d == null) {
         Class_1d4.var_9d = Display.getDisplay(this);
         Class_1d4.var_9d.setCurrent(Class_1d4.var_5e);
      }

      Class_1d4.var_5e.showNotify();
   }

   public void destroyApp(boolean var1) {
      Class_1d4.sub_b3();
   }

   public void pauseApp() {
      Class_1d4.var_5e.hideNotify();
   }
}
