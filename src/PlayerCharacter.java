import javax.microedition.lcdui.Graphics;

final class PlayerCharacter extends AnimatedSprite {
   int maxHealth;
   int knockbackVelocityX;
   int knockbackVelocityY;
   int damageDirection;
   int warpPositionX;
   int warpPositionY;
   int currentWeaponId;
   int attackAnimTimer;
   int lowHealthBlinkTimer;
   int lastGridPosition;
   int healEffectPosition;
   int movementFlags;
   int cameraAngle;
   int cameraOffsetX;
   int cameraOffsetY;
   int targetCameraOffsetX;
   int targetCameraOffsetY;
   AnimatedSprite weaponSprite;

   PlayerCharacter() {
      super.entityId = 0;
      this.weaponSprite = new AnimatedSprite();
      super.facing = 2;
   }

   public final void setSpawnPosition(int[] var1) {
      super.x = var1[0];
      super.y = var1[1];
      super.statusFlags = 9;
   }

   public final void sub_2a() {
      this.sub_6f();
      if (this.weaponSprite != null) {
         this.weaponSprite.sub_6f();
         this.weaponSprite = null;
      }

   }

   public final void reset(boolean var1) {
      this.sub_be();
      if (var1) {
         this.sub_2a();
      }

   }

   public final void initPlayer() {
      super.statusFlags |= 1;
      super.aiState = 0;
      this.weaponSprite.animationData = (byte[]) GameRenderer.getResource(GameManager.var_6d1[0]);
      this.weaponSprite.sub_14(-65536);
      super.renderOffsetX = super.renderOffsetY = 0;
      super.pivotOffsetX = super.pivotOffsetY = 0;
      this.updateMaxHealth();
      GameRenderer.writeInt16LE(GameManager.var_ff5, 2, (short)this.maxHealth);
   }

   final void updateMaxHealth() {
      this.maxHealth = GameManager.sub_1654(GameManager.var_ff5[1] & 255);
   }

   public final void spawnOnMap() {
      int var11 = GameManager.var_c45 >> 9 & 3;
      int var12 = GameManager.sub_1914(7);
      super.var_8fb = 0;
      super.statusFlags &= -545;
      super.statusFlags |= 1;
      super.aiState = 0;
      boolean var13 = false;
      int var2 = 0;
      int var1 = 0;

      int var5;
      for(var5 = -1; var1 < GameRenderer.zoneCount; var2 += 5) {
         int var3 = GameRenderer.zoneData[var2] & 8191;
         int var4;
         if ((var4 = GameRenderer.zoneData[var2] & '\ue000') == 16384 && (var3 & 4096) != 0) {
            if ((var3 & 511) == var12) {
               var5 = var1;
               var13 = false;
               break;
            }
         } else if (var4 == 32768 && (var3 & 8160) >> 5 == 17) {
            var5 = var1;
            var13 = true;
         }

         ++var1;
      }

      PlayerCharacter var10000;
      if (var5 != -1) {
         var2 = var5 * 5;
         int var10 = GameRenderer.zoneData[var2++] >> 9 & 3;
         short var6 = GameRenderer.zoneData[var2++];
         short var8 = GameRenderer.zoneData[var2++];
         short var7 = GameRenderer.zoneData[var2++];
         short var9 = GameRenderer.zoneData[var2];
         if (var13) {
            super.x = var6 + ((var7 - var6) * 128 >> 8);
            super.y = var8 + ((var9 - var8) * 128 >> 8);
         } else {
            short var14;
            int var10002;
            int var10003;
            if (var10 != var11) {
               super.x = var6 + ((var7 - var6) * 128 >> 8);
               var10000 = this;
               var14 = var8;
               var10002 = var9 - var8;
               var10003 = 128;
            } else {
               super.x = var6 + ((var7 - var6) * this.warpPositionX >> 8);
               var10000 = this;
               var14 = var8;
               var10002 = var9 - var8;
               var10003 = this.warpPositionY;
            }

            var10000.y = var14 + (var10002 * var10003 >> 8);
            super.facing = var10;
         }
      }

      if (!var13) {
         this.movementFlags = 1 << super.facing;
         short var15;
         PlayerCharacter var16;
         if ((this.movementFlags & 8) != 0) {
            this.cameraAngle = 128;
            this.targetCameraOffsetX = this.cameraOffsetX = -8192;
            var10000 = this;
            var16 = this;
            var15 = 0;
         } else if ((this.movementFlags & 2) != 0) {
            this.cameraAngle = 0;
            this.targetCameraOffsetX = this.cameraOffsetX = 8192;
            var10000 = this;
            var16 = this;
            var15 = 0;
         } else {
            short var17;
            if ((this.movementFlags & 1) != 0) {
               var10000 = this;
               var17 = 192;
            } else {
               var10000 = this;
               var17 = 64;
            }

            var10000.cameraAngle = var17;
            this.targetCameraOffsetX = this.cameraOffsetX = 0;
            var10000 = this;
            var16 = this;
            var15 = -8192;
         }

         var10000.targetCameraOffsetY = var16.cameraOffsetY = var15;
      }

      super.x <<= 8;
      super.y <<= 8;
      this.sub_388();
      super.screenX = GameRenderer.worldToScreenFixedX(0, super.x);
      super.screenY = GameRenderer.worldToScreenFixedY(0, super.y);
      this.sub_42d(false);
      GameRenderer.setCameraPosition(0, super.x + this.cameraOffsetX, super.y + this.cameraOffsetY, false, true);
      super.aiState = 0;
      this.healEffectPosition = 0;
   }

   private boolean handleWeaponAttack() {
      if (this.currentWeaponId != 5 && GameManager.var_a0a != 9) {
         boolean var7 = false;
         this.attackAnimTimer = 32;
         int var1 = super.x + super.transformedBounds[4];
         int var2 = super.y + super.transformedBounds[5];
         int var3 = super.x + super.transformedBounds[6];
         int var4 = super.y + super.transformedBounds[7];
         if (this.checkCollisions(var1, var2, var3, var4, (Entity)null, 3)) {
            if (this.currentWeaponId != 1 && this.currentWeaponId != 7) {
               this.currentWeaponId = 0;
            }
         } else if (this.currentWeaponId == 0 && (super.statusFlags & 16) == 0) {
            var7 = true;
         }

         if (GameManager.var_607[this.currentWeaponId * 9 + 6] != -1 && (super.statusFlags & 128) == 0) {
            if (GameManager.var_ff5[10 + GameManager.var_ff5[5]] == 0) {
               GameManager.sub_1576(false);
            }

            if (GameManager.var_ff5[10 + GameManager.var_ff5[5]] == 0) {
               GameManager.var_ff5[5] = 1;
               this.currentWeaponId = GameManager.var_ff5[5];
            } else {
               this.currentWeaponId = GameManager.var_ff5[5];
               if ((super.statusFlags & 128) == 0 && (GameManager.var_ff5[31] & 2) == 0) {
                  --GameManager.var_ff5[10 + this.currentWeaponId];
               }
            }
         }

         if ((super.statusFlags & 128) != 0 && AnimatedSprite.sub_240(this)) {
            var7 = true;
         }

         if ((super.statusFlags & 144) == 0) {
            super.statusFlags |= 144;
            super.aiState = 2;
         }

         this.sub_3fc();
         if (AnimatedSprite.sub_1d8(this)) {
            if (GameManager.var_607[this.currentWeaponId * 9 + 1] == 1) {
               GameManager.sub_8ea(GameManager.var_607[this.currentWeaponId * 9 + 2], super.x, super.y, super.facing, (Entity)null, this.currentWeaponId, 0);
               GameManager.sub_1576(false);
            }

            if (GameManager.var_607[this.currentWeaponId * 9 + 8] != 0) {
               GameManager.sub_81a();
            }
         }

         var1 = super.x + super.transformedBounds[8];
         var2 = super.y + super.transformedBounds[9];
         var3 = super.x + super.transformedBounds[10];
         var4 = super.y + super.transformedBounds[11];
         this.checkCollisions(var1, var2, var3, var4, (Entity)null, 0);
         if (var7) {
            this.currentWeaponId = GameManager.var_ff5[5];
            super.aiState = 0;
            super.statusFlags &= -17;
         }

         return var7;
      } else {
         return true;
      }
   }

   public final boolean checkCollisions(int var1, int var2, int var3, int var4, Entity var5, int var6) {
      boolean var11 = false;
      if (var1 == var3) {
         return false;
      } else {
         if (var6 != 8) {
            for(int var7 = 0; var7 < 16; ++var7) {
               Entity var12 = (Entity) GameManager.var_670[1 + var7];
               if ((var6 != 1 || (var12.statusFlags & 4194304) == 0) && (var6 == 7 || (var12.propertyFlags & 16) == 0) && var5 != var12 && (var12.statusFlags & 8) != 0 && ((var12.stateFlags & 8) != 0 || (var12.stateFlags & 32) != 0 && AnimatedSprite.sub_106(var12) || var6 == 3 || var6 == 5)) {
                  byte var10;
                  label188: {
                     var10 = 0;
                     byte var10000;
                     if (var12.animationSetId != 11 || var6 != 3 && var6 != 0) {
                        if ((var12.stateFlags & 32) == 0) {
                           break label188;
                        }

                        var10000 = 8;
                     } else {
                        var10000 = 4;
                     }

                     var10 = var10000;
                  }

                  if (var12.x + var12.transformedBounds[2 + var10] != var12.x + var12.transformedBounds[0 + var10] && var12.x + var12.transformedBounds[2 + var10] >= var1 && var12.y + var12.transformedBounds[3 + var10] >= var2 && var12.x + var12.transformedBounds[0 + var10] <= var3 && var12.y + var12.transformedBounds[1 + var10] <= var4) {
                     var11 = true;
                     if (var5 != null && var6 == 5 && var12.animationSetId == 1) {
                        var12.sub_20a(var5.aiState == 12 ? 50 : 250, false, 0, var5.facing);
                     }

                     if (var6 == 3) {
                        if (var12.animationSetId != 3 && (var12.behaviorFlags & 65536) == 0) {
                           if (var12.animationSetId == 11) {
                              return false;
                           }

                           return true;
                        }

                        this.currentWeaponId = 0;
                        this.sub_296(var12);
                        return true;
                     }

                     if ((var12.behaviorFlags & 65536) == 0) {
                        if (var5 != null) {
                           boolean var8 = false;
                           if ((var12.propertyFlags & 16) != 0) {
                              ++GameManager.var_ff5[9];
                           }
                        } else if (var12.animationSetId == 1) {
                           Entity var15;
                           byte var10001;
                           if (var6 == 1) {
                              var15 = var12;
                              var10001 = 5;
                           } else {
                              var15 = var12;
                              var10001 = 2;
                           }

                           var15.var_63d = var10001;
                           var12.sub_20a(GameManager.sub_13d2(0, var6), this.currentWeaponId >= 0, -GameManager.var_607[this.currentWeaponId * 9 + 5] << 8, var12.sub_370(super.x, super.y));
                        }
                     }
                  }
               }
            }
         }

         if (var6 != 3 && GameRenderer.findTilesInRect(0, GameManager.var_6be, var1, var2, var3, var4) > 0) {
            int var13 = GameManager.var_6be[0] >> 8;
            int var9 = GameRenderer.collisionMap[var13] >> 2;
            if ((this.currentWeaponId == 3 || this.currentWeaponId == 7) && (var9 == 3 || var9 == 27) || (this.currentWeaponId == 5 || this.currentWeaponId == 7) && (var9 == 5 || var9 == 18)) {
               GameManager.sub_93e(0, var13);
            }

            var11 = false;
         }

         return var11;
      }
   }

   private boolean takeDamage(int var1, boolean var2) {
      super.statusFlags |= 96;
      if (var1 > 0) {
         int var3;
         label41: {
            int var10000;
            if ((var3 = GameRenderer.readInt16LE(GameManager.var_ff5, 2) - var1) < 0) {
               var10000 = 0;
            } else {
               if (var3 <= this.maxHealth) {
                  break label41;
               }

               var10000 = this.maxHealth;
            }

            var3 = var10000;
         }

         GameRenderer.writeInt16LE(GameManager.var_ff5, 2, (short)var3);
         GameManager.var_9d8 |= 2;
         if ((GameManager.vibrationEnabled & 1) != 0) {
            GameEngine.vibrate();
         }
      }

      GameManager.sub_1576(true);
      if (GameRenderer.readInt16LE(GameManager.var_ff5, 2) <= 0) {
         GameManager.var_9d8 |= 16;
         GameManager.sub_c12();
         super.var_8fb = 64;
         super.aiState = 3;
         GameManager.var_9d8 |= 67108864;
         return true;
      } else {
         if (var2) {
            this.knockbackVelocityX = this.knockbackVelocityY = 0;
            byte var10001;
            PlayerCharacter var4;
            if (this.damageDirection == 0) {
               this.knockbackVelocityY = -2048;
               super.facing = 2;
               var4 = this;
               var10001 = 4;
            } else if (this.damageDirection == 2) {
               this.knockbackVelocityY = 2048;
               super.facing = 0;
               var4 = this;
               var10001 = 1;
            } else if (this.damageDirection == 3) {
               this.knockbackVelocityX = -2048;
               super.facing = 1;
               var4 = this;
               var10001 = 2;
            } else {
               if (this.damageDirection != 1) {
                  return false;
               }

               this.knockbackVelocityX = 2048;
               super.facing = 3;
               var4 = this;
               var10001 = 8;
            }

            var4.movementFlags = var10001;
         }

         return false;
      }
   }

   public final void sub_296(Entity var1) {
      if ((var1.behaviorFlags & 67108864) != 0) {
         if ((super.statusFlags & 65536) != 0) {
            var1.sub_105(false);
            GameManager.sub_a29(var1.x >> 8, var1.y >> 8, 2, 261, 0, 4, 0);
            return;
         }
      } else if ((var1.behaviorFlags & 65536) != 0) {
         if (var1.aiState != 12) {
            var1.sub_267(super.collisionRadius);
            return;
         }
      } else if ((var1.behaviorFlags & '耀') != 0) {
         byte var2 = GameManager.objectSpawnData[var1.dataId * 5 + 3];
         byte var3 = GameManager.objectSpawnData[var1.dataId * 5 + 4];
         short var6 = var2 != -2 ? GameManager.animationResourceIds[var3] : -1;
         if (var2 == -2) {
            GameManager.var_aed = 290;
            return;
         }

         int var10000;
         int var4;
         if (var2 != -1) {
            if (GameManager.var_ff5[var2] == 0) {
               GameManager.var_aed = 290;
               return;
            }

            if (var6 == -1 || AnimatedSprite.sub_22c(var1) == (var6 & 255)) {
               return;
            }

            var1.sub_292(var6);
            if (var1.y < 9216) {
               return;
            }

            var4 = GameRenderer.snapToGridCenterX(0, var1.x);
            var10000 = GameRenderer.snapToGridCenterX(0, var1.y);
         } else {
            if (var6 == -1 || AnimatedSprite.sub_22c(var1) == (var6 & 255)) {
               return;
            }

            var1.sub_292(var6);
            if (var1.y < 9216) {
               return;
            }

            var4 = GameRenderer.snapToGridCenterX(0, var1.x);
            var10000 = var1.y - 9216;
         }

         int var5 = var10000;
         GameRenderer.setCollisionAt(0, var4, var5, (byte)0);
      }

   }

   private static int sub_2a0(Entity var0) {
      if (var0.zoneProgressId != -1) {
         if (GameManager.var_ff5[26] == 0) {
            GameManager.var_ff5[26] = 1;
            GameManager.sub_11a8(339);
         }

         GameRenderer.setBitInArray(GameManager.var_ff5, var0.zoneProgressId, 0, 1, 33);
      }

      for(int var1 = 0; var1 < 7; ++var1) {
         if (GameManager.var_607[88 + var1 * 5 + 0] == var0.dataId) {
            ++GameManager.var_ff5[var1 + 18];
            GameManager.var_f43 = GameManager.var_ff5[var1 + 18];
            break;
         }

         if (GameManager.var_607[var1 * 9 + 0] == var0.dataId) {
            ++GameManager.var_ff5[var1 + 10];
            GameManager.sub_13a3();
            break;
         }
      }

      GameManager.sub_1506(2, var0.dataId);
      GameManager.sub_7c9();
      var0.sub_2b1();
      return 0;
   }

   private boolean sub_2ff() {
      int var2 = super.x + super.transformedBounds[0];
      int var4 = super.y + super.transformedBounds[1];
      int var3 = super.x + super.transformedBounds[2];
      int var5 = super.y + super.transformedBounds[3];
      int var6 = super.aiState;
      boolean var7 = false;

      for(int var1 = 0; var1 < 16; ++var1) {
         Entity var8;
         if (((var8 = (Entity) GameManager.var_670[1 + var1]).propertyFlags & 16) == 0 && (var8.statusFlags & 8) != 0 && AnimatedSprite.sub_106(var8) && var8.x + var8.transformedBounds[10] >= var2 && var8.y + var8.transformedBounds[11] >= var4 && var8.x + var8.transformedBounds[8] <= var3 && var8.y + var8.transformedBounds[9] <= var5) {
            if ((super.statusFlags & 32) == 0 && (var8.stateFlags & 2) != 0) {
               this.damageDirection = var8.movementDirection;
               if ((super.statusFlags & 65536) == 0) {
                  this.takeDamage(var8.sub_45b(), true);
               }

               if (var8.animationSetId == 1) {
                  var8.sub_20a(0, true, -2560, var8.movementDirection);
               } else if (var8.animationSetId == 11) {
                  var8.sub_a4();

                  for(var1 = 0; var1 < 16; ++var1) {
                     Entity var9;
                     if ((var9 = (Entity) GameManager.var_670[1 + var1]).entityId == (var8.projectileData >> 26 & 63)) {
                        --var9.var_596;
                        break;
                     }
                  }
               }

               var7 = true;
               break;
            }

            if ((var8.stateFlags & 4) != 0) {
               sub_2a0(var8);
            }
         }
      }

      return super.aiState != var6 || var7;
   }

   private boolean sub_33f(int var1, int var2, int var3, int var4) {
      if (GameRenderer.detectZonesAtPos(var1, var2, var3, var4) != 0) {
         if (GameRenderer.foundTriggerZone != -1 && (GameManager.var_9d8 & 128) == 0 && ((GameRenderer.foundTriggerZone & '\uffff') >> 0 & 4096) != 0) {
            label76: {
               GameManager.var_b02 = 0;
               GameManager.var_aed = ((GameRenderer.foundTriggerZone & '\uffff') >> 0 & 4095) + 262;
               int var10000;
               if ((var1 = GameManager.sub_1539(0, GameManager.var_aed)) != -2 && !GameRenderer.getBitInArray(GameManager.var_ff5, GameManager.var_aed - 262, 0, 1, GameManager.var_10d5)) {
                  if (var1 == -1) {
                     break label76;
                  }

                  var10000 = var1;
               } else {
                  var10000 = -1;
               }

               GameManager.var_aed = var10000;
            }
         }

         short var5;
         if ((var5 = (short)(GameRenderer.foundWarpZone >> 0 & '\uffff')) != -1) {
            if (GameManager.sub_c66(var5)) {
               return false;
            }

            int var10 = (short)(GameRenderer.foundWarpZone >> 16 & '\uffff') * 5;
            ++var10;
            short var6 = GameRenderer.zoneData[var10++];
            short var7 = GameRenderer.zoneData[var10++];
            short var8 = GameRenderer.zoneData[var10++];
            short var9 = GameRenderer.zoneData[var10];
            this.warpPositionX = ((super.x >> 8) - var6 << 8) / (var8 - var6);
            this.warpPositionY = ((super.y >> 8) - var7 << 8) / (var9 - var7);
            if (this.warpPositionY > 255) {
               this.warpPositionY = 255;
            }

            if (this.warpPositionY < 0) {
               this.warpPositionY = 0;
            }

            if (this.warpPositionX > 255) {
               this.warpPositionX = 255;
            }

            if (this.warpPositionX < 0) {
               this.warpPositionX = 0;
            }
         }

         super.statusFlags &= -7425;
         if (GameRenderer.foundEventZone != -1) {
            PlayerCharacter var11;
            int var10001;
            short var10002;
            switch(GameRenderer.foundEventZone) {
            case 4:
               var11 = this;
               var10001 = super.statusFlags;
               var10002 = 1024;
               break;
            case 5:
               var11 = this;
               var10001 = super.statusFlags;
               var10002 = 256;
               break;
            case 6:
            default:
               return false;
            case 7:
               var11 = this;
               var10001 = super.statusFlags;
               var10002 = 2048;
               break;
            case 8:
               var11 = this;
               var10001 = super.statusFlags;
               var10002 = 4096;
            }

            var11.statusFlags = var10001 | var10002;
         }
      } else {
         super.statusFlags &= -7425;
      }

      return false;
   }

   public final int sub_37c() {
      boolean var10 = true;
      if (AnimatedSprite.sub_43e(this)) {
         return 0;
      } else {
         boolean var8 = false;
         short var6 = 0;
         short var7 = 0;
         if (super.aiState != 3) {
            if ((super.statusFlags & 65536) != 0) {
               GameManager.var_ff5[5] = 7;
               this.currentWeaponId = GameManager.var_ff5[5];
               GameRenderer.writeInt16LE(GameManager.var_ff5, 2, (short)this.maxHealth);
               this.updateMaxHealth();
               if ((GameManager.mapConfigs[GameManager.var_ff5[8] * 8 + 3] & 8192) != 0 && (super.statusFlags & 1024) == 0) {
                  --GameManager.var_e42;
               }

               if (GameManager.var_e42 < 0) {
                  GameManager.var_e42 = 0;
                  GameRenderer.writeInt16LE(GameManager.var_ff5, 2, (short)0);
                  this.takeDamage(0, false);
               }
            } else if (this.currentWeaponId == 7) {
               GameManager.var_ff5[5] = 0;
               this.currentWeaponId = GameManager.var_ff5[5];
            } else if ((super.statusFlags & 64) != 0) {
               super.aiState = 5;
            }
         }

         int var11;
         int var12;
         if ((super.statusFlags & 4096) != 0) {
            if (super.aiState == 1) {
               var11 = GameRenderer.snapToGridCenterX(0, super.x) >> 8;
               var12 = GameRenderer.snapToGridCenterY(0, super.y) >> 8;
               if (var11 != this.lastGridPosition >> 16 && (short)var12 != (short)this.lastGridPosition) {
                  GameManager.sub_a29(super.x >> 8, super.y >> 8, 2, 111, 0, 4, 0);
                  this.lastGridPosition = (var11 << 16) + (short)var12;
               }

               var6 = 0;
               var7 = 0;
            }
         } else {
            this.lastGridPosition = 0;
         }

         PlayerCharacter var10000;
         int var10001;
         label252: {
            if ((GameManager.var_9d8 & 512) != 0) {
               super.statusFlags &= -65;
               var10000 = this;
               var10001 = super.statusFlags | 32;
            } else {
               if ((super.statusFlags & 64) != 0) {
                  this.sub_3c7(0, 0, true);
                  break label252;
               }

               var10000 = this;
               var10001 = super.statusFlags & -33;
            }

            var10000.statusFlags = var10001;
         }

         label277: {
            if (GameRenderer.readInt16LE(GameManager.var_ff5, 2) <= (short)(this.maxHealth >> 1) && super.aiState != 3) {
               super.statusFlags |= 16384;
               if (++this.lowHealthBlinkTimer <= 160) {
                  if (this.lowHealthBlinkTimer > 152) {
                     label175: {
                        short var10002;
                        if (this.lowHealthBlinkTimer > 156) {
                           super.statusFlags ^= 32768;
                           if ((super.statusFlags & '耀') != 0) {
                              var10000 = this;
                              var10001 = super.renderOffsetX + 256;
                              break label175;
                           }

                           var10000 = this;
                           var10001 = super.renderOffsetX;
                           var10002 = 256;
                        } else {
                           super.statusFlags ^= 32768;
                           if ((super.statusFlags & '耀') != 0) {
                              var10000 = this;
                              var10001 = super.renderOffsetX + 512;
                              break label175;
                           }

                           var10000 = this;
                           var10001 = super.renderOffsetX;
                           var10002 = 512;
                        }

                        var10001 -= var10002;
                     }

                     var10000.renderOffsetX = var10001;
                     this.weaponSprite.renderOffsetX = super.renderOffsetX;
                     return 0;
                  }
                  break label277;
               }

               if ((GameManager.var_a69.statusFlags & 1024) == 0) {
                  GameManager.sub_a29(super.x >> 8, super.y >> 8, 2, 151, 0, 4, 0);
                  var10000 = this;
                  var10001 = (super.x >> 8 << 16) + (super.y >> 8 & '\uffff');
               } else {
                  GameManager.sub_a29(super.x >> 8, super.y >> 8, 2, 172, 0, 4, 0);
                  var10000 = this;
                  var10001 = 0;
               }

               var10000.healEffectPosition = var10001;
               var10000 = this;
            } else {
               this.healEffectPosition = 0;
               super.statusFlags &= -16385;
               var10000 = this;
            }

            var10000.lowHealthBlinkTimer = 0;
         }

         switch(super.aiState) {
         case 3:
            super.statusFlags &= -8561;
            super.facing = 1;
            GameManager.var_9d8 = super.var_8fb >= 64 ? GameManager.var_9d8 & -67108865 : GameManager.var_9d8 | 67108864;
            if (super.var_8fb <= 0) {
               GameManager.sub_11a8(291);
            }

            this.currentWeaponId = GameManager.var_ff5[5] = 0;
            --super.var_8fb;
            break;
         case 4:
            --super.var_8fb;
            if (super.var_8fb <= 0) {
               super.var_8fb = 32;
               super.aiState = 0;
            }
            break;
         case 5:
            super.statusFlags &= -17;
            super.statusFlags |= 32;
            if (AnimatedSprite.sub_22c(this) == GameManager.animationIndices[232 + super.facing] && AnimatedSprite.sub_240(this)) {
               super.statusFlags &= -97;
               super.aiState = 0;
            }
            break;
         default:
            if (this.currentWeaponId == 5) {
               int var1 = super.x + super.transformedBounds[8];
               int var2 = super.y + super.transformedBounds[9];
               int var3 = super.x + super.transformedBounds[10];
               int var4 = super.y + super.transformedBounds[11];
               if (this.checkCollisions(var1, var2, var3, var4, (Entity)null, 1)) {
                  label233: {
                     short var14;
                     switch(super.facing) {
                     case 0:
                        var7 = 3584;
                        break label233;
                     case 1:
                        var14 = -3584;
                        break;
                     case 2:
                        var7 = -3584;
                        break label233;
                     case 3:
                        var14 = 3584;
                        break;
                     default:
                        break label233;
                     }

                     var6 = var14;
                  }

                  this.sub_3c7(var6, var7, true);
               }
            }

            label223: {
               byte var15;
               label222: {
                  if ((super.statusFlags & 2048) != 0) {
                     if (this.cameraAngle > 64 && this.cameraAngle <= 192) {
                        var10000 = this;
                        var15 = 3;
                        break label222;
                     }

                     var10000 = this;
                  } else {
                     int var5;
                     if ((var5 = this.cameraAngle + 32) > 256) {
                        var5 -= 256;
                     }

                     super.facing = var5 >> 6;
                     ++super.facing;
                     if (super.facing > 3) {
                        super.facing = 0;
                     }

                     if (this.cameraAngle >= 0) {
                        break label223;
                     }

                     var10000 = this;
                  }

                  var15 = 1;
               }

               var10000.facing = var15;
            }

            if (GameManager.var_d22 <= 0 && ((GameRenderer.inputState & 1) != 0 || (super.statusFlags & 16) != 0)) {
               var10 = this.handleWeaponAttack();
            }

            if (var10) {
               if ((GameRenderer.inputState & 1) == 0) {
                  super.statusFlags &= -129;
               }

               byte var13 = -1;
               var12 = 0;
               var11 = 0;
               if (GameManager.var_a0a != 9) {
                  label265: {
                     int var16;
                     label198: {
                        if ((GameRenderer.inputState & 2) != 0) {
                           this.movementFlags |= 1;
                           this.movementFlags &= -5;
                           if ((GameRenderer.inputState & 16) == 0 && (GameRenderer.inputState & 8) == 0) {
                              this.movementFlags &= -11;
                           }

                           var13 = 0;
                           var16 = -super.velocityY;
                        } else {
                           if ((GameRenderer.inputState & 4) == 0) {
                              break label198;
                           }

                           this.movementFlags |= 4;
                           this.movementFlags &= -2;
                           if ((GameRenderer.inputState & 16) == 0 && (GameRenderer.inputState & 8) == 0) {
                              this.movementFlags &= -11;
                           }

                           var13 = 2;
                           var16 = super.velocityY;
                        }

                        var12 = var16;
                     }

                     if ((GameRenderer.inputState & 8) != 0) {
                        this.movementFlags |= 8;
                        this.movementFlags &= -3;
                        if ((GameRenderer.inputState & 2) == 0 && (GameRenderer.inputState & 4) == 0) {
                           this.movementFlags &= -6;
                        }

                        var13 = 3;
                        var16 = -super.velocityX;
                     } else {
                        if ((GameRenderer.inputState & 16) == 0) {
                           break label265;
                        }

                        this.movementFlags |= 2;
                        this.movementFlags &= -9;
                        if ((GameRenderer.inputState & 2) == 0 && (GameRenderer.inputState & 4) == 0) {
                           this.movementFlags &= -6;
                        }

                        var13 = 1;
                        var16 = super.velocityX;
                     }

                     var11 = var16;
                  }
               }

               if (var13 == -1) {
                  super.aiState = 0;
                  this.sub_388();
               } else if ((super.statusFlags & 16) == 0) {
                  super.aiState = 1;
                  this.attackAnimTimer = 32;
                  this.sub_3c7(var11, var12, true);
               }

               if ((super.statusFlags & 64) == 0) {
                  this.sub_33f(super.x - 1792, super.y - 1792, super.x + 1792, super.y + 1792);
               }
            }

            if (this.sub_2ff()) {
               return 0;
            }
         }

         label184: {
            if ((super.statusFlags & 256) != 0) {
               if ((super.statusFlags & 8192) != 0) {
                  break label184;
               }

               this.sub_388();
               GameManager.sub_a29(super.x >> 8, super.y >> 8, 2, 66, 0, 4, 0);
               var10000 = this;
               var10001 = super.statusFlags | 8192;
            } else {
               if ((super.statusFlags & 8192) == 0) {
                  break label184;
               }

               this.sub_388();
               GameManager.sub_a29(super.x >> 8, super.y >> 8, 2, 66, 0, 4, 0);
               var10000 = this;
               var10001 = super.statusFlags & -8193;
            }

            var10000.statusFlags = var10001;
         }

         this.sub_3fc();
         return 0;
      }
   }

   private void sub_388() {
      PlayerCharacter var10000;
      int var10001;
      PlayerCharacter var10002;
      int var10003;
      if (this.currentWeaponId != 5 && (super.statusFlags & 256) == 0) {
         var10000 = this;
         var10003 = 1024;
         var10002 = this;
         var10001 = 1024;
      } else {
         var10000 = this;
         var10003 = this.currentWeaponId == 5 && (super.statusFlags & 256) != 0 ? 192 : 384;
         var10002 = this;
         var10001 = var10003;
      }

      var10002.velocityY = var10003;
      var10000.velocityX = var10001;
   }

   private boolean sub_3c7(int var1, int var2, boolean var3) {
      boolean var18 = false;
      boolean var17 = false;
      boolean var16 = false;
      boolean var15 = false;
      boolean var22 = false;
      boolean var21 = false;
      boolean var20 = false;
      boolean var19 = false;
      boolean var23 = false;
      boolean var25 = false;
      boolean var24 = false;
      int var35 = super.x + super.transformedBounds[0];
      int var37 = super.y + super.transformedBounds[1];
      int var36 = super.x + super.transformedBounds[2];
      int var38 = super.y + super.transformedBounds[3];
      if ((super.statusFlags & 64) != 0) {
         var1 += this.knockbackVelocityX;
         var2 += this.knockbackVelocityY;
         if (Math.abs(this.knockbackVelocityX) > 256) {
            this.knockbackVelocityX -= this.knockbackVelocityX > 0 ? 1280 : -1280;
            if (Math.abs(this.knockbackVelocityX) < 256) {
               this.knockbackVelocityX = this.knockbackVelocityX > 0 ? 256 : -256;
            }
         } else if (Math.abs(this.knockbackVelocityY) > 256) {
            this.knockbackVelocityY -= this.knockbackVelocityY > 0 ? 1280 : -1280;
            if (Math.abs(this.knockbackVelocityY) < 256) {
               this.knockbackVelocityY = this.knockbackVelocityY > 0 ? 256 : -256;
            }
         }
      }

      int var10000;
      int var28;
      int var29;
      label241: {
         var28 = super.x + var1;
         var29 = super.y + var2;
         if (var28 < 0) {
            var10000 = 0;
         } else {
            if (var28 <= GameRenderer.layerProperties[4] << 8) {
               break label241;
            }

            var10000 = GameRenderer.layerProperties[4] - 1 << 8;
         }

         var28 = var10000;
      }

      label235: {
         if (var29 < 0) {
            var10000 = 0;
         } else {
            if (var29 <= GameRenderer.layerProperties[5] << 8) {
               break label235;
            }

            var10000 = GameRenderer.layerProperties[5] - 1 << 8;
         }

         var29 = var10000;
      }

      int var11 = var28 + super.transformedBounds[0];
      int var12 = var29 + super.transformedBounds[1];
      int var13 = var28 + super.transformedBounds[2];
      int var14 = var29 + super.transformedBounds[3];
      if (var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            Entity var30;
            if (((var30 = (Entity) GameManager.var_670[1 + var4]).animFlags & 2) != 0 && (var30.statusFlags & 8) != 0 && (var30.stateFlags & 1) != 0 && (var30.propertyFlags & 16) == 0 && var30.x + var30.transformedBounds[2] >= var11 && var30.y + var30.transformedBounds[3] >= var12 && var30.x + var30.transformedBounds[0] <= var13 && var30.y + var30.transformedBounds[1] <= var14) {
               if (var30.x + var30.transformedBounds[2] >= var35 && var30.y + var30.transformedBounds[3] >= var37 && var30.x + var30.transformedBounds[0] <= var36 && var30.y + var30.transformedBounds[1] <= var38) {
                  var28 -= var1;
                  var29 -= var2;
               } else {
                  if (var30.animationSetId == 1) {
                     var30.statusFlags |= 128;
                     if (!var3) {
                        continue;
                     }
                  }

                  if ((var30.behaviorFlags & 268435456) == 0 || (var30.propertyFlags & 16) == 0) {
                     return false;
                  }
               }
            }
         }
      }

      int var5;
      int var7;
      int var26;
      int var27;
      int var32;
      int var34;
      label196: {
         var7 = GameRenderer.layerProperties[1];
         int var8 = GameRenderer.layerProperties[2];
         var26 = GameRenderer.layerProperties[6];
         var27 = GameRenderer.layerProperties[7];
         var32 = var7 * var26 << 8;
         var34 = var8 * var27 << 8;
         if (var11 < 0) {
            var10000 = var11 - 0;
         } else {
            if (var13 < var32) {
               break label196;
            }

            var10000 = var13 - var32 + 1;
         }

         var5 = var10000;
         var28 -= var5;
         var11 -= var5;
         var13 -= var5;
      }

      label190: {
         if (var12 < 0) {
            var10000 = var12 - 0;
         } else {
            if (var14 < var34) {
               break label190;
            }

            var10000 = var14 - var34 + 1;
         }

         var5 = var10000;
         var29 -= var5;
         var12 -= var5;
         var14 -= var5;
      }

      int var31 = (var11 >> 8) / var26;
      int var33 = (var12 >> 8) / var27;
      var32 = (var13 >> 8) / var26;
      var34 = (var14 >> 8) / var27;
      int var39 = 0;
      int var6;
      if ((var6 = GameRenderer.collisionMap[var33 * var7 + var31] & 3) == 1 || var6 == 2) {
         var39 = 1;
      }

      if ((var6 = GameRenderer.collisionMap[var33 * var7 + var32] & 3) == 1 || var6 == 2) {
         var39 |= 2;
      }

      if ((var6 = GameRenderer.collisionMap[var34 * var7 + var31] & 3) == 1 || var6 == 2) {
         var39 |= 4;
      }

      if ((var6 = GameRenderer.collisionMap[var34 * var7 + var32] & 3) == 1 || var6 == 2) {
         var39 |= 8;
      }

      int var41 = 0;
      int var40 = 0;
      if (var39 != 0) {
         if (var39 == 8) {
            var5 = var32 * var26 << 8;
            if (var36 > var5) {
               var6 = var13 - var5;
               var41 = var14 - (var34 * var27 - 1 << 8);
               if (var6 >> 8 <= 18) {
                  var40 = 512;
               }
            } else {
               var6 = var14 - (var34 * var27 << 8);
               var40 = var13 - (var32 * var26 - 1 << 8);
               if (var6 >> 8 <= 18) {
                  var41 = 512;
               }
            }
         } else if (var39 == 4) {
            var5 = var31 * var26 + var26 - 1 << 8;
            if (var35 < var5) {
               var6 = var5 - var11;
               var41 = var14 - (var34 * var27 - 1 << 8);
               if (var6 >> 8 <= 18) {
                  var40 = -512;
               }
            } else {
               var6 = var12 - (var34 * var27 << 8);
               var40 = var11 - (var31 * var26 + var26 << 8);
               if (var6 >> 8 <= 18) {
                  var41 = 512;
               }
            }
         } else if (var39 == 2) {
            var5 = var32 * var26 << 8;
            if (var36 > var5) {
               var6 = var13 - var5;
               var41 = var12 - (var33 * var27 + var27 << 8);
               if (var6 >> 8 <= 18) {
                  var40 = 512;
               }
            } else {
               var6 = (var33 * var27 + var27 - 1 << 8) - var14;
               var40 = var13 - (var32 * var26 - 1 << 8);
               if (var6 >> 8 <= 18) {
                  var41 = -512;
               }
            }
         } else if (var39 == 1) {
            var5 = var31 * var26 + var26 - 1 << 8;
            if (var35 < var5) {
               var6 = var5 - var11;
               var41 = var12 - (var33 * var27 + var27 << 8);
               if (var6 >> 8 <= 18) {
                  var40 = -512;
               }
            } else {
               var6 = (var33 * var27 + var27 - 1 << 8) - var12;
               var40 = var11 - (var31 * var26 + var26 << 8);
               if (var6 >> 8 <= 18) {
                  var41 = -512;
               }
            }
         } else if (var39 == 12) {
            var41 = var14 - (var34 * var27 - 1 << 8);
         } else if (var39 == 10) {
            var40 = var13 - (var32 * var26 - 1 << 8);
         } else if (var39 == 5) {
            var40 = var11 - (var31 * var26 + var26 << 8);
         } else if (var39 == 3) {
            var41 = var12 - (var33 * var27 + var27 << 8);
         } else if (var39 == 11) {
            var41 = var12 - (var33 * var27 + var27 << 8);
            var40 = var13 - (var32 * var26 - 1 << 8);
         } else if (var39 == 14) {
            var41 = var14 - (var34 * var27 - 1 << 8);
            var40 = var13 - (var32 * var26 - 1 << 8);
         } else if (var39 == 13) {
            var41 = var14 - (var34 * var27 - 1 << 8);
            var40 = var11 - (var31 * var26 + var26 << 8);
         } else {
            if (var39 != 7) {
               return false;
            }

            var41 = var12 - (var33 * var27 + var27 << 8);
            var40 = var11 - (var31 * var26 + var26 << 8);
         }
      }

      var29 -= var41;
      var28 -= var40;
      super.x = var28;
      super.y = var29;
      return true;
   }

   private void sub_3fc() {
      if ((super.statusFlags & 4) == 0 && (super.statusFlags & 2) == 0) {
         int var1 = 0;
         int var10000;
         if (super.aiState == 3) {
            var1 = (super.statusFlags & 65536) != 0 ? 48 : 49;
            boolean var2 = false;
         } else {
            label94: {
               if ((super.statusFlags & 64) != 0) {
                  var10000 = 58;
               } else {
                  label91: {
                     if (super.aiState == 2) {
                        if ((super.statusFlags & 128) == 0) {
                           break label91;
                        }

                        var10000 = 74;
                     } else {
                        if ((super.statusFlags & 2048) != 0) {
                           var1 = super.aiState == 1 ? 98 : 90;
                           break label91;
                        }

                        var10000 = (super.statusFlags & 16384) != 0 && (this.attackAnimTimer <= 0 || this.currentWeaponId == 0 || this.currentWeaponId == 3) && this.currentWeaponId != 5 ? 106 : (super.aiState == 1 ? 66 : 50);
                     }

                     var1 = var10000;
                  }

                  --this.attackAnimTimer;
                  if (this.attackAnimTimer <= 0 && this.currentWeaponId != 5 && (super.statusFlags & 65536) == 0) {
                     break label94;
                  }

                  var10000 = var1 + this.currentWeaponId;
               }

               var1 = var10000;
            }
         }

         int var5;
         label69: {
            if ((super.statusFlags & 256) != 0) {
               var10000 = 37;
            } else {
               if ((super.statusFlags & 2048) != 0) {
                  var5 = super.aiState == 1 ? 40 : 39;
                  break label69;
               }

               var10000 = super.aiState == 1 ? 36 : 35;
            }

            var5 = var10000;
         }

         short var3 = GameManager.animationIndices[var1 * 4 + super.facing];
         short var4 = GameManager.animationIndices[var5 * 4 + super.facing];
         if (var3 == -1) {
            var3 = GameManager.animationIndices[50 + super.facing];
         }

         if (var4 == -1) {
            var4 = GameManager.animationIndices[35 + super.facing];
         }

         GameManager.sub_159c(this, var3, super.facing);
         GameManager.sub_159c(this.weaponSprite, var4, super.facing);
      }
   }

   public final void sub_42d(boolean var1) {
      int var4 = GameManager.directionTable[this.movementFlags + 40] & 255;
      boolean var7 = false;
      int var2 = super.x + this.cameraOffsetX;
      int var3 = super.y + this.cameraOffsetY;
      GameRenderer.setCameraPosition(0, var2 >> 8, var3 + -8192 >> 8, false, true);
      if (var4 < 0) {
         var4 += 256;
      }

      if (var4 > 256) {
         var4 -= 256;
      }

      PlayerCharacter var10000;
      int var10001;
      int var8;
      label76: {
         this.cameraOffsetX = this.targetCameraOffsetX;
         this.cameraOffsetY = this.targetCameraOffsetY;
         var2 = GameEngine.mulBySin(8192L, var4);
         var3 = GameEngine.mulByCos(8192L, var4);
         if (var1) {
            var10000 = this;
            var10001 = var2;
         } else {
            if ((var8 = GameEngine.abs(this.targetCameraOffsetX - var2 >> 2)) > 1536) {
               var8 = 1536;
            }

            if (this.cameraOffsetX < var2) {
               var10000 = this;
               var10001 = this.targetCameraOffsetX + var8;
            } else {
               if (this.cameraOffsetX <= var2) {
                  break label76;
               }

               var10000 = this;
               var10001 = this.targetCameraOffsetX - var8;
            }
         }

         var10000.targetCameraOffsetX = var10001;
      }

      label68: {
         if (var1) {
            var10000 = this;
            var10001 = var3;
         } else {
            if ((var8 = GameEngine.abs(this.targetCameraOffsetY - var3 >> 2)) > 1536) {
               var8 = 1536;
            }

            if (this.cameraOffsetY < var3) {
               var10000 = this;
               var10001 = this.targetCameraOffsetY + var8;
            } else {
               if (this.cameraOffsetY <= var3) {
                  break label68;
               }

               var10000 = this;
               var10001 = this.targetCameraOffsetY - var8;
            }
         }

         var10000.targetCameraOffsetY = var10001;
      }

      byte var9 = 18;
      if (this.currentWeaponId == 5) {
         var9 = 9;
      }

      if (this.cameraAngle <= var4 + var9 && this.cameraAngle >= var4 - var9) {
         var10000 = this;
         var10001 = var4;
      } else {
         int var5 = var4 - this.cameraAngle;
         int var6 = this.cameraAngle - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         if (var6 < 0) {
            var6 += 256;
         }

         if (var5 < var6) {
            var10000 = this;
            var10001 = this.cameraAngle + var9;
         } else {
            var10000 = this;
            var10001 = this.cameraAngle - var9;
         }
      }

      var10000.cameraAngle = var10001;
      if (this.cameraAngle < 0) {
         this.cameraAngle += 256;
      }

      if (this.cameraAngle > 256) {
         this.cameraAngle -= 256;
      }

      GameManager.sub_707();
   }

   public final void sub_487(Graphics var1) {
      int var2 = (super.statusFlags & 1024) != 0 ? 3 : 0;
      this.weaponSprite.animationData = super.animationData = (byte[]) GameRenderer.getResource(GameManager.var_6d1[var2]);
      if (GameManager.var_a0a != 9 && (super.statusFlags & 1) != 0) {
         var1.drawImage(GameManager.var_686[0].images[0], GameManager.var_ccb + GameRenderer.viewOffsetX + ((super.transformedBounds[0] + super.transformedBounds[2] >> 1) + super.screenX >> 8) - 10, GameManager.var_d14 + GameRenderer.viewOffsetY + ((super.transformedBounds[1] + super.transformedBounds[3] >> 1) + super.screenY >> 8) - 4, 20);
         super.pivotOffsetX = GameManager.var_ccb;
         super.pivotOffsetY = GameManager.var_d14;
         if (super.aiState != 3) {
            if ((super.statusFlags & 256) == 0) {
               PlayerCharacter var10000;
               int var10001;
               int var10002;
               if (this.weaponSprite.sub_3b3(0) == 0) {
                  super.pivotOffsetX += this.weaponSprite.transformedBounds[8] + this.weaponSprite.transformedBounds[10] >> 1 >> 8;
                  var10000 = this;
                  var10001 = super.pivotOffsetY;
                  var10002 = this.weaponSprite.transformedBounds[9] >> 8;
               } else {
                  super.pivotOffsetX += this.weaponSprite.sub_3b3(0) >> 16;
                  var10000 = this;
                  var10001 = super.pivotOffsetY;
                  var10002 = (short)this.weaponSprite.sub_3b3(0);
               }

               var10000.pivotOffsetY = var10001 + var10002;
            }

            this.weaponSprite.render(var1, GameManager.var_ccb + (GameRenderer.worldToScreenFixedX(0, super.x + this.weaponSprite.renderOffsetX) >> 8), GameManager.var_d14 + (GameRenderer.worldToScreenFixedY(0, super.y + this.weaponSprite.renderOffsetY) >> 8));
            if ((super.statusFlags & 2) == 0) {
               this.weaponSprite.sub_315();
            }
         }

         super.sub_487(var1);
      }

   }
}
