import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public final class GameCanvas extends FullCanvas implements Runnable, PlayerListener {
   static MainApp midlet;
   static GameCanvas instance = null;
   static Display display = null;
   static boolean threadStopped = false;
   static boolean isPaused = false;
   static boolean isRunning = false;
   static int virtualPadY;
   static char[] pauseChars;
   static int[] pauseCharWidths;
   static int gameState;
   static int nextState;
   static int stateFlags;
   static Image portraitImage = null;
   public static Image virtualPadImage = null;
   public int[] rgbBuffer;
   public static boolean isLandscape = false;
   boolean shouldSkipRepaint;
   long frameTime;
   long pauseCheckResult;
   long frameStartTime = 0L;
   public static int touchX;
   public static int touchY;
   public static int touchRectX;
   public static int touchRectY;
   public static int touchRectWidth;
   public static int touchRectHeight;
   public static final int[] touchZones = new int[0];

   public GameCanvas(MainApp var1) {
      if (this.getWidth() > this.getHeight()) {
         isLandscape = true;
      }

      try {
         virtualPadImage = Image.createImage("/vpad.png");
         if (portraitImage == null) {
            portraitImage = Image.createImage("/portrait.png");
         }
      } catch (Exception var3) {
         System.out.println(" error ");
      }

      try {
         this.rgbBuffer = new int[93600];

         for(int var2 = 0; var2 < 93600; ++var2) {
            this.rgbBuffer[var2] = -6972;
         }
      } catch (Exception var4) {
         System.out.println(" errrorr ot create : " + var4.toString());
      }

      midlet = var1;
      stateFlags = 0;
   }

   static void initGame() {
      GameEngine.forceGC();
      GameRenderer.screenWidth = Math.max(240, instance.getWidth());
      GameRenderer.screenHeight = instance.getHeight() - virtualPadImage.getHeight();
      GameRenderer.setViewDimensions(GameRenderer.screenWidth, GameRenderer.screenHeight, false);
      GameEngine.initialize(midlet, GameRenderer.screenWidth, GameRenderer.screenHeight, 36, 36, 1);
      GameEngine.setTrigTables(GameRenderer.loadIntArray(437), (int[])null, (int[])null);
      GameEngine.playerListener = instance;
      GameManager.initSaveSystem();
      GameRenderer.initFontSystem(1);
      GameRenderer.loadFont(0, 50, 473);
      loadFont();
      initLevel();
      setState(10);
      isRunning = true;
      (new Thread(instance)).start();
   }

   private static void destroyGame() {
      stateFlags |= 8;
      stateFlags &= -786433;
      GameManager.stopAllMusic();
      cleanupLevel();
      unloadFont();
      GameEngine.destroy();
      GameEngine.directGraphics = null;
      isPaused = true;
      instance = null;
      display = null;
   }

   static void exitGame() {
      isRunning = false;

      while(!threadStopped) {
         try {
            Thread.sleep(500L);
         } catch (InterruptedException var0) {
         }
      }

      if (gameState < 13) {
         GameManager.disposeMenuResources();
      } else {
         GameManager.sub_b8b();
      }

      destroyGame();
   }

   public final void run() {
      threadStopped = false;

      while(isRunning) {
         if (!isPaused) {
            stateFlags |= 1;
            ++GameRenderer.frameCounter;
            if ((stateFlags & 2) != 0) {
               stateFlags &= -3;
               if ((stateFlags & 256) != 0) {
                  if ((stateFlags & 1048576) != 0) {
                     stateFlags &= -1048577;
                     GameManager.openWapLink(midlet);
                  }

                  isRunning = false;
                  destroyGame();
                  break;
               }

               setState(nextState);
               stateFlags &= -2;
            } else {
               label59: {
                  this.frameStartTime = System.currentTimeMillis();
                  this.pauseCheckResult = (long) checkPauseState();
                  if (this.pauseCheckResult != 1L) {
                     GameCanvas var10000;
                     boolean var10001;
                     if (gameState < 13) {
                        var10000 = this;
                        var10001 = GameManager.sub_18b();
                     } else {
                        var10000 = this;
                        var10001 = GameManager.sub_e55();
                     }

                     var10000.shouldSkipRepaint = var10001;
                     if (this.pauseCheckResult == 2L) {
                        stateFlags &= -262145;
                     }

                     handleGarbageCollection();
                     if (this.shouldSkipRepaint) {
                        stateFlags &= -2;
                        break label59;
                     }
                  }

                  instance.repaint();
               }

               this.frameTime = System.currentTimeMillis() - this.frameStartTime;

               try {
                  if (this.frameTime < 31L) {
                     Thread.sleep(31L - this.frameTime);
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

      threadStopped = true;
      midlet.notifyDestroyed();
   }

   private static void handleGarbageCollection() {
      boolean var0 = false;
      var0 = GameManager.playPendingMusic();
      if ((stateFlags & 131072) != 0 && !var0) {
         GameEngine.forceGC();

         try {
            Thread.sleep(2000L);
         } catch (Exception var1) {
         }
      }

      stateFlags &= -131073;
   }

   public final void paint(Graphics var1) {
      if (isLandscape) {
         var1.setColor(255, 255, 255);
         var1.fillRect(0, 0, this.getWidth(), this.getHeight());
         if (portraitImage != null) {
            var1.drawImage(portraitImage, this.getWidth() / 2, this.getHeight() / 2, 3);
         }

      } else {
         this.setFullScreenMode(true);
         this.getWidth();
         virtualPadY = this.getHeight() - virtualPadImage.getHeight();
         if (virtualPadImage != null) {
            var1.drawImage(virtualPadImage, 0, this.getHeight() - virtualPadImage.getHeight(), 0);
         }

         if (isPointInRect(touchRectX, touchRectX + touchRectWidth, touchRectY, touchRectY + touchRectHeight)) {
            var1.setClip(touchRectX, touchRectY, touchRectWidth, touchRectHeight);
            var1.drawRGB(this.rgbBuffer, 0, this.getWidth(), 0, virtualPadY, 360, virtualPadImage.getHeight(), true);
         }

         if (!isPaused) {
            GameEngine.directGraphics = DirectUtils.getDirectGraphics(var1);
            var1.setClip(0, 0, GameRenderer.screenWidth, GameRenderer.screenHeight);
            if (drawPauseScreen(var1) == 0) {
               if (gameState < 13) {
                  GameManager.sub_1ba(var1);
               } else {
                  GameManager.sub_ed9(var1);
               }

               stateFlags &= -524289;
            }

            stateFlags &= -2;
         }

      }
   }

   private static boolean isPointInRect(int var0, int var1, int var2, int var3) {
      int var4 = touchX;
      int var5 = touchY;
      return var4 >= var0 && var4 <= var1 && var5 >= var2 && var5 <= var3;
   }

   public final void pointerPressed(int var1, int var2) {
      touchX = 0;
      touchY = 0;
      touchX = var1;
      touchY = var2;
      int var3 = touchZones.length / 5;
      int var5 = this.getHeight() - virtualPadImage.getHeight();
      int var6 = 0;
      if (var1 >= 1 && var1 <= 88 && var2 >= GameRenderer.screenHeight + 0 && var2 <= GameRenderer.screenHeight + 100) {
         this.keyPressed(42);
      }

      if (var1 >= 96 && var1 <= 169 && var2 >= GameRenderer.screenHeight + 0 && var2 <= GameRenderer.screenHeight + 106) {
         this.keyPressed(-1);
      }

      if (var1 >= 170 && var1 <= 265 && var2 >= GameRenderer.screenHeight + 0 && var2 <= GameRenderer.screenHeight + 106) {
         this.keyPressed(-2);
      }

      if (var1 >= 273 && var1 <= 360 && var2 >= GameRenderer.screenHeight + 0 && var2 <= GameRenderer.screenHeight + 100) {
         this.keyPressed(48);
      }

      if (var1 >= 0 && var1 <= 112 && var2 >= GameRenderer.screenHeight + 107 && var2 <= GameRenderer.screenHeight + 224) {
         this.keyPressed(-3);
      }

      if (var1 >= 113 && var1 <= 253 && var2 >= GameRenderer.screenHeight + 107 && var2 <= GameRenderer.screenHeight + 224) {
         this.keyPressed(-5);
      }

      if (var1 >= 254 && var1 <= 360 && var2 >= GameRenderer.screenHeight + 107 && var2 <= GameRenderer.screenHeight + 224) {
         this.keyPressed(-4);
      }

      for(int var7 = 0; var7 < var3; ++var7) {
         int var8 = 0 + touchZones[var6 + 0];
         int var9 = var5 + touchZones[var6 + 1];
         int var10 = touchZones[var6 + 2];
         int var11 = touchZones[var6 + 3];
         touchRectX = var8;
         touchRectY = var9;
         touchRectWidth = var10;
         touchRectHeight = var11;
         if (isPointInRect(var8, var8 + var10, var9, var9 + var11)) {
            this.keyPressed(touchZones[var6 + 4]);
            return;
         }

         var6 += 5;
      }

   }

   public final void pointerReleased(int var1, int var2) {
      GameRenderer.inputState = 0;
      this.getHeight();
      virtualPadImage.getHeight();
      if (var1 >= 1 && var1 <= 95 && var2 >= GameRenderer.screenHeight + 0 && var2 <= GameRenderer.screenHeight + 106) {
         this.keyReleased(42);
      }

      if (var1 >= 96 && var1 <= 169 && var2 >= GameRenderer.screenHeight + 0 && var2 <= GameRenderer.screenHeight + 106) {
         this.keyReleased(-1);
      }

      if (var1 >= 170 && var1 <= 265 && var2 >= GameRenderer.screenHeight + 0 && var2 <= GameRenderer.screenHeight + 106) {
         this.keyReleased(-2);
      }

      if (var1 >= 266 && var1 <= 360 && var2 >= GameRenderer.screenHeight + 0 && var2 <= GameRenderer.screenHeight + 106) {
         this.keyReleased(48);
      }

      if (var1 >= 0 && var1 <= 112 && var2 >= GameRenderer.screenHeight + 107 && var2 <= GameRenderer.screenHeight + 224) {
         this.keyReleased(-3);
      }

      if (var1 >= 113 && var1 <= 253 && var2 >= GameRenderer.screenHeight + 107 && var2 <= GameRenderer.screenHeight + 224) {
         this.keyReleased(-5);
      }

      if (var1 >= 254 && var1 <= 360 && var2 >= GameRenderer.screenHeight + 107 && var2 <= GameRenderer.screenHeight + 224) {
         this.keyReleased(-4);
      }

      touchX = 0;
      touchY = 0;
   }

   public final void keyPressed(int var1) {
      if (gameState == 11 && var1 == 42) {
         int[] var10000 = GameManager.menuState;
         var10000[3] |= 4;
      }

      if ((stateFlags & 8) == 0) {
         GameRenderer.handleKeyPress(var1 = GameEngine.translateKeyCode(instance, var1), true);
         if (var1 == 35 && !GameEngine.toggleSound()) {
            handleMusicLoop(true);
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

      if ((stateFlags & 8) == 0) {
         GameRenderer.handleKeyPress(GameEngine.translateKeyCode(instance, var1), false);
      }
   }

   protected final void showNotify() {
      isPaused = false;
      this.setFullScreenMode(true);
      GameRenderer.inputState = 0;
      if (GameManager.menuState != null) {
         int[] var10000 = GameManager.menuState;
         var10000[3] |= 96;
      }

      if ((GameManager.var_9d8 & 128) != 0) {
         GameRenderer.dialogFlags |= 1;
      }

      GameManager.var_d55 &= -2;
   }

   protected final void hideNotify() {
      isPaused = true;
      stateFlags |= 262144;
      if (!threadStopped) {
         GameManager.stopAllMusic();
      }

   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (var2 == "endOfMedia") {
         handleMusicLoop(false);
      }
   }

   static void handleMusicLoop(boolean var0) {
      if (!GameEngine.isMuted()) {
         if (gameState < 13 && var0 || var0) {
            stateFlags |= 65536;
         }

      }
   }

   private static void setState(int var0) {
      gameState = var0;
      GameRenderer.frameCounter = 0;
      stateFlags &= -9;
      if (gameState < 13) {
         GameManager.initMenuState();
         stateFlags &= -131073;
      } else {
         GameManager.initLevel();
      }
   }

   private static void initLevel() {
      GameRenderer.initMapSystem();
      GameRenderer.initResourceCache(39);
      GameManager.sub_ad9();
   }

   private static void cleanupLevel() {
      GameManager.sub_aef();
      GameRenderer.clearResourceCache();
      GameRenderer.disposeMapSystem();
      GameRenderer.disposeFonts();
      GameManager.sub_16cb();
   }

   private static void loadFont() {
      GameRenderer.loadStringTable(435);
      pauseChars = GameRenderer.fontChars;
      pauseCharWidths = GameRenderer.stringTable;
   }

   private static void unloadFont() {
      pauseChars = null;
      pauseCharWidths = null;
   }

   private static int checkPauseState() {
      if ((stateFlags & 262144) == 0) {
         return 0;
      } else {
         if (GameRenderer.inputChanged) {
            GameRenderer.inputChanged = false;
            if (GameRenderer.inputState != 0 || GameRenderer.lastKeyCode != 0) {
               stateFlags |= 589824;
               GameRenderer.resetInput();
               return 2;
            }
         }

         return 1;
      }
   }

   private static int drawPauseScreen(Graphics var0) {
      if ((stateFlags & 262144) != 0) {
         var0.setColor(0);
         var0.fillRect(0, 0, GameRenderer.screenWidth, GameRenderer.screenHeight);
         char[] var1 = GameRenderer.fontChars;
         int[] var2 = GameRenderer.stringTable;
         GameRenderer.setCurrentFont(pauseChars, pauseCharWidths);
         GameRenderer.drawString(var0, 0, GameRenderer.viewWidth >> 1, GameRenderer.viewHeight >> 1, 15, 0, 0, 0);
         GameRenderer.setCurrentFont(var1, var2);
         return 1;
      } else {
         return 0;
      }
   }
}
