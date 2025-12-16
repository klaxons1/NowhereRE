import javax.microedition.lcdui.Graphics;

final class Class_1c2 extends Class_1ac {
   int var_61;
   int var_c4;
   int var_fa;
   int var_151;
   int var_19d;
   int var_1b4;
   int var_21a;
   int var_252;
   int var_28b;
   int var_29d;
   int var_2ae;
   int var_2f9;
   int var_329;
   int var_355;
   int var_373;
   int var_3cd;
   int var_3de;
   int var_43f;
   int var_459;
   int var_4af;
   int var_4f2;
   int var_596;
   int var_5be;
   int var_61a;
   int var_63d;
   int var_650;
   int var_68f;
   int var_69b;
   int var_6ce;
   int var_701;
   int var_70b;
   int var_719;

   Class_1c2(int var1) {
      super.var_9b3 = var1;
   }

   public final void sub_2a() {
      this.sub_6f();
   }

   public final void sub_5e(boolean var1) {
      this.sub_a4();
      this.sub_14(0);
      if (var1 || this.var_61 >= 4) {
         super.var_11 = null;
         this.sub_2a();
      }

   }

   public final void sub_14(int[] var1) {
      Class_1c2 var10000;
      label57: {
         super.var_591 = var1[0];
         super.var_5d1 = var1[1];
         super.var_9a0 = (byte)var1[2];
         this.var_c4 = var1[3];
         this.var_355 = -1;
         super.var_824 = 9;
         this.var_1b4 = 0;
         this.var_21a = 0;
         super.var_679 = 0;
         super.var_6c3 = 0;
         this.var_69b = this.var_701 = -1;
         this.var_6ce = this.var_70b = -1;
         int var10001;
         if (super.var_9a0 == 3) {
            this.var_61 = Class_201.var_4e8[this.var_c4 * 5 + 0] & 255;
            this.var_1b4 = Class_201.var_39b[this.var_c4 * 2 + 0];
            this.var_21a = Class_201.var_39b[this.var_c4 * 2 + 1];
            Class_1ac.sub_4dd(this, 63, Class_201.var_4e8[this.var_c4 * 5 + 2] & 255);
            var10000 = this;
            var10001 = 0;
         } else {
            if (super.var_9a0 != 1 && super.var_9a0 != 2) {
               break label57;
            }

            this.var_61 = Class_201.var_49a[this.var_c4 * 17 + 0] & 255;
            this.var_1b4 = Class_201.var_343[this.var_c4 * 5 + 4];
            this.var_21a = Class_201.var_343[this.var_c4 * 5 + 3];
            Class_1ac.sub_4dd(this, 63, Class_201.var_49a[this.var_c4 * 17 + 11] & 255);
            if (super.var_9a0 == 2) {
               var10000 = this;
               var10001 = -1;
            } else {
               var10000 = this;
               var10001 = 1 * (Class_201.var_49a[this.var_c4 * 17 + 5] & 255) * ((Class_201.var_ff5[31] & 4) != 0 ? 2 : 1);
            }

            var10000.var_29d = var10001;
            super.var_824 &= -5;
            this.var_fa = 4 * (Class_201.var_49a[this.var_c4 * 17 + 1] & 255);
            var10000 = this;
            var10001 = (Class_201.var_49a[this.var_c4 * 17 + 12] & 255) * 4;
         }

         var10000.var_151 = var10001;
      }

      super.var_899 = this.var_29d;
      if (super.var_9a0 != 1 && super.var_9a0 != 2) {
         super.var_721 = this.var_19d = 2;
      } else {
         Class_1c2 var2;
         byte var10002;
         if ((this.var_21a & 128) != 0) {
            var10000 = this;
            var2 = this;
            var10002 = 0;
         } else {
            label65: {
               if ((this.var_21a & 256) == 0) {
                  if ((this.var_21a & 512) != 0) {
                     var10000 = this;
                     var2 = this;
                     var10002 = 3;
                     break label65;
                  }

                  if ((this.var_21a & 1024) != 0) {
                     var10000 = this;
                     var2 = this;
                     var10002 = 1;
                     break label65;
                  }
               }

               var10000 = this;
               var2 = this;
               var10002 = 2;
            }
         }

         var10000.var_721 = var2.var_19d = var10002;
         super.var_814 = (byte)(1 << this.var_19d);
      }

      if ((this.var_1b4 & 16) != 0) {
         this.var_2f9 = 32 * (Class_201.var_49a[this.var_c4 * 17 + 6] & 255);
      }

   }

   public final void sub_a4() {
      super.var_824 &= -9;
      super.var_954 = 0;
      super.var_873 &= -64;
   }

   public final void sub_105(boolean var1) {
      if ((super.var_824 & 512) == 0) {
         Class_201.sub_6f3(this);
      }

      if ((super.var_873 & 16) != 0) {
         Class_17f.sub_f76(0, Class_17f.sub_dd0(0, super.var_591), Class_17f.sub_de9(0, super.var_5d1), (byte)0);
      }

      if (var1) {
         this.sub_18e(7, super.var_591, super.var_5d1, -1, 0);
      } else {
         this.sub_a4();
      }
   }

   private void sub_13b() {
      if ((super.var_824 & 131072) == 0) {
         super.var_8fb = 0;
         super.var_954 = 0;
         if (super.var_9a0 == 3) {
            byte var1 = Class_201.var_4e8[this.var_c4 * 5 + 1];
            short var2;
            if ((var2 = Class_201.var_3c4[var1]) != -1) {
               super.var_824 &= -5;
               this.sub_530((byte)(1 << super.var_721), (byte)Class_201.var_412[this.var_151 + super.var_721]);
               this.sub_292(var2);
            }
         } else if (super.var_9a0 == 1 || super.var_9a0 == 2) {
            label43: {
               Class_1c2 var10000;
               byte var10001;
               if ((this.var_1b4 & 4) != 0) {
                  if ((super.var_591 != Class_17f.sub_dd0(0, super.var_591) || super.var_5d1 != Class_17f.sub_de9(0, super.var_5d1)) && (this.var_21a & 65536) == 0) {
                     super.var_954 = 20;
                     super.var_7c3 = super.var_591 - Class_17f.sub_dd0(0, super.var_591) >> 2;
                     super.var_7d4 = super.var_5d1 - Class_17f.sub_de9(0, super.var_5d1) >> 2;
                     this.var_28b = 4;
                     break label43;
                  }

                  if ((super.var_824 & 16384) == 0) {
                     super.var_954 = 1;
                     super.var_8fb = 16;
                     this.var_28b = 16;
                     break label43;
                  }

                  var10000 = this;
                  var10001 = 2;
               } else {
                  var10000 = this;
                  var10001 = 1;
               }

               var10000.var_954 = var10001;
            }

            this.sub_385();
            if ((this.var_21a & 131072) != 0) {
               Class_201.var_c83 = 832;
            }
         }

         if ((super.var_873 & 16) != 0) {
            Class_17f.sub_f4f(0, super.var_591 + super.var_409[0], super.var_5d1 + super.var_409[1], super.var_591 + super.var_409[2], super.var_5d1 + super.var_409[3], (byte)1);
         }

         super.var_743 = Class_17f.sub_d60(0, super.var_591);
         super.var_77c = Class_17f.sub_db8(0, super.var_5d1);
      }

   }

   public final void sub_18e(int var1, int var2, int var3, int var4, int var5) {
      int var6;
      short var7;
      byte var9;
      int var10;
      Class_1c2 var10000;
      int var10001;
      label46: {
         int var11;
         label45: {
            this.var_63d = 0;
            super.var_591 = var2;
            super.var_5d1 = var3;
            var7 = 0;
            this.var_61 = -1;
            var10 = 0;
            super.var_824 = 9;
            this.var_1b4 = 0;
            this.var_21a = 0;
            byte var12;
            switch(var1) {
            case 6:
               this.var_329 = var5;
               var6 = 1;
               super.var_954 = 9;
               super.var_8fb = 288;
               this.var_252 = 96;
               var7 = Class_201.var_3c4[Class_201.var_4e8[this.var_329 * 5 + 1]];
               var12 = 4;
               break;
            case 7:
               super.var_954 = 8;
               var6 = 2;
               var7 = 230;
               var9 = 0;
               var11 = Class_201.var_a69.var_721 == 3 ? 2 : 0;
               break label45;
            case 8:
            case 9:
            default:
               var6 = 2;
               super.var_954 = 17;
               var7 = 0;
               var12 = 0;
               break;
            case 10:
            case 11:
               var6 = Class_201.var_49a[(var5 >> 20 & 63) * 17 + 0] & 63;
               super.var_954 = 14;
               this.var_4f2 = var5;
               this.var_fa = 4 * (Class_201.var_49a[(var5 >> 20 & 63) * 17 + 8] & 255);
               this.var_151 = 0;
               super.var_824 |= 2048;
               if (var1 == 11) {
                  this.var_373 = Class_201.var_a69.var_591;
                  var10000 = this;
                  var10001 = Class_201.var_a69.var_5d1;
               } else {
                  this.var_373 = super.var_591 + ((var5 >> 14 & 63) * 288 << 8);
                  var10000 = this;
                  var10001 = super.var_5d1 + ((var5 >> 14 & 63) * 288 << 8);
               }

               var10000.var_3cd = var10001;
               var9 = 2;
               if ((this.var_4f2 >> 8 & 63) > 0) {
                  var9 = 34;
               }

               this.var_19d = 1;
               break label46;
            }

            var9 = var12;
            var11 = 0;
         }

         var10 = var11;
      }

      Class_201.sub_76f(var1, super.var_9b3, Class_201.var_6d1[var6]);
      super.var_743 = Class_17f.sub_d60(0, super.var_591);
      super.var_77c = Class_17f.sub_db8(0, super.var_5d1);
      Class_1ac.sub_4dd(this, 63, var9);
      this.sub_14(-65536);
      if ((super.var_824 & 2048) != 0) {
         this.sub_385();
      } else {
         byte var13;
         if (var10 == 0) {
            var10000 = this;
            var13 = 0;
         } else {
            var10000 = this;
            var13 = 8;
         }

         var10000.sub_530(var13, (byte)var10);
         super.var_824 &= -5;
         this.sub_292(var7);
      }

      if (var4 == -1) {
         var10000 = this;
         var10001 = this.sub_444();
      } else {
         var10000 = this;
         var10001 = var4;
      }

      var10000.var_4af = var10001;
   }

   public final void sub_1ac(int var1, int var2, int var3, int var4) {
      boolean var6 = false;
      this.var_63d = 0;
      Class_201.var_6a4[0] = var1;
      Class_201.var_6a4[1] = var2;
      Class_201.var_6a4[2] = var3;
      Class_201.var_6a4[3] = var4;
      this.sub_14(Class_201.var_6a4);
      byte[] var10000;
      int var10001;
      byte var10002;
      if (super.var_9a0 != 1 && super.var_9a0 != 2) {
         var10000 = Class_201.var_4e8;
         var10001 = var4;
         var10002 = 5;
      } else {
         var10000 = Class_201.var_49a;
         var10001 = var4;
         var10002 = 17;
      }

      int var7 = var10000[var10001 * var10002 + 0] & 255;
      this.var_4af = this.sub_444();

      for(int var5 = 0; var5 < Class_201.var_788.length; ++var5) {
         if (Class_201.var_788[var5] == var7) {
            Class_201.sub_76f(super.var_9a0, super.var_9b3, Class_201.var_6d1[var7]);
            this.sub_13b();
            return;
         }
      }

   }

   public final boolean sub_20a(int var1, boolean var2, int var3, int var4) {
      if ((this.var_21a & 16384) != 0) {
         return false;
      } else {
         super.var_824 |= 128;
         if (this.var_29d <= 0) {
            return false;
         } else {
            GameEngine.sub_a1a();
            boolean var6 = false;
            boolean var7 = false;
            if ((super.var_824 & 16) != 0) {
               var1 = 0;
            }

            Class_1c2 var10000;
            int var10001;
            label109: {
               super.var_899 -= var1;
               if (super.var_899 < 0) {
                  var10000 = this;
                  var10001 = 0;
               } else {
                  if (super.var_899 <= this.var_29d) {
                     break label109;
                  }

                  var10000 = this;
                  var10001 = this.var_29d;
               }

               var10000.var_899 = var10001;
            }

            if ((this.var_1b4 & 2) != 0) {
               Class_201.var_9d8 |= 2;
            }

            if (var1 > 0) {
               ++Class_201.var_ff5[9];
            }

            if (super.var_899 <= 0) {
               if ((this.var_21a & 8) != 0) {
                  super.var_824 |= 262144;
               }

               super.var_824 |= 131072;
               super.var_954 = 21;
               this.var_719 = Class_201.var_a69.var_160;
               if ((super.var_824 & 512) != 0) {
                  for(int var5 = 0; var5 < 16; ++var5) {
                     Class_1c2 var9;
                     if ((var9 = (Class_1c2)Class_201.var_670[1 + var5]).var_9dd == this.var_4f2) {
                        var9.var_2f9 = 0;
                        --var9.var_596;
                        break;
                     }
                  }
               }

               this.var_28b = 0;
               this.sub_385();
               if ((this.var_21a & 4) != 0) {
                  ++Class_201.var_ff5[1];
                  Class_17f.sub_344(Class_201.var_ff5, 2, (short)Class_201.sub_1654(Class_201.var_ff5[1] & 255));
                  Class_201.var_a69.sub_e3();
               }
            } else {
               if (var2 && (this.var_1b4 & 8) != 0) {
                  this.var_373 = this.var_3cd = 0;
                  if (var4 == 3) {
                     this.var_373 += -var3;
                  } else if (var4 == 1) {
                     this.var_373 += var3;
                  } else {
                     int var10002;
                     if (var4 == 2) {
                        var10000 = this;
                        var10001 = this.var_3cd;
                        var10002 = var3;
                     } else {
                        var10000 = this;
                        var10001 = this.var_3cd;
                        var10002 = -var3;
                     }

                     var10000.var_3cd = var10001 + var10002;
                  }

                  super.var_721 = var4;
                  super.var_814 = 0;
               }

               int var10;
               int var13;
               int[] var14;
               byte var15;
               if (super.var_409[0] != super.var_409[0]) {
                  var10 = (super.var_409[0] + super.var_409[2]) / 2 >> 8;
                  var13 = super.var_409[1];
                  var14 = super.var_409;
                  var15 = 3;
               } else {
                  var10 = (super.var_409[8] + super.var_409[8]) / 2 >> 8;
                  var13 = super.var_409[9];
                  var14 = super.var_409;
                  var15 = 11;
               }

               int var11 = (var13 + var14[var15]) / 2 >> 8;
               if (Class_201.var_a69.var_721 != 0 && Class_201.var_a69.var_721 != 2) {
                  var11 = (Class_201.var_a69.var_5d1 >> 8) + Class_201.var_a69.var_6c3;
                  var10 = Class_201.var_a69.var_721 == 1 ? var10 + (super.var_591 >> 8) : (super.var_591 >> 8) - var10;
                  if (Class_1ac.sub_15e(Class_201.var_a69) > 0) {
                     var11 += Class_1ac.sub_1c7(Class_201.var_a69, 0);
                  }
               } else {
                  var10 = Class_201.var_a69.var_591 >> 8;
                  var11 += super.var_5d1 >> 8;
                  if (Class_1ac.sub_15e(Class_201.var_a69) > 0) {
                     var10 += Class_1ac.sub_18e(Class_201.var_a69, 0);
                  }
               }

               if (var1 > 0) {
                  Class_201.sub_a29(var10, var11, 2, 230, 0, 4, 0);
               }

               if (this.var_61 != 10 || var1 > 0) {
                  super.var_824 |= 16;
               }
            }

            return true;
         }
      }
   }

   public final void sub_267(int var1) {
      this.var_373 = this.var_3cd = 0;
      if (var1 == 1) {
         this.var_3cd = -(Class_17f.var_cb6[7] << 8);
      } else if (var1 == 4) {
         this.var_3cd = Class_17f.var_cb6[7] << 8;
      } else {
         label22: {
            Class_1c2 var10000;
            int var10001;
            if (var1 == 8) {
               var10000 = this;
               var10001 = -(Class_17f.var_cb6[6] << 8);
            } else {
               if (var1 != 2) {
                  break label22;
               }

               var10000 = this;
               var10001 = Class_17f.var_cb6[6] << 8;
            }

            var10000.var_373 = var10001;
         }
      }

      if (Class_17f.sub_fa2(0, super.var_591 + this.var_373, super.var_5d1 + this.var_3cd) == 0) {
         int var2 = Class_17f.sub_dd0(0, super.var_591);
         int var3 = Class_17f.sub_de9(0, super.var_5d1);
         Class_17f.sub_f76(0, var2, var3, (byte)0);
         Class_17f.sub_f76(0, var2 + this.var_373, var3 + this.var_3cd, (byte)1);
         super.var_954 = 12;
         this.var_28b = 4;
         this.var_373 >>= 2;
         this.var_3cd >>= 2;
      }

   }

   public final void sub_2b1() {
      Class_201.sub_1051(true, -1, true);
      super.var_873 &= -64;
      super.var_7c3 = 3072;
      super.var_954 = 10;
      super.var_824 &= -3;
      if (super.var_9dd != -1) {
         int[] var10000 = Class_201.var_8e2;
         int var10001 = super.var_9dd;
         var10000[var10001] |= 1;
      }

   }

   public final int sub_2d1() {
      int var5 = GameEngine.var_44f.nextInt() & 255;
      if ((super.var_824 & 8) != 0 && (super.var_824 & 2) == 0) {
         if ((this.var_1b4 & 65536) != 0) {
            this.sub_48a(7);
         }

         if ((this.var_1b4 & 16777216) != 0 && super.var_409[8] != super.var_409[10] && (super.var_954 == 12 || (this.var_1b4 & 1048578) != 0)) {
            this.sub_48a(5);
         }

         byte var10003;
         if (Class_201.var_a0a == 9 && (this.var_21a & 32) != 0 && Class_1ac.sub_240(this)) {
            if ((this.var_21a & 64) != 0) {
               Class_201.var_9d8 |= 64;
               Class_201.var_a0a = 4;
               byte[] var10000;
               byte var10001;
               byte var10002;
               if (this.var_c4 == 60) {
                  var10000 = Class_201.var_ff5;
                  var10001 = 31;
                  var10002 = var10000[31];
                  var10003 = 2;
               } else {
                  var10000 = Class_201.var_ff5;
                  var10001 = 31;
                  var10002 = var10000[31];
                  var10003 = 4;
               }

               var10000[var10001] = (byte)(var10002 | var10003);
               Class_201.var_ff5[32] = 1;
               Class_201.sub_1813();
            } else {
               Class_201.var_9d8 |= 524288;
               int var6 = Class_201.sub_1914(6);
               Class_201.sub_1506(6, var6);
            }

            this.sub_105(false);
         }

         int var17;
         if ((this.var_1b4 & 1048576) != 0 && Class_1ac.sub_240(this)) {
            if ((super.var_824 & 512) == 0) {
               int[] var15 = Class_201.var_8e2;
               var17 = super.var_9dd;
               var15[var17] |= 16;
            }

            this.var_63d = 0;
            if (Class_201.var_49a[this.var_c4 * 17 + 13] != -1) {
               this.sub_1ac(super.var_591, super.var_5d1, 1, Class_201.var_49a[this.var_c4 * 17 + 13]);
            } else {
               this.sub_105(false);
            }
         }

         int var13;
         int var14;
         Class_1c2 var16;
         int var18;
         if (this.var_63d > 0) {
            if ((this.var_1b4 & 268435456) != 0) {
               if (Class_201.var_412[this.var_fa + 8 + super.var_721] != -1 && (super.var_824 & 16) == 0) {
                  this.var_28b = 64;
                  super.var_824 |= 16;
                  super.var_8fb = Class_201.var_49a[this.var_c4 * 17 + 16] & 255;
                  this.sub_385();
               }

               super.var_824 ^= 32768;
               if ((super.var_824 & '耀') != 0) {
                  var16 = this;
                  var17 = super.var_615 + 512;
               } else {
                  var16 = this;
                  var17 = super.var_615 - 512;
               }

               var16.var_615 = var17;
               Class_1ac.sub_469(this);
               boolean var3 = false;
               boolean var2 = false;
               byte var19;
               int[] var20;
               if (super.var_409[0] != super.var_409[0]) {
                  var13 = (super.var_409[0] + super.var_409[2]) / 2;
                  var18 = super.var_409[1];
                  var20 = super.var_409;
                  var19 = 3;
               } else {
                  var13 = (super.var_409[8] + super.var_409[8]) / 2;
                  var18 = super.var_409[9];
                  var20 = super.var_409;
                  var19 = 11;
               }

               var14 = (var18 + var20[var19]) / 2;
               Class_201.sub_a29(super.var_591 + var13 >> 8, super.var_5d1 + var14 >> 8, 2, 151, 0, 4, 0);
            }

            if (super.var_954 != 13) {
               --this.var_63d;
               if (this.var_63d <= 0) {
                  this.var_63d = 0;
                  Class_1ac.sub_4a5(this);
               }
            }
         } else {
            super.var_615 = 0;
         }

         if ((this.var_1b4 & 512) != 0 && (super.var_824 & 131072) == 0) {
            super.var_824 |= 256;
            this.sub_301(var5);
         }

         if ((super.var_824 & 16) != 0) {
            if ((this.var_1b4 & 8) != 0) {
               this.sub_3c2();
            }

            super.var_824 |= 128;
         }

         if ((this.var_21a & 131072) != 0 && (super.var_824 & 131072) == 0) {
            if (Class_201.var_c83 >= 800) {
               if (Class_201.var_c83 == 800) {
                  if (super.var_954 != 1) {
                     super.var_954 = 24;
                  }

                  super.var_824 &= -1048753;
                  var16 = this;
                  var17 = super.var_824 | 4194304;
               } else if (Class_201.var_c83 <= 928) {
                  super.var_824 &= -1048737;
                  var16 = this;
                  var17 = super.var_824 | 4194304;
               } else {
                  Class_201.var_c83 = 0;
                  Class_201.sub_81a();
                  var16 = this;
                  var17 = super.var_824 & -4194305;
               }

               var16.var_824 = var17;
            }

            ++Class_201.var_c83;
         }

         int var7;
         Class_1c2 var10;
         Class_147 var22;
         switch(super.var_954) {
         case 4:
            this.sub_385();
            if (Class_1ac.sub_240(this)) {
               super.var_954 = 2;
               this.sub_385();
            }
            break;
         case 5:
            this.sub_385();
            if (Class_1ac.sub_240(this)) {
               super.var_954 = 2;
               this.sub_385();
            } else if (Class_1ac.sub_1d8(this) && Class_1ac.sub_15e(this) != 0) {
               for(var7 = 0; var7 < Class_1ac.sub_15e(this); ++var7) {
                  this.sub_31c((Class_1ac.sub_18e(this, var7) << 8) + super.var_591, (Class_1ac.sub_1c7(this, var7) << 8) + super.var_5d1);
               }
            }
            break;
         case 6:
            this.sub_385();
            if (Class_1ac.sub_240(this)) {
               super.var_954 = 2;
               this.sub_385();
            } else if (Class_1ac.sub_1d8(this)) {
               this.sub_328();
            }
         case 7:
         case 11:
         case 15:
         case 16:
         case 18:
         default:
            break;
         case 8:
            if (Class_1ac.sub_240(this)) {
               this.sub_a4();
            }
            break;
         case 9:
            --super.var_8fb;
            Class_201.var_f6b = (super.var_591 >> 8 << 16) + (super.var_5d1 >> 8 & '\uffff');
            if (super.var_8fb <= 0) {
               Class_201.sub_1051(false, 0, false);
               Class_201.var_f43 = -1;
               this.sub_a4();
            }

            return 0;
         case 10:
            if ((Class_201.var_a69.var_824 & 2) == 0) {
               Class_201.sub_1051(true, -1, true);
               super.var_824 &= -3;
            }

            int var8 = Class_201.var_a69.var_591;
            int var9 = Class_201.var_a69.var_5d1 + -12288;
            super.var_7c3 += 512;
            this.sub_3f5(var8, var9, super.var_7c3);
            Class_201.var_f6b = (super.var_591 >> 8 << 16) + (super.var_5d1 >> 8 & '\uffff');
            if (super.var_5d1 <= var9) {
               super.var_954 = 9;
               super.var_8fb = 16;
            }

            this.var_4af = 1028;
            return 0;
         case 12:
            super.var_591 += this.var_373;
            super.var_5d1 += this.var_3cd;
            Class_201.var_89d[super.var_9dd] = (short)(super.var_591 >> 8);
            Class_201.var_8c7[super.var_9dd] = (short)(super.var_5d1 >> 8);
            --this.var_28b;
            if (this.var_28b <= 0) {
               this.var_28b = 0;
               this.sub_13b();
            }

            this.var_4af = Class_17f.sub_d31(0, super.var_5d1 >> 8);
            return 0;
         case 13:
            Class_201.sub_10b2();
            var22 = Class_201.var_a69;
            var22.var_824 |= 34;
            ++this.var_2ae;
            if (this.var_2ae >= this.var_252) {
               Class_201.sub_1051(false, 0, false);
               Class_201.sub_1409(-1, this);
               Class_201.var_9d8 &= -513;
               var22 = Class_201.var_a69;
               var22.var_824 &= -35;
               Class_201.var_9d8 |= 4096;
               this.sub_105(false);
               if (this.var_61 == 10) {
                  Class_201.sub_11a8(343);
                  Class_201.sub_2f(Class_17f.var_d6b, 6);
               } else if ((this.var_1b4 & 2) != 0) {
                  Class_201.sub_a7();
               }
            } else {
               this.sub_385();
               int[] var21;
               if (super.var_409[0] != super.var_409[2]) {
                  var13 = super.var_591 + Class_17f.sub_cd(super.var_409[0], super.var_409[2]) >> 8;
                  var18 = super.var_5d1;
                  var17 = super.var_409[1];
                  var21 = super.var_409;
                  var10003 = 3;
               } else {
                  var13 = super.var_591 + Class_17f.sub_cd(super.var_409[8], super.var_409[10]) >> 8;
                  var18 = super.var_5d1;
                  var17 = super.var_409[9];
                  var21 = super.var_409;
                  var10003 = 11;
               }

               var14 = var18 + Class_17f.sub_cd(var17, var21[var10003]) >> 8;
               Class_201.sub_a29(var13, var14, 2, 0, 0, 1, 0);
            }

            return 0;
         case 14:
            if (Class_1ac.sub_240(this)) {
               for(var7 = 0; var7 < 16; ++var7) {
                  if ((var10 = (Class_1c2)Class_201.var_670[1 + var7]).var_9b3 == (this.var_4f2 >> 26 & 63)) {
                     --var10.var_596;
                     break;
                  }
               }

               this.sub_a4();
            }

            if ((this.var_4f2 >> 8 & 63) != 0 && this.sub_3f5(this.var_373, this.var_3cd, (this.var_4f2 >> 8 & 63) << 8)) {
               Class_201.sub_a29(super.var_591 >> 8, super.var_5d1 >> 8, 2, 92, 0, 4, 0);
               this.sub_a4();

               for(var7 = 0; var7 < 16; ++var7) {
                  if ((var10 = (Class_1c2)Class_201.var_670[1 + var7]).var_9b3 == (this.var_4f2 >> 26 & 63)) {
                     --var10.var_596;
                     break;
                  }
               }
            }

            this.var_4af = 1028;
            return 0;
         case 17:
            if (Class_1ac.sub_240(this)) {
               this.sub_a4();
            }
            break;
         case 19:
            ++this.var_2ae;
            if (this.var_2ae >= this.var_252 >> 1) {
               Class_201.sub_1409(-1, this);
               Class_201.var_9d8 &= -513;
               var22 = Class_201.var_a69;
               var22.var_824 &= -35;
               Class_201.var_9d8 |= 4096;
               this.sub_105(false);
            } else {
               var13 = super.var_591 + Class_17f.sub_cd(super.var_409[8], super.var_409[10]) >> 8;
               var14 = super.var_5d1 + Class_17f.sub_cd(super.var_409[9], super.var_409[11]) >> 8;
               byte var26;
               if ((this.var_21a & 2097152) != 0) {
                  super.var_5d1 += this.var_61a;
                  this.var_61a -= 512;
                  if (this.var_61a < 0) {
                     this.var_61a = 0;
                  }

                  var26 = 92;
               } else {
                  var26 = 0;
               }

               byte var11 = var26;
               Class_201.sub_a29(var13, var14, 2, var11, 0, 4, 0);
            }

            return 0;
         case 20:
            this.var_5be = Class_17f.sub_fc6(0, super.var_591 - super.var_7c3, super.var_5d1 - super.var_7d4, (super.var_824 & 1048576) != 0 && (this.var_21a & 1) == 0);
            if ((this.var_5be & 16) == 0) {
               super.var_591 -= super.var_7c3;
               super.var_5d1 -= super.var_7d4;
            }

            --this.var_28b;
            if (this.var_28b <= 0) {
               super.var_591 = Class_17f.sub_dd0(0, super.var_591);
               super.var_5d1 = Class_17f.sub_de9(0, super.var_5d1);
               super.var_954 = 1;
            }
            break;
         case 21:
            super.var_7c3 = super.var_7d4 = this.var_373 = this.var_3cd = 0;
            this.sub_385();
            this.var_63d = 0;
            super.var_824 &= -7;
            boolean var1 = false;
            if ((this.var_1b4 & 524288) != 0) {
               Class_201.sub_2f(16, 0);
            }

            if ((this.var_1b4 & 2048) != 0) {
               Class_201.var_9d8 |= 512;
               if ((this.var_21a & 262144) != 0) {
                  for(var7 = 0; var7 < 16; ++var7) {
                     if ((var10 = (Class_1c2)Class_201.var_670[1 + var7]) != this && (var10.var_824 & 8) != 0 && (var10.var_9a0 == 1 || var10.var_9a0 == 10 || var10.var_9a0 == 11)) {
                        Class_201.sub_1409(-1, var10);
                        var10.sub_105(true);
                     }
                  }
               }

               var22 = Class_201.var_a69;
               var22.var_824 |= 2;
               Class_1ac.sub_4dd(this, 63, 0);
               super.var_954 = 13;
               Class_201.sub_1051(true, -1, true);
               super.var_824 &= -7;
               super.var_8fb = 0;
               this.var_2ae = 1;
               this.var_252 = 128;
               super.var_824 |= 4;
            } else if ((this.var_1b4 & 262144) != 0) {
               Class_1ac.sub_4dd(this, 63, 0);
               super.var_954 = 19;
               super.var_8fb = 0;
               this.var_2ae = 1;
               this.var_252 = 128;
               this.var_61a = 4608;
            } else {
               boolean var24;
               if ((this.var_21a & 8) != 0 && Class_1ac.sub_240(this)) {
                  var16 = this;
                  var24 = false;
               } else {
                  if ((this.var_21a & 8) != 0) {
                     return 0;
                  }

                  Class_201.sub_1409(-1, this);
                  var16 = this;
                  var24 = true;
               }

               var16.sub_105(var24);
            }

            return 0;
         }

         if ((this.var_1b4 & '耀') != 0 && super.var_409[4] != super.var_409[6] && Class_201.var_a69.var_591 + Class_201.var_a69.var_409[2] >= super.var_591 + super.var_409[4] && Class_201.var_a69.var_5d1 + Class_201.var_a69.var_409[3] >= super.var_5d1 + super.var_409[5] && Class_201.var_a69.var_591 + Class_201.var_a69.var_409[0] <= super.var_591 + super.var_409[6] && Class_201.var_a69.var_5d1 + Class_201.var_a69.var_409[1] <= super.var_5d1 + super.var_409[7]) {
            Class_201.var_a69.sub_296(this);
            return 0;
         } else {
            if (super.var_9a0 == 1 && (Class_201.var_9d8 & 512) == 0 && super.var_954 != 19) {
               super.var_824 &= -257;
               if ((this.var_1b4 & 16) != 0) {
                  if (this.var_2f9 > 32 * (Class_201.var_49a[this.var_c4 * 17 + 6] & 255) && this.var_596 < (Class_201.var_49a[this.var_c4 * 17 + 13] & 255)) {
                     if (super.var_954 == 2) {
                        super.var_954 = 6;
                     }
                  } else {
                     ++this.var_2f9;
                  }
               }

               if ((this.var_1b4 & 64) != 0 && ((this.var_21a & 8192) == 0 || (super.var_824 & 1048576) != 0)) {
                  if (this.var_2f9 > 32 * (Class_201.var_49a[this.var_c4 * 17 + 6] & 255) && this.var_596 < (Class_201.var_49a[this.var_c4 * 17 + 13] & 255)) {
                     if (super.var_954 == 2) {
                        super.var_954 = 5;
                     }
                  } else {
                     ++this.var_2f9;
                  }
               }

               if (super.var_954 == 23 || super.var_954 == 24) {
                  this.sub_385();
                  if (Class_1ac.sub_240(this) || Class_201.var_412[this.var_fa + 20 + super.var_721] == -1) {
                     if (super.var_954 == 24) {
                        super.var_954 = 1;
                     }

                     if (super.var_954 == 23) {
                        super.var_954 = 2;
                     }
                  }
               }

               if ((Class_201.var_a69.var_824 & 16384) != 0 && Class_201.var_a69.var_215 != 0 && (this.var_21a & 2048) != 0 && Class_201.sub_8bf(this, 3, 8, this.var_19d, Class_201.var_a69.var_215 >> 16 << 8, (short)Class_201.var_a69.var_215 << 8)) {
                  super.var_824 |= 128;
               }

               int var12;
               if (Class_201.var_a69.var_954 != 3 && ((Class_201.var_a69.var_824 & 3072) == 0 || (Class_201.var_a69.var_824 & 512) != 0)) {
                  var13 = GameEngine.sub_9f9((super.var_591 >> 8) - (Class_201.var_a69.var_591 >> 8));
                  var14 = GameEngine.sub_9f9((super.var_5d1 >> 8) - (Class_201.var_a69.var_5d1 >> 8));
                  int var4 = var13 * var13 + var14 * var14;
                  var12 = Class_201.var_49a[this.var_c4 * 17 + 2] & 255;
                  if (var4 < var12 * var12) {
                     label543: {
                        short var23;
                        if (super.var_409[4] == super.var_409[6]) {
                           if ((Class_201.var_a69.var_824 & 4096) != 0) {
                              super.var_824 |= 128;
                           }

                           if ((Class_201.var_a69.var_824 & 512) != 0 || (this.var_21a & 2048) == 0 || !Class_201.sub_8bf(this, 3, 8, this.var_19d, Class_201.var_a69.var_591, Class_201.var_a69.var_5d1)) {
                              break label543;
                           }

                           var16 = this;
                           var17 = super.var_824;
                           var23 = 128;
                        } else {
                           if (Class_201.var_a69.var_591 + Class_201.var_a69.var_409[2] < super.var_591 + super.var_409[4] || Class_201.var_a69.var_5d1 + Class_201.var_a69.var_409[3] < super.var_5d1 + super.var_409[5] || Class_201.var_a69.var_591 + Class_201.var_a69.var_409[0] > super.var_591 + super.var_409[6] || Class_201.var_a69.var_5d1 + Class_201.var_a69.var_409[1] > super.var_5d1 + super.var_409[7]) {
                              break label543;
                           }

                           var16 = this;
                           var17 = super.var_824;
                           var23 = 384;
                        }

                        var16.var_824 = var17 | var23;
                     }

                     if ((Class_201.var_a69.var_824 & 512) != 0) {
                        var12 = Class_201.var_49a[this.var_c4 * 17 + 3] & 255;
                        if (var4 < var12 * var12) {
                           super.var_824 |= 256;
                        }
                     }
                  }
               }

               if ((super.var_824 & 128) != 0 && (super.var_824 & 32) == 0) {
                  super.var_824 |= 32;
                  this.sub_385();
                  if ((this.var_1b4 & 134217728) != 0 && Class_201.sub_1164() == 0) {
                     Class_201.sub_144b();
                     Class_201.sub_81a();
                  }
               }

               if (super.var_954 == 15) {
                  if ((super.var_824 & 1048576) != 0) {
                     super.var_954 = 2;
                     super.var_824 &= -2097153;
                  } else {
                     --super.var_8fb;
                     if (super.var_8fb <= 0) {
                        this.sub_3ad(this.var_19d);
                        if ((super.var_824 & 2097152) != 0) {
                           this.sub_530(super.var_814, (byte)Class_201.var_412[this.var_151 + this.var_19d]);
                           this.sub_292(Class_201.var_412[this.var_fa + 0 + this.var_19d]);
                           super.var_824 &= -2097153;
                           super.var_8fb = Class_201.var_49a[this.var_c4 * 17 + 16] & 255;
                        } else {
                           super.var_954 = 2;
                        }
                     }
                  }
               }

               if ((super.var_824 & 32) != 0 && (this.var_21a & '耀') == 0 && (super.var_824 & 1048576) == 0) {
                  super.var_954 = 23;
                  super.var_824 |= 1048576;
               }

               if (super.var_954 == 1) {
                  --super.var_8fb;
                  if (super.var_8fb <= 0 && (this.var_1b4 & 4) != 0 && ((this.var_21a & 65536) == 0 || (super.var_824 & 1048576) != 0)) {
                     super.var_824 |= 16384;
                     super.var_954 = 2;
                  }

                  var16 = this;
               } else {
                  if (super.var_954 != 2) {
                     return 0;
                  }

                  if ((super.var_824 & 16) == 0) {
                     var14 = 0;
                     var13 = 0;
                     int var25;
                     Class_1c2 var27;
                     if (this.var_63d > 0) {
                        var16 = this;
                        var27 = this;
                        var25 = 0;
                     } else {
                        var16 = this;
                        var27 = this;
                        var25 = Class_201.var_343[this.var_c4 * 5 + 2];
                     }

                     var16.var_7c3 = var27.var_7d4 = var25;
                     if ((super.var_824 & 32) != 0 && (this.var_21a & 4194304) == 0) {
                        super.var_7c3 += super.var_7c3 << 1;
                        super.var_7d4 += super.var_7d4 << 1;
                     }

                     label502: {
                        this.var_43f -= super.var_7c3;
                        this.var_459 -= super.var_7d4;
                        if ((super.var_814 & 1) != 0) {
                           var18 = -super.var_7d4;
                        } else {
                           if ((super.var_814 & 4) == 0) {
                              break label502;
                           }

                           var18 = super.var_7d4;
                        }

                        var14 = var18;
                     }

                     label496: {
                        if ((super.var_814 & 8) != 0) {
                           var18 = -super.var_7c3;
                        } else {
                           if ((super.var_814 & 2) == 0) {
                              break label496;
                           }

                           var18 = super.var_7c3;
                        }

                        var13 = var18;
                     }

                     if (this.var_43f >= 0 && this.var_459 >= 0) {
                        if ((super.var_814 & 5) != 0) {
                           if ((var12 = super.var_591 - Class_17f.sub_dd0(0, super.var_591)) > 0) {
                              var13 -= 128;
                           } else if (var12 < 0) {
                              var13 += 128;
                           }
                        }

                        if ((super.var_814 & 10) != 0) {
                           if ((var12 = super.var_5d1 - Class_17f.sub_de9(0, super.var_5d1)) > 0) {
                              var14 -= 128;
                           } else if (var12 < 0) {
                              var14 += 128;
                           }
                        }

                        if ((this.var_21a & 4096) == 0) {
                           var16 = this;
                           var17 = Class_17f.sub_fc6(0, super.var_591 + var13, super.var_5d1 + var14, (super.var_824 & 1048576) != 0 && (this.var_21a & 1) == 0);
                        } else {
                           var16 = this;
                           var17 = 0;
                        }

                        var16.var_5be = var17;
                        if ((this.var_5be & 16) == 0) {
                           super.var_591 += var13;
                           super.var_5d1 += var14;
                        }

                        if ((this.var_21a & 4096) == 0) {
                           label471: {
                              if (super.var_591 < 0) {
                                 var16 = this;
                                 var17 = 0;
                              } else {
                                 if (super.var_591 <= Class_17f.var_cb6[4] << 8) {
                                    break label471;
                                 }

                                 var16 = this;
                                 var17 = Class_17f.var_cb6[4] << 8;
                              }

                              var16.var_591 = var17;
                           }

                           if (super.var_5d1 < 0) {
                              super.var_5d1 = 0;
                           } else if (super.var_5d1 > Class_17f.var_cb6[5] << 8) {
                              super.var_5d1 = Class_17f.var_cb6[5] << 8;
                           }
                        }
                     } else {
                        this.var_43f = this.var_459 = 0;
                        if ((super.var_824 & 32) == 0 || (this.var_1b4 & 64) != 0) {
                           ++this.var_28b;
                           if (this.var_28b <= 0) {
                              this.var_28b = Class_17f.sub_cd(2, 12);
                              super.var_8fb = Class_17f.sub_cd(0, 16);
                              super.var_954 = 1;
                           }
                        }

                        if (super.var_954 == 2) {
                           this.sub_3ad(this.var_19d);
                        }
                     }
                  }

                  var16 = this;
               }

               var16.sub_385();
            }

            return 0;
         }
      } else {
         return 0;
      }
   }

   private boolean sub_301(int var1) {
      --this.var_2f9;
      boolean var6 = false;
      if (this.var_2f9 <= 0 && Class_201.var_a69.var_954 != 3 && ((Class_201.var_a69.var_824 & 1024) == 0 || (Class_201.var_a69.var_824 & 512) != 0)) {
         this.var_2f9 = 32 * (Class_201.var_49a[this.var_c4 * 17 + 6] & 255);
         if ((super.var_824 & 256) != 0) {
            int var5 = 0;
            int var4 = 0;
            int var3 = 0;
            boolean var2 = Class_201.sub_1146();
            if ((this.var_1b4 & 16) != 0 && Class_201.sub_1164() + 1 <= 6 && var2) {
               var3 = 2;
               var4 += 8;
               ++var5;
            }

            if ((this.var_1b4 & 320) != 0 && Class_201.sub_852(10) == 0 && Class_201.sub_852(11) == 0 && var2) {
               var3 |= 3 << var4;
               var4 += 8;
               ++var5;
            }

            if ((this.var_1b4 & 512) != 0) {
               var3 |= 1 << var4;
               ++var5;
            }

            if (var5 > 0) {
               label52: {
                  var6 = true;
                  Class_1c2 var10000;
                  byte var10001;
                  switch(var3 >> (var1 % var5 << 3) & 255) {
                  case 1:
                     if (Class_201.var_412[this.var_fa + 12 + this.var_19d] == -1) {
                        break label52;
                     }

                     var10000 = this;
                     var10001 = 4;
                     break;
                  case 2:
                     if (Class_201.var_412[this.var_fa + 16 + this.var_19d] != -1) {
                        var10000 = this;
                        var10001 = 6;
                        break;
                     }
                  case 3:
                  case 4:
                  default:
                     break label52;
                  }

                  var10000.var_954 = var10001;
               }

               this.sub_385();
            } else {
               this.var_2f9 = Class_201.var_49a[this.var_c4 * 17 + 6] & 255;
            }
         }

         return var6;
      } else {
         return false;
      }
   }

   private void sub_31c(int var1, int var2) {
      byte var4;
      if ((var4 = Class_201.var_49a[this.var_c4 * 17 + 7]) != -1 && this.var_596 < (Class_201.var_49a[this.var_c4 * 17 + 13] & 255)) {
         int var5 = (var5 = var4 & 255) | (Class_201.var_49a[this.var_c4 * 17 + 9] & 63) << 8 | (Class_201.var_49a[this.var_c4 * 17 + 10] & 63) << 14 | (this.var_c4 & 63) << 20 | (super.var_9b3 & 63) << 26;
         Class_201.sub_10f1(var1, var2, 11, var5, 1028, 1028, 0);
         ++this.var_596;
      }

      this.var_2f9 = 0;
   }

   public final void sub_328() {
      if (Class_201.sub_1164() < 6) {
         int var1 = Class_201.var_49a[this.var_c4 * 17 + 14];
         byte var2 = Class_201.var_49a[this.var_c4 * 17 + 15];
         if ((super.var_99 & 2) != 0) {
            var1 = -var1;
         }

         var1 <<= 8;
         int var3 = var2 << 8;
         if (super.var_9a0 == 1) {
            var1 += super.var_409[0] + super.var_409[2] >> 1;
            var3 += super.var_409[1] + super.var_409[3] >> 1;
         }

         label25: {
            var1 += super.var_591;
            var3 += super.var_5d1;
            int var10000;
            if (var1 < 0) {
               var10000 = 0;
            } else {
               if (var1 < Class_17f.var_cb6[4] << 8) {
                  break label25;
               }

               var10000 = Class_17f.var_cb6[4] - 1 << 8;
            }

            var1 = var10000;
         }

         if (this.var_2f9 > 32 * (Class_201.var_49a[this.var_c4 * 17 + 6] & 255) && this.var_596 < (Class_201.var_49a[this.var_c4 * 17 + 13] & 255)) {
            Class_201.sub_10f1(var1, var3, 1, this.var_c4, -1, super.var_9dd, 1);
            ++this.var_596;
         }
      }

      this.var_2f9 = 0;
   }

   public final int sub_370(int var1, int var2) {
      int var3 = super.var_591 - var1;
      int var4 = super.var_5d1 - var2;
      if (Math.abs(var3) < Math.abs(var4)) {
         return var4 > 0 ? 0 : 2;
      } else {
         return var3 > 0 ? 3 : 1;
      }
   }

   private void sub_385() {
      int var10000;
      switch(super.var_954) {
      case 1:
      case 3:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 15:
      case 16:
      case 17:
      case 18:
      case 22:
      default:
         var10000 = 0;
         break;
      case 2:
      case 20:
         var10000 = 4;
         break;
      case 4:
         var10000 = 12;
         break;
      case 5:
      case 6:
         var10000 = 16;
         break;
      case 13:
      case 19:
      case 21:
         var10000 = (this.var_21a & 8) != 0 ? (114 + this.var_719) * 4 - this.var_fa : 8;
         break;
      case 14:
         var10000 = 0;
         break;
      case 23:
         var10000 = 20;
         break;
      case 24:
         var10000 = 16;
      }

      int var1 = var10000;
      if ((super.var_824 & 16) != 0 && (super.var_824 & 131072) == 0) {
         if ((this.var_1b4 & 8) != 0) {
            if (this.var_3de >= 8) {
               super.var_824 &= -17;
               super.var_954 = 1;
               if ((this.var_21a & 1048576) != 0) {
                  super.var_954 = 2;
               }

               super.var_8fb = 4;
               this.var_373 = this.var_3cd = 0;
               this.var_3de = 0;
            } else {
               ++this.var_3de;
            }
         } else if (super.var_954 != 23 && super.var_954 != 24) {
            var1 = 8;
            if (Class_1ac.sub_240(this)) {
               super.var_824 &= -17;
            }
         }
      }

      if (this.var_c4 == 3 && this.var_63d <= 0) {
         super.var_824 &= -17;
      }

      int var3 = ((super.var_824 & 32) == 0 || (this.var_1b4 & 64) != 0 || (this.var_1b4 & 536870912) != 0) && (this.var_1b4 & 536870912) != 0 ? 1 : this.var_19d;
      short var2;
      if ((var2 = Class_201.var_412[this.var_fa + var1 + var3]) == -1) {
         var2 = Class_201.var_412[this.var_fa + 0 + var3];
      }

      if (Class_1ac.sub_22c(this) != var2 || super.var_99 != Class_201.var_412[this.var_151 + var3]) {
         this.sub_530(super.var_814, (byte)Class_201.var_412[this.var_151 + var3]);
         this.sub_292(var2);
      }

   }

   private void sub_3ad(int var1) {
      var1 *= 4;
      boolean var4 = false;
      boolean var3 = false;
      boolean var8 = false;
      boolean var7 = false;
      boolean var15 = false;
      int var16 = (this.var_21a & 4096) == 0 ? Class_17f.sub_fc6(0, super.var_591, super.var_5d1, (super.var_824 & 32) != 0 && (this.var_21a & 1) == 0) : 0;
      super.var_824 &= -65;
      int var10000;
      if ((this.var_21a & 4096) != 0) {
         var10000 = this.var_19d;
      } else {
         label243: {
            int var9;
            if ((super.var_824 & 32) != 0 && (this.var_21a & 4194304) == 0) {
               int var17 = (Class_201.var_a69.var_591 >> 8) / Class_17f.var_cb6[6];
               int var18 = (Class_201.var_a69.var_5d1 >> 8) / Class_17f.var_cb6[7];
               int var5 = Class_17f.sub_dd0(0, super.var_591);
               int var6 = Class_17f.sub_de9(0, super.var_5d1);
               if (var5 != this.var_69b || var6 != this.var_6ce) {
                  this.var_701 = this.var_69b;
                  this.var_70b = this.var_6ce;
                  this.var_69b = var5;
                  this.var_6ce = var6;
               }

               var5 = (super.var_591 >> 8) / Class_17f.var_cb6[6];
               var6 = (super.var_5d1 >> 8) / Class_17f.var_cb6[7];
               int var19 = GameEngine.sub_9f9(var5 - var17);
               int var20 = GameEngine.sub_9f9(var6 - var18);
               if (var19 == 0 && var20 == 0) {
                  var10000 = this.sub_370(Class_201.var_a69.var_591, Class_201.var_a69.var_5d1);
                  break label243;
               }

               if (this.var_68f == 8) {
                  label245: {
                     if ((var9 = this.var_650 & 255) != 2 && var9 != 0) {
                        if (var19 != 0) {
                           break label245;
                        }
                     } else if (var20 != 0) {
                        break label245;
                     }

                     this.var_650 >>= 8;
                     this.var_68f -= 8;
                  }
               }

               if (this.var_68f <= 8) {
                  if (var19 == 0 || var20 != 0 && var20 >= var19) {
                     this.var_650 = var6 < var18 ? 2 : 0;
                  } else {
                     this.var_650 = var5 < var17 ? 1 : 3;
                  }

                  this.var_68f = 8;
               }

               boolean var22 = false;

               do {
                  int var13;
                  int var14;
                  label134: {
                     var9 = this.var_650 & 255;
                     var13 = this.var_69b;
                     var14 = this.var_6ce;
                     switch(var9) {
                     case 0:
                        var10000 = var14 - 9216;
                        break;
                     case 1:
                        var13 += 9216;
                        break label134;
                     case 2:
                        var10000 = var14 + 9216;
                        break;
                     case 3:
                        var13 -= 9216;
                     default:
                        break label134;
                     }

                     var14 = var10000;
                  }

                  if ((var16 & 1 << var9) != 0 || var13 == this.var_701 && var14 == this.var_70b) {
                     this.var_650 <<= this.var_68f;
                     label158:
                     switch(this.var_68f) {
                     case 8:
                        if (var9 != 0 && var9 != 2) {
                           if (var18 - var6 < 0) {
                              var9 = 0;
                           } else {
                              var9 = 2;
                           }
                        } else if (var17 - var5 < 0) {
                           var9 = 3;
                        } else {
                           var9 = 1;
                        }
                        break;
                     case 16:
                        byte var25;
                        switch(var9) {
                        case 0:
                           var25 = 2;
                           break;
                        case 1:
                           var25 = 3;
                           break;
                        case 2:
                           var25 = 0;
                           break;
                        case 3:
                           var25 = 1;
                           break;
                        default:
                           break label158;
                        }

                        var9 = var25;
                        break;
                     case 24:
                        if (var9 != 0 && var9 != 2) {
                           if (var18 - var6 < 0) {
                              var9 = 2;
                           } else {
                              var9 = 0;
                           }
                        } else if (var17 - var5 < 0) {
                           var9 = 1;
                        } else {
                           var9 = 3;
                        }
                        break;
                     case 32:
                        this.var_701 = this.var_69b;
                        this.var_70b = this.var_6ce;
                        this.var_68f = -8;
                        var22 = true;
                     }

                     this.var_68f += 8;
                     this.var_650 |= var9;
                  } else {
                     boolean var24;
                     if (this.var_68f > 8) {
                        int var21 = this.var_650 >> 8 & 255;
                        if ((var16 & 1 << var21) == 0 && (var13 != this.var_701 || var14 != this.var_70b)) {
                           var9 = var21;
                           this.var_650 >>= 8;
                           this.var_68f -= 8;
                        }

                        var24 = true;
                     } else {
                        var24 = true;
                     }

                     var22 = var24;
                  }
               } while(!var22);
            } else {
               var9 = Class_201.var_454[var1 + 0];
               byte var10 = Class_201.var_454[var1 + 1];
               byte var11 = Class_201.var_454[var1 + 2];
               byte var12 = Class_201.var_454[var1 + 3];
               if ((var16 & 1 << var9) != 0) {
                  var10000 = (var16 & 1 << var10) == 0 ? var10 : ((var16 & 1 << var11) == 0 ? var11 : ((var16 & 1 << var12) == 0 ? var12 : -1));
                  break label243;
               }
            }

            var10000 = var9;
         }
      }

      int var23 = var10000;
      this.var_459 = Class_17f.var_cb6[7] << 8;
      this.var_43f = Class_17f.var_cb6[6] << 8;
      if (var23 == -1) {
         super.var_824 |= 64;
         this.var_43f = this.var_459 = 0;
         super.var_721 = this.var_19d;
         super.var_954 = 1;
         super.var_8fb = Class_17f.sub_cd(0, 16);
         this.var_28b = Class_17f.sub_cd(2, 12);
      } else {
         if (var23 != this.var_19d && (super.var_824 & 1048704) == 0 && (this.var_21a & 4096) == 0 && super.var_8fb <= 0) {
            super.var_954 = 15;
            super.var_8fb = Class_201.var_49a[this.var_c4 * 17 + 16] & 255;
            if ((super.var_824 & 2097152) == 0) {
               super.var_824 |= 2097152;
               return;
            }
         }

         this.var_19d = var23;
         super.var_814 = (byte)(1 << var23);
      }
   }

   private boolean sub_3c2() {
      Class_1c2 var10000;
      short var10001;
      label150: {
         super.var_7c3 = super.var_7d4 = 0;
         if (this.var_373 >= 5120) {
            var10000 = this;
            var10001 = 5120;
         } else {
            if (this.var_373 > -5120) {
               break label150;
            }

            var10000 = this;
            var10001 = -5120;
         }

         var10000.var_373 = var10001;
      }

      label144: {
         if (this.var_3cd >= 5120) {
            var10000 = this;
            var10001 = 5120;
         } else {
            if (this.var_3cd > -5120) {
               break label144;
            }

            var10000 = this;
            var10001 = -5120;
         }

         var10000.var_3cd = var10001;
      }

      if (Math.abs(this.var_373) > 256) {
         this.var_373 -= this.var_373 > 0 ? 768 : -768;
         if (Math.abs(this.var_373) < 256) {
            this.var_373 = this.var_373 > 0 ? 256 : -256;
         }
      } else if (Math.abs(this.var_3cd) > 256) {
         this.var_3cd -= this.var_3cd > 0 ? 768 : -768;
         if (Math.abs(this.var_3cd) < 256) {
            this.var_3cd = this.var_3cd > 0 ? 256 : -256;
         }
      }

      int var1 = super.var_591 + this.var_373;
      int var2 = super.var_5d1 + this.var_3cd;
      if (this.var_373 != 0 && (Class_17f.sub_fa2(0, var1 + 0, var2 + 0) == 1 || Class_17f.sub_fa2(0, var1 + 0, var2 + 0) == 2 || Class_17f.sub_fa2(0, var1 + 0, var2 + 0) == 3 && (super.var_824 & 1048576) == 0 || var1 <= Class_201.var_a69.var_591 - ((Class_17f.var_89 << 8 >> 1) - Class_201.var_a69.var_26e) && (this.var_1b4 & 268435456) != 0 || var1 >= Class_201.var_a69.var_591 + (Class_17f.var_89 << 8 >> 1) + Class_201.var_a69.var_26e && (this.var_1b4 & 268435456) != 0)) {
         var1 = super.var_591;
      }

      if (this.var_3cd != 0 && (Class_17f.sub_fa2(0, var1 + 0, var2 + 0) == 1 || Class_17f.sub_fa2(0, var1 + 0, var2 + 0) == 2 || Class_17f.sub_fa2(0, var1 + 0, var2 + 0) == 3 && (super.var_824 & 1048576) == 0 || var2 >= Class_17f.var_dd << 8 && (this.var_1b4 & 268435456) != 0 || var2 <= 0 && (this.var_1b4 & 268435456) != 0)) {
         var2 = super.var_5d1;
      }

      int var4;
      label103: {
         if (var1 < 0) {
            var4 = 0;
         } else {
            if (var1 < Class_17f.var_cb6[4] << 8) {
               break label103;
            }

            var4 = Class_17f.var_cb6[4] - 1 << 8;
         }

         var1 = var4;
      }

      label97: {
         if (var2 < 0) {
            var4 = 0;
         } else {
            if (var2 < Class_17f.var_cb6[5] << 8) {
               break label97;
            }

            var4 = Class_17f.var_cb6[5] - 1 << 8;
         }

         var2 = var4;
      }

      if ((((this.var_21a & 4096) == 0 ? Class_17f.sub_fc6(0, var1, var2, (super.var_824 & 1048576) != 0 && (this.var_21a & 1) == 0) : 0) & 16) != 0) {
         return false;
      } else {
         super.var_591 = var1;
         super.var_5d1 = var2;
         return false;
      }
   }

   private boolean sub_3f5(int var1, int var2, int var3) {
      int var5 = super.var_591;
      int var6 = super.var_5d1;
      int var7 = var1 - var5;
      int var8 = var2 - var6;
      int var10 = super.var_591;
      int var11 = super.var_5d1;
      boolean var4 = false;
      int var14 = var7 < 0 ? -1 : 1;
      int var15 = var8 < 0 ? -1 : 1;
      var7 = Math.abs(var7);
      var8 = Math.abs(var8);
      if (var7 <= 256 && var8 <= 256) {
         super.var_591 = var1;
         super.var_5d1 = var2;
         return true;
      } else {
         int var9;
         if (var7 < 256) {
            var9 = Math.min(var8, var3 >> 1);
            if (var8 != 0) {
               var6 += var9 * var15;
            }

            var11 = var6;
         } else if (var8 < 256) {
            var9 = Math.min(var7, var3 >> 1);
            if (var7 != 0) {
               var5 += var9 * var14;
            }

            var10 = var5;
         } else {
            int var12 = var5 > var1 ? -256 : 256;
            int var13 = var6 > var2 ? -256 : 256;
            var9 = var3 >> 8;
            int var10000;
            int var16;
            int var10001;
            if (var7 >= var8) {
               var15 = (var14 = var8 << 1) - (var7 << 1);

               for(var16 = var14 - var7; var7 >= 0 && var9 > 0; --var7) {
                  var5 = var10;
                  var6 = var11;
                  var10 += var12;
                  --var9;
                  if (var16 > 0) {
                     var11 += var13;
                     --var9;
                     var10000 = var16;
                     var10001 = var15;
                  } else {
                     var10000 = var16;
                     var10001 = var14;
                  }

                  var16 = var10000 + var10001;
               }

               if (var12 > 0) {
                  if (var5 >= var1) {
                     var4 = true;
                     var6 = var2;
                  }
               } else if (var5 <= var1) {
                  var4 = true;
                  var6 = var2;
               }
            } else {
               label137: {
                  var15 = (var14 = var7 << 1) - (var8 << 1);

                  for(var16 = var14 - var8; var8 >= 0 && var9 > 0; --var8) {
                     var5 = var10;
                     var6 = var11;
                     var11 += var13;
                     --var9;
                     if (var16 > 0) {
                        var10 += var12;
                        --var9;
                        var10000 = var16;
                        var10001 = var15;
                     } else {
                        var10000 = var16;
                        var10001 = var14;
                     }

                     var16 = var10000 + var10001;
                  }

                  if (var13 > 0) {
                     if (var6 < var2) {
                        break label137;
                     }
                  } else if (var6 > var2) {
                     break label137;
                  }

                  var4 = true;
                  var5 = var1;
               }
            }
         }

         if (var5 <= 0 || var5 >= Class_17f.var_cb6[4] << 8) {
            var4 = true;
         }

         if (var6 <= 0 || var6 >= Class_17f.var_cb6[5] << 8) {
            var4 = true;
         }

         if (var7 >= var8) {
            this.var_19d = var1 - var5 < 0 ? 3 : 1;
         } else {
            this.var_19d = var2 - var6 < 0 ? 0 : 2;
         }

         super.var_591 = var10;
         super.var_5d1 = var11;
         this.sub_444();
         return var4;
      }
   }

   private int sub_444() {
      Class_1c2 var10000;
      int var2;
      label15: {
         byte var10001;
         int var10002;
         if (super.var_954 == 14) {
            int var1 = Class_17f.var_13c + ((super.var_409[9] + super.var_409[11] >> 1) + super.var_77c >> 8);
            var10000 = this;
            var10001 = 0;
            var10002 = var1;
         } else {
            if ((this.var_1b4 & 1048576) != 0) {
               var10000 = this;
               var2 = 1028;
               break label15;
            }

            var10000 = this;
            var10001 = 0;
            var10002 = super.var_5d1 >> 8;
         }

         var2 = Class_17f.sub_d31(var10001, var10002);
      }

      var10000.var_4af = var2;
      return this.var_4af;
   }

   public final void sub_487(Graphics var1) {
      boolean var3 = false;
      boolean var2 = false;
      if ((super.var_824 & 8) != 0) {
         if ((this.var_1b4 & 131072) != 0 && (super.var_9a0 == 2 || super.var_899 > 0)) {
            int var4 = Class_17f.var_104 + ((super.var_409[8] + super.var_409[10] >> 1) + super.var_743 >> 8) - 10;
            int var5 = Class_17f.var_13c + ((super.var_409[9] + super.var_409[11] >> 1) + super.var_77c >> 8) - 4;
            var1.drawImage(Class_201.var_686[0].var_8a[0], var4 + Class_201.var_ccb, var5 + Class_201.var_d14, 20);
         }

         super.var_679 += Class_201.var_ccb;
         super.var_6c3 += Class_201.var_d14;
         super.sub_487(var1);
         super.var_679 -= Class_201.var_ccb;
         super.var_6c3 -= Class_201.var_d14;
      }
   }

   public final int sub_45b() {
      if (super.var_9a0 == 10) {
         this.sub_a4();
         super.var_8fb = 0;
         return this.var_4f2 >> 14 & 63;
      } else {
         return Class_201.sub_13d2(Class_201.var_343[this.var_c4 * 5 + 1], 6);
      }
   }

   private void sub_48a(int var1) {
      Class_201.var_a69.sub_1eb(super.var_591 + super.var_409[8], super.var_5d1 + super.var_409[9], super.var_591 + super.var_409[10], super.var_5d1 + super.var_409[11], this, var1);
   }
}
