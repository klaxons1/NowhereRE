import com.nokia.mid.ui.DeviceControl;
import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

final class GameEngine {
   private static int[] var_13 = null;
   private static byte[] var_70 = null;
   private static int[] var_98;
   protected static Player var_dc = null;
   protected static boolean var_126 = true;
   protected static boolean var_18a = false;
   protected static PlayerListener var_1b9 = null;
   protected static int var_1e0;
   protected static int var_209;
   protected static DirectGraphics var_224;
   private static Class_de var_236 = null;
   private static DirectGraphics var_294 = null;
   private static Class_de var_2d6 = null;
   private static Graphics var_314 = null;
   private static int var_35e;
   private static int var_396;
   private static int[] var_3f3 = null;
   protected static Random var_44f = null;
   protected static int var_46b;
   protected static byte[] var_493;
   public static boolean var_4c1;

   private static boolean loadResourceFile(MIDlet var0) {
      if (var_70 == null) {
         DataInputStream var1 = new DataInputStream(var0.getClass().getResourceAsStream("/d"));

         try {
            var1.readByte();
            var1.readByte();
            var1.readByte();
            var1.readByte();
            boolean var2 = false;
            int var6 = (var1.readByte() & 255) + ((var1.readByte() & 255) << 8) + ((var1.readByte() & 255) << 16) + ((var1.readByte() & 255) << 24);
            ++var6;
            var_13 = new int[var6];

            for(var6 = 0; var6 < var_13.length; ++var6) {
               var_13[var6] = (var1.readByte() & 255) + ((var1.readByte() & 255) << 8) + ((var1.readByte() & 255) << 16) + ((var1.readByte() & 255) << 24);
            }

            var_70 = new byte[var_13[var6 - 1] - var_13[0]];
            int var3 = 0;
            boolean var4 = false;

            int var7;
            do {
               var7 = var1.read(var_70, var3, var_70.length - var3);
               var3 += var7;
            } while(var7 != -1 && var3 < var_70.length);
         } catch (IOException var5) {
         }

         sub_bdf();
      }

      return true;
   }

   private static void unloadResources() {
      var_13 = null;
      var_70 = null;
   }

   public static Class_de sub_b1(int var0) {
      Object[] var2 = sub_1de(var0);
      Class_de var1 = new Class_de(var2.length);

      for(int var4 = 0; var4 < var2.length; ++var4) {
         if (var2[var4] != null) {
            byte[] var3 = (byte[])var2[var4];
            sub_7ce(var1, var4, Image.createImage(var3, 0, var3.length));
         }
      }

      var1.var_3b = var0;
      return var1;
   }

   public static BinaryReader sub_bc(int var0) {
      return new BinaryReader(sub_237(var0), var0);
   }

   public static int sub_109(BinaryReader var0) {
      return sub_1ff(var0.resourceId);
   }

   public static int sub_156(BinaryReader var0) {
      return (var0.buffer[var0.position++] & 255) + ((var0.buffer[var0.position++] & 255) << 8) + ((var0.buffer[var0.position++] & 255) << 16) + ((var0.buffer[var0.position++] & 255) << 24);
   }

   public static byte[] sub_1a1(BinaryReader var0, int var1) {
      Object var2 = null;
      byte[] var3 = new byte[var1];
      System.arraycopy(var0.buffer, var0.position, var3, 0, var3.length);
      var0.position += var1;
      return var3;
   }

   private static Object[] sub_1de(int var0) {
      byte[] var2 = sub_237(var0);
      byte var5 = 0;
      int var10 = var5 + 1;
      int var10000 = var2[0] & 255;
      ++var10;
      var10000 += (var2[1] & 255) << 8;
      ++var10;
      var10000 += (var2[2] & 255) << 16;
      ++var10;
      int var6 = var10000 + ((var2[3] & 255) << 24);
      int[] var4 = new int[2 + var6];

      int var7;
      for(var7 = 0; var7 < var4.length; ++var7) {
         var4[var7] = var2[var10++] & 255;
         var4[var7] += (var2[var10++] & 255) << 8;
         var4[var7] += (var2[var10++] & 255) << 16;
         var4[var7] += (var2[var10++] & 255) << 24;
      }

      int var8 = var4[0];
      Object[] var1 = new Object[var6 > 1 ? 4 : 1];
      var7 = 0;

      for(int var9 = 0; var7 < var6; ++var7) {
         byte[] var3 = new byte[var4[var7 + 2] - var4[var7 + 1]];
         System.arraycopy(var2, var10, var3, 0, var3.length);

         for(var10 += var3.length; (var8 & 1) == 0; var8 >>= 1) {
            ++var9;
         }

         var1[var9++] = var3;
         var8 >>= 1;
      }

      return var1;
   }

   private static int sub_1ff(int var0) {
      int[] var10000;
      int var10001;
      byte var10002;
      if (var_13[var0 + 1] == 0) {
         var10000 = var_13;
         var10001 = var0;
         var10002 = 2;
      } else {
         var10000 = var_13;
         var10001 = var0;
         var10002 = 1;
      }

      return var10000[var10001 + var10002] - var_13[var0];
   }

   private static byte[] sub_237(int var0) {
      byte[] var1 = new byte[sub_1ff(var0)];
      System.arraycopy(var_70, var_13[var0] - var_13[0], var1, 0, var1.length);
      return var1;
   }

   protected static byte[] sub_28f(int var0) {
      int var2 = var_13[var0] - var_13[0];
      int var3 = (var_70[var2++] & 255) + ((var_70[var2++] & 255) << 8) + ((var_70[var2++] & 255) << 16) + ((var_70[var2++] & 255) << 24);
      var2 += (1 + var3 + 1) * 4;
      var2 += 33;
      byte[] var4 = new byte[((var_70[var2] & 255) << 24) + ((var_70[var2 + 1] & 255) << 16) + ((var_70[var2 + 2] & 255) << 8) + (var_70[var2 + 3] & 255)];
      System.arraycopy(var_70, var2 + 8, var4, 0, var4.length);
      return var4;
   }

   public static Object sub_2ae(MIDlet var0, String var1, int var2) {
      try {
         InputStream var3 = var0.getClass().getResourceAsStream(var1);
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();

         int var5;
         while((var5 = var3.read()) != -1) {
            var4.write(var5);
         }

         var3.close();
         var4.close();
         byte[] var6 = var4.toByteArray();
         return var2 == 2 ? (Object)sub_885(var6, 0, var6.length) : (Object)var6;
      } catch (IOException var7) {
         return null;
      }
   }

   private static void sub_2f2() {
      var_98 = new int[256];

      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = var0;

         for(int var2 = 8; var2 > 0; --var2) {
            var1 = (var1 & 1) == 1 ? var1 >>> 1 ^ -306674912 : var1 >>> 1;
         }

         var_98[var0] = var1;
      }

   }

   private static int sub_30e(byte[] var0, int var1, int var2) {
      int var10000 = -1;

      while(true) {
         int var3 = var10000;
         if (var2-- == 0) {
            return ~var3;
         }

         int var4 = var3 >>> 8;
         int var5 = var_98[(var3 ^ var0[var1++]) & 255];
         var10000 = var4 ^ var5;
      }
   }

   public static boolean sub_31a() {
      return var_126;
   }

   public static boolean sub_37d() {
      return sub_38b(!var_126);
   }

   public static synchronized boolean sub_38b(boolean var0) {
      try {
         if (var0) {
            var_126 = true;
            if (!var_18a) {
               sub_41e();
            } else if (var_dc != null) {
               var_dc.stop();
            }
         } else {
            var_126 = false;
            if (var_18a) {
               var_dc.prefetch();
               var_dc.setLoopCount(-1);
               ((VolumeControl)var_dc.getControl("VolumeControl")).setLevel(50);
               var_dc.start();
            }
         }
      } catch (Exception var2) {
      }

      return var_126;
   }

   public static synchronized void sub_3e6(MIDlet var0, String var1) {
      try {
         if (!var_126 && (var_dc == null || var_dc.getState() == 0 || var_dc.getState() == 300)) {
            sub_41e();
            var_dc = Manager.createPlayer(var0.getClass().getResourceAsStream(var1), "audio/midi");
            if (var_1b9 != null) {
               var_dc.addPlayerListener(var_1b9);
            }

            var_dc.prefetch();
            Player var10000;
            byte var10001;
            if (var_18a) {
               var10000 = var_dc;
               var10001 = -1;
            } else {
               var10000 = var_dc;
               var10001 = 1;
            }

            var10000.setLoopCount(var10001);
            ((VolumeControl)var_dc.getControl("VolumeControl")).setLevel(50);
            var_dc.start();
         }

      } catch (Exception var3) {
      }
   }

   public static synchronized void sub_41e() {
      if (var_dc != null) {
         try {
            var_dc.stop();
         } catch (Exception var3) {
         }

         try {
            var_dc.deallocate();
         } catch (Exception var2) {
         }

         try {
            var_dc.close();
         } catch (Exception var1) {
         }

         try {
            if (var_1b9 != null) {
               var_dc.removePlayerListener(var_1b9);
            }
         } catch (Exception var0) {
         }

         var_dc = null;
      }

   }

   public static void sub_45f(MIDlet var0, int var1, int var2, int var3, int var4, int var5) {
      if (loadResourceFile(var0)) {
         var_44f = new Random();
         sub_2f2();
         var_1e0 = var1;
         var_209 = var2;
         sub_5db(var3, var4);
      }
   }

   public static void sub_4a7() {
      sub_41e();
      var_44f = null;
      var_493 = null;
      var_98 = null;
      sub_63c();
      unloadResources();
   }

   public static void sub_506(byte[] var0) {
      try {
         RecordStore var1;
         if ((var1 = RecordStore.openRecordStore("savNW", true)).getNumRecords() == 0) {
            var1.addRecord(var0, 0, var0.length);
         }

         byte[] var2 = var1.getRecord(1);
         var1.closeRecordStore();
         System.arraycopy(var2, 0, var0, 0, var0.length);
         sub_bdf();
      } catch (Exception var3) {
      }
   }

   public static void sub_52a(byte[] var0) {
      try {
         RecordStore var1;
         if ((var1 = RecordStore.openRecordStore("savNW", true)).getNumRecords() == 0) {
            var1.addRecord(var0, 0, var0.length);
         } else {
            var1.setRecord(1, var0, 0, var0.length);
         }

         var1.closeRecordStore();
         sub_bdf();
      } catch (Exception var2) {
      }
   }

   public static void sub_550() {
      try {
         DeviceControl.startVibra(100, 1000L);
      } catch (IllegalStateException var0) {
      }
   }

   public static void sub_58f(Graphics var0, Class_de var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var0.getClipX();
      int var11 = var0.getClipY();
      int var12 = var0.getClipWidth();
      int var13 = var0.getClipHeight();
      var0.clipRect(var2, var3, var7, var8);
      if (var9 == 0) {
         var0.drawImage(var1.var_8a[0], var2 - var5, var3 - var6, 20);
      } else {
         int var14 = var5;
         int var15 = var6;
         int var17 = 0;
         if ((var9 & 2) != 0) {
            var17 = 8192;
            var14 = var1.var_8a[0].getWidth() - (var5 + var7);
         }

         if ((var9 & 1) != 0) {
            var17 |= 16384;
            var15 = var1.var_8a[0].getHeight() - (var6 + var8);
         }

         var_224.drawImage(var1.var_8a[0], var2 - var14, var3 - var15, var4, var17);
      }

      var0.setClip(var10, var11, var12, var13);
   }

   private static void sub_5b1(DirectGraphics var0, Class_de var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2;
      int var8 = var3;
      int var10 = 0;
      if ((var6 & 2) != 0) {
         var10 = 8192;
         var7 = var1.var_8a[0].getWidth() - (var2 + var4);
      }

      if ((var6 & 1) != 0) {
         var10 |= 16384;
         var8 = var1.var_8a[0].getHeight() - (var3 + var5);
      }

      var0.drawImage(var1.var_8a[0], -var7, -var8, 20, var10);
   }

   private static void sub_5db(int var0, int var1) {
      if (var_2d6 == null) {
         var_236 = sub_852(var0, var1);
         var_294 = DirectUtils.getDirectGraphics(var_236.var_8a[0].getGraphics());
         var_35e = (var_1e0 / var0 + 2 + (var_1e0 % var0 > 0 ? 1 : 0)) * var0;
         var_396 = (var_209 / var1 + 2 + (var_209 % var1 > 0 ? 1 : 0)) * var1;
         var_2d6 = sub_852(var_35e, var_396);
         var_314 = var_2d6.var_8a[0].getGraphics();
      }

   }

   private static void sub_63c() {
      sub_828(var_2d6);
      var_2d6 = null;
      sub_828(var_236);
      var_236 = null;
      var_294 = null;
   }

   public static void sub_687(Class_64 var0) {
      var0.var_2f3 = null;
      var0.var_344 = null;
      var0.var_2d1 = null;
   }

   public static void sub_69e(Class_64 var0, int var1, int var2, int var3, int var4, boolean var5) {
      var0.var_2f3[var2 * var0.var_344[0] + var1] = (short)((var4 & 255) << 8 | var3 & 255);
      if (var5 && var3 != 0) {
         int var8 = var_2d6.var_8a[0].getWidth();
         int var9 = var_2d6.var_8a[0].getHeight();
         int var10 = var0.var_344[2];
         int var11 = var0.var_344[3];
         var1 *= var10;
         var2 *= var11;
         int var12 = var0.var_344[4] / var10 * var10;
         int var13 = var0.var_344[5] / var11 * var11;
         int var6 = (var0.var_64 + (var1 - var12) + var8) % var8;
         int var7 = (var0.var_77 + (var2 - var13) + var9) % var9;
         sub_7b1(var0, var6, var7, var3 & 255, (var3 & '\uff00') >> 8);
      }
   }

   public static void sub_6b1(Class_64 var0, int var1, int var2, int var3, int var4) {
      if (var3 > var_1e0) {
         var3 = var_1e0;
      }

      if (var4 > var_209) {
         var4 = var_209;
      }

      if (var0.var_344[10] != Integer.MAX_VALUE) {
         var0.var_344[10] = var0.var_344[4];
         var0.var_344[11] = var0.var_344[5];
      }

      var0.var_344[4] = var1;
      var0.var_344[5] = var2;
      var0.var_344[6] = var3;
      var0.var_344[7] = var4;
      sub_74c(var0);
   }

   public static void sub_6d7(Class_64 var0, Graphics var1, int var2, int var3) {
      if (var0.var_344[4] + var0.var_344[6] > 0 && var0.var_344[4] < var0.var_344[8] && var0.var_344[5] + var0.var_344[7] > 0 && var0.var_344[5] < var0.var_344[9]) {
         if (var0.var_344[4] < 0) {
            var2 -= var0.var_344[4];
         }

         if (var0.var_344[5] < 0) {
            var3 -= var0.var_344[5];
         }

         if (var0.var_bc > 0 && var0.var_e2 > 0) {
            sub_58f(var1, var_2d6, var2, var3, 20, var0.var_64, var0.var_77, var0.var_bc, var0.var_e2, 0);
         }

         if (var0.var_bc > 0 && var0.var_14f > 0) {
            sub_58f(var1, var_2d6, var2, var3 + var0.var_e2, 20, var0.var_64, 0, var0.var_bc, var0.var_14f, 0);
         }

         if (var0.var_121 > 0 && var0.var_14f > 0) {
            sub_58f(var1, var_2d6, var2 + var0.var_bc, var3 + var0.var_e2, 20, 0, 0, var0.var_121, var0.var_14f, 0);
         }

         if (var0.var_121 > 0 && var0.var_e2 > 0) {
            sub_58f(var1, var_2d6, var2 + var0.var_bc, var3, 20, 0, var0.var_77, var0.var_121, var0.var_e2, 0);
         }

      }
   }

   public static void sub_6fd(Class_64 var0, int var1, int var2) {
      var0.var_254 = var1;
      var0.var_29e = var2;
   }

   private static void sub_74c(Class_64 var0) {
      int var8 = var0.var_344[2];
      int var9 = var0.var_344[3];
      int var1 = var0.var_344[4];
      int var2 = var0.var_344[5];
      int var3 = var0.var_344[6];
      int var4 = var0.var_344[7];
      if (var1 < var0.var_344[8] && var2 < var0.var_344[9] && var1 + var3 > 0 && var2 + var4 > 0) {
         int var5 = var1 - var0.var_344[10];
         int var6 = var2 - var0.var_344[11];
         if (var5 != 0 || var6 != 0) {
            int var7 = 0;
            if (var1 < 0) {
               var3 += var1;
               var1 = 0;
               var7 = 1;
            }

            if (var2 < 0) {
               var4 += var2;
               var2 = 0;
               var7 |= 8;
            }

            if (var1 + var3 >= var0.var_344[8]) {
               var3 = var0.var_344[8] - var1;
               var7 |= 2;
            }

            if (var2 + var4 >= var0.var_344[9]) {
               var4 = var0.var_344[9] - var2;
               var7 |= 4;
            }

            if (Math.abs(var5) <= var8 && Math.abs(var6) <= var9) {
               sub_79e(var0, var5, var6, var1, var2, var3, var4, var7);
            } else {
               sub_76e(var0, var1, var2, var3, var4);
            }

            var0.var_344[10] = var1;
            var0.var_344[11] = var2;
         }
      }
   }

   private static void sub_76e(Class_64 var0, int var1, int var2, int var3, int var4) {
      int var15 = var0.var_344[2];
      int var16 = var0.var_344[3];
      int var6 = var1 / var15;
      int var8 = (var1 + var3 - 1) / var15;
      int var7 = var2 / var16;
      int var9 = (var2 + var4 - 1) / var16;
      int var10 = var7 * var0.var_344[0];
      var0.var_64 = (var0.var_254 + var15 - 1) / var15 * var15;
      var0.var_77 = (var0.var_29e + var16 - 1) / var16 * var16;
      int var14 = var0.var_77;

      for(int var12 = var7; var12 <= var9; ++var12) {
         int var13 = var0.var_64;

         for(int var11 = var6; var11 <= var8; ++var11) {
            short var5 = var0.var_2f3[var10 + var11];
            sub_7b1(var0, var13, var14, var5 & 255, (var5 & '\uff00') >> 8);
            var13 += var15;
         }

         var10 += var0.var_344[0];
         var14 += var16;
      }

      var0.var_64 += var1 % var15;
      var0.var_77 += var2 % var16;
      var0.var_bc = var3;
      var0.var_e2 = var4;
      var0.var_121 = var0.var_14f = 0;
      var0.var_176 = var1 / var15 * var15;
      var0.var_1c6 = var2 / var16 * var16;
      var0.var_1d1 = (var1 + var3 + ((var1 + var3) % var15 > 0 ? var15 : 0)) / var15 * var15;
      var0.var_1f9 = (var2 + var4 + ((var2 + var4) % var16 > 0 ? var16 : 0)) / var16 * var16;
   }

   private static void sub_79e(Class_64 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var10;
      int var11;
      int var13;
      int var14;
      int var15;
      int var10000;
      int var17;
      boolean var19;
      boolean var20;
      boolean var21;
      label115: {
         var14 = 0;
         var13 = 0;
         var17 = 0;
         var15 = 0;
         var19 = false;
         var20 = false;
         var21 = false;
         var10 = var0.var_344[2];
         var11 = var0.var_344[3];
         var0.var_64 = (var0.var_64 + var1 + var_35e) % var_35e;
         var0.var_77 = (var0.var_77 + var2 + var_396) % var_396;
         if (var1 > 0) {
            var20 = var3 >= var0.var_1d1 - var5 && (var7 & 2) == 0;
            var15 = (var3 + var5) / var10;
            var10000 = (var0.var_64 + var5 + var_35e) % var_35e;
         } else {
            if (var1 >= 0) {
               break label115;
            }

            var20 = var3 < var0.var_176 && (var7 & 1) == 0;
            var15 = var3 / var10;
            var10000 = var0.var_64;
         }

         var13 = var10000;
      }

      int var8;
      int var9;
      short var12;
      int var10001;
      Class_64 var22;
      if (var1 != 0) {
         var0.var_bc = var_35e - var0.var_64;
         if (var0.var_bc >= var5) {
            var0.var_bc = var5;
            var22 = var0;
            var10001 = 0;
         } else {
            var22 = var0;
            var10001 = var5 - var0.var_bc;
         }

         var22.var_121 = var10001;
         if (var20) {
            var17 = var4 / var11;
            int var18 = (var4 + var6 - 1) / var11;
            var14 = var0.var_77;
            var9 = var17 * var0.var_344[0];

            for(var8 = var17; var8 <= var18; ++var8) {
               var12 = var0.var_2f3[var9 + var15];
               sub_7b1(var0, var13, var14, var12 & 255, (var12 & '\uff00') >> 8);
               var9 += var0.var_344[0];
               var14 = (var14 + var11 + var_396) % var_396;
            }

            var19 = true;
         }
      }

      label89: {
         if (var2 > 0) {
            var21 = var4 >= var0.var_1f9 - var6 && (var7 & 4) == 0;
            var17 = (var4 + var6) / var11;
            var10000 = (var0.var_77 + var6 + var_396) % var_396;
         } else {
            if (var2 >= 0) {
               break label89;
            }

            var21 = var4 < var0.var_1c6 && (var7 & 8) == 0;
            var17 = var4 / var11;
            var10000 = var0.var_77;
         }

         var14 = var10000;
      }

      if (var2 != 0) {
         var0.var_e2 = var_396 - var0.var_77;
         if (var0.var_e2 >= var6) {
            var0.var_e2 = var6;
            var22 = var0;
            var10001 = 0;
         } else {
            var22 = var0;
            var10001 = var6 - var0.var_e2;
         }

         var22.var_14f = var10001;
         if (var21) {
            var15 = var3 / var10;
            int var16 = (var3 + var5 - 1) / var10;
            var13 = var0.var_64;
            var9 = var17 * var0.var_344[0];

            for(var8 = var15; var8 <= var16; ++var8) {
               var12 = var0.var_2f3[var9 + var8];
               sub_7b1(var0, var13, var14, var12 & 255, (var12 & '\uff00') >> 8);
               var13 = (var13 + var10 + var_35e) % var_35e;
            }

            var19 = true;
         }
      }

      if (var19) {
         var0.var_176 = var3 / var10 * var10;
         var0.var_1c6 = var4 / var11 * var11;
         var0.var_1d1 = (var3 + var5 + ((var3 + var5) % var10 > 0 ? var10 : 0)) / var10 * var10;
         var0.var_1f9 = (var4 + var6 + ((var4 + var6) % var11 > 0 ? var11 : 0)) / var11 * var11;
      }

   }

   private static void sub_7b1(Class_64 var0, int var1, int var2, int var3, int var4) {
      if (var3 - 1 >= 0) {
         --var3;
         int var8 = var0.var_344[2];
         int var9 = var0.var_344[3];
         var1 = var1 / var8 * var8;
         var2 = var2 / var9 * var9;
         int var5 = var0.var_2d1.var_8a[0].getWidth() / var8;
         int var6 = var3 / var5 * var8;
         int var7 = var3 % var5 * var9;
         sub_5b1(var_294, var0.var_2d1, var7, var6, var8, var9, var4);
         var_314.drawImage(var_236.var_8a[0], var1, var2, 20);
      }
   }

   private static void sub_7ce(Class_de var0, int var1, Image var2) {
      var0.var_8a[var1] = var2;
   }

   public static void sub_828(Class_de var0) {
      if (var0 != null && var0.var_8a != null) {
         for(int var1 = 0; var1 < var0.var_8a.length; ++var1) {
            var0.var_8a[var1] = null;
         }

         var0.var_8a = null;
      }

   }

   private static Class_de sub_852(int var0, int var1) {
      Class_de var2;
      sub_7ce(var2 = new Class_de(1), 0, Image.createImage(var0, var1));
      return var2;
   }

   private static Class_de sub_885(byte[] var0, int var1, int var2) {
      Class_de var3;
      sub_7ce(var3 = new Class_de(1), 0, Image.createImage(var0, var1, var2));
      return var3;
   }

   public static byte[] sub_8a1(Class_de var0) {
      return sub_28f(var0.var_3b);
   }

   public static Class_de sub_8fb(Class_de var0, byte[] var1, int var2) {
      try {
         Class_de var7 = new Class_de(var0.var_8a.length);
         Object[] var3 = sub_1de(var0.var_3b);

         for(int var6 = 0; var6 < var0.var_8a.length; ++var6) {
            byte[] var5;
            if ((var5 = (byte[])var3[var6]) != null) {
               byte[] var4 = sub_950(var5, var1, var2);
               sub_7ce(var7, var6, Image.createImage(var4, 0, var4.length));
            }
         }

         return var7;
      } catch (Exception var8) {
         return var0;
      }
   }

   private static byte[] sub_950(byte[] var0, byte[] var1, int var2) {
      Object var3 = null;
      Object var4 = null;
      int var6 = ((var0[33] & 255) << 24) + ((var0[34] & 255) << 16) + ((var0[35] & 255) << 8) + (var0[36] & 255);
      int var7;
      byte[] var9;
      if (var2 == -1) {
         var9 = new byte[var0.length];
         System.arraycopy(var0, 0, var9, 0, var0.length);
         System.arraycopy(var1, 0, var9, 41, var6);
      } else {
         byte[] var8;
         (var8 = new byte[13 + var2])[3] = (byte)(var2 + 1);
         var8[4] = 116;
         var8[5] = 82;
         var8[6] = 78;
         var8[7] = 83;

         int var5;
         for(var5 = 8; var5 < 8 + var2; ++var5) {
            var8[var5] = -1;
         }

         var8[var5] = 0;
         var9 = new byte[var0.length + var8.length];
         System.arraycopy(var0, 0, var9, 0, 93);
         System.arraycopy(var8, 0, var9, 93, var8.length);
         System.arraycopy(var0, 93, var9, 93 + var8.length, var0.length - 93);
         System.arraycopy(var1, 0, var9, 41, var6);
         var7 = sub_30e(var8, 4, var8[3] + 4);
         var9[93 + var8.length - 4] = (byte)((var7 & -16777216) >> 24);
         var9[93 + var8.length - 3] = (byte)((var7 & 16711680) >> 16);
         var9[93 + var8.length - 2] = (byte)((var7 & '\uff00') >> 8);
         var9[93 + var8.length - 1] = (byte)(var7 & 255);
      }

      var7 = sub_30e(var9, 37, var6 + 4);
      var9[41 + var6] = (byte)((var7 & -16777216) >> 24);
      var9[41 + var6 + 1] = (byte)((var7 & 16711680) >> 16);
      var9[41 + var6 + 2] = (byte)((var7 & '\uff00') >> 8);
      var9[41 + var6 + 3] = (byte)(var7 & 255);
      return var9;
   }

   public static void sub_96a(byte[] var0, int var1, int var2) {
      var1 *= 3;
      var0[var1] = (byte)((var2 & 16711680) >> 16);
      var0[var1 + 1] = (byte)((var2 & '\uff00') >> 8);
      var0[var1 + 2] = (byte)(var2 & 255);
   }

   public static int sub_999(byte[] var0, int var1) {
      return -16777216 | (var0[var1 * 3] & 255) << 16 | (var0[var1 * 3 + 1] & 255) << 8 | var0[var1 * 3 + 2] & 255;
   }

   public static int sub_9f9(int var0) {
      return Math.abs(var0);
   }

   public static int sub_a1a() {
      return var_44f.nextInt();
   }

   private static int sub_a6b(int var0) {
      if ((var0 = Math.abs(var0) & 255) > 128) {
         var0 = 256 - var0;
      }

      return var0 > 64 ? -var_3f3[128 - var0] : var_3f3[var0];
   }

   public static int sub_aa2(int var0) {
      return sub_a6b(64 - (var0 & 255));
   }

   public static int sub_abc(long var0, int var2) {
      return (int)(var0 * (long)sub_a6b(var2) >> 16);
   }

   public static int sub_acf(long var0, int var2) {
      return (int)(var0 * (long)sub_a6b(64 - (var2 & 255)) >> 16);
   }

   protected static void sub_b07(int[] var0, int[] var1, int[] var2) {
      var_3f3 = var0;
   }

   public static void sub_b47(byte[] var0) {
      var_493 = var0;
      var_46b = 0;
   }

   public static void sub_b51(int var0) {
      var_46b = var0;
   }

   public static int sub_b95(int var0) {
      int var1 = 0;

      for(int var2 = 1; var2 <= var0; ++var2) {
         int var3 = var_46b >> 3;
         var1 += (var_493[var3] >> 7 - (var_46b - (var3 << 3)) & 1) << var0 - var2;
         ++var_46b;
      }

      return var1;
   }

   public static void sub_bb3(int var0, int var1) {
      boolean var2 = false;
      boolean var3 = false;

      for(int var4 = 1; var4 <= var1; ++var4) {
         int var5 = var_46b >> 3;
         byte var6 = (byte)(1 << 7 - (var_46b - (var5 << 3)));
         byte[] var10000;
         int var10001;
         int var10002;
         if ((var0 & 1 << var1 - var4) != 0) {
            var10000 = var_493;
            var10001 = var5;
            var10002 = var_493[var5] | var6;
         } else {
            var10000 = var_493;
            var10001 = var5;
            var10002 = var_493[var5] & (byte)(255 ^ var6);
         }

         var10000[var10001] = (byte)var10002;
         ++var_46b;
      }

   }

   public static void sub_bdf() {
      try {
         System.gc();
         Thread.sleep(40L);
      } catch (Exception var0) {
      }
   }

   public static int sub_c2f(Canvas var0, int var1) {
      int var10000;
      switch(var1) {
      case -7:
      case -6:
      case 9:
      case 10:
      case 11:
      case 12:
      case 35:
      case 48:
      case 49:
      case 51:
      case 55:
      case 57:
         var10000 = var1;
         break;
      case 33:
         var10000 = 49;
         break;
      case 34:
      case 50:
         var10000 = 1;
         break;
      case 36:
      case 52:
         var10000 = 2;
         break;
      case 37:
      case 54:
         var10000 = 5;
         break;
      case 38:
         var10000 = 55;
         break;
      case 40:
         var10000 = 57;
         break;
      case 41:
         var10000 = 48;
         break;
      case 42:
         var10000 = var_4c1 ? 6 : var1;
         break;
      case 53:
      case 8364:
         var10000 = 8;
         break;
      case 56:
         var10000 = 6;
         break;
      case 68:
      case 75:
      case 100:
      case 107:
         var10000 = 0;
         break;
      case 126:
         var10000 = 35;
         break;
      case 163:
         var10000 = 51;
         break;
      default:
         var10000 = var0.getGameAction(var1);
      }

      return var10000;
   }
}
