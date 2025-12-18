import javax.microedition.lcdui.Graphics;

class AnimatedSprite {
   public byte[] animationData;
   public int animFlags;
   public int flipFlags;
   protected int animationOffset;
   private int frameDataOffset;
   public int frameFlags;
   public int currentFrame;
   protected int frameTimer;
   protected int frameConfig;
   private int frameOffsetX;
   private int frameOffsetY;
   protected int accumulatedDeltaX;
   protected int accumulatedDeltaY;
   private int spritesListOffset;
   private int hitboxListOffset;
   private int anchorPointsOffset;
   private int hitbox1Offset;
   private int hitbox2Offset;
   public int[] transformedBounds;
   public int boundsLeft;
   public int boundsTop;
   public int boundsRight;
   public int boundsBottom;
   public int visibleLayersMask;
   public int x;
   public int y;
   public int renderOffsetX;
   public int renderOffsetY;
   public int pivotOffsetX;
   public int pivotOffsetY;
   public int facing;
   public int screenX;
   public int screenY;
   public int velocityX;
   public int velocityY;
   public byte collisionRadius;
   public int statusFlags;
   public int stateFlags;
   public int health;
   public int var_8fb;
   public int aiState;
   public int animationSetId;
   public int entityId;
   public int mapObjectIndex;

   public AnimatedSprite() {
      this.sub_be();
      this.transformedBounds = new int[14];
      this.collisionRadius = 4;
      this.sub_3da();
   }

   public void initEntity(int[] var1) {
   }

   public void sub_2a() {
   }

   public final void sub_14(int var1) {
      this.animFlags &= var1;
      this.flipFlags = 0;
      this.animationOffset = -1;
      this.frameDataOffset = 0;
      this.frameFlags = 0;
      this.currentFrame = 0;
      this.frameTimer = 1;
      this.visibleLayersMask = -1;
      this.frameConfig = 16777216;
      this.frameOffsetX = this.frameOffsetY = 0;
      this.accumulatedDeltaX = this.accumulatedDeltaY = 0;
      this.spritesListOffset = this.anchorPointsOffset = this.hitboxListOffset = 0;
   }

   public final void sub_6f() {
      this.sub_be();
      this.transformedBounds = null;
   }

   public final void sub_be() {
      this.animationData = null;
      this.sub_14(0);
   }

   public static boolean sub_106(AnimatedSprite var0) {
      return (var0.animationData[var0.frameDataOffset + 0] & 4) != 0;
   }

   public static int sub_15e(AnimatedSprite var0) {
      return var0.animationData[var0.frameDataOffset + 3] & 255;
   }

   public static int sub_18e(AnimatedSprite var0, int var1) {
      return (var0.animationData[var0.anchorPointsOffset + var1 * 3 + 0] & 1) != 0 ? -(var0.animationData[var0.anchorPointsOffset + var1 * 3 + 1] & 255) : var0.animationData[var0.anchorPointsOffset + var1 * 3 + 1] & 255;
   }

   public static int sub_1c7(AnimatedSprite var0, int var1) {
      return (var0.animationData[var0.anchorPointsOffset + var1 * 3 + 0] & 2) != 0 ? -(var0.animationData[var0.anchorPointsOffset + var1 * 3 + 2] & 255) : var0.animationData[var0.anchorPointsOffset + var1 * 3 + 2] & 255;
   }

   public static boolean sub_1d8(AnimatedSprite var0) {
      return (var0.frameConfig >> 16 & 255) == var0.frameTimer;
   }

   public static int sub_22c(AnimatedSprite var0) {
      return var0.animationOffset - (1 + (var0.animationData[0] << 1)) >> 2;
   }

   public static boolean sub_240(AnimatedSprite var0) {
      return (var0.animFlags & 1) != 0;
   }

   public final void sub_281(int var1) {
      int var6 = this.animationData[this.animationOffset + 1] & 255;
      int var2 = this.animationOffset + 2 + (var1 << 1);
      this.frameDataOffset = this.animationOffset + ((this.animationData[var2 + 1] & 255) << 8) + (this.animationData[var2] & 255);
      this.frameFlags = this.animationData[this.frameDataOffset + 0];
      int var3 = this.animationData[this.frameDataOffset + 1] & 255;
      int var4 = this.animationData[this.frameDataOffset + 2] & 255;
      int var5 = this.animationData[this.frameDataOffset + 3] & 255;
      var2 = this.frameDataOffset + 4;
      this.spritesListOffset = var2;
      var2 += var3 * 7;
      this.hitboxListOffset = var2;
      var2 += var4 * 5;
      this.anchorPointsOffset = var2;
      var2 += var5 * 3;
      AnimatedSprite var10000;
      int var10001;
      if ((this.frameFlags & 2) != 0) {
         var10000 = this;
         var10001 = (this.animationData[var2] << 24) + (this.animationData[var2 + 1] << 16) + ((this.animationData[var2 + 2] & 255) << 8) + (this.animationData[var2 + 3] & 255);
      } else {
         var10000 = this;
         var10001 = 16777216;
      }

      var10000.frameConfig = var10001;
      this.currentFrame = var1;
      this.frameTimer = 1;
      this.frameOffsetX = this.frameOffsetY = 0;
      this.accumulatedDeltaX = this.accumulatedDeltaY = 0;
      this.animFlags &= -2;
      var2 = (var2 = this.animationOffset + 2 + (var6 << 1)) + ((this.animationData[var2 + 1] & 255) << 8) + (this.animationData[var2] & 255);
      var2 += 2;
      if ((this.animationData[this.animationOffset + 0] & 2) != 0) {
         this.hitbox1Offset = var2;
         this.animFlags |= 2;
         if ((this.animationData[var2 + 0] & 4) != 0 || (this.animationData[var2 + 0] & 8) != 0) {
            this.animFlags |= 8;
         }

         var2 += 5;
      } else {
         this.animFlags &= -11;
      }

      if ((this.animationData[this.animationOffset + 0] & 4) == 0) {
         this.animFlags &= -21;
      } else {
         this.hitbox2Offset = var2;
         this.animFlags |= 4;
         if ((this.animationData[var2 + 0] & 4) != 0 || (this.animationData[var2 + 0] & 8) != 0) {
            this.animFlags |= 16;
         }

      }
   }

   public final boolean sub_292(int var1) {
      label17: {
         int var2 = 1 + (this.animationData[0] << 1);
         if (this.animationOffset == var2 + (var1 << 2)) {
            if ((this.animationData[this.animationOffset + 0] & 1) != 0) {
               break label17;
            }
         } else {
            this.animationOffset = var2 + (var1 << 2);
         }

         this.sub_281(0);
      }

      this.sub_341(true);
      return (this.frameConfig >> 16 & 255) == this.frameTimer;
   }

   public final void render(Graphics var1, int var2, int var3) {
      int var4;
      if ((var4 = this.animationData[this.frameDataOffset + 1] & 255) != 0) {
         this.boundsLeft = Integer.MAX_VALUE;
         this.boundsTop = Integer.MAX_VALUE;
         this.boundsRight = -1;
         this.boundsBottom = -1;
         var2 += GameRenderer.viewOffsetX;
         var3 += GameRenderer.viewOffsetY;
         int var5 = this.spritesListOffset;

         for(int var6 = 0; var6 < var4; var5 += 7) {
            int var20 = this.animationData[var5 + 6] & 255;
            if ((this.visibleLayersMask & 1 << var20) != 0) {
               int var7 = this.animationData[var5 + 0] & 255;
               int var8 = this.animationData[var5 + 1] & 255;
               Sprite var24 = (Sprite) GameRenderer.resourceCache[this.animationData[1 + var7]];
               byte[] var23 = (byte[]) GameRenderer.resourceCache[this.animationData[1 + var8]];
               int var9 = (this.animationData[var5 + 5] & 255) << 2;
               int var10 = (var23[var9] & 255) << 1;
               int var11 = (var23[var9 + 1] & 255) << 1;
               int var12 = (var23[var9 + 2] & 255) << 1;
               int var13 = (var23[var9 + 3] & 255) << 1;
               int var14 = 0;
               if ((this.animationData[var5 + 2] & 16) != 0) {
                  var14 = 2;
               }

               if ((this.animationData[var5 + 2] & 32) != 0) {
                  var14 |= 1;
               }

               var14 ^= this.flipFlags;
               int var15 = (this.animationData[var5 + 2] & 1) != 0 ? -(this.animationData[var5 + 3] & 255) : this.animationData[var5 + 3] & 255;
               int var16 = (this.animationData[var5 + 2] & 2) != 0 ? -(this.animationData[var5 + 4] & 255) : this.animationData[var5 + 4] & 255;
               if ((this.animationData[var5 + 2] & 4) != 0) {
                  var15 += this.frameOffsetX;
               }

               if ((this.animationData[var5 + 2] & 8) != 0) {
                  var16 += this.frameOffsetY;
               }

               int var17 = (this.flipFlags & 2) != 0 ? var2 - (var15 + var12) : var2 + var15;
               int var18 = (this.flipFlags & 1) != 0 ? var3 - (var16 + var13) : var3 + var16;
               GameEngine.drawRegion(var1, var24, var17, var18, 20, var10, var11, var12, var13, var14);
               var20 = 0;
               int var19 = 0;
               int var21 = var12;
               int var22 = var13;
               if ((this.animationData[var5 + 2] & 64) != 0) {
                  if ((this.flipFlags & 2) != 0) {
                     var19 = (this.animationData[var5 + 2] & 16) != 0 ? var12 : -var12;
                  } else {
                     var19 = (this.animationData[var5 + 2] & 16) != 0 ? -var12 : var12;
                  }

                  var21 = var12 << 1;
                  GameEngine.drawRegion(var1, var24, var17 + var19, var18, 20, var10, var11, var12, var13, var14 ^ 2);
               }

               if ((this.animationData[var5 + 2] & 128) != 0) {
                  if ((this.flipFlags & 1) != 0) {
                     var20 = (this.animationData[var5 + 2] & 32) != 0 ? var13 : -var13;
                  } else {
                     var20 = (this.animationData[var5 + 2] & 32) != 0 ? -var13 : var13;
                  }

                  var22 = var13 << 1;
                  GameEngine.drawRegion(var1, var24, var17, var18 + var20, 20, var10, var11, var12, var13, var14 ^ 1);
               }

               if ((this.animationData[var5 + 2] & 192) == 192) {
                  GameEngine.drawRegion(var1, var24, var17 + var19, var18 + var20, 20, var10, var11, var12, var13, var14 ^ 3);
               }

               if (var19 < 0) {
                  var17 += var19;
               }

               if (var20 < 0) {
                  var18 += var20;
               }

               if (var17 < this.boundsLeft) {
                  this.boundsLeft = var17;
               }

               if (var18 < this.boundsTop) {
                  this.boundsTop = var18;
               }

               if (var17 + var21 > this.boundsRight) {
                  this.boundsRight = var17 + var21;
               }

               if (var18 + var22 > this.boundsBottom) {
                  this.boundsBottom = var18 + var22;
               }
            }

            ++var6;
         }

         this.boundsRight -= this.boundsLeft;
         this.boundsBottom -= this.boundsTop;
      }
   }

   public final void sub_315() {
      int var2 = this.animationData[this.animationOffset + 1] & 255;
      int var1 = this.frameConfig >> 24 & 255;
      ++this.frameTimer;
      AnimatedSprite var10000;
      boolean var7;
      if (this.frameTimer > var1) {
         int var10001;
         label45: {
            int var3;
            if (this.currentFrame == var2 - 1) {
               this.accumulatedDeltaY = this.accumulatedDeltaX = 0;
               if ((this.animationData[this.animationOffset + 0] & 1) == 0) {
                  this.animFlags |= 1;
                  this.frameTimer = var1;
                  return;
               }

               this.currentFrame = 0;
               var3 = this.animationOffset + 2;
               this.frameDataOffset = this.animationOffset + ((this.animationData[var3 + 1] & 255) << 8) + (this.animationData[var3] & 255);
               this.frameFlags = this.animationData[this.frameDataOffset + 0];
               this.spritesListOffset = this.frameDataOffset + 4;
               this.hitboxListOffset = this.spritesListOffset + (this.animationData[this.frameDataOffset + 1] & 255) * 7;
               this.anchorPointsOffset = this.hitboxListOffset + (this.animationData[this.frameDataOffset + 2] & 255) * 5;
               this.frameConfig = this.anchorPointsOffset + (this.animationData[this.frameDataOffset + 3] & 255) * 3;
               if ((this.frameFlags & 2) != 0) {
                  var10000 = this;
                  var10001 = (this.animationData[this.frameConfig] << 24) + (this.animationData[this.frameConfig + 1] << 16) + ((this.animationData[this.frameConfig + 2] & 255) << 8) + (this.animationData[this.frameConfig + 3] & 255);
                  break label45;
               }

               var10000 = this;
            } else {
               ++this.currentFrame;
               var3 = this.animationOffset + 2 + (this.currentFrame << 1);
               this.frameDataOffset = this.animationOffset + ((this.animationData[var3 + 1] & 255) << 8) + (this.animationData[var3] & 255);
               this.frameFlags = this.animationData[this.frameDataOffset + 0];
               this.spritesListOffset = this.frameDataOffset + 4;
               this.hitboxListOffset = this.spritesListOffset + (this.animationData[this.frameDataOffset + 1] & 255) * 7;
               this.anchorPointsOffset = this.hitboxListOffset + (this.animationData[this.frameDataOffset + 2] & 255) * 5;
               this.frameConfig = this.anchorPointsOffset + (this.animationData[this.frameDataOffset + 3] & 255) * 3;
               if ((this.frameFlags & 2) != 0) {
                  var10000 = this;
                  var10001 = (this.animationData[this.frameConfig] << 24) + (this.animationData[this.frameConfig + 1] << 16) + ((this.animationData[this.frameConfig + 2] & 255) << 8) + (this.animationData[this.frameConfig + 3] & 255);
                  break label45;
               }

               var10000 = this;
            }

            var10001 = 16777216;
         }

         var10000.frameConfig = var10001;
         this.frameTimer = 1;
         this.frameOffsetX = this.frameOffsetY = 0;
         var10000 = this;
         var7 = true;
      } else {
         if ((this.frameFlags & 2) != 0) {
            byte var4 = (byte)(this.frameConfig >> 8);
            byte var5 = (byte)this.frameConfig;
            this.frameOffsetX += var4;
            this.frameOffsetY += var5;
            this.accumulatedDeltaX += (this.flipFlags & 2) != 0 ? -var4 : var4;
            this.accumulatedDeltaY += (this.flipFlags & 1) != 0 ? -var5 : var5;
         }

         boolean var6 = (this.animFlags & 24) != 0;
         var10000 = this;
         var7 = var6;
      }

      var10000.sub_341(var7);
   }

   public final void sub_341(boolean var1) {
      if (this.animationOffset != -1) {
         boolean var12 = false;
         int var11;
         if (var1) {
            for(int var2 = 0; var2 < 2; ++var2) {
               byte var3;
               int var4;
               int var5;
               label70: {
                  var5 = 0;
                  var4 = 0;
                  if (var2 == 0) {
                     var12 = (this.animFlags & 2) != 0;
                     var3 = 0;
                     var11 = this.hitbox1Offset;
                     if (!var12) {
                        break label70;
                     }

                     if ((this.animationData[var11 + 0] & 4) != 0) {
                        var4 = this.accumulatedDeltaX;
                     }

                     if ((this.animationData[var11 + 0] & 8) == 0) {
                        break label70;
                     }
                  } else {
                     var12 = (this.animFlags & 4) != 0;
                     var3 = 4;
                     var11 = this.hitbox2Offset;
                     if (!var12) {
                        break label70;
                     }

                     if ((this.animationData[var11 + 0] & 4) != 0) {
                        var4 = this.accumulatedDeltaX;
                     }

                     if ((this.animationData[var11 + 0] & 8) == 0) {
                        break label70;
                     }
                  }

                  var5 = this.accumulatedDeltaY;
               }

               int var7;
               int var8;
               int var9;
               int var10;
               if (var12) {
                  byte var6;
                  var7 = (((var6 = this.animationData[var11++]) & 1) != 0 ? -(this.animationData[var11++] & 255) : this.animationData[var11++] & 255) + var4;
                  var8 = ((var6 & 2) != 0 ? -(this.animationData[var11++] & 255) : this.animationData[var11++] & 255) + var5;
                  var9 = (this.animationData[var11++] & 255) << 1;
                  var10 = (this.animationData[var11] & 255) << 1;
               } else {
                  var10 = 0;
                  var9 = 0;
                  var8 = 0;
                  var7 = 0;
               }

               this.transformedBounds[var3] = var7 << 8;
               this.transformedBounds[var3 + 1] = var8 << 8;
               this.transformedBounds[var3 + 2] = var7 + var9 << 8;
               this.transformedBounds[var3 + 3] = var8 + var10 << 8;
               if ((this.flipFlags & 2) != 0) {
                  var11 = this.transformedBounds[var3 + 2];
                  this.transformedBounds[var3 + 2] = -this.transformedBounds[var3];
                  this.transformedBounds[var3] = -var11;
               }

               if ((this.flipFlags & 1) != 0) {
                  var11 = this.transformedBounds[var3 + 3];
                  this.transformedBounds[var3 + 3] = -this.transformedBounds[var3 + 1];
                  this.transformedBounds[var3 + 1] = -var11;
               }
            }
         }

         this.sub_392(0, this.transformedBounds, 8);
         var11 = this.sub_3b3(0);
         this.transformedBounds[12] = var11 >> 16 << 8;
         this.transformedBounds[13] = (short)var11 << 8;
      }
   }

   public final boolean sub_392(int var1, int[] var2, int var3) {
      int var9;
      if ((this.animationData[this.frameDataOffset + 0] & 4) != 0 && var1 < (this.animationData[this.frameDataOffset + 2] & 255)) {
         var9 = this.hitboxListOffset + var1 * 5;
         byte var7;
         int var4 = ((var7 = this.animationData[var9++]) & 4) != 0 ? this.frameOffsetX : 0;
         int var5 = (var7 & 8) != 0 ? this.frameOffsetY : 0;
         var2[var3] = var4 + ((var7 & 1) != 0 ? -(this.animationData[var9++] & 255) : this.animationData[var9++] & 255);
         var2[var3 + 1] = var5 + ((var7 & 2) != 0 ? -(this.animationData[var9++] & 255) : this.animationData[var9++] & 255);
         var2[var3 + 2] = var2[var3] + ((this.animationData[var9++] & 255) << 1) << 8;
         var2[var3 + 3] = var2[var3 + 1] + ((this.animationData[var9] & 255) << 1) << 8;
         var2[var3] <<= 8;
         var2[var3 + 1] <<= 8;
         int var8;
         if ((this.flipFlags & 2) != 0) {
            var8 = var2[var3 + 2];
            var2[var3 + 2] = -var2[var3];
            var2[var3] = -var8;
         }

         if ((this.flipFlags & 1) != 0) {
            var8 = var2[var3 + 3];
            var2[var3 + 3] = -var2[var3 + 1];
            var2[var3 + 1] = -var8;
         }

         return true;
      } else {
         boolean var6 = false;

         for(var9 = var3; var9 < var3 + 4; ++var9) {
            var2[var9] = 0;
         }

         return false;
      }
   }

   public final int sub_3b3(int var1) {
      if ((this.animationData[this.frameDataOffset + 0] & 8) != 0 && var1 < (this.animationData[this.frameDataOffset + 3] & 255)) {
         int var4 = this.anchorPointsOffset + var1 * 3;
         byte var5;
         int var2 = ((var5 = this.animationData[var4++]) & 4) != 0 ? this.frameOffsetX : 0;
         int var3 = (var5 & 8) != 0 ? this.frameOffsetY : 0;
         int var6 = (short)(var2 + ((var5 & 1) != 0 ? -(this.animationData[var4++] & 255) : this.animationData[var4++] & 255));
         int var7 = (short)(var3 + ((var5 & 2) != 0 ? -(this.animationData[var4] & 255) : this.animationData[var4] & 255));
         if ((this.flipFlags & 2) != 0) {
            var6 = -var6;
         }

         if ((this.flipFlags & 1) != 0) {
            var7 = -var7;
         }

         return (var6 << 16) + (var7 & '\uffff');
      } else {
         return 0;
      }
   }

   public final void sub_3da() {
      this.renderOffsetX = this.renderOffsetY = 0;
      this.facing = 1;
      this.velocityX = this.velocityY = 0;
      this.collisionRadius = 2;
      this.statusFlags = 1;
      this.stateFlags = 0;
      this.health = 0;
      this.var_8fb = 0;
      this.aiState = 0;
      this.sub_14(-65536);
   }

   public static boolean sub_43e(AnimatedSprite var0) {
      return (var0.statusFlags & 2) != 0;
   }

   public static void sub_469(AnimatedSprite var0) {
      var0.statusFlags |= 4;
   }

   public static void sub_4a5(AnimatedSprite var0) {
      var0.statusFlags &= -5;
   }

   public static void sub_4dd(AnimatedSprite var0, int var1, int var2) {
      var0.stateFlags = var0.stateFlags & ~var1 | var2;
   }

   public final void sub_530(byte var1, byte var2) {
      this.collisionRadius = var1;
      this.flipFlags = var2;
      this.sub_341(true);
   }

   public void sub_487(Graphics var1) {
      if ((this.statusFlags & 1) != 0) {
         int var2 = (this.screenX + this.renderOffsetX >> 8) + this.pivotOffsetX + GameRenderer.globalRenderOffsetX;
         int var3 = (this.screenY + this.renderOffsetY >> 8) + this.pivotOffsetY + GameRenderer.globalRenderOffsetY;
         this.render(var1, var2, var3);
      }

      if ((this.statusFlags & 6) == 0) {
         this.sub_315();
      }

   }
}
