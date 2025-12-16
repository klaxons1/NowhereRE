import javax.microedition.lcdui.Graphics;

final class Class_147 extends Class_1ac {
   int var_d;
   int var_26;
   int var_87;
   int var_bf;
   int var_d0;
   int var_11b;
   int var_160;
   int var_1a1;
   int var_1b2;
   int var_1cc;
   int var_215;
   int var_242;
   int var_24f;
   int var_26e;
   int var_27f;
   int var_2c4;
   int var_2ed;
   Class_1ac var_30e;

   Class_147() {
      super.var_9b3 = 0;
      this.var_30e = new Class_1ac();
      super.var_721 = 2;
   }

   public final void sub_14(int[] var1) {
      super.var_591 = var1[0];
      super.var_5d1 = var1[1];
      super.var_824 = 9;
   }

   public final void sub_2a() {
      this.sub_6f();
      if (this.var_30e != null) {
         this.var_30e.sub_6f();
         this.var_30e = null;
      }

   }

   public final void sub_51(boolean var1) {
      this.sub_be();
      if (var1) {
         this.sub_2a();
      }

   }

   public final void sub_a6() {
      super.var_824 |= 1;
      super.var_954 = 0;
      this.var_30e.var_11 = (byte[])Class_17f.sub_9d4(Class_201.var_6d1[0]);
      this.var_30e.sub_14(-65536);
      super.var_615 = super.var_640 = 0;
      super.var_679 = super.var_6c3 = 0;
      this.sub_e3();
      Class_17f.sub_344(Class_201.var_ff5, 2, (short)this.var_d);
   }

   final void sub_e3() {
      this.var_d = Class_201.sub_1654(Class_201.var_ff5[1] & 255);
   }

   public final void sub_133() {
      int var11 = Class_201.var_c45 >> 9 & 3;
      int var12 = Class_201.sub_1914(7);
      super.var_8fb = 0;
      super.var_824 &= -545;
      super.var_824 |= 1;
      super.var_954 = 0;
      boolean var13 = false;
      int var2 = 0;
      int var1 = 0;

      int var5;
      for(var5 = -1; var1 < Class_17f.var_f77; var2 += 5) {
         int var3 = Class_17f.var_f81[var2] & 8191;
         int var4;
         if ((var4 = Class_17f.var_f81[var2] & '\ue000') == 16384 && (var3 & 4096) != 0) {
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

      Class_147 var10000;
      if (var5 != -1) {
         var2 = var5 * 5;
         int var10 = Class_17f.var_f81[var2++] >> 9 & 3;
         short var6 = Class_17f.var_f81[var2++];
         short var8 = Class_17f.var_f81[var2++];
         short var7 = Class_17f.var_f81[var2++];
         short var9 = Class_17f.var_f81[var2];
         if (var13) {
            super.var_591 = var6 + ((var7 - var6) * 128 >> 8);
            super.var_5d1 = var8 + ((var9 - var8) * 128 >> 8);
         } else {
            short var14;
            int var10002;
            int var10003;
            if (var10 != var11) {
               super.var_591 = var6 + ((var7 - var6) * 128 >> 8);
               var10000 = this;
               var14 = var8;
               var10002 = var9 - var8;
               var10003 = 128;
            } else {
               super.var_591 = var6 + ((var7 - var6) * this.var_d0 >> 8);
               var10000 = this;
               var14 = var8;
               var10002 = var9 - var8;
               var10003 = this.var_11b;
            }

            var10000.var_5d1 = var14 + (var10002 * var10003 >> 8);
            super.var_721 = var10;
         }
      }

      if (!var13) {
         this.var_242 = 1 << super.var_721;
         short var15;
         Class_147 var16;
         if ((this.var_242 & 8) != 0) {
            this.var_24f = 128;
            this.var_2c4 = this.var_26e = -8192;
            var10000 = this;
            var16 = this;
            var15 = 0;
         } else if ((this.var_242 & 2) != 0) {
            this.var_24f = 0;
            this.var_2c4 = this.var_26e = 8192;
            var10000 = this;
            var16 = this;
            var15 = 0;
         } else {
            short var17;
            if ((this.var_242 & 1) != 0) {
               var10000 = this;
               var17 = 192;
            } else {
               var10000 = this;
               var17 = 64;
            }

            var10000.var_24f = var17;
            this.var_2c4 = this.var_26e = 0;
            var10000 = this;
            var16 = this;
            var15 = -8192;
         }

         var10000.var_2ed = var16.var_27f = var15;
      }

      super.var_591 <<= 8;
      super.var_5d1 <<= 8;
      this.sub_388();
      super.var_743 = Class_17f.sub_d60(0, super.var_591);
      super.var_77c = Class_17f.sub_db8(0, super.var_5d1);
      this.sub_42d(false);
      Class_17f.sub_ccb(0, super.var_591 + this.var_26e, super.var_5d1 + this.var_27f, false, true);
      super.var_954 = 0;
      this.var_215 = 0;
   }

   private boolean sub_196() {
      if (this.var_160 != 5 && Class_201.var_a0a != 9) {
         boolean var7 = false;
         this.var_1a1 = 32;
         int var1 = super.var_591 + super.var_409[4];
         int var2 = super.var_5d1 + super.var_409[5];
         int var3 = super.var_591 + super.var_409[6];
         int var4 = super.var_5d1 + super.var_409[7];
         if (this.sub_1eb(var1, var2, var3, var4, (Class_1c2)null, 3)) {
            if (this.var_160 != 1 && this.var_160 != 7) {
               this.var_160 = 0;
            }
         } else if (this.var_160 == 0 && (super.var_824 & 16) == 0) {
            var7 = true;
         }

         if (Class_201.var_607[this.var_160 * 9 + 6] != -1 && (super.var_824 & 128) == 0) {
            if (Class_201.var_ff5[10 + Class_201.var_ff5[5]] == 0) {
               Class_201.sub_1576(false);
            }

            if (Class_201.var_ff5[10 + Class_201.var_ff5[5]] == 0) {
               Class_201.var_ff5[5] = 1;
               this.var_160 = Class_201.var_ff5[5];
            } else {
               this.var_160 = Class_201.var_ff5[5];
               if ((super.var_824 & 128) == 0 && (Class_201.var_ff5[31] & 2) == 0) {
                  --Class_201.var_ff5[10 + this.var_160];
               }
            }
         }

         if ((super.var_824 & 128) != 0 && Class_1ac.sub_240(this)) {
            var7 = true;
         }

         if ((super.var_824 & 144) == 0) {
            super.var_824 |= 144;
            super.var_954 = 2;
         }

         this.sub_3fc();
         if (Class_1ac.sub_1d8(this)) {
            if (Class_201.var_607[this.var_160 * 9 + 1] == 1) {
               Class_201.sub_8ea(Class_201.var_607[this.var_160 * 9 + 2], super.var_591, super.var_5d1, super.var_721, (Class_1c2)null, this.var_160, 0);
               Class_201.sub_1576(false);
            }

            if (Class_201.var_607[this.var_160 * 9 + 8] != 0) {
               Class_201.sub_81a();
            }
         }

         var1 = super.var_591 + super.var_409[8];
         var2 = super.var_5d1 + super.var_409[9];
         var3 = super.var_591 + super.var_409[10];
         var4 = super.var_5d1 + super.var_409[11];
         this.sub_1eb(var1, var2, var3, var4, (Class_1c2)null, 0);
         if (var7) {
            this.var_160 = Class_201.var_ff5[5];
            super.var_954 = 0;
            super.var_824 &= -17;
         }

         return var7;
      } else {
         return true;
      }
   }

   public final boolean sub_1eb(int var1, int var2, int var3, int var4, Class_1c2 var5, int var6) {
      boolean var11 = false;
      if (var1 == var3) {
         return false;
      } else {
         if (var6 != 8) {
            for(int var7 = 0; var7 < 16; ++var7) {
               Class_1c2 var12 = (Class_1c2)Class_201.var_670[1 + var7];
               if ((var6 != 1 || (var12.var_824 & 4194304) == 0) && (var6 == 7 || (var12.var_21a & 16) == 0) && var5 != var12 && (var12.var_824 & 8) != 0 && ((var12.var_873 & 8) != 0 || (var12.var_873 & 32) != 0 && Class_1ac.sub_106(var12) || var6 == 3 || var6 == 5)) {
                  byte var10;
                  label188: {
                     var10 = 0;
                     byte var10000;
                     if (var12.var_9a0 != 11 || var6 != 3 && var6 != 0) {
                        if ((var12.var_873 & 32) == 0) {
                           break label188;
                        }

                        var10000 = 8;
                     } else {
                        var10000 = 4;
                     }

                     var10 = var10000;
                  }

                  if (var12.var_591 + var12.var_409[2 + var10] != var12.var_591 + var12.var_409[0 + var10] && var12.var_591 + var12.var_409[2 + var10] >= var1 && var12.var_5d1 + var12.var_409[3 + var10] >= var2 && var12.var_591 + var12.var_409[0 + var10] <= var3 && var12.var_5d1 + var12.var_409[1 + var10] <= var4) {
                     var11 = true;
                     if (var5 != null && var6 == 5 && var12.var_9a0 == 1) {
                        var12.sub_20a(var5.var_954 == 12 ? 50 : 250, false, 0, var5.var_721);
                     }

                     if (var6 == 3) {
                        if (var12.var_9a0 != 3 && (var12.var_1b4 & 65536) == 0) {
                           if (var12.var_9a0 == 11) {
                              return false;
                           }

                           return true;
                        }

                        this.var_160 = 0;
                        this.sub_296(var12);
                        return true;
                     }

                     if ((var12.var_1b4 & 65536) == 0) {
                        if (var5 != null) {
                           boolean var8 = false;
                           if ((var12.var_21a & 16) != 0) {
                              ++Class_201.var_ff5[9];
                           }
                        } else if (var12.var_9a0 == 1) {
                           Class_1c2 var15;
                           byte var10001;
                           if (var6 == 1) {
                              var15 = var12;
                              var10001 = 5;
                           } else {
                              var15 = var12;
                              var10001 = 2;
                           }

                           var15.var_63d = var10001;
                           var12.sub_20a(Class_201.sub_13d2(0, var6), this.var_160 >= 0, -Class_201.var_607[this.var_160 * 9 + 5] << 8, var12.sub_370(super.var_591, super.var_5d1));
                        }
                     }
                  }
               }
            }
         }

         if (var6 != 3 && Class_17f.sub_fdd(0, Class_201.var_6be, var1, var2, var3, var4) > 0) {
            int var13 = Class_201.var_6be[0] >> 8;
            int var9 = Class_17f.var_1064[var13] >> 2;
            if ((this.var_160 == 3 || this.var_160 == 7) && (var9 == 3 || var9 == 27) || (this.var_160 == 5 || this.var_160 == 7) && (var9 == 5 || var9 == 18)) {
               Class_201.sub_93e(0, var13);
            }

            var11 = false;
         }

         return var11;
      }
   }

   private boolean sub_233(int var1, boolean var2) {
      super.var_824 |= 96;
      if (var1 > 0) {
         int var3;
         label41: {
            int var10000;
            if ((var3 = Class_17f.sub_2e5(Class_201.var_ff5, 2) - var1) < 0) {
               var10000 = 0;
            } else {
               if (var3 <= this.var_d) {
                  break label41;
               }

               var10000 = this.var_d;
            }

            var3 = var10000;
         }

         Class_17f.sub_344(Class_201.var_ff5, 2, (short)var3);
         Class_201.var_9d8 |= 2;
         if ((Class_201.var_129e & 1) != 0) {
            GameEngine.sub_550();
         }
      }

      Class_201.sub_1576(true);
      if (Class_17f.sub_2e5(Class_201.var_ff5, 2) <= 0) {
         Class_201.var_9d8 |= 16;
         Class_201.sub_c12();
         super.var_8fb = 64;
         super.var_954 = 3;
         Class_201.var_9d8 |= 67108864;
         return true;
      } else {
         if (var2) {
            this.var_26 = this.var_87 = 0;
            byte var10001;
            Class_147 var4;
            if (this.var_bf == 0) {
               this.var_87 = -2048;
               super.var_721 = 2;
               var4 = this;
               var10001 = 4;
            } else if (this.var_bf == 2) {
               this.var_87 = 2048;
               super.var_721 = 0;
               var4 = this;
               var10001 = 1;
            } else if (this.var_bf == 3) {
               this.var_26 = -2048;
               super.var_721 = 1;
               var4 = this;
               var10001 = 2;
            } else {
               if (this.var_bf != 1) {
                  return false;
               }

               this.var_26 = 2048;
               super.var_721 = 3;
               var4 = this;
               var10001 = 8;
            }

            var4.var_242 = var10001;
         }

         return false;
      }
   }

   public final void sub_296(Class_1c2 var1) {
      if ((var1.var_1b4 & 67108864) != 0) {
         if ((super.var_824 & 65536) != 0) {
            var1.sub_105(false);
            Class_201.sub_a29(var1.var_591 >> 8, var1.var_5d1 >> 8, 2, 261, 0, 4, 0);
            return;
         }
      } else if ((var1.var_1b4 & 65536) != 0) {
         if (var1.var_954 != 12) {
            var1.sub_267(super.var_814);
            return;
         }
      } else if ((var1.var_1b4 & '耀') != 0) {
         byte var2 = Class_201.var_4e8[var1.var_c4 * 5 + 3];
         byte var3 = Class_201.var_4e8[var1.var_c4 * 5 + 4];
         short var6 = var2 != -2 ? Class_201.var_3c4[var3] : -1;
         if (var2 == -2) {
            Class_201.var_aed = 290;
            return;
         }

         int var10000;
         int var4;
         if (var2 != -1) {
            if (Class_201.var_ff5[var2] == 0) {
               Class_201.var_aed = 290;
               return;
            }

            if (var6 == -1 || Class_1ac.sub_22c(var1) == (var6 & 255)) {
               return;
            }

            var1.sub_292(var6);
            if (var1.var_5d1 < 9216) {
               return;
            }

            var4 = Class_17f.sub_dd0(0, var1.var_591);
            var10000 = Class_17f.sub_dd0(0, var1.var_5d1);
         } else {
            if (var6 == -1 || Class_1ac.sub_22c(var1) == (var6 & 255)) {
               return;
            }

            var1.sub_292(var6);
            if (var1.var_5d1 < 9216) {
               return;
            }

            var4 = Class_17f.sub_dd0(0, var1.var_591);
            var10000 = var1.var_5d1 - 9216;
         }

         int var5 = var10000;
         Class_17f.sub_f76(0, var4, var5, (byte)0);
      }

   }

   private static int sub_2a0(Class_1c2 var0) {
      if (var0.var_355 != -1) {
         if (Class_201.var_ff5[26] == 0) {
            Class_201.var_ff5[26] = 1;
            Class_201.sub_11a8(339);
         }

         Class_17f.sub_3b0(Class_201.var_ff5, var0.var_355, 0, 1, 33);
      }

      for(int var1 = 0; var1 < 7; ++var1) {
         if (Class_201.var_607[88 + var1 * 5 + 0] == var0.var_c4) {
            ++Class_201.var_ff5[var1 + 18];
            Class_201.var_f43 = Class_201.var_ff5[var1 + 18];
            break;
         }

         if (Class_201.var_607[var1 * 9 + 0] == var0.var_c4) {
            ++Class_201.var_ff5[var1 + 10];
            Class_201.sub_13a3();
            break;
         }
      }

      Class_201.sub_1506(2, var0.var_c4);
      Class_201.sub_7c9();
      var0.sub_2b1();
      return 0;
   }

   private boolean sub_2ff() {
      int var2 = super.var_591 + super.var_409[0];
      int var4 = super.var_5d1 + super.var_409[1];
      int var3 = super.var_591 + super.var_409[2];
      int var5 = super.var_5d1 + super.var_409[3];
      int var6 = super.var_954;
      boolean var7 = false;

      for(int var1 = 0; var1 < 16; ++var1) {
         Class_1c2 var8;
         if (((var8 = (Class_1c2)Class_201.var_670[1 + var1]).var_21a & 16) == 0 && (var8.var_824 & 8) != 0 && Class_1ac.sub_106(var8) && var8.var_591 + var8.var_409[10] >= var2 && var8.var_5d1 + var8.var_409[11] >= var4 && var8.var_591 + var8.var_409[8] <= var3 && var8.var_5d1 + var8.var_409[9] <= var5) {
            if ((super.var_824 & 32) == 0 && (var8.var_873 & 2) != 0) {
               this.var_bf = var8.var_19d;
               if ((super.var_824 & 65536) == 0) {
                  this.sub_233(var8.sub_45b(), true);
               }

               if (var8.var_9a0 == 1) {
                  var8.sub_20a(0, true, -2560, var8.var_19d);
               } else if (var8.var_9a0 == 11) {
                  var8.sub_a4();

                  for(var1 = 0; var1 < 16; ++var1) {
                     Class_1c2 var9;
                     if ((var9 = (Class_1c2)Class_201.var_670[1 + var1]).var_9b3 == (var8.var_4f2 >> 26 & 63)) {
                        --var9.var_596;
                        break;
                     }
                  }
               }

               var7 = true;
               break;
            }

            if ((var8.var_873 & 4) != 0) {
               sub_2a0(var8);
            }
         }
      }

      return super.var_954 != var6 || var7;
   }

   private boolean sub_33f(int var1, int var2, int var3, int var4) {
      if (Class_17f.sub_edd(var1, var2, var3, var4) != 0) {
         if (Class_17f.var_1026 != -1 && (Class_201.var_9d8 & 128) == 0 && ((Class_17f.var_1026 & '\uffff') >> 0 & 4096) != 0) {
            label76: {
               Class_201.var_b02 = 0;
               Class_201.var_aed = ((Class_17f.var_1026 & '\uffff') >> 0 & 4095) + 262;
               int var10000;
               if ((var1 = Class_201.sub_1539(0, Class_201.var_aed)) != -2 && !Class_17f.sub_39b(Class_201.var_ff5, Class_201.var_aed - 262, 0, 1, Class_201.var_10d5)) {
                  if (var1 == -1) {
                     break label76;
                  }

                  var10000 = var1;
               } else {
                  var10000 = -1;
               }

               Class_201.var_aed = var10000;
            }
         }

         short var5;
         if ((var5 = (short)(Class_17f.var_fd5 >> 0 & '\uffff')) != -1) {
            if (Class_201.sub_c66(var5)) {
               return false;
            }

            int var10 = (short)(Class_17f.var_fd5 >> 16 & '\uffff') * 5;
            ++var10;
            short var6 = Class_17f.var_f81[var10++];
            short var7 = Class_17f.var_f81[var10++];
            short var8 = Class_17f.var_f81[var10++];
            short var9 = Class_17f.var_f81[var10];
            this.var_d0 = ((super.var_591 >> 8) - var6 << 8) / (var8 - var6);
            this.var_11b = ((super.var_5d1 >> 8) - var7 << 8) / (var9 - var7);
            if (this.var_11b > 255) {
               this.var_11b = 255;
            }

            if (this.var_11b < 0) {
               this.var_11b = 0;
            }

            if (this.var_d0 > 255) {
               this.var_d0 = 255;
            }

            if (this.var_d0 < 0) {
               this.var_d0 = 0;
            }
         }

         super.var_824 &= -7425;
         if (Class_17f.var_1013 != -1) {
            Class_147 var11;
            int var10001;
            short var10002;
            switch(Class_17f.var_1013) {
            case 4:
               var11 = this;
               var10001 = super.var_824;
               var10002 = 1024;
               break;
            case 5:
               var11 = this;
               var10001 = super.var_824;
               var10002 = 256;
               break;
            case 6:
            default:
               return false;
            case 7:
               var11 = this;
               var10001 = super.var_824;
               var10002 = 2048;
               break;
            case 8:
               var11 = this;
               var10001 = super.var_824;
               var10002 = 4096;
            }

            var11.var_824 = var10001 | var10002;
         }
      } else {
         super.var_824 &= -7425;
      }

      return false;
   }

   public final int sub_37c() {
      boolean var10 = true;
      if (Class_1ac.sub_43e(this)) {
         return 0;
      } else {
         boolean var8 = false;
         short var6 = 0;
         short var7 = 0;
         if (super.var_954 != 3) {
            if ((super.var_824 & 65536) != 0) {
               Class_201.var_ff5[5] = 7;
               this.var_160 = Class_201.var_ff5[5];
               Class_17f.sub_344(Class_201.var_ff5, 2, (short)this.var_d);
               this.sub_e3();
               if ((Class_201.var_57c[Class_201.var_ff5[8] * 8 + 3] & 8192) != 0 && (super.var_824 & 1024) == 0) {
                  --Class_201.var_e42;
               }

               if (Class_201.var_e42 < 0) {
                  Class_201.var_e42 = 0;
                  Class_17f.sub_344(Class_201.var_ff5, 2, (short)0);
                  this.sub_233(0, false);
               }
            } else if (this.var_160 == 7) {
               Class_201.var_ff5[5] = 0;
               this.var_160 = Class_201.var_ff5[5];
            } else if ((super.var_824 & 64) != 0) {
               super.var_954 = 5;
            }
         }

         int var11;
         int var12;
         if ((super.var_824 & 4096) != 0) {
            if (super.var_954 == 1) {
               var11 = Class_17f.sub_dd0(0, super.var_591) >> 8;
               var12 = Class_17f.sub_de9(0, super.var_5d1) >> 8;
               if (var11 != this.var_1cc >> 16 && (short)var12 != (short)this.var_1cc) {
                  Class_201.sub_a29(super.var_591 >> 8, super.var_5d1 >> 8, 2, 111, 0, 4, 0);
                  this.var_1cc = (var11 << 16) + (short)var12;
               }

               var6 = 0;
               var7 = 0;
            }
         } else {
            this.var_1cc = 0;
         }

         Class_147 var10000;
         int var10001;
         label252: {
            if ((Class_201.var_9d8 & 512) != 0) {
               super.var_824 &= -65;
               var10000 = this;
               var10001 = super.var_824 | 32;
            } else {
               if ((super.var_824 & 64) != 0) {
                  this.sub_3c7(0, 0, true);
                  break label252;
               }

               var10000 = this;
               var10001 = super.var_824 & -33;
            }

            var10000.var_824 = var10001;
         }

         label277: {
            if (Class_17f.sub_2e5(Class_201.var_ff5, 2) <= (short)(this.var_d >> 1) && super.var_954 != 3) {
               super.var_824 |= 16384;
               if (++this.var_1b2 <= 160) {
                  if (this.var_1b2 > 152) {
                     label175: {
                        short var10002;
                        if (this.var_1b2 > 156) {
                           super.var_824 ^= 32768;
                           if ((super.var_824 & '耀') != 0) {
                              var10000 = this;
                              var10001 = super.var_615 + 256;
                              break label175;
                           }

                           var10000 = this;
                           var10001 = super.var_615;
                           var10002 = 256;
                        } else {
                           super.var_824 ^= 32768;
                           if ((super.var_824 & '耀') != 0) {
                              var10000 = this;
                              var10001 = super.var_615 + 512;
                              break label175;
                           }

                           var10000 = this;
                           var10001 = super.var_615;
                           var10002 = 512;
                        }

                        var10001 -= var10002;
                     }

                     var10000.var_615 = var10001;
                     this.var_30e.var_615 = super.var_615;
                     return 0;
                  }
                  break label277;
               }

               if ((Class_201.var_a69.var_824 & 1024) == 0) {
                  Class_201.sub_a29(super.var_591 >> 8, super.var_5d1 >> 8, 2, 151, 0, 4, 0);
                  var10000 = this;
                  var10001 = (super.var_591 >> 8 << 16) + (super.var_5d1 >> 8 & '\uffff');
               } else {
                  Class_201.sub_a29(super.var_591 >> 8, super.var_5d1 >> 8, 2, 172, 0, 4, 0);
                  var10000 = this;
                  var10001 = 0;
               }

               var10000.var_215 = var10001;
               var10000 = this;
            } else {
               this.var_215 = 0;
               super.var_824 &= -16385;
               var10000 = this;
            }

            var10000.var_1b2 = 0;
         }

         switch(super.var_954) {
         case 3:
            super.var_824 &= -8561;
            super.var_721 = 1;
            Class_201.var_9d8 = super.var_8fb >= 64 ? Class_201.var_9d8 & -67108865 : Class_201.var_9d8 | 67108864;
            if (super.var_8fb <= 0) {
               Class_201.sub_11a8(291);
            }

            this.var_160 = Class_201.var_ff5[5] = 0;
            --super.var_8fb;
            break;
         case 4:
            --super.var_8fb;
            if (super.var_8fb <= 0) {
               super.var_8fb = 32;
               super.var_954 = 0;
            }
            break;
         case 5:
            super.var_824 &= -17;
            super.var_824 |= 32;
            if (Class_1ac.sub_22c(this) == Class_201.var_412[232 + super.var_721] && Class_1ac.sub_240(this)) {
               super.var_824 &= -97;
               super.var_954 = 0;
            }
            break;
         default:
            if (this.var_160 == 5) {
               int var1 = super.var_591 + super.var_409[8];
               int var2 = super.var_5d1 + super.var_409[9];
               int var3 = super.var_591 + super.var_409[10];
               int var4 = super.var_5d1 + super.var_409[11];
               if (this.sub_1eb(var1, var2, var3, var4, (Class_1c2)null, 1)) {
                  label233: {
                     short var14;
                     switch(super.var_721) {
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
                  if ((super.var_824 & 2048) != 0) {
                     if (this.var_24f > 64 && this.var_24f <= 192) {
                        var10000 = this;
                        var15 = 3;
                        break label222;
                     }

                     var10000 = this;
                  } else {
                     int var5;
                     if ((var5 = this.var_24f + 32) > 256) {
                        var5 -= 256;
                     }

                     super.var_721 = var5 >> 6;
                     ++super.var_721;
                     if (super.var_721 > 3) {
                        super.var_721 = 0;
                     }

                     if (this.var_24f >= 0) {
                        break label223;
                     }

                     var10000 = this;
                  }

                  var15 = 1;
               }

               var10000.var_721 = var15;
            }

            if (Class_201.var_d22 <= 0 && ((Class_17f.var_30f & 1) != 0 || (super.var_824 & 16) != 0)) {
               var10 = this.sub_196();
            }

            if (var10) {
               if ((Class_17f.var_30f & 1) == 0) {
                  super.var_824 &= -129;
               }

               byte var13 = -1;
               var12 = 0;
               var11 = 0;
               if (Class_201.var_a0a != 9) {
                  label265: {
                     int var16;
                     label198: {
                        if ((Class_17f.var_30f & 2) != 0) {
                           this.var_242 |= 1;
                           this.var_242 &= -5;
                           if ((Class_17f.var_30f & 16) == 0 && (Class_17f.var_30f & 8) == 0) {
                              this.var_242 &= -11;
                           }

                           var13 = 0;
                           var16 = -super.var_7d4;
                        } else {
                           if ((Class_17f.var_30f & 4) == 0) {
                              break label198;
                           }

                           this.var_242 |= 4;
                           this.var_242 &= -2;
                           if ((Class_17f.var_30f & 16) == 0 && (Class_17f.var_30f & 8) == 0) {
                              this.var_242 &= -11;
                           }

                           var13 = 2;
                           var16 = super.var_7d4;
                        }

                        var12 = var16;
                     }

                     if ((Class_17f.var_30f & 8) != 0) {
                        this.var_242 |= 8;
                        this.var_242 &= -3;
                        if ((Class_17f.var_30f & 2) == 0 && (Class_17f.var_30f & 4) == 0) {
                           this.var_242 &= -6;
                        }

                        var13 = 3;
                        var16 = -super.var_7c3;
                     } else {
                        if ((Class_17f.var_30f & 16) == 0) {
                           break label265;
                        }

                        this.var_242 |= 2;
                        this.var_242 &= -9;
                        if ((Class_17f.var_30f & 2) == 0 && (Class_17f.var_30f & 4) == 0) {
                           this.var_242 &= -6;
                        }

                        var13 = 1;
                        var16 = super.var_7c3;
                     }

                     var11 = var16;
                  }
               }

               if (var13 == -1) {
                  super.var_954 = 0;
                  this.sub_388();
               } else if ((super.var_824 & 16) == 0) {
                  super.var_954 = 1;
                  this.var_1a1 = 32;
                  this.sub_3c7(var11, var12, true);
               }

               if ((super.var_824 & 64) == 0) {
                  this.sub_33f(super.var_591 - 1792, super.var_5d1 - 1792, super.var_591 + 1792, super.var_5d1 + 1792);
               }
            }

            if (this.sub_2ff()) {
               return 0;
            }
         }

         label184: {
            if ((super.var_824 & 256) != 0) {
               if ((super.var_824 & 8192) != 0) {
                  break label184;
               }

               this.sub_388();
               Class_201.sub_a29(super.var_591 >> 8, super.var_5d1 >> 8, 2, 66, 0, 4, 0);
               var10000 = this;
               var10001 = super.var_824 | 8192;
            } else {
               if ((super.var_824 & 8192) == 0) {
                  break label184;
               }

               this.sub_388();
               Class_201.sub_a29(super.var_591 >> 8, super.var_5d1 >> 8, 2, 66, 0, 4, 0);
               var10000 = this;
               var10001 = super.var_824 & -8193;
            }

            var10000.var_824 = var10001;
         }

         this.sub_3fc();
         return 0;
      }
   }

   private void sub_388() {
      Class_147 var10000;
      int var10001;
      Class_147 var10002;
      int var10003;
      if (this.var_160 != 5 && (super.var_824 & 256) == 0) {
         var10000 = this;
         var10003 = 1024;
         var10002 = this;
         var10001 = 1024;
      } else {
         var10000 = this;
         var10003 = this.var_160 == 5 && (super.var_824 & 256) != 0 ? 192 : 384;
         var10002 = this;
         var10001 = var10003;
      }

      var10002.var_7d4 = var10003;
      var10000.var_7c3 = var10001;
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
      int var35 = super.var_591 + super.var_409[0];
      int var37 = super.var_5d1 + super.var_409[1];
      int var36 = super.var_591 + super.var_409[2];
      int var38 = super.var_5d1 + super.var_409[3];
      if ((super.var_824 & 64) != 0) {
         var1 += this.var_26;
         var2 += this.var_87;
         if (Math.abs(this.var_26) > 256) {
            this.var_26 -= this.var_26 > 0 ? 1280 : -1280;
            if (Math.abs(this.var_26) < 256) {
               this.var_26 = this.var_26 > 0 ? 256 : -256;
            }
         } else if (Math.abs(this.var_87) > 256) {
            this.var_87 -= this.var_87 > 0 ? 1280 : -1280;
            if (Math.abs(this.var_87) < 256) {
               this.var_87 = this.var_87 > 0 ? 256 : -256;
            }
         }
      }

      int var10000;
      int var28;
      int var29;
      label241: {
         var28 = super.var_591 + var1;
         var29 = super.var_5d1 + var2;
         if (var28 < 0) {
            var10000 = 0;
         } else {
            if (var28 <= Class_17f.var_cb6[4] << 8) {
               break label241;
            }

            var10000 = Class_17f.var_cb6[4] - 1 << 8;
         }

         var28 = var10000;
      }

      label235: {
         if (var29 < 0) {
            var10000 = 0;
         } else {
            if (var29 <= Class_17f.var_cb6[5] << 8) {
               break label235;
            }

            var10000 = Class_17f.var_cb6[5] - 1 << 8;
         }

         var29 = var10000;
      }

      int var11 = var28 + super.var_409[0];
      int var12 = var29 + super.var_409[1];
      int var13 = var28 + super.var_409[2];
      int var14 = var29 + super.var_409[3];
      if (var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            Class_1c2 var30;
            if (((var30 = (Class_1c2)Class_201.var_670[1 + var4]).var_52 & 2) != 0 && (var30.var_824 & 8) != 0 && (var30.var_873 & 1) != 0 && (var30.var_21a & 16) == 0 && var30.var_591 + var30.var_409[2] >= var11 && var30.var_5d1 + var30.var_409[3] >= var12 && var30.var_591 + var30.var_409[0] <= var13 && var30.var_5d1 + var30.var_409[1] <= var14) {
               if (var30.var_591 + var30.var_409[2] >= var35 && var30.var_5d1 + var30.var_409[3] >= var37 && var30.var_591 + var30.var_409[0] <= var36 && var30.var_5d1 + var30.var_409[1] <= var38) {
                  var28 -= var1;
                  var29 -= var2;
               } else {
                  if (var30.var_9a0 == 1) {
                     var30.var_824 |= 128;
                     if (!var3) {
                        continue;
                     }
                  }

                  if ((var30.var_1b4 & 268435456) == 0 || (var30.var_21a & 16) == 0) {
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
         var7 = Class_17f.var_cb6[1];
         int var8 = Class_17f.var_cb6[2];
         var26 = Class_17f.var_cb6[6];
         var27 = Class_17f.var_cb6[7];
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
      if ((var6 = Class_17f.var_1064[var33 * var7 + var31] & 3) == 1 || var6 == 2) {
         var39 = 1;
      }

      if ((var6 = Class_17f.var_1064[var33 * var7 + var32] & 3) == 1 || var6 == 2) {
         var39 |= 2;
      }

      if ((var6 = Class_17f.var_1064[var34 * var7 + var31] & 3) == 1 || var6 == 2) {
         var39 |= 4;
      }

      if ((var6 = Class_17f.var_1064[var34 * var7 + var32] & 3) == 1 || var6 == 2) {
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
      super.var_591 = var28;
      super.var_5d1 = var29;
      return true;
   }

   private void sub_3fc() {
      if ((super.var_824 & 4) == 0 && (super.var_824 & 2) == 0) {
         int var1 = 0;
         int var10000;
         if (super.var_954 == 3) {
            var1 = (super.var_824 & 65536) != 0 ? 48 : 49;
            boolean var2 = false;
         } else {
            label94: {
               if ((super.var_824 & 64) != 0) {
                  var10000 = 58;
               } else {
                  label91: {
                     if (super.var_954 == 2) {
                        if ((super.var_824 & 128) == 0) {
                           break label91;
                        }

                        var10000 = 74;
                     } else {
                        if ((super.var_824 & 2048) != 0) {
                           var1 = super.var_954 == 1 ? 98 : 90;
                           break label91;
                        }

                        var10000 = (super.var_824 & 16384) != 0 && (this.var_1a1 <= 0 || this.var_160 == 0 || this.var_160 == 3) && this.var_160 != 5 ? 106 : (super.var_954 == 1 ? 66 : 50);
                     }

                     var1 = var10000;
                  }

                  --this.var_1a1;
                  if (this.var_1a1 <= 0 && this.var_160 != 5 && (super.var_824 & 65536) == 0) {
                     break label94;
                  }

                  var10000 = var1 + this.var_160;
               }

               var1 = var10000;
            }
         }

         int var5;
         label69: {
            if ((super.var_824 & 256) != 0) {
               var10000 = 37;
            } else {
               if ((super.var_824 & 2048) != 0) {
                  var5 = super.var_954 == 1 ? 40 : 39;
                  break label69;
               }

               var10000 = super.var_954 == 1 ? 36 : 35;
            }

            var5 = var10000;
         }

         short var3 = Class_201.var_412[var1 * 4 + super.var_721];
         short var4 = Class_201.var_412[var5 * 4 + super.var_721];
         if (var3 == -1) {
            var3 = Class_201.var_412[50 + super.var_721];
         }

         if (var4 == -1) {
            var4 = Class_201.var_412[35 + super.var_721];
         }

         Class_201.sub_159c(this, var3, super.var_721);
         Class_201.sub_159c(this.var_30e, var4, super.var_721);
      }
   }

   public final void sub_42d(boolean var1) {
      int var4 = Class_201.var_454[this.var_242 + 40] & 255;
      boolean var7 = false;
      int var2 = super.var_591 + this.var_26e;
      int var3 = super.var_5d1 + this.var_27f;
      Class_17f.sub_ccb(0, var2 >> 8, var3 + -8192 >> 8, false, true);
      if (var4 < 0) {
         var4 += 256;
      }

      if (var4 > 256) {
         var4 -= 256;
      }

      Class_147 var10000;
      int var10001;
      int var8;
      label76: {
         this.var_26e = this.var_2c4;
         this.var_27f = this.var_2ed;
         var2 = GameEngine.sub_abc(8192L, var4);
         var3 = GameEngine.sub_acf(8192L, var4);
         if (var1) {
            var10000 = this;
            var10001 = var2;
         } else {
            if ((var8 = GameEngine.sub_9f9(this.var_2c4 - var2 >> 2)) > 1536) {
               var8 = 1536;
            }

            if (this.var_26e < var2) {
               var10000 = this;
               var10001 = this.var_2c4 + var8;
            } else {
               if (this.var_26e <= var2) {
                  break label76;
               }

               var10000 = this;
               var10001 = this.var_2c4 - var8;
            }
         }

         var10000.var_2c4 = var10001;
      }

      label68: {
         if (var1) {
            var10000 = this;
            var10001 = var3;
         } else {
            if ((var8 = GameEngine.sub_9f9(this.var_2ed - var3 >> 2)) > 1536) {
               var8 = 1536;
            }

            if (this.var_27f < var3) {
               var10000 = this;
               var10001 = this.var_2ed + var8;
            } else {
               if (this.var_27f <= var3) {
                  break label68;
               }

               var10000 = this;
               var10001 = this.var_2ed - var8;
            }
         }

         var10000.var_2ed = var10001;
      }

      byte var9 = 18;
      if (this.var_160 == 5) {
         var9 = 9;
      }

      if (this.var_24f <= var4 + var9 && this.var_24f >= var4 - var9) {
         var10000 = this;
         var10001 = var4;
      } else {
         int var5 = var4 - this.var_24f;
         int var6 = this.var_24f - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         if (var6 < 0) {
            var6 += 256;
         }

         if (var5 < var6) {
            var10000 = this;
            var10001 = this.var_24f + var9;
         } else {
            var10000 = this;
            var10001 = this.var_24f - var9;
         }
      }

      var10000.var_24f = var10001;
      if (this.var_24f < 0) {
         this.var_24f += 256;
      }

      if (this.var_24f > 256) {
         this.var_24f -= 256;
      }

      Class_201.sub_707();
   }

   public final void sub_487(Graphics var1) {
      int var2 = (super.var_824 & 1024) != 0 ? 3 : 0;
      this.var_30e.var_11 = super.var_11 = (byte[])Class_17f.sub_9d4(Class_201.var_6d1[var2]);
      if (Class_201.var_a0a != 9 && (super.var_824 & 1) != 0) {
         var1.drawImage(Class_201.var_686[0].var_8a[0], Class_201.var_ccb + Class_17f.var_104 + ((super.var_409[0] + super.var_409[2] >> 1) + super.var_743 >> 8) - 10, Class_201.var_d14 + Class_17f.var_13c + ((super.var_409[1] + super.var_409[3] >> 1) + super.var_77c >> 8) - 4, 20);
         super.var_679 = Class_201.var_ccb;
         super.var_6c3 = Class_201.var_d14;
         if (super.var_954 != 3) {
            if ((super.var_824 & 256) == 0) {
               Class_147 var10000;
               int var10001;
               int var10002;
               if (this.var_30e.sub_3b3(0) == 0) {
                  super.var_679 += this.var_30e.var_409[8] + this.var_30e.var_409[10] >> 1 >> 8;
                  var10000 = this;
                  var10001 = super.var_6c3;
                  var10002 = this.var_30e.var_409[9] >> 8;
               } else {
                  super.var_679 += this.var_30e.sub_3b3(0) >> 16;
                  var10000 = this;
                  var10001 = super.var_6c3;
                  var10002 = (short)this.var_30e.sub_3b3(0);
               }

               var10000.var_6c3 = var10001 + var10002;
            }

            this.var_30e.sub_2ce(var1, Class_201.var_ccb + (Class_17f.sub_d60(0, super.var_591 + this.var_30e.var_615) >> 8), Class_201.var_d14 + (Class_17f.sub_db8(0, super.var_5d1 + this.var_30e.var_640) >> 8));
            if ((super.var_824 & 2) == 0) {
               this.var_30e.sub_315();
            }
         }

         super.sub_487(var1);
      }

   }
}
