import javax.microedition.lcdui.Graphics;

final class GameRenderer {
   static int screenWidth;
   static int screenHeight;
   public static int viewWidth;
   public static int viewHeight;
   public static int viewOffsetX;
   public static int viewOffsetY;
   public static int marginX;
   public static int marginY;
   public static int viewportFlags;
   public static int boundsLeft;
   public static int boundsTop;
   public static int boundsRight;
   public static int boundsBottom;
   public static byte inputState;
   public static boolean inputChanged;
   public static int lastKeyCode;
   public static int frameCounter;
   static int var_418;
   static int var_43a;
   public static int var_481 = 0;
   public static char[] numberBuffer;
   public static Sprite iconSprite;
   static char[] fontChars;
   static int[] stringTable;
   static int charCounter;
   static int charLimit;
   static boolean textOverflow;
   static int languageId;
   static Sprite[] fontSprites;
   static Object[] fontData;
   static int dialogState;
   static int dialogFlags;
   static int stringId;
   static int startLineIndex;
   static int dialogNavigation;
   static int textDisplayTimer;
   static int maxTextTimer;
   static int currentIconId;
   static int previousIconId;
   static int dialogNavigationType;
   static int lineVisibilityMask;
   static int dialogWidth;
   static int dialogHeight;
   static int currentFontHeight;
   static int currentFontId;
   static int iconFontId;
   static int charAnimationCounter;
   static char[] savedFontChars;
   static int[] savedStringTable;
   protected static int[] resourceIds = null;
   protected static Object[] resourceCache = null;
   static int layerCount;
   static int[] layerProperties;
   static TileMap[] tileMaps;
   static Sprite[] layerSprites;
   static int defaultPaletteId;
   static int mapFlags;
   static byte[] mapDataBuffer;
   static int mapLoadProgress;
   static int viewportLeft;
   static int viewportTop;
   static int viewportWidth;
   static int viewportHeight;
   static int zoneCount;
   static short[] zoneData;
   static int foundWarpZone;
   static int foundEventZone;
   static int foundTriggerZone;
   static Object[] objectArray;
   static byte[] collisionMap;
   static int var_10a3;
   static int var_10eb;
   public static int mapBackgroundColor;

   static void drawAlignedSprite(Graphics var0, Sprite var1, byte var2) {
      int var10000;
      int var3;
      int var5;
      int var6;
      label31: {
         var3 = var1.var_8a[0].getWidth();
         int var4 = var1.var_8a[0].getHeight();
         var5 = 0;
         var6 = 0;
         if ((var2 & 5) == 5) {
            var10000 = viewHeight - var4 >> 1;
         } else if ((var2 & 1) != 0) {
            var10000 = 0;
         } else {
            if ((var2 & 4) == 0) {
               break label31;
            }

            var10000 = viewHeight - var4;
         }

         var6 = var10000;
      }

      label24: {
         if ((var2 & 10) == 10) {
            var10000 = viewWidth - var3 >> 1;
         } else if ((var2 & 8) != 0) {
            var10000 = 0;
         } else {
            if ((var2 & 2) == 0) {
               break label24;
            }

            var10000 = viewWidth - var3;
         }

         var5 = var10000;
      }

      var5 += viewOffsetX;
      var6 += viewOffsetY;
      var0.drawImage(var1.var_8a[0], var5, var6, 20);
   }

   static void drawTiledPattern(Graphics var0, int var1, int var2, int var3, int var4, Sprite var5, int var6, int var7, int var8) {
      var1 += viewOffsetX;
      var2 += viewOffsetY;
      var6 *= var7;
      var0.clipRect(var1, var2, var3, var4);
      int var10000 = var2;

      while(true) {
         int var10 = var10000;
         if (var10000 >= var2 + var4) {
            var0.setClip(0, 0, screenWidth, screenHeight);
            return;
         }

         var10000 = var1;

         while(true) {
            int var9 = var10000;
            if (var10000 >= var1 + var3) {
               var10000 = var10 + var8;
               break;
            }

            GameEngine.drawRegion(var0, var5, var9, var10, 20, var6, 0, var7, var8, 0);
            var10000 = var9 + var7;
         }
      }
   }

   public static void resetInput() {
      inputState = 0;
      lastKeyCode = 0;
      inputChanged = false;
   }

   static void handleKeyPress(int var0, boolean var1) {
      byte var2;
      byte var3;
      label54: {
         var2 = inputState;
         var3 = 0;
         byte var10000;
         if (var0 != 8 && var0 != 53) {
            if (var0 == 1) {
               var10000 = 2;
            } else if (var0 == 6) {
               var10000 = 4;
            } else if (var0 == 2) {
               var10000 = 8;
            } else if (var0 == 5) {
               var10000 = 16;
            } else if (var0 == 49) {
               var10000 = 10;
            } else if (var0 == 51) {
               var10000 = 18;
            } else if (var0 == 55) {
               var10000 = 12;
            } else if (var0 == 57) {
               var10000 = 20;
            } else {
               if (var0 != 48) {
                  break label54;
               }

               var10000 = -128;
            }
         } else {
            var10000 = 1;
         }

         var3 = var10000;
      }

      int var4;
      if (var1) {
         inputChanged = true;
         lastKeyCode = var0;
         var4 = var2 | var3;
      } else {
         var4 = var2 & ~var3;
      }

      var2 = (byte)var4;
      if (inputState != var2) {
         inputState = var2;
      }

   }

   static int randomInRange(int var0, int var1) {
      int var2 = GameEngine.random.nextInt();
      return var0 + Math.abs(var2) % (var1 - var0 + 1);
   }

   private static int interpolateColor(int var0, int var1, int var2) {
      label14: {
         short var10000;
         if (var2 < 0) {
            var10000 = 0;
         } else {
            if (var2 <= 256) {
               break label14;
            }

            var10000 = 256;
         }

         var2 = var10000;
      }

      int var6 = var0 >> 16 & 255;
      int var7 = var0 >> 8 & 255;
      int var8 = var0 & 255;
      int var9 = var1 >> 16 & 255;
      int var10 = var1 >> 8 & 255;
      int var11 = var1 & 255;
      int var3 = (var6 * (256 - var2) >> 8) + (var9 * var2 >> 8);
      int var4 = (var7 * (256 - var2) >> 8) + (var10 * var2 >> 8);
      int var5 = (var8 * (256 - var2) >> 8) + (var11 * var2 >> 8);
      return var3 << 16 | var4 << 8 | var5;
   }

   public static void setViewDimensions(int var0, int var1, boolean var2) {
      viewWidth = var0 <= 0 ? screenWidth : var0;
      viewHeight = var1 <= 0 ? screenHeight : var1;
      viewOffsetX = screenWidth - viewWidth >> 1;
      viewOffsetY = screenHeight - viewHeight >> 1;
      if (var2) {
         viewportFlags &= -16;
      }

   }

   private static void updateViewportFlags() {
      viewportFlags &= -241;
      if (viewportWidth < viewWidth) {
         if (viewportLeft > 0) {
            viewportFlags |= 128;
         }

         if (viewWidth - viewportWidth - viewportLeft > 0) {
            viewportFlags |= 32;
         }
      }

      if (viewportHeight < viewHeight) {
         if (viewportTop > 0) {
            viewportFlags |= 16;
         }

         if (viewHeight - viewportHeight - viewportTop > 0) {
            viewportFlags |= 64;
         }
      }

   }

   public static void drawViewportBorders(Graphics var0, int var1) {
      if ((viewportFlags & 240) != 0) {
         var0.setColor(var1);
         if ((viewportFlags & 128) != 0) {
            var0.fillRect(viewOffsetX, viewOffsetY, viewportLeft + marginX, viewHeight);
         }

         if ((viewportFlags & 32) != 0) {
            var0.fillRect(viewOffsetX + viewportLeft + viewportWidth - marginX, viewOffsetY, viewWidth - viewportWidth - viewportLeft + marginX, viewHeight);
         }

         if ((viewportFlags & 16) != 0) {
            var0.fillRect(viewOffsetX, viewOffsetY, viewWidth, viewportTop + marginY);
         }

         if ((viewportFlags & 64) != 0) {
            var0.fillRect(viewOffsetX, viewOffsetY + viewportHeight + viewportTop - marginY, viewWidth, viewHeight - viewportHeight - viewportTop + marginY);
         }
      }

   }

   private static void drawVerticalGradient(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8;
      int var12 = (var8 = var4 / var7) * var7;
      int var9 = 255 / var7;
      var1 += viewOffsetX;
      var2 += viewOffsetY;
      int var11 = 0;

      int var10;
      for(var10 = 0; var10 < var12; var11 += var9) {
         var0.setColor(interpolateColor(var5, var6, var11));
         var0.fillRect(var1, var2 + var10, var3, var8);
         var10 += var8;
      }

      var8 = var4 - var12;
      int var10000 = var12;

      while(true) {
         var10 = var10000;
         if (var10000 >= var4) {
            return;
         }

         var0.setColor(interpolateColor(var5, var6, var11));
         var0.fillRect(var1, var2 + var10, var3, var8);
         var10000 = var10 + var8;
      }
   }

   public static int getAnimationFrameCount(int var0, byte[] var1) {
      var0 = 1 + ((var1[0] & 255) << 1) + (var0 << 2);
      return var1[var0 + 1] & 255;
   }

   public static int getAnimationSpriteCount(int var0, int var1, byte[] var2) {
      int var3 = (var1 = 1 + ((var2[0] & 255) << 1) + (var1 << 2)) + 2 + (var0 << 1);
      int var4 = var1 + ((var2[var3 + 1] & 255) << 8) + (var2[var3] & 255);
      if ((var2[var4 + 0] & 2) != 0) {
         var3 = var4 + 4 + (var2[var4 + 1] & 255) * 7 + (var2[var4 + 2] & 255) * 5 + (var2[var4 + 3] & 255) * 3;
         return var2[var3] & 255;
      } else {
         return 1;
      }
   }

   static boolean drawCompositeSprite(Graphics var0, int var1, int var2, int var3, int var4, int var5, boolean var6, int var7, byte[] var8) {
      var3 = 1 + ((var8[0] & 255) << 1) + (var3 << 2);
      int var9 = var8[var3 + 1] & 255;
      boolean var10000;
      if (var4 >= var9 - 1) {
         var4 = var9 - 1;
         var10000 = true;
      } else {
         var10000 = false;
      }

      boolean var30 = var10000;
      int var10 = var3 + 2 + (var4 << 1);
      var10 = var3 + ((var8[var10 + 1] & 255) << 8) + (var8[var10] & 255);
      var9 = var8[var10 + 1] & 255;
      var10 += 4;
      if (var9 == 0) {
         return var30;
      } else {
         boundsLeft = Integer.MAX_VALUE;
         boundsTop = Integer.MAX_VALUE;
         boundsRight = -1;
         boundsBottom = -1;
         var1 += viewOffsetX;
         var2 += viewOffsetY;

         for(int var11 = 0; var11 < var9; var10 += 7) {
            int var13 = var8[var10 + 6] & 255;
            if ((var5 & 1 << var13) != 0) {
               int var17 = var8[var10 + 0] & 255;
               int var18 = var8[var10 + 1] & 255;
               Sprite var29 = (Sprite) resourceCache[var8[1 + var17]];
               byte[] var28 = (byte[]) resourceCache[var8[1 + var18]];
               byte var16 = var8[var10 + 2];
               var13 = (var8[var10 + 5] & 255) << 2;
               int var19 = (var28[var13++] & 255) << 1;
               int var20 = (var28[var13++] & 255) << 1;
               int var21 = (var28[var13++] & 255) << 1;
               int var22 = (var28[var13] & 255) << 1;
               int var23 = 0;
               if ((var16 & 16) != 0) {
                  var23 = 2;
               }

               if ((var16 & 32) != 0) {
                  var23 |= 1;
               }

               var23 ^= var7;
               int var26 = var1;
               int var27 = var2;
               if (var6) {
                  int var24 = var8[var10 + 3] & 255;
                  int var25 = var8[var10 + 4] & 255;
                  if ((var16 & 1) != 0) {
                     var24 = -var24;
                  }

                  if ((var16 & 2) != 0) {
                     var25 = -var25;
                  }

                  var26 = (var7 & 2) != 0 ? var1 - (var24 + var21) : var1 + var24;
                  var27 = (var7 & 1) != 0 ? var2 - (var25 + var22) : var2 + var25;
               }

               GameEngine.drawRegion(var0, var29, var26, var27, 20, var19, var20, var21, var22, var23);
               var13 = 0;
               int var12 = 0;
               int var14 = var21;
               int var15 = var22;
               if ((var16 & 64) != 0) {
                  if ((var7 & 2) != 0) {
                     var12 = (var16 & 16) != 0 ? var21 : -var21;
                  } else {
                     var12 = (var16 & 16) != 0 ? -var21 : var21;
                  }

                  var14 = var21 << 1;
                  GameEngine.drawRegion(var0, var29, var26 + var12, var27, 20, var19, var20, var21, var22, var23 ^ 2);
               }

               if ((var16 & 128) != 0) {
                  if ((var7 & 1) != 0) {
                     var13 = (var16 & 32) != 0 ? var22 : -var22;
                  } else {
                     var13 = (var16 & 32) != 0 ? -var22 : var22;
                  }

                  var15 = var22 << 1;
                  GameEngine.drawRegion(var0, var29, var26, var27 + var13, 20, var19, var20, var21, var22, var23 ^ 1);
               }

               if ((var16 & 192) == 192) {
                  GameEngine.drawRegion(var0, var29, var26 + var12, var27 + var13, 20, var19, var20, var21, var22, var23 ^ 3);
               }

               if (var12 < 0) {
                  var26 += var12;
               }

               if (var13 < 0) {
                  var27 += var13;
               }

               if (var26 < boundsLeft) {
                  boundsLeft = var26;
               }

               if (var27 < boundsTop) {
                  boundsTop = var27;
               }

               if (var26 + var14 > boundsRight) {
                  boundsRight = var26 + var14;
               }

               if (var27 + var15 > boundsBottom) {
                  boundsBottom = var27 + var15;
               }
            }

            ++var11;
         }

         boundsRight -= boundsLeft;
         boundsBottom -= boundsTop;
         return var30;
      }
   }

   static int readInt32LE(byte[] var0, int var1) {
      return ((var0[var1 + 3] & 255) << 24) + ((var0[var1 + 2] & 255) << 16) + ((var0[var1 + 1] & 255) << 8) + (var0[var1] & 255);
   }

   static short readInt16LE(byte[] var0, int var1) {
      return (short)(((var0[var1 + 1] & 255) << 8) + (var0[var1] & 255));
   }

   static void writeInt32LE(byte[] var0, int var1, int var2) {
      var0[var1 + 3] = (byte)(var2 >> 24 & 255);
      var0[var1 + 2] = (byte)(var2 >> 16 & 255);
      var0[var1 + 1] = (byte)(var2 >> 8 & 255);
      var0[var1 + 0] = (byte)(var2 & 255);
   }

   static void writeInt16LE(byte[] var0, int var1, short var2) {
      var0[var1 + 1] = (byte)(var2 >> 8 & 255);
      var0[var1 + 0] = (byte)(var2 & 255);
   }

   static boolean getBitInArray(byte[] var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 * var3 + var2;
      return (var0[var4 + (var5 >> 3)] & 1 << 7 - var5 % 8) != 0;
   }

   static void setBitInArray(byte[] var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 * var3 + var2;
      var0[var4 + (var5 >> 3)] = (byte)(var0[var4 + (var5 >> 3)] | 1 << 7 - var5 % 8);
   }

   static void initFontSystem(int var0) {
      fontSprites = new Sprite[var0];
      fontData = new Object[var0];
      numberBuffer = new char[10];
      charLimit = 0;
      languageId = 0;
   }

   static void disposeFonts() {
      unloadFont(-1);
      fontSprites = null;
      fontData = null;
      numberBuffer = null;
      if (iconSprite != null) {
         GameEngine.freeSprite(iconSprite);
         iconSprite = null;
      }

      clearCurrentFont();
   }

   static void loadFont(int var0, int var1, int var2) {
      fontSprites[var0] = GameEngine.loadSpriteSet(var1);
      BinaryReader var5;
      int var3 = ((var5 = GameEngine.openDataStream(var2)).buffer[var5.position++] & 255) + ((var5.buffer[var5.position++] & 255) << 8) + ((var5.buffer[var5.position++] & 255) << 16) + ((var5.buffer[var5.position++] & 255) << 24);
      fontData[var0] = GameEngine.readBytes(var5, var3);
      var5.buffer = null;
      byte[] var4;
      (var4 = (byte[]) fontData[var0])[69] = 5;
      var4[435] = 5;
   }

   private static void unloadFont(int var0) {
      for(int var1 = 0; var1 < fontSprites.length; ++var1) {
         if (var0 == -1 || var0 == var1) {
            if (fontSprites[var1] != null) {
               GameEngine.freeSprite(fontSprites[var1]);
               fontSprites[var1] = null;
            }

            if (fontData[var1] != null) {
               fontData[var1] = null;
            }
         }
      }

      clearCurrentFont();
   }

   public static void clearCurrentFont() {
      fontChars = null;
      stringTable = null;
   }

   public static void setCurrentFont(char[] var0, int[] var1) {
      fontChars = var0;
      stringTable = var1;
   }

   public static int loadStringTable(int var0) {
      BinaryReader var3;
      byte[] var2 = GameEngine.readBytes(var3 = GameEngine.openDataStream(languageId * 174 + var0), GameEngine.getStreamSize(var3));
      var3.buffer = null;
      fontChars = decodeString(var2, var2.length);
      return parseStringTable();
   }

   public static int parseStringTable() {
      stringTable = null;
      if (fontChars == null) {
         return 0;
      } else {
         int var0 = fontChars.length;
         int var1 = 0;
         int var4 = 0;

         char var2;
         while(var1 < var0) {
            if ((var2 = fontChars[var1++]) == 0 || var1 >= var0) {
               ++var4;
               break;
            }

            if (var2 == '\n') {
               ++var4;
            }
         }

         if (var4 > 0) {
            stringTable = new int[var4];
            int var3 = 0;
            var1 = 0;
            stringTable[0] = 0;

            do {
               do {
                  if (var1 >= var0) {
                     return var4;
                  }
               } while((var2 = fontChars[var1++]) != '\n' && var2 != 0 && var1 < var0);

               int[] var10000 = stringTable;
               var10000[var3] |= var1 - stringTable[var3] - 1 << 16;
               ++var3;
               if (var3 < var4) {
                  stringTable[var3] = var1;
               }
            } while(var2 != 0);
         }

         return var4;
      }
   }

   public static int getFontHeight(int var0) {
      return ((byte[]) fontData[var0])[2];
   }

   public static int getStringWidth(int var0, int var1) {
      if (fontChars != null && var1 < stringTable.length) {
         int var3 = stringTable[var1] >> 16;
         int var4 = stringTable[var1] & '\uffff';
         byte[] var8 = (byte[]) fontData[var0];
         int var2 = 0;

         int var6;
         for(var6 = 0; var2 < var3; ++var2) {
            int var5;
            if ((var5 = fontChars[var4 + var2] & 255) == 64) {
               ++var2;
               if (iconSprite != null) {
                  var6 += 0;
               }
            } else {
               byte var7;
               if ((var7 = var8[4 + var5 * 2 + 1]) != 0) {
                  var6 += var7 + 0;
               }
            }
         }

         return var6;
      } else {
         return 0;
      }
   }

   public static int drawCharacter(Graphics var0, char var1, int var2, int var3, int var4, int var5) {
      int var9 = var1 & 255;
      byte var8;
      byte[] var12;
      if ((var8 = (var12 = (byte[]) fontData[var4])[4 + var9 * 2 + 1]) > 0) {
         if (var5 != -1) {
            var2 += var5 - var8 >> 1;
         }

         if (var1 != ' ' && var1 != 215 && var1 != 182 && var0 != null) {
            byte var10 = var12[1];
            byte var11 = var12[2];
            int var6;
            int var7 = (var6 = var12[4 + var9 * 2 + 0] & 255) / var12[3];
            var6 = (var6 - var7 * var12[3]) * var10;
            var7 *= var11;
            GameEngine.drawRegion(var0, fontSprites[var4], viewOffsetX + var2, viewOffsetY + var3, 20, var6, var7, var10, var11, 0);
         }

         var2 += var8 + 0;
      }

      return var2;
   }

   public static int drawString(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var22 = var5 >> 24;
      int var23 = var5 >> 16 & 255;
      var5 &= 65535;
      if (fontChars == null) {
         return 0;
      } else {
         byte[] var21;
         int var17 = (var21 = (byte[]) fontData[var7])[2] + 1;
         var22 = var22 > 0 && var1 + var22 <= stringTable.length ? var22 + var1 : stringTable.length;
         byte var18 = (byte)(var4 >> 8 & 255);
         int var10000 = stringTable[var1] >> 16;
         boolean var11 = false;
         int var9 = var10000;
         int var10 = stringTable[var1] & '\uffff';
         int var14 = 0;
         int var19;
         int var24;
         if (var5 == 0) {
            var19 = var2;
            var24 = getStringWidth(var7, var1);
            switch(var4 & 255) {
            case 11:
               var2 -= var24 >> 1;
               break;
            case 15:
               var2 -= var24 >> 1;
               var3 -= var17 >> 1;
            }

            if (var0 != null) {
               var19 = drawStringInternal(var0, fontChars, var10, var9, var2, var3, var7);
            }

            var3 += var17 + var18;
         } else {
            while(true) {
               int var15 = 0;
               var19 = var2;
               if (var9 == 0) {
                  if (var0 != null && (var22 == 0 || var22 != 0 && var14 >= var6)) {
                     var3 += var17 + var18;
                     if (var22 != 0 && var23 != 0) {
                        --var23;
                        if (var23 <= 0) {
                           if ((var4 >> 16 & 255) == 0) {
                              return var3;
                           }

                           return var2;
                        }
                     }
                  }

                  ++var14;
               }

               while(var15 < var9) {
                  int var13 = var3;
                  int var12 = 0;
                  var24 = 0;
                  var19 = 0;
                  int var16 = var15;

                  int var8;
                  for(var8 = var15; var8 < var9; ++var8) {
                     char var20;
                     if ((var20 = fontChars[var10 + var8]) != 167 && var20 != '~') {
                        if (var20 == '@') {
                           ++var8;
                           var12 += 0;
                        } else {
                           if (var20 == 182) {
                              var16 = var8 - 1;
                              var24 = var12;
                              break;
                           }

                           if (var20 == ' ') {
                              var24 = var12;
                              var16 = var8 - 1;
                           }

                           var12 += var21[4 + ((var20 & 255) << 1) + 1] + 0;
                        }

                        if (var12 >= var5) {
                           break;
                        }
                     }
                  }

                  label135: {
                     if (var8 >= var9) {
                        var10000 = var9 - 1;
                     } else {
                        if (var16 != var15) {
                           break label135;
                        }

                        var10000 = var8 + 1;
                     }

                     var16 = var10000;
                     var24 = var12;
                  }

                  if (var0 != null && (var22 == 0 || var22 != 0 && var14 >= var6)) {
                     var8 = var16 - var15 + 1;
                     var12 = var2;
                     switch(var4 & 255) {
                     case 11:
                        var12 = var2 - (var24 >> 1);
                        break;
                     case 15:
                        var12 = var2 - (var24 >> 1);
                        var13 = var3 - (var17 + var18 >> 1);
                     }

                     var19 = drawStringInternal(var0, fontChars, var10 + var15, var8, var12, var13, var7);
                     var3 += var17 + var18;
                     if (var22 != 0 && var23 != 0) {
                        --var23;
                        if (var23 <= 0) {
                           if ((var4 >> 16 & 255) == 0) {
                              return var3;
                           }

                           return var19;
                        }
                     }
                  }

                  var15 = var16 + 2;
                  ++var14;
               }

               ++var1;
               if (var1 >= var22) {
                  break;
               }

               var9 = stringTable[var1] >> 16;
               var10 = stringTable[var1] & '\uffff';
            }
         }

         if (var0 != null) {
            return (var4 >> 16 & 255) == 0 ? var3 : var19;
         } else {
            return var14;
         }
      }
   }

   private static int drawStringInternal(Graphics var0, char[] var1, int var2, int var3, int var4, int var5, int var6) {
      var4 += viewOffsetX;
      var5 += viewOffsetY;
      var3 += var2;
      textOverflow = false;
      byte[] var14;
      byte var12 = (var14 = (byte[]) fontData[var6])[1];
      byte var13 = var14[2];

      for(int var8 = var2; var8 < var3; ++var8) {
         int var7;
         if ((var7 = var1[var8] & 255) == 64) {
            ++var8;
            var7 = var1[var8] - 97;
            if (iconSprite != null) {
               GameEngine.drawRegion(var0, iconSprite, var4, var5, 20, var7 * 0, 0, 0, 0, 0);
               var4 += 0;
            }
         } else {
            byte var9;
            if (var7 != 167 && var7 != 126 && (var9 = var14[4 + var7 * 2 + 1]) != 0) {
               if (var7 != 32 && var7 != 215) {
                  int var10;
                  int var11 = (var10 = var14[4 + var7 * 2 + 0] & 255) / var14[3];
                  var10 = (var10 - var11 * var14[3]) * var12;
                  var11 *= var13;
                  if (charLimit != 0 && charCounter >= charLimit) {
                     textOverflow = true;
                  } else {
                     GameEngine.drawRegion(var0, fontSprites[var6], var4, var5, 20, var10, var11, var12, var13, 0);
                  }

                  ++charCounter;
               }

               var4 += var9 + 0;
            }
         }
      }

      return var4 - viewOffsetX;
   }

   public static int drawNumber(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = 0;
      byte var14 = 0;
      var2 += viewOffsetX;
      var3 += viewOffsetY;
      if (var1 < 0) {
         var14 = 1;
         var1 = -var1;
      }

      label87: {
         char[] var10000;
         int var10001;
         byte var10002;
         if (var1 == 0) {
            var10000 = numberBuffer;
            var10001 = 0;
            ++var8;
            var10002 = 48;
         } else {
            while(true) {
               if (var1 <= 0) {
                  if (var14 == 0) {
                     break label87;
                  }

                  var10000 = numberBuffer;
                  var10001 = var8++;
                  var10002 = 45;
                  break;
               }

               numberBuffer[var8++] = (char)(48 + var1 % 10);
               var1 /= 10;
            }
         }

         var10000[var10001] = (char)var10002;
      }

      if (var4 > 0 && var4 - var8 - var14 > 0) {
         for(int var7 = 0; var7 < Math.min(var4 - var8 - var14, 10); ++var7) {
            numberBuffer[var8++] = '0';
         }
      }

      if (var5 == -2) {
         return var8;
      } else {
         byte[] var15 = (byte[]) fontData[var6];
         int var9;
         char var16;
         if (var5 != -1) {
            int var11 = 0;
            var9 = var8;

            while(true) {
               --var9;
               if (var9 < 0) {
                  var2 += var5 - var11 >> 1;
                  break;
               }

               var16 = numberBuffer[var9];
               byte var10;
               if ((var10 = var15[4 + var16 * 2 + 1]) != 0) {
                  var11 += var10 + 0;
               }
            }
         }

         while(true) {
            byte var18;
            do {
               --var8;
               if (var8 < 0) {
                  return var2 - viewOffsetX;
               }

               var16 = numberBuffer[var8];
            } while((var18 = var15[4 + var16 * 2 + 1]) == 0);

            if (var0 != null) {
               byte var12 = var15[1];
               byte var13 = var15[2];
               int var17 = (var9 = var15[4 + var16 * 2 + 0] & 255) / var15[3];
               var9 = (var9 - var17 * var15[3]) * var12;
               var17 *= var13;
               GameEngine.drawRegion(var0, fontSprites[var6], var2, var3, 20, var9, var17, var12, var13, 0);
            }

            var2 += var18 + 0;
         }
      }
   }

   static void insertValueInText(int var0, int var1, int var2, char[] var3, int var4, int var5) {
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      int var14 = var3 == null ? drawNumber((Graphics)null, var2, 0, 0, 0, -2, 0) : 0;
      int var10 = 0;

      for(int var7 = var0; var7 < stringTable.length; ++var7) {
         int var8 = stringTable[var7] >> 16;
         int var9 = stringTable[var7] & '\uffff';

         for(int var6 = 0; var6 < var8; ++var6) {
            boolean var10000;
            if (fontChars[var9 + var6] == '~') {
               if (var10 == var1) {
                  var12 = true;
                  if (var3 == null) {
                     --var14;
                     if (var14 >= 0) {
                        fontChars[var9 + var6] = numberBuffer[var14];
                     } else {
                        fontChars[var9 + var6] = 167;
                     }
                  } else if (var14 < var5) {
                     fontChars[var9 + var6] = var3[var4 + var14++];
                  } else {
                     fontChars[var9 + var6] = 167;
                  }
                  continue;
               }

               if (var13) {
                  continue;
               }

               var10000 = true;
            } else {
               if (var12) {
                  break;
               }

               if (!var13) {
                  continue;
               }

               ++var10;
               var10000 = false;
            }

            var13 = var10000;
         }

         if (var12) {
            return;
         }
      }

   }

   static void initDialog(int var0, int var1, int var2, int var3, int var4, int var5) {
      currentFontId = var3;
      currentFontHeight = getFontHeight(var3);
      dialogWidth = var2;
      dialogHeight = 10 + (currentFontHeight + 1) * 3;
      if ((dialogHeight & 1) != 0) {
         ++dialogHeight;
      }

      startLineIndex = var1;
      stringId = var0;
      dialogState = 30;
      dialogFlags = var5;
      dialogFlags &= -65;
      previousIconId = -1;
      currentIconId = -1;
      lineVisibilityMask = 0;
      iconFontId = var4;
      dialogNavigation = 0;
      charAnimationCounter = 1;
   }

   private static void closeDialog() {
      dialogNavigationType = 0;
      savedFontChars = null;
      savedStringTable = null;
      clearCurrentFont();
   }

   public static void handleDialogInput(int var0) {
      if (dialogState == 34) {
         int var1 = dialogNavigation & 255;
         int var2 = dialogNavigation >> 8 & 255;
         if (dialogNavigation != 0 && dialogNavigation != 16777216 && var1 != 0 && var2 > 0) {
            if (inputState == 8) {
               dialogNavigation &= 65535;
               dialogFlags |= 1;
               return;
            }

            if (inputState == 16) {
               dialogNavigation = 65536 | dialogNavigation & '\uffff';
               dialogFlags |= 1;
               return;
            }

            if ((inputState & 1) != 0) {
               ++textDisplayTimer;
               dialogFlags |= 1;
               return;
            }
         } else {
            if ((inputState & 5) != 0) {
               if (charAnimationCounter != 0) {
                  charAnimationCounter = 0;
               } else {
                  charAnimationCounter = 1;
                  ++textDisplayTimer;
               }

               dialogFlags |= 1;
               return;
            }

            if (var0 == -6) {
               textDisplayTimer = maxTextTimer;
               dialogState = 35;
            }
         }

      }
   }

   public static boolean updateDialog() {
      setCurrentFont(savedFontChars, savedStringTable);
      int var0;
      int var1;
      switch(dialogState) {
      case 30:
         loadStringTable(stringId);
         savedFontChars = fontChars;
         savedStringTable = stringTable;
         dialogNavigation = 0;
         textDisplayTimer = 0;
         maxTextTimer = renderDialogText((Graphics)null, 0, 0, 0);
         dialogFlags |= 1;
         dialogState = 31;
      case 31:
      default:
         break;
      case 32:
         dialogState = 34;
         break;
      case 33:
         if (lineVisibilityMask != 0) {
            var0 = dialogNavigation & 255;
            var1 = dialogNavigation >> 8 & 255;
            int var2 = (fontChars[2] | 32) - 97;
            int var3 = (fontChars[3] | 32) - 97;
            if (lineVisibilityMask != 1 && (var2 != 0 || var3 != 0)) {
               if (lineVisibilityMask == 2) {
                  ++var1;
                  dialogNavigation = ((dialogFlags & 16) != 0 ? 0 : 1) << 16 | (var1 & 255) << 8 | var0 & 255;
               } else {
                  dialogNavigation = 16777216;
                  if (lineVisibilityMask == 3 && var2 > 0) {
                     startLineIndex = 3;
                  } else if (lineVisibilityMask == 4 && var3 > 0) {
                     startLineIndex = 3 + var2;
                  } else {
                     dialogState = 35;
                  }
               }

               maxTextTimer = renderDialogText((Graphics)null, 0, 0, 0);
               textDisplayTimer = 0;
               dialogFlags |= 1;
               dialogState = 34;
               lineVisibilityMask = 0;
            } else {
               dialogState = 35;
            }
         }
         break;
      case 34:
         if (textDisplayTimer >= maxTextTimer) {
            if ((var0 = dialogNavigation & 255) != 0 && (var1 = dialogNavigation >> 8 & 255) <= var0) {
               if (var1 == 0) {
                  ++var1;
                  dialogNavigation = ((dialogFlags & 16) != 0 ? 0 : 1) << 16 | (var1 & 255) << 8 | var0 & 255;
                  maxTextTimer = renderDialogText((Graphics)null, 0, 0, 0);
                  textDisplayTimer = 0;
                  dialogFlags |= 1;
               } else {
                  dialogState = 33;
               }
            } else {
               dialogState = 35;
            }
         }
         break;
      case 35:
         closeDialog();
         return true;
      }

      return false;
   }

   public static boolean drawDialog(Graphics var0, int var1, int var2, int var3) {
      if (dialogState == 35) {
         return false;
      } else {
         var0.setColor(9961472);
         var0.fillRect(viewOffsetX + var1, viewOffsetY + var2, viewWidth, dialogHeight);
         drawVerticalGradient(var0, var1 + 2, var2 + 2, dialogWidth - 4, dialogHeight - 4, 4737080, 0, 16);
         setCurrentFont(savedFontChars, savedStringTable);
         if (dialogState != 34) {
            return true;
         } else {
            dialogFlags &= -2;
            int var4;
            if ((var4 = textDisplayTimer) >= maxTextTimer) {
               var4 = maxTextTimer - 1;
            }

            renderDialogText(var0, var3, var2, var4);
            if (charAnimationCounter != 0) {
               charAnimationCounter += 2;
            }

            if (textDisplayTimer < maxTextTimer - 1 && frameCounter % 20 != 0) {
               drawCharacter(var0, '°', var3 + dialogWidth - drawCharacter((Graphics)null, '°', 0, 0, currentFontId, -1) - 2, var2 + dialogHeight - currentFontHeight, currentFontId, -1);
            }

            return true;
         }
      }
   }

   private static int renderDialogText(Graphics var0, int var1, int var2, int var3) {
      int var9;
      int var10;
      int var11;
      int var13;
      int var14;
      int var10000;
      label74: {
         label86: {
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            var9 = 0;
            var10 = 0;
            var11 = 0;
            boolean var12 = false;
            if ((dialogNavigation & 16777216) == 0 && stringTable[0] >> 16 >= 7 && fontChars[0] == '@' && (fontChars[1] | 32) == 122) {
               int var15 = (fontChars[2] | 32) - 97;
               int var16 = (fontChars[3] | 32) - 97;
               var14 = (fontChars[4] | 32) - 97;
               var9 = (fontChars[5] | 32) - 97;
               var10 = dialogNavigation >> 8 & 255;
               var11 = dialogNavigation >> 16 & 255;
               if (var10 == 0 && var14 == 0) {
                  ++var10;
                  dialogNavigation = ((dialogFlags & 16) != 0 ? 0 : 1) << 16 | (var10 & 255) << 8 | var9 & 255;
               }

               if (var10 == 0) {
                  var13 = 3 + var15 + var16;
                  dialogNavigation = ((dialogFlags & 16) != 0 ? 0 : 1) << 16 | var9;
                  break label74;
               }

               if (var10 > var9) {
                  return -1;
               }

               var13 = 3 + var14 + var15 + var16 + (var10 - 1);
               if (4 + var10 < stringTable[0] >> 16) {
                  var10000 = (fontChars[6 + var10] | 32) - 97;
                  break label86;
               }
            } else {
               if (startLineIndex == -1) {
                  var13 = 0;
                  var10000 = -1;
                  break label86;
               }

               var13 = startLineIndex;
            }

            var10000 = 1;
         }

         var14 = var10000;
      }

      int var17 = drawWrappedText(var0, var1 + 5, var2 + 5, var3, dialogWidth - 10, var13, var14);
      if (var0 != null && var9 != 0 && var10 > 0 && textDisplayTimer >= maxTextTimer - 1) {
         var13 = drawCharacter((Graphics)null, '±', 0, 0, iconFontId, -1) * 2;
         int var4 = getStringWidth(currentFontId, 2);
         var17 += var2 + dialogHeight - currentFontHeight - 1 - var17 >> 1;
         if (var11 == 0) {
            drawCharacter(var0, '±', var1 + 8 + (GameEngine.cos(frameCounter * 32) * 3 >> 16), var17, iconFontId, -1);
         }

         drawStringInternal(var0, fontChars, stringTable[1] & '\uffff', stringTable[1] >> 16, var1 + 0 + 8 + var13, var17, currentFontId);
         if (var11 == 1) {
            drawCharacter(var0, '±', var1 + dialogWidth - var4 - var13 - 8 + (GameEngine.cos(frameCounter * 32) * 3 >> 16), var17, iconFontId, -1);
         }

         drawStringInternal(var0, fontChars, stringTable[2] & '\uffff', stringTable[2] >> 16, var1 + 0 + dialogWidth - var4 - 8, var17, currentFontId);
         var10000 = dialogFlags | 128;
      } else {
         var10000 = dialogFlags & -129;
      }

      dialogFlags = var10000;
      return var17;
   }

   private static int drawWrappedText(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var17 = false;
      boolean var19 = false;
      int var20 = var5;
      int var21 = var6 == -1 ? -1 : var5 + var6 - 1;
      if (var0 != null) {
         previousIconId = currentIconId;
      }

      byte[] var18 = (byte[]) fontData[currentFontId];
      charCounter = 0;
      charLimit = charAnimationCounter;
      int var16 = 0;
      boolean var12 = false;
      int var11 = 0;

      do {
         int var8 = stringTable[var20] >> 16;
         int var9 = stringTable[var20] & '\uffff';
         int var14 = 0;
         int var15 = 0;
         if (dialogNavigationType != 0 && (dialogNavigationType & 1 << var20) == 0) {
            var14 = var8;
         }

         label117:
         do {
            do {
               if (var14 >= var8) {
                  break label117;
               }

               var17 = false;
               int var10 = 0;

               int var7;
               int var13;
               for(var7 = var14; var7 < var8; ++var7) {
                  if (fontChars[var9 + var7] == '@') {
                     ++var7;
                     if (var10 + 0 >= var4) {
                        break;
                     }

                     var10 += 0;
                     if (var11 != 0) {
                        var12 = true;
                        break;
                     }

                     if (var0 != null) {
                        currentIconId = (fontChars[var9 + var7] | 32) - 97;
                     }
                  } else {
                     if (fontChars[var9 + var7] == ' ') {
                        var15 = var7 - 1;
                     }

                     var13 = (var18[4 + ((fontChars[var9 + var7] & 255) << 1) + 1] & 255) + 0;
                     if (var10 + var13 >= var4) {
                        break;
                     }

                     var10 += var13;
                  }
               }

               if (var7 >= var8) {
                  var15 = var8 - 1;
               }

               if (!var12) {
                  if (var0 != null && var16 == var3) {
                     var13 = var15 - var14 + 1;
                     drawStringInternal(var0, fontChars, var9 + var14, var13, var1, var2, currentFontId);
                     if (textOverflow) {
                        var19 = true;
                     }

                     var2 += currentFontHeight + 1;
                  }

                  var14 = var15 + 2;
               }

               ++var11;
            } while(var11 < 3 && !var12);

            var11 = 0;
            var12 = false;
            ++var16;
            var17 = true;
         } while(var0 == null || var16 <= var3);

         if (var0 != null && var16 > var3) {
            break;
         }

         ++var20;
      } while(var21 == -1 && var20 < stringTable.length || var21 != -1 && var20 <= var21);

      if (var0 != null && !var19) {
         charAnimationCounter = 0;
      }

      if (!var17) {
         ++var16;
      }

      charCounter = 0;
      charLimit = 0;
      if (var0 != null && previousIconId != -1 && previousIconId != currentIconId) {
         dialogFlags |= 64;
      }

      return var0 == null ? var16 : var2;
   }

   public static void initResourceCache(int var0) {
      resourceIds = new int[var0];
      resourceCache = new Object[var0];

      for(int var1 = 0; var1 < var0; ++var1) {
         resourceIds[var1] = -1;
         resourceCache[var1] = null;
      }

   }

   public static void clearResourceCache() {
      resourceIds = null;
      if (resourceCache != null) {
         for(int var0 = 0; var0 < resourceCache.length; ++var0) {
            resourceCache[var0] = null;
         }
      }

      resourceCache = null;
   }

   private static int findResourceInCache(int var0, int var1) {
      int var2 = var1 < 0 ? var0 & '\uffff' : (var1 << 16) + (var0 & '\uffff');

      for(int var3 = 0; var3 < resourceIds.length; ++var3) {
         if (resourceIds[var3] == var2 && resourceCache[var3] != null) {
            return var3;
         }
      }

      return -1;
   }

   public static int loadResource(int var0, int var1, int var2) {
      int var3 = var1 < 0 ? var0 & '\uffff' : (var1 << 16) + (var0 & '\uffff');

      int var6;
      for(var6 = 0; var6 < resourceIds.length; ++var6) {
         if (resourceIds[var6] == var3 && resourceCache[var6] != null) {
            return var6;
         }
      }

      var6 = findFreeSlot();
      Sprite var10;
      switch(var2) {
      case 0:
         resourceCache[var6] = GameEngine.loadSpriteSet(var0);
         break;
      case 1:
         var10 = GameEngine.loadSpriteSet(var0);
         resourceCache[var6] = GameEngine.recolorSprite(var10, loadPalette(var1), -1);
         GameEngine.freeSprite(var10);
         break;
      case 2:
      default:
         return -1;
      case 3:
         BinaryReader var11;
         byte[] var9 = GameEngine.readBytes(var11 = GameEngine.openDataStream(var0), GameEngine.getStreamSize(var11));
         var11.buffer = null;
         resourceCache[var6] = var9;
         resourceIds[var6] = var3;
         int var5 = var9[0] & 255;

         int var4;
         for(var4 = 1; var4 < 1 + var5 * 2; var4 += 2) {
            var0 = 32 + (var9[var4] & 127);
            int var10000;
            int var10001;
            if ((var9[var4] & 128) != 0) {
               var10000 = var0;
               var10001 = var1;
            } else {
               var10000 = var0;
               var10001 = -1;
            }

            int var7;
            if ((var7 = findResourceInCache(var10000, var10001)) == -1) {
               var7 = findFreeSlot();
               var10 = GameEngine.loadSpriteSet(var0);
               if ((var9[var4] & 128) != 0 && var1 != -1) {
                  resourceCache[var7] = GameEngine.recolorSprite(var10, loadPalette(var1), -1);
                  GameEngine.freeSprite(var10);
               } else {
                  resourceCache[var7] = var10;
               }

               resourceIds[var7] = var1 < 0 ? var0 & '\uffff' : (var1 << 16) + (var0 & '\uffff');
            }

            var9[var4] = (byte)var7;
         }

         for(var4 = 1; var4 < 1 + var5 * 2; var4 += 2) {
            int var8;
            if ((var8 = findResourceInCache(var0 = 437 + (var9[var4 + 1] & 255), -1)) == -1) {
               var8 = findFreeSlot();
               resourceCache[var8] = loadRawData(var0);
               resourceIds[var8] = var0 & '\uffff';
            }

            var9[var4 + 1] = (byte)var8;
         }

         return var6;
      case 4:
         resourceCache[var6] = GameEngine.openDataStream(var0);
         break;
      case 5:
         resourceCache[var6] = loadPalette(var0);
      }

      resourceIds[var6] = var3;
      return var6;
   }

   public static Object getResource(int var0) {
      return resourceCache[var0];
   }

   public static boolean freeResource(int var0, int var1) {
      if (var0 < 0) {
         return false;
      } else {
         if (var1 != 0 && var1 != 1) {
            if (var1 == 4) {
               ((BinaryReader) resourceCache[var0]).buffer = null;
            } else if (var1 == 3) {
               byte[] var2 = (byte[]) resourceCache[var0];
               int var3 = 1 + (var2[0] & 255) * 2;

               for(int var4 = 1; var4 < var3; var4 += 2) {
                  byte var5 = var2[var4];
                  byte var6 = var2[var4 + 1];
                  if (var5 > var0) {
                     GameEngine.freeSprite((Sprite) resourceCache[var5]);
                     resourceIds[var5] = -1;
                     resourceCache[var5] = null;
                  }

                  if (var6 > var0) {
                     resourceIds[var6] = -1;
                     resourceCache[var6] = null;
                  }
               }
            }
         } else {
            GameEngine.freeSprite((Sprite) resourceCache[var0]);
         }

         resourceIds[var0] = -1;
         resourceCache[var0] = null;
         return true;
      }
   }

   private static int findFreeSlot() {
      for(int var0 = 0; var0 < resourceIds.length; ++var0) {
         if (resourceIds[var0] == -1 && resourceCache[var0] == null) {
            return var0;
         }
      }

      return -1;
   }

   public static byte[] loadByteArray(int var0) {
      BinaryReader var1;
      GameEngine.readInt32LE(var1 = GameEngine.openDataStream(var0));
      int var2 = (var1.buffer[var1.position++] & 255) + ((var1.buffer[var1.position++] & 255) << 8) + ((var1.buffer[var1.position++] & 255) << 16) + ((var1.buffer[var1.position++] & 255) << 24);
      byte[] var3 = GameEngine.readBytes(var1, var2);
      var1.buffer = null;
      return var3;
   }

   public static short[] loadShortArray(int var0) {
      BinaryReader var1;
      GameEngine.readInt32LE(var1 = GameEngine.openDataStream(var0));
      int var2;
      short[] var4 = new short[var2 = (var1.buffer[var1.position++] & 255) + ((var1.buffer[var1.position++] & 255) << 8) + ((var1.buffer[var1.position++] & 255) << 16) + ((var1.buffer[var1.position++] & 255) << 24)];

      for(int var3 = 0; var3 < var2; ++var3) {
         var4[var3] = (short)(var1.buffer[var1.position++] & 255);
         var4[var3] += (short)((var1.buffer[var1.position++] & 255) << 8);
      }

      var1.buffer = null;
      return var4;
   }

   public static int[] loadIntArray(int var0) {
      BinaryReader var1;
      GameEngine.readInt32LE(var1 = GameEngine.openDataStream(var0));
      int var2;
      int[] var4 = new int[var2 = (var1.buffer[var1.position++] & 255) + ((var1.buffer[var1.position++] & 255) << 8) + ((var1.buffer[var1.position++] & 255) << 16) + ((var1.buffer[var1.position++] & 255) << 24)];

      for(int var3 = 0; var3 < var2; ++var3) {
         var4[var3] = var1.buffer[var1.position++] & 255;
         var4[var3] += (var1.buffer[var1.position++] & 255) << 8;
         var4[var3] += (var1.buffer[var1.position++] & 255) << 16;
         var4[var3] += (var1.buffer[var1.position++] & 255) << 24;
      }

      var1.buffer = null;
      return var4;
   }

   private static byte[] loadPalette(int var0) {
      BinaryReader var1;
      GameEngine.readInt32LE(var1 = GameEngine.openDataStream(var0));
      byte[] var3 = GameEngine.readBytes(var1, 48);
      byte[] var4;
      GameEngine.setPaletteColor(var4 = new byte[48], 0, (-16777216 | (var3[0] & 255 & 255) << 16 | (var3[1] & 255 & 255) << 8 | var3[2] & 255 & 255) & 16777215);

      for(int var2 = 1; var2 < 16; ++var2) {
         GameEngine.setPaletteColor(var4, var2, -16777216 | (var3[var2 * 3] & 255 & 255) << 16 | (var3[var2 * 3 + 1] & 255 & 255) << 8 | var3[var2 * 3 + 2] & 255 & 255);
      }

      var1.buffer = null;
      return var4;
   }

   private static byte[] loadRawData(int var0) {
      BinaryReader var1 = GameEngine.openDataStream(var0);

      for(int var2 = 0; var2 < 7; ++var2) {
         ++var1.position;
      }

      byte[] var4 = GameEngine.readBytes(var1, GameEngine.getStreamSize(var1) - 7);
      var1.buffer = null;
      return var4;
   }

   private static char[] decodeString(byte[] var0, int var1) {
      Object var6 = null;
      byte var3 = 0;
      int var7 = var3 + 1;
      char[] var8 = new char[var1 + 1];

      for(int var2 = 0; var2 < var1 - 1; ++var2) {
         var8[var2] = (char)(var0[var7++] & 255);
      }

      var8[var1] = 0;
      return var8;
   }

   public static void initMapSystem() {
      layerProperties = null;
      tileMaps = null;
      layerSprites = null;
      mapDataBuffer = null;
      zoneData = null;
      collisionMap = null;
      layerCount = 0;
      zoneCount = 0;
      mapLoadProgress = 0;
      foundWarpZone = -1;
      foundEventZone = -1;
      foundTriggerZone = -1;
      defaultPaletteId = -1;
      mapFlags = -1;
   }

   public static void disposeMapSystem() {
      clearMapData();
   }

   public static void clearMapData() {
      zoneData = null;
      zoneCount = 0;
      mapDataBuffer = null;
      collisionMap = null;
      int var0;
      if (objectArray != null) {
         for(var0 = 0; var0 < objectArray.length; ++var0) {
            objectArray[var0] = null;
         }
      }

      objectArray = null;
      if (layerSprites != null) {
         for(var0 = 0; var0 < layerSprites.length; var0 += 2) {
            for(int var1 = 0; var1 < 2; ++var1) {
               GameEngine.freeSprite(layerSprites[var0 + var1]);
               layerSprites[var0 + var1] = null;
            }
         }

         layerSprites = null;
      }

      if (tileMaps != null) {
         for(var0 = 0; var0 < tileMaps.length; ++var0) {
            if (tileMaps[var0] != null) {
               GameEngine.disposeTileMap(tileMaps[var0]);
            }

            tileMaps[var0] = null;
         }

         tileMaps = null;
      }

      layerProperties = null;
      layerCount = 0;
   }

   public static void setMapViewport(int var0, int var1, int var2, int var3) {
      viewportLeft = var0;
      viewportTop = var1;
      viewportWidth = var2;
      viewportHeight = var3;
      int var5 = 0;

      for(int var4 = 0; var4 < layerCount; var5 += 23) {
         label21: {
            int var6;
            int[] var10000;
            int var10001;
            int var10002;
            int[] var10003;
            int var10004;
            byte var10005;
            if ((var6 = layerProperties[var5 + 21]) == 5) {
               var10000 = layerProperties;
               var10001 = var5 + 20;
               var10002 = viewportHeight - layerProperties[var5 + 20];
               var10003 = layerProperties;
               var10004 = var5;
               var10005 = 5;
            } else {
               if (var6 == 7) {
                  layerProperties[var5 + 20] = viewportHeight - layerProperties[var5 + 20] - layerProperties[var5 + 5];
               } else if (var6 != 2) {
                  break label21;
               }

               var10000 = layerProperties;
               var10001 = var5 + 19;
               var10002 = viewportWidth - layerProperties[var5 + 19];
               var10003 = layerProperties;
               var10004 = var5;
               var10005 = 4;
            }

            var10000[var10001] = var10002 - var10003[var10004 + var10005];
         }

         ++var4;
      }

      updateViewportFlags();
   }

   public static void setCameraSize(int var0, int var1, int var2, boolean var3) {
      int var4 = 23 * var0;
      if (var3) {
         if (var1 > layerProperties[var4 + 4]) {
            var1 = layerProperties[var4 + 4];
         }

         if (var2 > layerProperties[var4 + 5]) {
            var2 = layerProperties[var4 + 5];
         }
      }

      layerProperties[var4 + 12] = var1;
      layerProperties[var4 + 13] = var2;
      layerProperties[var4 + 8] = layerProperties[var4 + 4] - layerProperties[var4 + 12];
      layerProperties[var4 + 9] = layerProperties[var4 + 5] - layerProperties[var4 + 13];
   }

   public static int setCameraPosition(int var0, int var1, int var2, boolean var3, boolean var4) {
      int var5 = var0 * 23;
      int var6 = var0 * 1;
      int var7 = 0;
      layerProperties[var5 + 10] = var1;
      layerProperties[var5 + 11] = var2;
      if (!var3) {
         int[] var10000 = layerProperties;
         var10000[var5 + 10] -= layerProperties[var5 + 12] >> 1;
         var10000 = layerProperties;
         var10000[var5 + 11] -= layerProperties[var5 + 13] >> 1;
      }

      if (var4) {
         label34: {
            label28: {
               byte var8;
               if (layerProperties[var5 + 10] < 0) {
                  layerProperties[var5 + 10] = 0;
                  var8 = 4;
               } else {
                  if (layerProperties[var5 + 10] <= layerProperties[var5 + 8]) {
                     break label28;
                  }

                  layerProperties[var5 + 10] = layerProperties[var5 + 8];
                  var8 = 8;
               }

               var7 = var8;
            }

            byte var10001;
            int var9;
            if (layerProperties[var5 + 11] < 0) {
               layerProperties[var5 + 11] = 0;
               var9 = var7;
               var10001 = 1;
            } else {
               if (layerProperties[var5 + 11] <= layerProperties[var5 + 9]) {
                  break label34;
               }

               layerProperties[var5 + 11] = layerProperties[var5 + 9];
               var9 = var7;
               var10001 = 2;
            }

            var7 = var9 | var10001;
         }
      }

      GameEngine.setViewport(tileMaps[var6], layerProperties[var5 + 10], layerProperties[var5 + 11], layerProperties[var5 + 12], layerProperties[var5 + 13]);
      return var7;
   }

   public static void drawMapLayer(int var0, Graphics var1, int var2, int var3, boolean var4) {
      int var5 = var0 * 23;
      if (var4) {
         var2 = var2 - layerProperties[var5 + 12] >> 1;
         var3 = var3 - layerProperties[var5 + 13] >> 1;
      }

      var2 += viewOffsetX + viewportLeft + layerProperties[var5 + 19];
      var3 += viewOffsetY + viewportTop + layerProperties[var5 + 20];
      GameEngine.drawTileMap(tileMaps[var0 * 1], var1, var2, var3);
   }

   static int worldToScreenX(int var0, int var1) {
      return viewportLeft + layerProperties[23 * var0 + 19] + var1 - layerProperties[23 * var0 + 10];
   }

   static int worldToScreenY(int var0, int var1) {
      return viewportTop + layerProperties[23 * var0 + 20] + var1 - layerProperties[23 * var0 + 11];
   }

   static int worldToScreenFixedX(int var0, int var1) {
      return viewportLeft + layerProperties[23 * var0 + 19] + (var1 >> 8) - layerProperties[23 * var0 + 10] << 8;
   }

   static int worldToScreenFixedY(int var0, int var1) {
      return viewportTop + layerProperties[23 * var0 + 20] + (var1 >> 8) - layerProperties[23 * var0 + 11] << 8;
   }

   static int snapToGridCenterX(int var0, int var1) {
      int var2 = layerProperties[23 * var0 + 6];
      return (var1 >> 8) / var2 * var2 + (var2 >> 1) << 8;
   }

   static int snapToGridCenterY(int var0, int var1) {
      int var2 = layerProperties[23 * var0 + 7];
      return (var1 >> 8) / var2 * var2 + (var2 >> 1) << 8;
   }

   public static boolean loadMapChunk(int var0, int var1, int var2, int var3) {
      boolean var8 = false;
      boolean var16 = false;
      int var5;
      int var6;
      int var10;
      int var17;
      if (mapDataBuffer == null) {
         defaultPaletteId = -1;
         mapFlags = -1;
         BinaryReader var15;
         if ((var15 = GameEngine.openDataStream(var0)) == null) {
            return false;
         }

         mapDataBuffer = GameEngine.readBytes(var15, GameEngine.getStreamSize(var15));
         var15.buffer = null;
         var6 = 0;
         byte var4 = 0;
         mapLoadProgress = 0;
         var10 = readInt32LE(mapDataBuffer, 0);
         var17 = var4 + 4;
         var17 += 4;
         if (var10 != 1280920903) {
            mapDataBuffer = null;
            return false;
         }

         ++var17;
         var5 = mapDataBuffer[8] & 255;
         ++var17;
         layerCount = mapDataBuffer[9] & 255;
         if ((var5 & 1) != 0) {
            defaultPaletteId = readInt16LE(mapDataBuffer, 10);
            var17 += 2;
         }

         if ((var5 & 2) != 0) {
            mapFlags = mapDataBuffer[var17++] & 255;
         }

         if (layerCount == 0) {
            mapDataBuffer = null;
            return false;
         }

         tileMaps = new TileMap[layerCount * 1];
         layerSprites = new Sprite[layerCount * 2];
         layerProperties = new int[layerCount * 23];
      } else {
         var17 = mapLoadProgress & '\uffff';
         var6 = mapLoadProgress >> 16;
      }

      if ((var10 = readInt32LE(mapDataBuffer, var17)) == 1162757152) {
         mapDataBuffer = null;
         return false;
      } else {
         if (var10 == 1279351122) {
            int var12 = var17 + readInt32LE(mapDataBuffer, var17 + 4);
            var17 += 8;
            byte[] var14 = null;
            var5 = mapDataBuffer[var17++] & 255;
            short var7 = readInt16LE(mapDataBuffer, var17);
            var17 += 2;
            layerProperties[var6 * 23 + 22] = var7 - 88;
            int var9;
            Sprite var13 = GameEngine.loadSpriteSet(var9 = mapDataBuffer[var17++] & 255);
            byte[] var10000;
            if ((var5 & 1) == 0 && var2 == -1) {
               layerSprites[var6 * 2] = var13;
               var10000 = GameEngine.getSpritePalette(layerSprites[var6 * 2]);
            } else {
               int var18 = var2 != -1 ? var2 : readInt16LE(mapDataBuffer, var17);
               if ((var5 & 1) != 0) {
                  var17 += 2;
               }

               var14 = loadPalette(var18);
               layerSprites[var6 * 2] = GameEngine.recolorSprite(var13, var14, -1);
               var16 = true;
               var10000 = var14;
            }

            mapBackgroundColor = GameEngine.getPaletteColor(var10000, 0);
            layerProperties[var6 * 23 + 19] = readInt16LE(mapDataBuffer, var17);
            var17 += 2;
            layerProperties[var6 * 23 + 20] = readInt16LE(mapDataBuffer, var17);
            var17 += 2;
            layerProperties[var6 * 23 + 21] = mapDataBuffer[var17++] & 255;
            if (!loadTileLayer(var6, var7, layerSprites[var6 * 2])) {
               clearMapData();
               mapDataBuffer = null;
               return false;
            }

            if ((layerProperties[var6 * 23 + 0] & 2) != 0) {
               if (var14 == null) {
                  var14 = GameEngine.extractPaletteData(var13.var_3b);
               }

               layerSprites[var6 * 2 + 1] = GameEngine.recolorSprite(var13, var14, var3);
            }

            if (var16) {
               GameEngine.freeSprite(var13);
            }

            layerProperties[var6 * 23 + 17] = var9;

            while(var17 < var12) {
               if (readInt32LE(mapDataBuffer, var17) == 1515146821) {
                  var17 = loadMapZones(var6, mapDataBuffer, var17);
               } else if (readInt32LE(mapDataBuffer, var17) == 1346458696) {
                  var17 += readInt32LE(mapDataBuffer, var17 + 4);
               } else {
                  var17 += readInt32LE(mapDataBuffer, var17 + 4);
               }
            }

            ++var6;
         } else {
            var17 += readInt32LE(mapDataBuffer, var17 + 4);
         }

         mapLoadProgress = var6 << 16 | var17 & '\uffff';
         return true;
      }
   }

   private static boolean loadTileLayer(int var0, int var1, Sprite var2) {
      int var19 = var0 * 23;
      int var20 = var0 * 1;
      BinaryReader var21;
      byte[] var18 = GameEngine.readBytes(var21 = GameEngine.openDataStream(var1), GameEngine.getStreamSize(var21));
      var21.buffer = null;
      byte var9 = 0;
      if (readInt32LE(var18, 0) != 1347174745) {
         return false;
      } else {
         int var22 = var9 + 8;
         int var5 = var18[8] & 255;
         int var6 = var18[9] & 255;
         byte var15 = var18[10];
         int var13 = var18[11] & 255;
         int var7 = var18[12] & 255;
         int var8 = var18[13] & 255;
         int var17 = var18[14] & 255;
         var22 += 7;
         layerProperties[var19 + 18] = var17;
         if ((var13 & 1) != 0) {
            var7 = 1 << var7;
            var8 = 1 << var8;
         }

         layerProperties[var19 + 1] = var5;
         layerProperties[var19 + 2] = var6;
         layerProperties[var19 + 6] = var7;
         layerProperties[var19 + 7] = var8;
         layerProperties[var19 + 3] = var5 * var6;
         layerProperties[var19 + 4] = var5 * var7;
         layerProperties[var19 + 5] = var6 * var8;
         layerProperties[var19 + 14] = var2.var_8a[0].getWidth() / var7;
         layerProperties[var19 + 16] = 0;
         layerProperties[var19 + 10] = 0;
         layerProperties[var19 + 11] = 0;
         tileMaps[var20] = new TileMap(var5, var6, var2, var7, var8);
         boolean var12 = false;
         boolean var11 = false;
         int[] var10000;
         byte var23;
         byte var25;
         if ((var13 & 4) != 0) {
            var10000 = layerProperties;
            var10000[var19 + 0] |= 4;
            var23 = 4;
            var25 = 8;
         } else {
            var23 = 1;
            var25 = 2;
         }

         byte var24 = var25;
         if ((var13 & 2) != 0) {
            var10000 = layerProperties;
            var10000[var19 + 0] |= 2;
         } else {
            var24 = 1;
         }

         GameEngine.initBitReader(var18);
         GameEngine.setBitPosition(15 + var5 * var6 << 3);

         for(int var4 = 0; var4 < var6; ++var4) {
            for(int var3 = 0; var3 < var5; ++var3) {
               int var10 = 1 + (var18[var22++] & 255);
               int var16 = 0;
               if (var15 != 0) {
                  int var14 = GameEngine.readBits(var15);
                  if ((var13 & 8) != 0 && (var14 & var24) != 0) {
                     continue;
                  }

                  if ((var13 & 4) != 0) {
                     if ((var14 & 1) != 0) {
                        var16 = 2;
                     }

                     if ((var14 & 2) != 0) {
                        var16 |= 1;
                     }
                  }

                  if ((var13 & 2) != 0 && (var14 & var23) != 0) {
                     var16 |= 8;
                  }
               }

               GameEngine.setTile(tileMaps[var20], var3, var4, var10, var16, false);
            }
         }

         GameEngine.initBitReader((byte[])null);
         return true;
      }
   }

   private static int loadMapZones(int var0, byte[] var1, int var2) {
      if (readInt32LE(var1, var2) != 1515146821) {
         return var2;
      } else {
         var2 += 8;
         zoneCount = var1[var2++] & 255;
         if (zoneCount == 0) {
            return var2;
         } else {
            int[] var10000 = layerProperties;
            var10000[var0 * 23 + 0] |= 1;
            zoneData = new short[zoneCount * 5];
            int var3 = 0;

            for(int var4 = 0; var3 < zoneCount; var4 += 5) {
               zoneData[var4] = readInt16LE(var1, var2);
               var2 += 2;
               zoneData[var4 + 1] = (short)(readInt16LE(var1, var2) << 1);
               var2 += 2;
               zoneData[var4 + 2] = (short)(readInt16LE(var1, var2) << 1);
               var2 += 2;
               zoneData[var4 + 3] = (short)(zoneData[var4 + 1] + ((var1[var2++] & 255) << 1));
               zoneData[var4 + 4] = (short)(zoneData[var4 + 2] + ((var1[var2++] & 255) << 1));
               ++var3;
            }

            return var2;
         }
      }
   }

   static int detectZonesAtPos(int var0, int var1, int var2, int var3) {
      var0 >>= 8;
      var2 >>= 8;
      var1 >>= 8;
      var3 >>= 8;
      int var5 = 0;
      int var4 = 0;
      foundWarpZone = -1;
      foundEventZone = -1;
      foundTriggerZone = -1;
      int var12 = 0;

      while(true) {
         while(var4 < zoneCount) {
            int var11;
            if ((var11 = zoneData[var5] & '\ue000') != 0 && var11 != 8192 && var11 != 57344 && var11 != 32768) {
               int var10 = zoneData[var5++] & 8191;
               short var6 = zoneData[var5++];
               short var7 = zoneData[var5++];
               short var8 = zoneData[var5++];
               short var9 = zoneData[var5++];
               if (var2 >= var6 && var3 >= var7 && var0 <= var8 && var1 <= var9) {
                  label67: {
                     switch(var11) {
                     case 16384:
                        if (foundWarpZone != -1 || (var10 & 4096) != 0) {
                           break label67;
                        }

                        foundWarpZone = (var4 & '\uffff') << 16 | (var10 & '\uffff') << 0;
                        break;
                     case 24576:
                        if (foundEventZone != -1) {
                           break label67;
                        }

                        foundEventZone = var10;
                        break;
                     case 40960:
                        if (foundTriggerZone == -1) {
                           foundTriggerZone = var4 << 16 | var10 & '\uffff';
                           break;
                        }
                     default:
                        break label67;
                     }

                     ++var12;
                  }
               }

               ++var4;
            } else {
               var5 += 5;
               ++var4;
            }
         }

         return var12;
      }
   }

   static boolean buildCollisionMap(int var0) {
      int var14 = 23 * var0;
      collisionMap = new byte[layerProperties[var14 + 3]];

      int var1;
      for(var1 = 0; var1 < collisionMap.length; ++var1) {
         collisionMap[var1] = 1;
      }

      int var11 = 0;
      char var10 = 0;

      label98:
      for(int var9 = 0; var9 < 4; ++var9) {
         label67: {
            byte var10000;
            switch(var9) {
            case 0:
               var10 = 0;
               var10000 = 0;
               break;
            case 1:
               var10 = 8192;
               var10000 = 1;
               break;
            case 2:
               var10 = 0;
               var10000 = 4;
               break;
            case 3:
               var10 = '쀀';
               var10000 = 2;
               break;
            default:
               break label67;
            }

            var11 = var10000;
         }

         int var2 = 0;
         var1 = 0;

         while(true) {
            while(true) {
               if (var1 >= zoneCount) {
                  continue label98;
               }

               if ((zoneData[var2] & '\ue000') == var10) {
                  if (var9 == 2 && (zoneData[var2] & 4096) == 0 || var9 == 3 && (zoneData[var2] & 4096) == 0) {
                     var2 += 5;
                     ++var1;
                     continue;
                  }

                  if (var9 == 1) {
                     var11 = (zoneData[var2] & 1) == 0 ? 1 : 3;
                  }

                  int var12 = zoneData[var2++] & 8191;
                  if (var9 == 3) {
                     var12 = (var12 &= 4032) >> 6;
                     var11 = (var11 &= 3) | var12 << 2;
                  }

                  int var3 = zoneData[var2++] / layerProperties[var14 + 6];
                  int var4 = zoneData[var2++] / layerProperties[var14 + 7];
                  int var5 = (zoneData[var2++] + (layerProperties[var14 + 6] >> 1)) / layerProperties[var14 + 6];
                  int var6 = (zoneData[var2++] + (layerProperties[var14 + 7] >> 1)) / layerProperties[var14 + 7];
                  if (var3 > layerProperties[var14 + 1]) {
                     var3 = layerProperties[var14 + 1];
                  }

                  if (var5 > layerProperties[var14 + 1]) {
                     var5 = layerProperties[var14 + 1];
                  }

                  if (var4 > layerProperties[var14 + 2]) {
                     var4 = layerProperties[var14 + 2];
                  }

                  if (var6 > layerProperties[var14 + 2]) {
                     var6 = layerProperties[var14 + 2];
                  }

                  for(int var8 = var4; var8 < var6; ++var8) {
                     int var13 = var8 * layerProperties[var14 + 1];

                     for(int var7 = var3; var7 < var5; ++var7) {
                        collisionMap[var13 + var7] = (byte)var11;
                     }
                  }
               } else {
                  var2 += 5;
               }

               ++var1;
            }
         }
      }

      return true;
   }

   static void setCollisionRect(int var0, int var1, int var2, int var3, int var4, byte var5) {
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var10000;
      label63: {
         var15 = 23 * var0;
         int var9 = layerProperties[var15 + 6];
         int var10 = layerProperties[var15 + 7];
         var11 = (var1 >> 8) / var9;
         var12 = (var2 >> 8) / var10;
         var13 = ((var3 >> 8) + var9 - 1) / var9;
         var14 = ((var4 >> 8) + var10 - 1) / var10;
         if (var11 < 0) {
            var10000 = 0;
         } else {
            if (var11 <= layerProperties[var15 + 1]) {
               break label63;
            }

            var10000 = layerProperties[var15 + 1];
         }

         var11 = var10000;
      }

      label57: {
         if (var13 < 0) {
            var10000 = 0;
         } else {
            if (var13 <= layerProperties[var15 + 1]) {
               break label57;
            }

            var10000 = layerProperties[var15 + 1];
         }

         var13 = var10000;
      }

      label51: {
         if (var12 < 0) {
            var10000 = 0;
         } else {
            if (var12 <= layerProperties[var15 + 2]) {
               break label51;
            }

            var10000 = layerProperties[var15 + 2];
         }

         var12 = var10000;
      }

      label45: {
         if (var14 < 0) {
            var10000 = 0;
         } else {
            if (var14 <= layerProperties[var15 + 2]) {
               break label45;
            }

            var10000 = layerProperties[var15 + 2];
         }

         var14 = var10000;
      }

      for(int var7 = var12; var7 < var14; ++var7) {
         int var8 = var7 * layerProperties[var15 + 1];

         for(int var6 = var11; var6 < var13; ++var6) {
            collisionMap[var8 + var6] = var5;
         }
      }

   }

   static void setCollisionAt(int var0, int var1, int var2, byte var3) {
      int var4 = 23 * var0;
      var1 = (var1 >> 8) / layerProperties[var4 + 6];
      var2 = (var2 >> 8) / layerProperties[var4 + 7];
      if (var1 >= 0 && var1 < layerProperties[var4 + 1] && var2 >= 0 && var2 < layerProperties[var4 + 2]) {
         collisionMap[var2 * layerProperties[var4 + 1] + var1] = var3;
      }
   }

   static int getCollisionAt(int var0, int var1, int var2) {
      int var3 = 23 * var0;
      var1 = (var1 >> 8) / layerProperties[var3 + 6];
      var2 = (var2 >> 8) / layerProperties[var3 + 7];
      return var1 >= 0 && var1 < layerProperties[var3 + 1] && var2 >= 0 && var2 < layerProperties[var3 + 2] ? collisionMap[var2 * layerProperties[var3 + 1] + var1] & 3 : 1;
   }

   static int getWalkableDirections(int var0, int var1, int var2, boolean var3) {
      int var5 = -1;
      int var4 = 23 * var0;
      int var6 = layerProperties[var4 + 1];
      int var7 = layerProperties[var4 + 2];
      var1 = (var1 >> 8) / layerProperties[var4 + 6];
      if ((var2 = (var2 >> 8) / layerProperties[var4 + 7]) >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = collisionMap[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 = -17;
      }

      --var2;
      if (var2 >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = collisionMap[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 &= -2;
      }

      var2 += 2;
      if (var2 >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = collisionMap[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 &= -5;
      }

      --var2;
      ++var1;
      if (var2 >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = collisionMap[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 &= -3;
      }

      var1 -= 2;
      if (var2 >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = collisionMap[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 &= -9;
      }

      return var5;
   }

   public static int findTilesInRect(int var0, int[] var1, int var2, int var3, int var4, int var5) {
      int var10;
      int var10000;
      label75: {
         var10 = 23 * var0;
         var2 >>= 8;
         var4 >>= 8;
         var3 >>= 8;
         var5 >>= 8;
         var2 /= layerProperties[var10 + 6];
         var3 /= layerProperties[var10 + 7];
         var4 /= layerProperties[var10 + 6];
         var5 /= layerProperties[var10 + 7];
         if (var2 < 0) {
            var10000 = 0;
         } else {
            if (var2 < layerProperties[var10 + 1]) {
               break label75;
            }

            var10000 = layerProperties[var10 + 1] - 1;
         }

         var2 = var10000;
      }

      label69: {
         if (var4 < 0) {
            var10000 = 0;
         } else {
            if (var4 < layerProperties[var10 + 1]) {
               break label69;
            }

            var10000 = layerProperties[var10 + 1] - 1;
         }

         var4 = var10000;
      }

      label63: {
         if (var3 < 0) {
            var10000 = 0;
         } else {
            if (var3 < layerProperties[var10 + 2]) {
               break label63;
            }

            var10000 = layerProperties[var10 + 2] - 1;
         }

         var3 = var10000;
      }

      label57: {
         if (var5 < 0) {
            var10000 = 0;
         } else {
            if (var5 < layerProperties[var10 + 2]) {
               break label57;
            }

            var10000 = layerProperties[var10 + 2] - 1;
         }

         var5 = var10000;
      }

      int var11 = 0;

      for(int var7 = var3; var7 <= var5; ++var7) {
         for(int var6 = var2; var6 <= var4; ++var6) {
            int var9 = var7 * layerProperties[var10 + 1] + var6;
            int var8;
            if (((var8 = collisionMap[var9] & 255) & 3) == 2) {
               if (var1 == null) {
                  ++var11;
                  break;
               }

               if (var11 >= var1.length) {
                  break;
               }

               var1[var11++] = var9 << 8 | var8 >> 2;
            }
         }
      }

      return var11;
   }
}
