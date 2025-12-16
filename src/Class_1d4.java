import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public final class Class_1d4 extends FullCanvas implements Runnable, PlayerListener {
   static MainApp var_22;
   static Class_1d4 var_5e = null;
   static Display var_9d = null;
   static boolean var_c9 = false;
   static boolean var_12d = false;
   static boolean var_15e = false;
   static int var_1ab;
   static char[] var_1d3;
   static int[] var_1f8;
   static int var_205;
   static int var_266;
   static int var_278;
   static Image var_2c0 = null;
   public static Image var_2fa = null;
   public int[] var_308;
   public static boolean var_31f = false;
   boolean var_376;
   long var_3d4;
   long var_41c;
   long var_441 = 0L;
   public static int var_462;
   public static int var_4b5;
   public static int var_4df;
   public static int var_530;
   public static int var_572;
   public static int var_589;
   public static final int[] var_5e2 = new int[0];

   public Class_1d4(MainApp var1) {
      if (this.getWidth() > this.getHeight()) {
         var_31f = true;
      }

      try {
         var_2fa = Image.createImage("/vpad.png");
         if (var_2c0 == null) {
            var_2c0 = Image.createImage("/portrait.png");
         }
      } catch (Exception var3) {
         System.out.println(" error ");
      }

      try {
         this.var_308 = new int[93600];

         for(int var2 = 0; var2 < 93600; ++var2) {
            this.var_308[var2] = -6972;
         }
      } catch (Exception var4) {
         System.out.println(" errrorr ot create : " + var4.toString());
      }

      var_22 = var1;
      var_278 = 0;
   }

   static void sub_36() {
      GameEngine.forceGC();
      Class_17f.var_21 = Math.max(240, var_5e.getWidth());
      Class_17f.var_67 = var_5e.getHeight() - var_2fa.getHeight();
      Class_17f.sub_14a(Class_17f.var_21, Class_17f.var_67, false);
      GameEngine.initialize(var_22, Class_17f.var_21, Class_17f.var_67, 36, 36, 1);
      GameEngine.setTrigTables(Class_17f.sub_ac4(437), (int[])null, (int[])null);
      GameEngine.playerListener = var_5e;
      Class_201.sub_167e();
      Class_17f.sub_3d7(1);
      Class_17f.sub_485(0, 50, 473);
      sub_18f();
      sub_13f();
      sub_135(10);
      var_15e = true;
      (new Thread(var_5e)).start();
   }

   private static void sub_51() {
      var_278 |= 8;
      var_278 &= -786433;
      Class_201.sub_a7();
      sub_157();
      sub_1ef();
      GameEngine.destroy();
      GameEngine.directGraphics = null;
      var_12d = true;
      var_5e = null;
      var_9d = null;
   }

   static void sub_b3() {
      var_15e = false;

      while(!var_c9) {
         try {
            Thread.sleep(500L);
         } catch (InterruptedException var0) {
         }
      }

      if (var_205 < 13) {
         Class_201.sub_11c();
      } else {
         Class_201.sub_b8b();
      }

      sub_51();
   }

   public final void run() {
      var_c9 = false;

      while(var_15e) {
         if (!var_12d) {
            var_278 |= 1;
            ++Class_17f.var_3b7;
            if ((var_278 & 2) != 0) {
               var_278 &= -3;
               if ((var_278 & 256) != 0) {
                  if ((var_278 & 1048576) != 0) {
                     var_278 &= -1048577;
                     Class_201.sub_1a34(var_22);
                  }

                  var_15e = false;
                  sub_51();
                  break;
               }

               sub_135(var_266);
               var_278 &= -2;
            } else {
               label59: {
                  this.var_441 = System.currentTimeMillis();
                  this.var_41c = (long)sub_20c();
                  if (this.var_41c != 1L) {
                     Class_1d4 var10000;
                     boolean var10001;
                     if (var_205 < 13) {
                        var10000 = this;
                        var10001 = Class_201.sub_18b();
                     } else {
                        var10000 = this;
                        var10001 = Class_201.sub_e55();
                     }

                     var10000.var_376 = var10001;
                     if (this.var_41c == 2L) {
                        var_278 &= -262145;
                     }

                     sub_d8();
                     if (this.var_376) {
                        var_278 &= -2;
                        break label59;
                     }
                  }

                  var_5e.repaint();
               }

               this.var_3d4 = System.currentTimeMillis() - this.var_441;

               try {
                  if (this.var_3d4 < 31L) {
                     Thread.sleep(31L - this.var_3d4);
                  }
               } catch (InterruptedException var3) {
               }
            }
         } else {
            try {
               Thread.sleep(500L);
            } catch (Exception var2) {
            }
         }
      }

      try {
         Thread.sleep(10L);
      } catch (Exception var1) {
      }

      var_c9 = true;
      var_22.notifyDestroyed();
   }

   private static void sub_d8() {
      boolean var0 = false;
      var0 = Class_201.sub_50();
      if ((var_278 & 131072) != 0 && !var0) {
         GameEngine.forceGC();

         try {
            Thread.sleep(2000L);
         } catch (Exception var1) {
         }
      }

      var_278 &= -131073;
   }

   public final void paint(Graphics var1) {
      if (var_31f) {
         var1.setColor(255, 255, 255);
         var1.fillRect(0, 0, this.getWidth(), this.getHeight());
         if (var_2c0 != null) {
            var1.drawImage(var_2c0, this.getWidth() / 2, this.getHeight() / 2, 3);
         }

      } else {
         this.setFullScreenMode(true);
         this.getWidth();
         var_1ab = this.getHeight() - var_2fa.getHeight();
         if (var_2fa != null) {
            var1.drawImage(var_2fa, 0, this.getHeight() - var_2fa.getHeight(), 0);
         }

         if (sub_11a(var_4df, var_4df + var_572, var_530, var_530 + var_589)) {
            var1.setClip(var_4df, var_530, var_572, var_589);
            var1.drawRGB(this.var_308, 0, this.getWidth(), 0, var_1ab, 360, var_2fa.getHeight(), true);
         }

         if (!var_12d) {
            GameEngine.directGraphics = DirectUtils.getDirectGraphics(var1);
            var1.setClip(0, 0, Class_17f.var_21, Class_17f.var_67);
            if (sub_23e(var1) == 0) {
               if (var_205 < 13) {
                  Class_201.sub_1ba(var1);
               } else {
                  Class_201.sub_ed9(var1);
               }

               var_278 &= -524289;
            }

            var_278 &= -2;
         }

      }
   }

   private static boolean sub_11a(int var0, int var1, int var2, int var3) {
      int var4 = var_462;
      int var5 = var_4b5;
      return var4 >= var0 && var4 <= var1 && var5 >= var2 && var5 <= var3;
   }

   public final void pointerPressed(int var1, int var2) {
      var_462 = 0;
      var_4b5 = 0;
      var_462 = var1;
      var_4b5 = var2;
      int var3 = var_5e2.length / 5;
      int var5 = this.getHeight() - var_2fa.getHeight();
      int var6 = 0;
      if (var1 >= 1 && var1 <= 88 && var2 >= Class_17f.var_67 + 0 && var2 <= Class_17f.var_67 + 100) {
         this.keyPressed(42);
      }

      if (var1 >= 96 && var1 <= 169 && var2 >= Class_17f.var_67 + 0 && var2 <= Class_17f.var_67 + 106) {
         this.keyPressed(-1);
      }

      if (var1 >= 170 && var1 <= 265 && var2 >= Class_17f.var_67 + 0 && var2 <= Class_17f.var_67 + 106) {
         this.keyPressed(-2);
      }

      if (var1 >= 273 && var1 <= 360 && var2 >= Class_17f.var_67 + 0 && var2 <= Class_17f.var_67 + 100) {
         this.keyPressed(48);
      }

      if (var1 >= 0 && var1 <= 112 && var2 >= Class_17f.var_67 + 107 && var2 <= Class_17f.var_67 + 224) {
         this.keyPressed(-3);
      }

      if (var1 >= 113 && var1 <= 253 && var2 >= Class_17f.var_67 + 107 && var2 <= Class_17f.var_67 + 224) {
         this.keyPressed(-5);
      }

      if (var1 >= 254 && var1 <= 360 && var2 >= Class_17f.var_67 + 107 && var2 <= Class_17f.var_67 + 224) {
         this.keyPressed(-4);
      }

      for(int var7 = 0; var7 < var3; ++var7) {
         int var8 = 0 + var_5e2[var6 + 0];
         int var9 = var5 + var_5e2[var6 + 1];
         int var10 = var_5e2[var6 + 2];
         int var11 = var_5e2[var6 + 3];
         var_4df = var8;
         var_530 = var9;
         var_572 = var10;
         var_589 = var11;
         if (sub_11a(var8, var8 + var10, var9, var9 + var11)) {
            this.keyPressed(var_5e2[var6 + 4]);
            return;
         }

         var6 += 5;
      }

   }

   public final void pointerReleased(int var1, int var2) {
      Class_17f.var_30f = 0;
      this.getHeight();
      var_2fa.getHeight();
      if (var1 >= 1 && var1 <= 95 && var2 >= Class_17f.var_67 + 0 && var2 <= Class_17f.var_67 + 106) {
         this.keyReleased(42);
      }

      if (var1 >= 96 && var1 <= 169 && var2 >= Class_17f.var_67 + 0 && var2 <= Class_17f.var_67 + 106) {
         this.keyReleased(-1);
      }

      if (var1 >= 170 && var1 <= 265 && var2 >= Class_17f.var_67 + 0 && var2 <= Class_17f.var_67 + 106) {
         this.keyReleased(-2);
      }

      if (var1 >= 266 && var1 <= 360 && var2 >= Class_17f.var_67 + 0 && var2 <= Class_17f.var_67 + 106) {
         this.keyReleased(48);
      }

      if (var1 >= 0 && var1 <= 112 && var2 >= Class_17f.var_67 + 107 && var2 <= Class_17f.var_67 + 224) {
         this.keyReleased(-3);
      }

      if (var1 >= 113 && var1 <= 253 && var2 >= Class_17f.var_67 + 107 && var2 <= Class_17f.var_67 + 224) {
         this.keyReleased(-5);
      }

      if (var1 >= 254 && var1 <= 360 && var2 >= Class_17f.var_67 + 107 && var2 <= Class_17f.var_67 + 224) {
         this.keyReleased(-4);
      }

      var_462 = 0;
      var_4b5 = 0;
   }

   public final void keyPressed(int var1) {
      if (var_205 == 11 && var1 == 42) {
         int[] var10000 = Class_201.var_228;
         var10000[3] |= 4;
      }

      if ((var_278 & 8) == 0) {
         Class_17f.sub_b2(var1 = GameEngine.translateKeyCode(var_5e, var1), true);
         if (var1 == 35 && !GameEngine.toggleSound()) {
            sub_125(true);
         }

      }
   }

   public final void keyReleased(int var1) {
      try {
         Thread.sleep(10L);
      } catch (Exception var2) {
      }

      if (var1 == -50) {
         GameEngine.useAlternateKeys = false;
      }

      if ((var_278 & 8) == 0) {
         Class_17f.sub_b2(GameEngine.translateKeyCode(var_5e, var1), false);
      }
   }

   protected final void showNotify() {
      var_12d = false;
      this.setFullScreenMode(true);
      Class_17f.var_30f = 0;
      if (Class_201.var_228 != null) {
         int[] var10000 = Class_201.var_228;
         var10000[3] |= 96;
      }

      if ((Class_201.var_9d8 & 128) != 0) {
         Class_17f.var_6e3 |= 1;
      }

      Class_201.var_d55 &= -2;
   }

   protected final void hideNotify() {
      var_12d = true;
      var_278 |= 262144;
      if (!var_c9) {
         Class_201.sub_a7();
      }

   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (var2 == "endOfMedia") {
         sub_125(false);
      }
   }

   static void sub_125(boolean var0) {
      if (!GameEngine.isMuted()) {
         if (var_205 < 13 && var0 || var0) {
            var_278 |= 65536;
         }

      }
   }

   private static void sub_135(int var0) {
      var_205 = var0;
      Class_17f.var_3b7 = 0;
      var_278 &= -9;
      if (var_205 < 13) {
         Class_201.sub_c0();
         var_278 &= -131073;
      } else {
         Class_201.sub_b34();
      }
   }

   private static void sub_13f() {
      Class_17f.sub_bb1();
      Class_17f.sub_901(39);
      Class_201.sub_ad9();
   }

   private static void sub_157() {
      Class_201.sub_aef();
      Class_17f.sub_90c();
      Class_17f.sub_bed();
      Class_17f.sub_437();
      Class_201.sub_16cb();
   }

   private static void sub_18f() {
      Class_17f.sub_52a(435);
      var_1d3 = Class_17f.var_51a;
      var_1f8 = Class_17f.var_543;
   }

   private static void sub_1ef() {
      var_1d3 = null;
      var_1f8 = null;
   }

   private static int sub_20c() {
      if ((var_278 & 262144) == 0) {
         return 0;
      } else {
         if (Class_17f.var_33f) {
            Class_17f.var_33f = false;
            if (Class_17f.var_30f != 0 || Class_17f.var_363 != 0) {
               var_278 |= 589824;
               Class_17f.sub_9a();
               return 2;
            }
         }

         return 1;
      }
   }

   private static int sub_23e(Graphics var0) {
      if ((var_278 & 262144) != 0) {
         var0.setColor(0);
         var0.fillRect(0, 0, Class_17f.var_21, Class_17f.var_67);
         char[] var1 = Class_17f.var_51a;
         int[] var2 = Class_17f.var_543;
         Class_17f.sub_4f7(var_1d3, var_1f8);
         Class_17f.sub_657(var0, 0, Class_17f.var_89 >> 1, Class_17f.var_dd >> 1, 15, 0, 0, 0);
         Class_17f.sub_4f7(var1, var2);
         return 1;
      } else {
         return 0;
      }
   }
}
