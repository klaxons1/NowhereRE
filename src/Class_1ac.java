import javax.microedition.lcdui.Graphics;

class Class_1ac {
   public byte[] var_11;
   public int var_52;
   public int var_99;
   protected int var_fc;
   private int var_127;
   public int var_132;
   public int var_142;
   protected int var_16e;
   protected int var_1ba;
   private int var_211;
   private int var_244;
   protected int var_268;
   protected int var_2bb;
   private int var_301;
   private int var_33e;
   private int var_393;
   private int var_3c5;
   private int var_3e0;
   public int[] var_409;
   public int var_426;
   public int var_44b;
   public int var_4a3;
   public int var_4eb;
   public int var_53d;
   public int var_591;
   public int var_5d1;
   public int var_615;
   public int var_640;
   public int var_679;
   public int var_6c3;
   public int var_721;
   public int var_743;
   public int var_77c;
   public int var_7c3;
   public int var_7d4;
   public byte var_814;
   public int var_824;
   public int var_873;
   public int var_899;
   public int var_8fb;
   public int var_954;
   public int var_9a0;
   public int var_9b3;
   public int var_9dd;

   public Class_1ac() {
      this.sub_be();
      this.var_409 = new int[14];
      this.var_814 = 4;
      this.sub_3da();
   }

   public void sub_14(int[] var1) {
   }

   public void sub_2a() {
   }

   public final void sub_14(int var1) {
      this.var_52 &= var1;
      this.var_99 = 0;
      this.var_fc = -1;
      this.var_127 = 0;
      this.var_132 = 0;
      this.var_142 = 0;
      this.var_16e = 1;
      this.var_53d = -1;
      this.var_1ba = 16777216;
      this.var_211 = this.var_244 = 0;
      this.var_268 = this.var_2bb = 0;
      this.var_301 = this.var_393 = this.var_33e = 0;
   }

   public final void sub_6f() {
      this.sub_be();
      this.var_409 = null;
   }

   public final void sub_be() {
      this.var_11 = null;
      this.sub_14(0);
   }

   public static boolean sub_106(Class_1ac var0) {
      return (var0.var_11[var0.var_127 + 0] & 4) != 0;
   }

   public static int sub_15e(Class_1ac var0) {
      return var0.var_11[var0.var_127 + 3] & 255;
   }

   public static int sub_18e(Class_1ac var0, int var1) {
      return (var0.var_11[var0.var_393 + var1 * 3 + 0] & 1) != 0 ? -(var0.var_11[var0.var_393 + var1 * 3 + 1] & 255) : var0.var_11[var0.var_393 + var1 * 3 + 1] & 255;
   }

   public static int sub_1c7(Class_1ac var0, int var1) {
      return (var0.var_11[var0.var_393 + var1 * 3 + 0] & 2) != 0 ? -(var0.var_11[var0.var_393 + var1 * 3 + 2] & 255) : var0.var_11[var0.var_393 + var1 * 3 + 2] & 255;
   }

   public static boolean sub_1d8(Class_1ac var0) {
      return (var0.var_1ba >> 16 & 255) == var0.var_16e;
   }

   public static int sub_22c(Class_1ac var0) {
      return var0.var_fc - (1 + (var0.var_11[0] << 1)) >> 2;
   }

   public static boolean sub_240(Class_1ac var0) {
      return (var0.var_52 & 1) != 0;
   }

   public final void sub_281(int var1) {
      int var6 = this.var_11[this.var_fc + 1] & 255;
      int var2 = this.var_fc + 2 + (var1 << 1);
      this.var_127 = this.var_fc + ((this.var_11[var2 + 1] & 255) << 8) + (this.var_11[var2] & 255);
      this.var_132 = this.var_11[this.var_127 + 0];
      int var3 = this.var_11[this.var_127 + 1] & 255;
      int var4 = this.var_11[this.var_127 + 2] & 255;
      int var5 = this.var_11[this.var_127 + 3] & 255;
      var2 = this.var_127 + 4;
      this.var_301 = var2;
      var2 += var3 * 7;
      this.var_33e = var2;
      var2 += var4 * 5;
      this.var_393 = var2;
      var2 += var5 * 3;
      Class_1ac var10000;
      int var10001;
      if ((this.var_132 & 2) != 0) {
         var10000 = this;
         var10001 = (this.var_11[var2] << 24) + (this.var_11[var2 + 1] << 16) + ((this.var_11[var2 + 2] & 255) << 8) + (this.var_11[var2 + 3] & 255);
      } else {
         var10000 = this;
         var10001 = 16777216;
      }

      var10000.var_1ba = var10001;
      this.var_142 = var1;
      this.var_16e = 1;
      this.var_211 = this.var_244 = 0;
      this.var_268 = this.var_2bb = 0;
      this.var_52 &= -2;
      var2 = (var2 = this.var_fc + 2 + (var6 << 1)) + ((this.var_11[var2 + 1] & 255) << 8) + (this.var_11[var2] & 255);
      var2 += 2;
      if ((this.var_11[this.var_fc + 0] & 2) != 0) {
         this.var_3c5 = var2;
         this.var_52 |= 2;
         if ((this.var_11[var2 + 0] & 4) != 0 || (this.var_11[var2 + 0] & 8) != 0) {
            this.var_52 |= 8;
         }

         var2 += 5;
      } else {
         this.var_52 &= -11;
      }

      if ((this.var_11[this.var_fc + 0] & 4) == 0) {
         this.var_52 &= -21;
      } else {
         this.var_3e0 = var2;
         this.var_52 |= 4;
         if ((this.var_11[var2 + 0] & 4) != 0 || (this.var_11[var2 + 0] & 8) != 0) {
            this.var_52 |= 16;
         }

      }
   }

   public final boolean sub_292(int var1) {
      label17: {
         int var2 = 1 + (this.var_11[0] << 1);
         if (this.var_fc == var2 + (var1 << 2)) {
            if ((this.var_11[this.var_fc + 0] & 1) != 0) {
               break label17;
            }
         } else {
            this.var_fc = var2 + (var1 << 2);
         }

         this.sub_281(0);
      }

      this.sub_341(true);
      return (this.var_1ba >> 16 & 255) == this.var_16e;
   }

   public final void sub_2ce(Graphics var1, int var2, int var3) {
      int var4;
      if ((var4 = this.var_11[this.var_127 + 1] & 255) != 0) {
         this.var_426 = Integer.MAX_VALUE;
         this.var_44b = Integer.MAX_VALUE;
         this.var_4a3 = -1;
         this.var_4eb = -1;
         var2 += Class_17f.var_104;
         var3 += Class_17f.var_13c;
         int var5 = this.var_301;

         for(int var6 = 0; var6 < var4; var5 += 7) {
            int var20 = this.var_11[var5 + 6] & 255;
            if ((this.var_53d & 1 << var20) != 0) {
               int var7 = this.var_11[var5 + 0] & 255;
               int var8 = this.var_11[var5 + 1] & 255;
               Class_de var24 = (Class_de)Class_17f.var_c27[this.var_11[1 + var7]];
               byte[] var23 = (byte[])Class_17f.var_c27[this.var_11[1 + var8]];
               int var9 = (this.var_11[var5 + 5] & 255) << 2;
               int var10 = (var23[var9] & 255) << 1;
               int var11 = (var23[var9 + 1] & 255) << 1;
               int var12 = (var23[var9 + 2] & 255) << 1;
               int var13 = (var23[var9 + 3] & 255) << 1;
               int var14 = 0;
               if ((this.var_11[var5 + 2] & 16) != 0) {
                  var14 = 2;
               }

               if ((this.var_11[var5 + 2] & 32) != 0) {
                  var14 |= 1;
               }

               var14 ^= this.var_99;
               int var15 = (this.var_11[var5 + 2] & 1) != 0 ? -(this.var_11[var5 + 3] & 255) : this.var_11[var5 + 3] & 255;
               int var16 = (this.var_11[var5 + 2] & 2) != 0 ? -(this.var_11[var5 + 4] & 255) : this.var_11[var5 + 4] & 255;
               if ((this.var_11[var5 + 2] & 4) != 0) {
                  var15 += this.var_211;
               }

               if ((this.var_11[var5 + 2] & 8) != 0) {
                  var16 += this.var_244;
               }

               int var17 = (this.var_99 & 2) != 0 ? var2 - (var15 + var12) : var2 + var15;
               int var18 = (this.var_99 & 1) != 0 ? var3 - (var16 + var13) : var3 + var16;
               Class_ec.sub_58f(var1, var24, var17, var18, 20, var10, var11, var12, var13, var14);
               var20 = 0;
               int var19 = 0;
               int var21 = var12;
               int var22 = var13;
               if ((this.var_11[var5 + 2] & 64) != 0) {
                  if ((this.var_99 & 2) != 0) {
                     var19 = (this.var_11[var5 + 2] & 16) != 0 ? var12 : -var12;
                  } else {
                     var19 = (this.var_11[var5 + 2] & 16) != 0 ? -var12 : var12;
                  }

                  var21 = var12 << 1;
                  Class_ec.sub_58f(var1, var24, var17 + var19, var18, 20, var10, var11, var12, var13, var14 ^ 2);
               }

               if ((this.var_11[var5 + 2] & 128) != 0) {
                  if ((this.var_99 & 1) != 0) {
                     var20 = (this.var_11[var5 + 2] & 32) != 0 ? var13 : -var13;
                  } else {
                     var20 = (this.var_11[var5 + 2] & 32) != 0 ? -var13 : var13;
                  }

                  var22 = var13 << 1;
                  Class_ec.sub_58f(var1, var24, var17, var18 + var20, 20, var10, var11, var12, var13, var14 ^ 1);
               }

               if ((this.var_11[var5 + 2] & 192) == 192) {
                  Class_ec.sub_58f(var1, var24, var17 + var19, var18 + var20, 20, var10, var11, var12, var13, var14 ^ 3);
               }

               if (var19 < 0) {
                  var17 += var19;
               }

               if (var20 < 0) {
                  var18 += var20;
               }

               if (var17 < this.var_426) {
                  this.var_426 = var17;
               }

               if (var18 < this.var_44b) {
                  this.var_44b = var18;
               }

               if (var17 + var21 > this.var_4a3) {
                  this.var_4a3 = var17 + var21;
               }

               if (var18 + var22 > this.var_4eb) {
                  this.var_4eb = var18 + var22;
               }
            }

            ++var6;
         }

         this.var_4a3 -= this.var_426;
         this.var_4eb -= this.var_44b;
      }
   }

   public final void sub_315() {
      int var2 = this.var_11[this.var_fc + 1] & 255;
      int var1 = this.var_1ba >> 24 & 255;
      ++this.var_16e;
      Class_1ac var10000;
      boolean var7;
      if (this.var_16e > var1) {
         int var10001;
         label45: {
            int var3;
            if (this.var_142 == var2 - 1) {
               this.var_2bb = this.var_268 = 0;
               if ((this.var_11[this.var_fc + 0] & 1) == 0) {
                  this.var_52 |= 1;
                  this.var_16e = var1;
                  return;
               }

               this.var_142 = 0;
               var3 = this.var_fc + 2;
               this.var_127 = this.var_fc + ((this.var_11[var3 + 1] & 255) << 8) + (this.var_11[var3] & 255);
               this.var_132 = this.var_11[this.var_127 + 0];
               this.var_301 = this.var_127 + 4;
               this.var_33e = this.var_301 + (this.var_11[this.var_127 + 1] & 255) * 7;
               this.var_393 = this.var_33e + (this.var_11[this.var_127 + 2] & 255) * 5;
               this.var_1ba = this.var_393 + (this.var_11[this.var_127 + 3] & 255) * 3;
               if ((this.var_132 & 2) != 0) {
                  var10000 = this;
                  var10001 = (this.var_11[this.var_1ba] << 24) + (this.var_11[this.var_1ba + 1] << 16) + ((this.var_11[this.var_1ba + 2] & 255) << 8) + (this.var_11[this.var_1ba + 3] & 255);
                  break label45;
               }

               var10000 = this;
            } else {
               ++this.var_142;
               var3 = this.var_fc + 2 + (this.var_142 << 1);
               this.var_127 = this.var_fc + ((this.var_11[var3 + 1] & 255) << 8) + (this.var_11[var3] & 255);
               this.var_132 = this.var_11[this.var_127 + 0];
               this.var_301 = this.var_127 + 4;
               this.var_33e = this.var_301 + (this.var_11[this.var_127 + 1] & 255) * 7;
               this.var_393 = this.var_33e + (this.var_11[this.var_127 + 2] & 255) * 5;
               this.var_1ba = this.var_393 + (this.var_11[this.var_127 + 3] & 255) * 3;
               if ((this.var_132 & 2) != 0) {
                  var10000 = this;
                  var10001 = (this.var_11[this.var_1ba] << 24) + (this.var_11[this.var_1ba + 1] << 16) + ((this.var_11[this.var_1ba + 2] & 255) << 8) + (this.var_11[this.var_1ba + 3] & 255);
                  break label45;
               }

               var10000 = this;
            }

            var10001 = 16777216;
         }

         var10000.var_1ba = var10001;
         this.var_16e = 1;
         this.var_211 = this.var_244 = 0;
         var10000 = this;
         var7 = true;
      } else {
         if ((this.var_132 & 2) != 0) {
            byte var4 = (byte)(this.var_1ba >> 8);
            byte var5 = (byte)this.var_1ba;
            this.var_211 += var4;
            this.var_244 += var5;
            this.var_268 += (this.var_99 & 2) != 0 ? -var4 : var4;
            this.var_2bb += (this.var_99 & 1) != 0 ? -var5 : var5;
         }

         boolean var6 = (this.var_52 & 24) != 0;
         var10000 = this;
         var7 = var6;
      }

      var10000.sub_341(var7);
   }

   public final void sub_341(boolean var1) {
      if (this.var_fc != -1) {
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
                     var12 = (this.var_52 & 2) != 0;
                     var3 = 0;
                     var11 = this.var_3c5;
                     if (!var12) {
                        break label70;
                     }

                     if ((this.var_11[var11 + 0] & 4) != 0) {
                        var4 = this.var_268;
                     }

                     if ((this.var_11[var11 + 0] & 8) == 0) {
                        break label70;
                     }
                  } else {
                     var12 = (this.var_52 & 4) != 0;
                     var3 = 4;
                     var11 = this.var_3e0;
                     if (!var12) {
                        break label70;
                     }

                     if ((this.var_11[var11 + 0] & 4) != 0) {
                        var4 = this.var_268;
                     }

                     if ((this.var_11[var11 + 0] & 8) == 0) {
                        break label70;
                     }
                  }

                  var5 = this.var_2bb;
               }

               int var7;
               int var8;
               int var9;
               int var10;
               if (var12) {
                  byte var6;
                  var7 = (((var6 = this.var_11[var11++]) & 1) != 0 ? -(this.var_11[var11++] & 255) : this.var_11[var11++] & 255) + var4;
                  var8 = ((var6 & 2) != 0 ? -(this.var_11[var11++] & 255) : this.var_11[var11++] & 255) + var5;
                  var9 = (this.var_11[var11++] & 255) << 1;
                  var10 = (this.var_11[var11] & 255) << 1;
               } else {
                  var10 = 0;
                  var9 = 0;
                  var8 = 0;
                  var7 = 0;
               }

               this.var_409[var3] = var7 << 8;
               this.var_409[var3 + 1] = var8 << 8;
               this.var_409[var3 + 2] = var7 + var9 << 8;
               this.var_409[var3 + 3] = var8 + var10 << 8;
               if ((this.var_99 & 2) != 0) {
                  var11 = this.var_409[var3 + 2];
                  this.var_409[var3 + 2] = -this.var_409[var3];
                  this.var_409[var3] = -var11;
               }

               if ((this.var_99 & 1) != 0) {
                  var11 = this.var_409[var3 + 3];
                  this.var_409[var3 + 3] = -this.var_409[var3 + 1];
                  this.var_409[var3 + 1] = -var11;
               }
            }
         }

         this.sub_392(0, this.var_409, 8);
         var11 = this.sub_3b3(0);
         this.var_409[12] = var11 >> 16 << 8;
         this.var_409[13] = (short)var11 << 8;
      }
   }

   public final boolean sub_392(int var1, int[] var2, int var3) {
      int var9;
      if ((this.var_11[this.var_127 + 0] & 4) != 0 && var1 < (this.var_11[this.var_127 + 2] & 255)) {
         var9 = this.var_33e + var1 * 5;
         byte var7;
         int var4 = ((var7 = this.var_11[var9++]) & 4) != 0 ? this.var_211 : 0;
         int var5 = (var7 & 8) != 0 ? this.var_244 : 0;
         var2[var3] = var4 + ((var7 & 1) != 0 ? -(this.var_11[var9++] & 255) : this.var_11[var9++] & 255);
         var2[var3 + 1] = var5 + ((var7 & 2) != 0 ? -(this.var_11[var9++] & 255) : this.var_11[var9++] & 255);
         var2[var3 + 2] = var2[var3] + ((this.var_11[var9++] & 255) << 1) << 8;
         var2[var3 + 3] = var2[var3 + 1] + ((this.var_11[var9] & 255) << 1) << 8;
         var2[var3] <<= 8;
         var2[var3 + 1] <<= 8;
         int var8;
         if ((this.var_99 & 2) != 0) {
            var8 = var2[var3 + 2];
            var2[var3 + 2] = -var2[var3];
            var2[var3] = -var8;
         }

         if ((this.var_99 & 1) != 0) {
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
      if ((this.var_11[this.var_127 + 0] & 8) != 0 && var1 < (this.var_11[this.var_127 + 3] & 255)) {
         int var4 = this.var_393 + var1 * 3;
         byte var5;
         int var2 = ((var5 = this.var_11[var4++]) & 4) != 0 ? this.var_211 : 0;
         int var3 = (var5 & 8) != 0 ? this.var_244 : 0;
         int var6 = (short)(var2 + ((var5 & 1) != 0 ? -(this.var_11[var4++] & 255) : this.var_11[var4++] & 255));
         int var7 = (short)(var3 + ((var5 & 2) != 0 ? -(this.var_11[var4] & 255) : this.var_11[var4] & 255));
         if ((this.var_99 & 2) != 0) {
            var6 = -var6;
         }

         if ((this.var_99 & 1) != 0) {
            var7 = -var7;
         }

         return (var6 << 16) + (var7 & '\uffff');
      } else {
         return 0;
      }
   }

   public final void sub_3da() {
      this.var_615 = this.var_640 = 0;
      this.var_721 = 1;
      this.var_7c3 = this.var_7d4 = 0;
      this.var_814 = 2;
      this.var_824 = 1;
      this.var_873 = 0;
      this.var_899 = 0;
      this.var_8fb = 0;
      this.var_954 = 0;
      this.sub_14(-65536);
   }

   public static boolean sub_43e(Class_1ac var0) {
      return (var0.var_824 & 2) != 0;
   }

   public static void sub_469(Class_1ac var0) {
      var0.var_824 |= 4;
   }

   public static void sub_4a5(Class_1ac var0) {
      var0.var_824 &= -5;
   }

   public static void sub_4dd(Class_1ac var0, int var1, int var2) {
      var0.var_873 = var0.var_873 & ~var1 | var2;
   }

   public final void sub_530(byte var1, byte var2) {
      this.var_814 = var1;
      this.var_99 = var2;
      this.sub_341(true);
   }

   public void sub_487(Graphics var1) {
      if ((this.var_824 & 1) != 0) {
         int var2 = (this.var_743 + this.var_615 >> 8) + this.var_679 + Class_17f.var_418;
         int var3 = (this.var_77c + this.var_640 >> 8) + this.var_6c3 + Class_17f.var_43a;
         this.sub_2ce(var1, var2, var3);
      }

      if ((this.var_824 & 6) == 0) {
         this.sub_315();
      }

   }
}
