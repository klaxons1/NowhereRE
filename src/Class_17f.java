import javax.microedition.lcdui.Graphics;

final class Class_17f {
   static int var_21;
   static int var_67;
   public static int var_89;
   public static int var_dd;
   public static int var_104;
   public static int var_13c;
   public static int var_186;
   public static int var_1d5;
   public static int var_1ee;
   public static int var_238;
   public static int var_24c;
   public static int var_289;
   public static int var_2c5;
   public static byte var_30f;
   public static boolean var_33f;
   public static int var_363;
   public static int var_3b7;
   static int var_418;
   static int var_43a;
   public static int var_481 = 0;
   public static char[] var_4bb;
   public static Sprite var_4f0;
   static char[] var_51a;
   static int[] var_543;
   static int var_563;
   static int var_56e;
   static boolean var_5a1;
   static int var_5d5;
   static Sprite[] var_61d;
   static Object[] var_671;
   static int var_696;
   static int var_6e3;
   static int var_735;
   static int var_795;
   static int var_7a4;
   static int var_7fb;
   static int var_851;
   static int var_87e;
   static int var_8df;
   static int var_936;
   static int var_971;
   static int var_9c5;
   static int var_a20;
   static int var_a7e;
   static int var_ab7;
   static int var_ac9;
   static int var_ae8;
   static char[] var_b49;
   static int[] var_ba2;
   protected static int[] var_c06 = null;
   protected static Object[] var_c27 = null;
   static int var_c77;
   static int[] var_cb6;
   static TileMap[] var_cd8;
   static Sprite[] var_d07;
   static int var_d50;
   static int var_d6b;
   static byte[] var_dcb;
   static int var_e25;
   static int var_e72;
   static int var_eaa;
   static int var_ef4;
   static int var_f32;
   static int var_f77;
   static short[] var_f81;
   static int var_fd5;
   static int var_1013;
   static int var_1026;
   static Object[] var_1059;
   static byte[] var_1064;
   static int var_10a3;
   static int var_10eb;
   public static int var_1129;

   static void sub_3b(Graphics var0, Sprite var1, byte var2) {
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
            var10000 = var_dd - var4 >> 1;
         } else if ((var2 & 1) != 0) {
            var10000 = 0;
         } else {
            if ((var2 & 4) == 0) {
               break label31;
            }

            var10000 = var_dd - var4;
         }

         var6 = var10000;
      }

      label24: {
         if ((var2 & 10) == 10) {
            var10000 = var_89 - var3 >> 1;
         } else if ((var2 & 8) != 0) {
            var10000 = 0;
         } else {
            if ((var2 & 2) == 0) {
               break label24;
            }

            var10000 = var_89 - var3;
         }

         var5 = var10000;
      }

      var5 += var_104;
      var6 += var_13c;
      var0.drawImage(var1.var_8a[0], var5, var6, 20);
   }

   static void sub_7f(Graphics var0, int var1, int var2, int var3, int var4, Sprite var5, int var6, int var7, int var8) {
      var1 += var_104;
      var2 += var_13c;
      var6 *= var7;
      var0.clipRect(var1, var2, var3, var4);
      int var10000 = var2;

      while(true) {
         int var10 = var10000;
         if (var10000 >= var2 + var4) {
            var0.setClip(0, 0, var_21, var_67);
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

   public static void sub_9a() {
      var_30f = 0;
      var_363 = 0;
      var_33f = false;
   }

   static void sub_b2(int var0, boolean var1) {
      byte var2;
      byte var3;
      label54: {
         var2 = var_30f;
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
         var_33f = true;
         var_363 = var0;
         var4 = var2 | var3;
      } else {
         var4 = var2 & ~var3;
      }

      var2 = (byte)var4;
      if (var_30f != var2) {
         var_30f = var2;
      }

   }

   static int sub_cd(int var0, int var1) {
      int var2 = GameEngine.random.nextInt();
      return var0 + Math.abs(var2) % (var1 - var0 + 1);
   }

   private static int sub_10a(int var0, int var1, int var2) {
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

   public static void sub_14a(int var0, int var1, boolean var2) {
      var_89 = var0 <= 0 ? var_21 : var0;
      var_dd = var1 <= 0 ? var_67 : var1;
      var_104 = var_21 - var_89 >> 1;
      var_13c = var_67 - var_dd >> 1;
      if (var2) {
         var_1ee &= -16;
      }

   }

   private static void sub_16a() {
      var_1ee &= -241;
      if (var_ef4 < var_89) {
         if (var_e72 > 0) {
            var_1ee |= 128;
         }

         if (var_89 - var_ef4 - var_e72 > 0) {
            var_1ee |= 32;
         }
      }

      if (var_f32 < var_dd) {
         if (var_eaa > 0) {
            var_1ee |= 16;
         }

         if (var_dd - var_f32 - var_eaa > 0) {
            var_1ee |= 64;
         }
      }

   }

   public static void sub_1c2(Graphics var0, int var1) {
      if ((var_1ee & 240) != 0) {
         var0.setColor(var1);
         if ((var_1ee & 128) != 0) {
            var0.fillRect(var_104, var_13c, var_e72 + var_186, var_dd);
         }

         if ((var_1ee & 32) != 0) {
            var0.fillRect(var_104 + var_e72 + var_ef4 - var_186, var_13c, var_89 - var_ef4 - var_e72 + var_186, var_dd);
         }

         if ((var_1ee & 16) != 0) {
            var0.fillRect(var_104, var_13c, var_89, var_eaa + var_1d5);
         }

         if ((var_1ee & 64) != 0) {
            var0.fillRect(var_104, var_13c + var_f32 + var_eaa - var_1d5, var_89, var_dd - var_f32 - var_eaa + var_1d5);
         }
      }

   }

   private static void sub_21d(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8;
      int var12 = (var8 = var4 / var7) * var7;
      int var9 = 255 / var7;
      var1 += var_104;
      var2 += var_13c;
      int var11 = 0;

      int var10;
      for(var10 = 0; var10 < var12; var11 += var9) {
         var0.setColor(sub_10a(var5, var6, var11));
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

         var0.setColor(sub_10a(var5, var6, var11));
         var0.fillRect(var1, var2 + var10, var3, var8);
         var10000 = var10 + var8;
      }
   }

   public static int sub_244(int var0, byte[] var1) {
      var0 = 1 + ((var1[0] & 255) << 1) + (var0 << 2);
      return var1[var0 + 1] & 255;
   }

   public static int sub_265(int var0, int var1, byte[] var2) {
      int var3 = (var1 = 1 + ((var2[0] & 255) << 1) + (var1 << 2)) + 2 + (var0 << 1);
      int var4 = var1 + ((var2[var3 + 1] & 255) << 8) + (var2[var3] & 255);
      if ((var2[var4 + 0] & 2) != 0) {
         var3 = var4 + 4 + (var2[var4 + 1] & 255) * 7 + (var2[var4 + 2] & 255) * 5 + (var2[var4 + 3] & 255) * 3;
         return var2[var3] & 255;
      } else {
         return 1;
      }
   }

   static boolean sub_292(Graphics var0, int var1, int var2, int var3, int var4, int var5, boolean var6, int var7, byte[] var8) {
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
         var_238 = Integer.MAX_VALUE;
         var_24c = Integer.MAX_VALUE;
         var_289 = -1;
         var_2c5 = -1;
         var1 += var_104;
         var2 += var_13c;

         for(int var11 = 0; var11 < var9; var10 += 7) {
            int var13 = var8[var10 + 6] & 255;
            if ((var5 & 1 << var13) != 0) {
               int var17 = var8[var10 + 0] & 255;
               int var18 = var8[var10 + 1] & 255;
               Sprite var29 = (Sprite)var_c27[var8[1 + var17]];
               byte[] var28 = (byte[])var_c27[var8[1 + var18]];
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

               if (var26 < var_238) {
                  var_238 = var26;
               }

               if (var27 < var_24c) {
                  var_24c = var27;
               }

               if (var26 + var14 > var_289) {
                  var_289 = var26 + var14;
               }

               if (var27 + var15 > var_2c5) {
                  var_2c5 = var27 + var15;
               }
            }

            ++var11;
         }

         var_289 -= var_238;
         var_2c5 -= var_24c;
         return var30;
      }
   }

   static int sub_2ad(byte[] var0, int var1) {
      return ((var0[var1 + 3] & 255) << 24) + ((var0[var1 + 2] & 255) << 16) + ((var0[var1 + 1] & 255) << 8) + (var0[var1] & 255);
   }

   static short sub_2e5(byte[] var0, int var1) {
      return (short)(((var0[var1 + 1] & 255) << 8) + (var0[var1] & 255));
   }

   static void sub_300(byte[] var0, int var1, int var2) {
      var0[var1 + 3] = (byte)(var2 >> 24 & 255);
      var0[var1 + 2] = (byte)(var2 >> 16 & 255);
      var0[var1 + 1] = (byte)(var2 >> 8 & 255);
      var0[var1 + 0] = (byte)(var2 & 255);
   }

   static void sub_344(byte[] var0, int var1, short var2) {
      var0[var1 + 1] = (byte)(var2 >> 8 & 255);
      var0[var1 + 0] = (byte)(var2 & 255);
   }

   static boolean sub_39b(byte[] var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 * var3 + var2;
      return (var0[var4 + (var5 >> 3)] & 1 << 7 - var5 % 8) != 0;
   }

   static void sub_3b0(byte[] var0, int var1, int var2, int var3, int var4) {
      int var5 = var1 * var3 + var2;
      var0[var4 + (var5 >> 3)] = (byte)(var0[var4 + (var5 >> 3)] | 1 << 7 - var5 % 8);
   }

   static void sub_3d7(int var0) {
      var_61d = new Sprite[var0];
      var_671 = new Object[var0];
      var_4bb = new char[10];
      var_56e = 0;
      var_5d5 = 0;
   }

   static void sub_437() {
      sub_499(-1);
      var_61d = null;
      var_671 = null;
      var_4bb = null;
      if (var_4f0 != null) {
         GameEngine.freeSprite(var_4f0);
         var_4f0 = null;
      }

      sub_4d7();
   }

   static void sub_485(int var0, int var1, int var2) {
      var_61d[var0] = GameEngine.loadSpriteSet(var1);
      BinaryReader var5;
      int var3 = ((var5 = GameEngine.openDataStream(var2)).buffer[var5.position++] & 255) + ((var5.buffer[var5.position++] & 255) << 8) + ((var5.buffer[var5.position++] & 255) << 16) + ((var5.buffer[var5.position++] & 255) << 24);
      var_671[var0] = GameEngine.readBytes(var5, var3);
      var5.buffer = null;
      byte[] var4;
      (var4 = (byte[])var_671[var0])[69] = 5;
      var4[435] = 5;
   }

   private static void sub_499(int var0) {
      for(int var1 = 0; var1 < var_61d.length; ++var1) {
         if (var0 == -1 || var0 == var1) {
            if (var_61d[var1] != null) {
               GameEngine.freeSprite(var_61d[var1]);
               var_61d[var1] = null;
            }

            if (var_671[var1] != null) {
               var_671[var1] = null;
            }
         }
      }

      sub_4d7();
   }

   public static void sub_4d7() {
      var_51a = null;
      var_543 = null;
   }

   public static void sub_4f7(char[] var0, int[] var1) {
      var_51a = var0;
      var_543 = var1;
   }

   public static int sub_52a(int var0) {
      BinaryReader var3;
      byte[] var2 = GameEngine.readBytes(var3 = GameEngine.openDataStream(var_5d5 * 174 + var0), GameEngine.getStreamSize(var3));
      var3.buffer = null;
      var_51a = sub_b90(var2, var2.length);
      return sub_546();
   }

   public static int sub_546() {
      var_543 = null;
      if (var_51a == null) {
         return 0;
      } else {
         int var0 = var_51a.length;
         int var1 = 0;
         int var4 = 0;

         char var2;
         while(var1 < var0) {
            if ((var2 = var_51a[var1++]) == 0 || var1 >= var0) {
               ++var4;
               break;
            }

            if (var2 == '\n') {
               ++var4;
            }
         }

         if (var4 > 0) {
            var_543 = new int[var4];
            int var3 = 0;
            var1 = 0;
            var_543[0] = 0;

            do {
               do {
                  if (var1 >= var0) {
                     return var4;
                  }
               } while((var2 = var_51a[var1++]) != '\n' && var2 != 0 && var1 < var0);

               int[] var10000 = var_543;
               var10000[var3] |= var1 - var_543[var3] - 1 << 16;
               ++var3;
               if (var3 < var4) {
                  var_543[var3] = var1;
               }
            } while(var2 != 0);
         }

         return var4;
      }
   }

   public static int sub_5a0(int var0) {
      return ((byte[])var_671[var0])[2];
   }

   public static int sub_5f5(int var0, int var1) {
      if (var_51a != null && var1 < var_543.length) {
         int var3 = var_543[var1] >> 16;
         int var4 = var_543[var1] & '\uffff';
         byte[] var8 = (byte[])var_671[var0];
         int var2 = 0;

         int var6;
         for(var6 = 0; var2 < var3; ++var2) {
            int var5;
            if ((var5 = var_51a[var4 + var2] & 255) == 64) {
               ++var2;
               if (var_4f0 != null) {
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

   public static int sub_645(Graphics var0, char var1, int var2, int var3, int var4, int var5) {
      int var9 = var1 & 255;
      byte var8;
      byte[] var12;
      if ((var8 = (var12 = (byte[])var_671[var4])[4 + var9 * 2 + 1]) > 0) {
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
            GameEngine.drawRegion(var0, var_61d[var4], var_104 + var2, var_13c + var3, 20, var6, var7, var10, var11, 0);
         }

         var2 += var8 + 0;
      }

      return var2;
   }

   public static int sub_657(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var22 = var5 >> 24;
      int var23 = var5 >> 16 & 255;
      var5 &= 65535;
      if (var_51a == null) {
         return 0;
      } else {
         byte[] var21;
         int var17 = (var21 = (byte[])var_671[var7])[2] + 1;
         var22 = var22 > 0 && var1 + var22 <= var_543.length ? var22 + var1 : var_543.length;
         byte var18 = (byte)(var4 >> 8 & 255);
         int var10000 = var_543[var1] >> 16;
         boolean var11 = false;
         int var9 = var10000;
         int var10 = var_543[var1] & '\uffff';
         int var14 = 0;
         int var19;
         int var24;
         if (var5 == 0) {
            var19 = var2;
            var24 = sub_5f5(var7, var1);
            switch(var4 & 255) {
            case 11:
               var2 -= var24 >> 1;
               break;
            case 15:
               var2 -= var24 >> 1;
               var3 -= var17 >> 1;
            }

            if (var0 != null) {
               var19 = sub_6a9(var0, var_51a, var10, var9, var2, var3, var7);
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
                     if ((var20 = var_51a[var10 + var8]) != 167 && var20 != '~') {
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

                     var19 = sub_6a9(var0, var_51a, var10 + var15, var8, var12, var13, var7);
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

               var9 = var_543[var1] >> 16;
               var10 = var_543[var1] & '\uffff';
            }
         }

         if (var0 != null) {
            return (var4 >> 16 & 255) == 0 ? var3 : var19;
         } else {
            return var14;
         }
      }
   }

   private static int sub_6a9(Graphics var0, char[] var1, int var2, int var3, int var4, int var5, int var6) {
      var4 += var_104;
      var5 += var_13c;
      var3 += var2;
      var_5a1 = false;
      byte[] var14;
      byte var12 = (var14 = (byte[])var_671[var6])[1];
      byte var13 = var14[2];

      for(int var8 = var2; var8 < var3; ++var8) {
         int var7;
         if ((var7 = var1[var8] & 255) == 64) {
            ++var8;
            var7 = var1[var8] - 97;
            if (var_4f0 != null) {
               GameEngine.drawRegion(var0, var_4f0, var4, var5, 20, var7 * 0, 0, 0, 0, 0);
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
                  if (var_56e != 0 && var_563 >= var_56e) {
                     var_5a1 = true;
                  } else {
                     GameEngine.drawRegion(var0, var_61d[var6], var4, var5, 20, var10, var11, var12, var13, 0);
                  }

                  ++var_563;
               }

               var4 += var9 + 0;
            }
         }
      }

      return var4 - var_104;
   }

   public static int sub_6de(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = 0;
      byte var14 = 0;
      var2 += var_104;
      var3 += var_13c;
      if (var1 < 0) {
         var14 = 1;
         var1 = -var1;
      }

      label87: {
         char[] var10000;
         int var10001;
         byte var10002;
         if (var1 == 0) {
            var10000 = var_4bb;
            var10001 = 0;
            ++var8;
            var10002 = 48;
         } else {
            while(true) {
               if (var1 <= 0) {
                  if (var14 == 0) {
                     break label87;
                  }

                  var10000 = var_4bb;
                  var10001 = var8++;
                  var10002 = 45;
                  break;
               }

               var_4bb[var8++] = (char)(48 + var1 % 10);
               var1 /= 10;
            }
         }

         var10000[var10001] = (char)var10002;
      }

      if (var4 > 0 && var4 - var8 - var14 > 0) {
         for(int var7 = 0; var7 < Math.min(var4 - var8 - var14, 10); ++var7) {
            var_4bb[var8++] = '0';
         }
      }

      if (var5 == -2) {
         return var8;
      } else {
         byte[] var15 = (byte[])var_671[var6];
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

               var16 = var_4bb[var9];
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
                  return var2 - var_104;
               }

               var16 = var_4bb[var8];
            } while((var18 = var15[4 + var16 * 2 + 1]) == 0);

            if (var0 != null) {
               byte var12 = var15[1];
               byte var13 = var15[2];
               int var17 = (var9 = var15[4 + var16 * 2 + 0] & 255) / var15[3];
               var9 = (var9 - var17 * var15[3]) * var12;
               var17 *= var13;
               GameEngine.drawRegion(var0, var_61d[var6], var2, var3, 20, var9, var17, var12, var13, 0);
            }

            var2 += var18 + 0;
         }
      }
   }

   static void sub_738(int var0, int var1, int var2, char[] var3, int var4, int var5) {
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      int var14 = var3 == null ? sub_6de((Graphics)null, var2, 0, 0, 0, -2, 0) : 0;
      int var10 = 0;

      for(int var7 = var0; var7 < var_543.length; ++var7) {
         int var8 = var_543[var7] >> 16;
         int var9 = var_543[var7] & '\uffff';

         for(int var6 = 0; var6 < var8; ++var6) {
            boolean var10000;
            if (var_51a[var9 + var6] == '~') {
               if (var10 == var1) {
                  var12 = true;
                  if (var3 == null) {
                     --var14;
                     if (var14 >= 0) {
                        var_51a[var9 + var6] = var_4bb[var14];
                     } else {
                        var_51a[var9 + var6] = 167;
                     }
                  } else if (var14 < var5) {
                     var_51a[var9 + var6] = var3[var4 + var14++];
                  } else {
                     var_51a[var9 + var6] = 167;
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

   static void sub_785(int var0, int var1, int var2, int var3, int var4, int var5) {
      var_ab7 = var3;
      var_a7e = sub_5a0(var3);
      var_9c5 = var2;
      var_a20 = 10 + (var_a7e + 1) * 3;
      if ((var_a20 & 1) != 0) {
         ++var_a20;
      }

      var_795 = var1;
      var_735 = var0;
      var_696 = 30;
      var_6e3 = var5;
      var_6e3 &= -65;
      var_8df = -1;
      var_87e = -1;
      var_971 = 0;
      var_ac9 = var4;
      var_7a4 = 0;
      var_ae8 = 1;
   }

   private static void sub_7bd() {
      var_936 = 0;
      var_b49 = null;
      var_ba2 = null;
      sub_4d7();
   }

   public static void sub_81d(int var0) {
      if (var_696 == 34) {
         int var1 = var_7a4 & 255;
         int var2 = var_7a4 >> 8 & 255;
         if (var_7a4 != 0 && var_7a4 != 16777216 && var1 != 0 && var2 > 0) {
            if (var_30f == 8) {
               var_7a4 &= 65535;
               var_6e3 |= 1;
               return;
            }

            if (var_30f == 16) {
               var_7a4 = 65536 | var_7a4 & '\uffff';
               var_6e3 |= 1;
               return;
            }

            if ((var_30f & 1) != 0) {
               ++var_7fb;
               var_6e3 |= 1;
               return;
            }
         } else {
            if ((var_30f & 5) != 0) {
               if (var_ae8 != 0) {
                  var_ae8 = 0;
               } else {
                  var_ae8 = 1;
                  ++var_7fb;
               }

               var_6e3 |= 1;
               return;
            }

            if (var0 == -6) {
               var_7fb = var_851;
               var_696 = 35;
            }
         }

      }
   }

   public static boolean sub_831() {
      sub_4f7(var_b49, var_ba2);
      int var0;
      int var1;
      switch(var_696) {
      case 30:
         sub_52a(var_735);
         var_b49 = var_51a;
         var_ba2 = var_543;
         var_7a4 = 0;
         var_7fb = 0;
         var_851 = sub_89d((Graphics)null, 0, 0, 0);
         var_6e3 |= 1;
         var_696 = 31;
      case 31:
      default:
         break;
      case 32:
         var_696 = 34;
         break;
      case 33:
         if (var_971 != 0) {
            var0 = var_7a4 & 255;
            var1 = var_7a4 >> 8 & 255;
            int var2 = (var_51a[2] | 32) - 97;
            int var3 = (var_51a[3] | 32) - 97;
            if (var_971 != 1 && (var2 != 0 || var3 != 0)) {
               if (var_971 == 2) {
                  ++var1;
                  var_7a4 = ((var_6e3 & 16) != 0 ? 0 : 1) << 16 | (var1 & 255) << 8 | var0 & 255;
               } else {
                  var_7a4 = 16777216;
                  if (var_971 == 3 && var2 > 0) {
                     var_795 = 3;
                  } else if (var_971 == 4 && var3 > 0) {
                     var_795 = 3 + var2;
                  } else {
                     var_696 = 35;
                  }
               }

               var_851 = sub_89d((Graphics)null, 0, 0, 0);
               var_7fb = 0;
               var_6e3 |= 1;
               var_696 = 34;
               var_971 = 0;
            } else {
               var_696 = 35;
            }
         }
         break;
      case 34:
         if (var_7fb >= var_851) {
            if ((var0 = var_7a4 & 255) != 0 && (var1 = var_7a4 >> 8 & 255) <= var0) {
               if (var1 == 0) {
                  ++var1;
                  var_7a4 = ((var_6e3 & 16) != 0 ? 0 : 1) << 16 | (var1 & 255) << 8 | var0 & 255;
                  var_851 = sub_89d((Graphics)null, 0, 0, 0);
                  var_7fb = 0;
                  var_6e3 |= 1;
               } else {
                  var_696 = 33;
               }
            } else {
               var_696 = 35;
            }
         }
         break;
      case 35:
         sub_7bd();
         return true;
      }

      return false;
   }

   public static boolean sub_83e(Graphics var0, int var1, int var2, int var3) {
      if (var_696 == 35) {
         return false;
      } else {
         var0.setColor(9961472);
         var0.fillRect(var_104 + var1, var_13c + var2, var_89, var_a20);
         sub_21d(var0, var1 + 2, var2 + 2, var_9c5 - 4, var_a20 - 4, 4737080, 0, 16);
         sub_4f7(var_b49, var_ba2);
         if (var_696 != 34) {
            return true;
         } else {
            var_6e3 &= -2;
            int var4;
            if ((var4 = var_7fb) >= var_851) {
               var4 = var_851 - 1;
            }

            sub_89d(var0, var3, var2, var4);
            if (var_ae8 != 0) {
               var_ae8 += 2;
            }

            if (var_7fb < var_851 - 1 && var_3b7 % 20 != 0) {
               sub_645(var0, '°', var3 + var_9c5 - sub_645((Graphics)null, '°', 0, 0, var_ab7, -1) - 2, var2 + var_a20 - var_a7e, var_ab7, -1);
            }

            return true;
         }
      }
   }

   private static int sub_89d(Graphics var0, int var1, int var2, int var3) {
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
            if ((var_7a4 & 16777216) == 0 && var_543[0] >> 16 >= 7 && var_51a[0] == '@' && (var_51a[1] | 32) == 122) {
               int var15 = (var_51a[2] | 32) - 97;
               int var16 = (var_51a[3] | 32) - 97;
               var14 = (var_51a[4] | 32) - 97;
               var9 = (var_51a[5] | 32) - 97;
               var10 = var_7a4 >> 8 & 255;
               var11 = var_7a4 >> 16 & 255;
               if (var10 == 0 && var14 == 0) {
                  ++var10;
                  var_7a4 = ((var_6e3 & 16) != 0 ? 0 : 1) << 16 | (var10 & 255) << 8 | var9 & 255;
               }

               if (var10 == 0) {
                  var13 = 3 + var15 + var16;
                  var_7a4 = ((var_6e3 & 16) != 0 ? 0 : 1) << 16 | var9;
                  break label74;
               }

               if (var10 > var9) {
                  return -1;
               }

               var13 = 3 + var14 + var15 + var16 + (var10 - 1);
               if (4 + var10 < var_543[0] >> 16) {
                  var10000 = (var_51a[6 + var10] | 32) - 97;
                  break label86;
               }
            } else {
               if (var_795 == -1) {
                  var13 = 0;
                  var10000 = -1;
                  break label86;
               }

               var13 = var_795;
            }

            var10000 = 1;
         }

         var14 = var10000;
      }

      int var17 = sub_8eb(var0, var1 + 5, var2 + 5, var3, var_9c5 - 10, var13, var14);
      if (var0 != null && var9 != 0 && var10 > 0 && var_7fb >= var_851 - 1) {
         var13 = sub_645((Graphics)null, '±', 0, 0, var_ac9, -1) * 2;
         int var4 = sub_5f5(var_ab7, 2);
         var17 += var2 + var_a20 - var_a7e - 1 - var17 >> 1;
         if (var11 == 0) {
            sub_645(var0, '±', var1 + 8 + (GameEngine.cos(var_3b7 * 32) * 3 >> 16), var17, var_ac9, -1);
         }

         sub_6a9(var0, var_51a, var_543[1] & '\uffff', var_543[1] >> 16, var1 + 0 + 8 + var13, var17, var_ab7);
         if (var11 == 1) {
            sub_645(var0, '±', var1 + var_9c5 - var4 - var13 - 8 + (GameEngine.cos(var_3b7 * 32) * 3 >> 16), var17, var_ac9, -1);
         }

         sub_6a9(var0, var_51a, var_543[2] & '\uffff', var_543[2] >> 16, var1 + 0 + var_9c5 - var4 - 8, var17, var_ab7);
         var10000 = var_6e3 | 128;
      } else {
         var10000 = var_6e3 & -129;
      }

      var_6e3 = var10000;
      return var17;
   }

   private static int sub_8eb(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var17 = false;
      boolean var19 = false;
      int var20 = var5;
      int var21 = var6 == -1 ? -1 : var5 + var6 - 1;
      if (var0 != null) {
         var_8df = var_87e;
      }

      byte[] var18 = (byte[])var_671[var_ab7];
      var_563 = 0;
      var_56e = var_ae8;
      int var16 = 0;
      boolean var12 = false;
      int var11 = 0;

      do {
         int var8 = var_543[var20] >> 16;
         int var9 = var_543[var20] & '\uffff';
         int var14 = 0;
         int var15 = 0;
         if (var_936 != 0 && (var_936 & 1 << var20) == 0) {
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
                  if (var_51a[var9 + var7] == '@') {
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
                        var_87e = (var_51a[var9 + var7] | 32) - 97;
                     }
                  } else {
                     if (var_51a[var9 + var7] == ' ') {
                        var15 = var7 - 1;
                     }

                     var13 = (var18[4 + ((var_51a[var9 + var7] & 255) << 1) + 1] & 255) + 0;
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
                     sub_6a9(var0, var_51a, var9 + var14, var13, var1, var2, var_ab7);
                     if (var_5a1) {
                        var19 = true;
                     }

                     var2 += var_a7e + 1;
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
      } while(var21 == -1 && var20 < var_543.length || var21 != -1 && var20 <= var21);

      if (var0 != null && !var19) {
         var_ae8 = 0;
      }

      if (!var17) {
         ++var16;
      }

      var_563 = 0;
      var_56e = 0;
      if (var0 != null && var_8df != -1 && var_8df != var_87e) {
         var_6e3 |= 64;
      }

      return var0 == null ? var16 : var2;
   }

   public static void sub_901(int var0) {
      var_c06 = new int[var0];
      var_c27 = new Object[var0];

      for(int var1 = 0; var1 < var0; ++var1) {
         var_c06[var1] = -1;
         var_c27[var1] = null;
      }

   }

   public static void sub_90c() {
      var_c06 = null;
      if (var_c27 != null) {
         for(int var0 = 0; var0 < var_c27.length; ++var0) {
            var_c27[var0] = null;
         }
      }

      var_c27 = null;
   }

   private static int sub_94a(int var0, int var1) {
      int var2 = var1 < 0 ? var0 & '\uffff' : (var1 << 16) + (var0 & '\uffff');

      for(int var3 = 0; var3 < var_c06.length; ++var3) {
         if (var_c06[var3] == var2 && var_c27[var3] != null) {
            return var3;
         }
      }

      return -1;
   }

   public static int sub_97a(int var0, int var1, int var2) {
      int var3 = var1 < 0 ? var0 & '\uffff' : (var1 << 16) + (var0 & '\uffff');

      int var6;
      for(var6 = 0; var6 < var_c06.length; ++var6) {
         if (var_c06[var6] == var3 && var_c27[var6] != null) {
            return var6;
         }
      }

      var6 = sub_a31();
      Sprite var10;
      switch(var2) {
      case 0:
         var_c27[var6] = GameEngine.loadSpriteSet(var0);
         break;
      case 1:
         var10 = GameEngine.loadSpriteSet(var0);
         var_c27[var6] = GameEngine.recolorSprite(var10, sub_afd(var1), -1);
         GameEngine.freeSprite(var10);
         break;
      case 2:
      default:
         return -1;
      case 3:
         BinaryReader var11;
         byte[] var9 = GameEngine.readBytes(var11 = GameEngine.openDataStream(var0), GameEngine.getStreamSize(var11));
         var11.buffer = null;
         var_c27[var6] = var9;
         var_c06[var6] = var3;
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
            if ((var7 = sub_94a(var10000, var10001)) == -1) {
               var7 = sub_a31();
               var10 = GameEngine.loadSpriteSet(var0);
               if ((var9[var4] & 128) != 0 && var1 != -1) {
                  var_c27[var7] = GameEngine.recolorSprite(var10, sub_afd(var1), -1);
                  GameEngine.freeSprite(var10);
               } else {
                  var_c27[var7] = var10;
               }

               var_c06[var7] = var1 < 0 ? var0 & '\uffff' : (var1 << 16) + (var0 & '\uffff');
            }

            var9[var4] = (byte)var7;
         }

         for(var4 = 1; var4 < 1 + var5 * 2; var4 += 2) {
            int var8;
            if ((var8 = sub_94a(var0 = 437 + (var9[var4 + 1] & 255), -1)) == -1) {
               var8 = sub_a31();
               var_c27[var8] = sub_b55(var0);
               var_c06[var8] = var0 & '\uffff';
            }

            var9[var4 + 1] = (byte)var8;
         }

         return var6;
      case 4:
         var_c27[var6] = GameEngine.openDataStream(var0);
         break;
      case 5:
         var_c27[var6] = sub_afd(var0);
      }

      var_c06[var6] = var3;
      return var6;
   }

   public static Object sub_9d4(int var0) {
      return var_c27[var0];
   }

   public static boolean sub_9fa(int var0, int var1) {
      if (var0 < 0) {
         return false;
      } else {
         if (var1 != 0 && var1 != 1) {
            if (var1 == 4) {
               ((BinaryReader)var_c27[var0]).buffer = null;
            } else if (var1 == 3) {
               byte[] var2 = (byte[])var_c27[var0];
               int var3 = 1 + (var2[0] & 255) * 2;

               for(int var4 = 1; var4 < var3; var4 += 2) {
                  byte var5 = var2[var4];
                  byte var6 = var2[var4 + 1];
                  if (var5 > var0) {
                     GameEngine.freeSprite((Sprite)var_c27[var5]);
                     var_c06[var5] = -1;
                     var_c27[var5] = null;
                  }

                  if (var6 > var0) {
                     var_c06[var6] = -1;
                     var_c27[var6] = null;
                  }
               }
            }
         } else {
            GameEngine.freeSprite((Sprite)var_c27[var0]);
         }

         var_c06[var0] = -1;
         var_c27[var0] = null;
         return true;
      }
   }

   private static int sub_a31() {
      for(int var0 = 0; var0 < var_c06.length; ++var0) {
         if (var_c06[var0] == -1 && var_c27[var0] == null) {
            return var0;
         }
      }

      return -1;
   }

   public static byte[] sub_a5d(int var0) {
      BinaryReader var1;
      GameEngine.readInt32LE(var1 = GameEngine.openDataStream(var0));
      int var2 = (var1.buffer[var1.position++] & 255) + ((var1.buffer[var1.position++] & 255) << 8) + ((var1.buffer[var1.position++] & 255) << 16) + ((var1.buffer[var1.position++] & 255) << 24);
      byte[] var3 = GameEngine.readBytes(var1, var2);
      var1.buffer = null;
      return var3;
   }

   public static short[] sub_aaf(int var0) {
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

   public static int[] sub_ac4(int var0) {
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

   private static byte[] sub_afd(int var0) {
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

   private static byte[] sub_b55(int var0) {
      BinaryReader var1 = GameEngine.openDataStream(var0);

      for(int var2 = 0; var2 < 7; ++var2) {
         ++var1.position;
      }

      byte[] var4 = GameEngine.readBytes(var1, GameEngine.getStreamSize(var1) - 7);
      var1.buffer = null;
      return var4;
   }

   private static char[] sub_b90(byte[] var0, int var1) {
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

   public static void sub_bb1() {
      var_cb6 = null;
      var_cd8 = null;
      var_d07 = null;
      var_dcb = null;
      var_f81 = null;
      var_1064 = null;
      var_c77 = 0;
      var_f77 = 0;
      var_e25 = 0;
      var_fd5 = -1;
      var_1013 = -1;
      var_1026 = -1;
      var_d50 = -1;
      var_d6b = -1;
   }

   public static void sub_bed() {
      sub_c0e();
   }

   public static void sub_c0e() {
      var_f81 = null;
      var_f77 = 0;
      var_dcb = null;
      var_1064 = null;
      int var0;
      if (var_1059 != null) {
         for(var0 = 0; var0 < var_1059.length; ++var0) {
            var_1059[var0] = null;
         }
      }

      var_1059 = null;
      if (var_d07 != null) {
         for(var0 = 0; var0 < var_d07.length; var0 += 2) {
            for(int var1 = 0; var1 < 2; ++var1) {
               GameEngine.freeSprite(var_d07[var0 + var1]);
               var_d07[var0 + var1] = null;
            }
         }

         var_d07 = null;
      }

      if (var_cd8 != null) {
         for(var0 = 0; var0 < var_cd8.length; ++var0) {
            if (var_cd8[var0] != null) {
               GameEngine.disposeTileMap(var_cd8[var0]);
            }

            var_cd8[var0] = null;
         }

         var_cd8 = null;
      }

      var_cb6 = null;
      var_c77 = 0;
   }

   public static void sub_c18(int var0, int var1, int var2, int var3) {
      var_e72 = var0;
      var_eaa = var1;
      var_ef4 = var2;
      var_f32 = var3;
      int var5 = 0;

      for(int var4 = 0; var4 < var_c77; var5 += 23) {
         label21: {
            int var6;
            int[] var10000;
            int var10001;
            int var10002;
            int[] var10003;
            int var10004;
            byte var10005;
            if ((var6 = var_cb6[var5 + 21]) == 5) {
               var10000 = var_cb6;
               var10001 = var5 + 20;
               var10002 = var_f32 - var_cb6[var5 + 20];
               var10003 = var_cb6;
               var10004 = var5;
               var10005 = 5;
            } else {
               if (var6 == 7) {
                  var_cb6[var5 + 20] = var_f32 - var_cb6[var5 + 20] - var_cb6[var5 + 5];
               } else if (var6 != 2) {
                  break label21;
               }

               var10000 = var_cb6;
               var10001 = var5 + 19;
               var10002 = var_ef4 - var_cb6[var5 + 19];
               var10003 = var_cb6;
               var10004 = var5;
               var10005 = 4;
            }

            var10000[var10001] = var10002 - var10003[var10004 + var10005];
         }

         ++var4;
      }

      sub_16a();
   }

   public static void sub_c7b(int var0, int var1, int var2, boolean var3) {
      int var4 = 23 * var0;
      if (var3) {
         if (var1 > var_cb6[var4 + 4]) {
            var1 = var_cb6[var4 + 4];
         }

         if (var2 > var_cb6[var4 + 5]) {
            var2 = var_cb6[var4 + 5];
         }
      }

      var_cb6[var4 + 12] = var1;
      var_cb6[var4 + 13] = var2;
      var_cb6[var4 + 8] = var_cb6[var4 + 4] - var_cb6[var4 + 12];
      var_cb6[var4 + 9] = var_cb6[var4 + 5] - var_cb6[var4 + 13];
   }

   public static int sub_ccb(int var0, int var1, int var2, boolean var3, boolean var4) {
      int var5 = var0 * 23;
      int var6 = var0 * 1;
      int var7 = 0;
      var_cb6[var5 + 10] = var1;
      var_cb6[var5 + 11] = var2;
      if (!var3) {
         int[] var10000 = var_cb6;
         var10000[var5 + 10] -= var_cb6[var5 + 12] >> 1;
         var10000 = var_cb6;
         var10000[var5 + 11] -= var_cb6[var5 + 13] >> 1;
      }

      if (var4) {
         label34: {
            label28: {
               byte var8;
               if (var_cb6[var5 + 10] < 0) {
                  var_cb6[var5 + 10] = 0;
                  var8 = 4;
               } else {
                  if (var_cb6[var5 + 10] <= var_cb6[var5 + 8]) {
                     break label28;
                  }

                  var_cb6[var5 + 10] = var_cb6[var5 + 8];
                  var8 = 8;
               }

               var7 = var8;
            }

            byte var10001;
            int var9;
            if (var_cb6[var5 + 11] < 0) {
               var_cb6[var5 + 11] = 0;
               var9 = var7;
               var10001 = 1;
            } else {
               if (var_cb6[var5 + 11] <= var_cb6[var5 + 9]) {
                  break label34;
               }

               var_cb6[var5 + 11] = var_cb6[var5 + 9];
               var9 = var7;
               var10001 = 2;
            }

            var7 = var9 | var10001;
         }
      }

      GameEngine.setViewport(var_cd8[var6], var_cb6[var5 + 10], var_cb6[var5 + 11], var_cb6[var5 + 12], var_cb6[var5 + 13]);
      return var7;
   }

   public static void sub_cf9(int var0, Graphics var1, int var2, int var3, boolean var4) {
      int var5 = var0 * 23;
      if (var4) {
         var2 = var2 - var_cb6[var5 + 12] >> 1;
         var3 = var3 - var_cb6[var5 + 13] >> 1;
      }

      var2 += var_104 + var_e72 + var_cb6[var5 + 19];
      var3 += var_13c + var_eaa + var_cb6[var5 + 20];
      GameEngine.drawTileMap(var_cd8[var0 * 1], var1, var2, var3);
   }

   static int sub_d20(int var0, int var1) {
      return var_e72 + var_cb6[23 * var0 + 19] + var1 - var_cb6[23 * var0 + 10];
   }

   static int sub_d31(int var0, int var1) {
      return var_eaa + var_cb6[23 * var0 + 20] + var1 - var_cb6[23 * var0 + 11];
   }

   static int sub_d60(int var0, int var1) {
      return var_e72 + var_cb6[23 * var0 + 19] + (var1 >> 8) - var_cb6[23 * var0 + 10] << 8;
   }

   static int sub_db8(int var0, int var1) {
      return var_eaa + var_cb6[23 * var0 + 20] + (var1 >> 8) - var_cb6[23 * var0 + 11] << 8;
   }

   static int sub_dd0(int var0, int var1) {
      int var2 = var_cb6[23 * var0 + 6];
      return (var1 >> 8) / var2 * var2 + (var2 >> 1) << 8;
   }

   static int sub_de9(int var0, int var1) {
      int var2 = var_cb6[23 * var0 + 7];
      return (var1 >> 8) / var2 * var2 + (var2 >> 1) << 8;
   }

   public static boolean sub_e12(int var0, int var1, int var2, int var3) {
      boolean var8 = false;
      boolean var16 = false;
      int var5;
      int var6;
      int var10;
      int var17;
      if (var_dcb == null) {
         var_d50 = -1;
         var_d6b = -1;
         BinaryReader var15;
         if ((var15 = GameEngine.openDataStream(var0)) == null) {
            return false;
         }

         var_dcb = GameEngine.readBytes(var15, GameEngine.getStreamSize(var15));
         var15.buffer = null;
         var6 = 0;
         byte var4 = 0;
         var_e25 = 0;
         var10 = sub_2ad(var_dcb, 0);
         var17 = var4 + 4;
         var17 += 4;
         if (var10 != 1280920903) {
            var_dcb = null;
            return false;
         }

         ++var17;
         var5 = var_dcb[8] & 255;
         ++var17;
         var_c77 = var_dcb[9] & 255;
         if ((var5 & 1) != 0) {
            var_d50 = sub_2e5(var_dcb, 10);
            var17 += 2;
         }

         if ((var5 & 2) != 0) {
            var_d6b = var_dcb[var17++] & 255;
         }

         if (var_c77 == 0) {
            var_dcb = null;
            return false;
         }

         var_cd8 = new TileMap[var_c77 * 1];
         var_d07 = new Sprite[var_c77 * 2];
         var_cb6 = new int[var_c77 * 23];
      } else {
         var17 = var_e25 & '\uffff';
         var6 = var_e25 >> 16;
      }

      if ((var10 = sub_2ad(var_dcb, var17)) == 1162757152) {
         var_dcb = null;
         return false;
      } else {
         if (var10 == 1279351122) {
            int var12 = var17 + sub_2ad(var_dcb, var17 + 4);
            var17 += 8;
            byte[] var14 = null;
            var5 = var_dcb[var17++] & 255;
            short var7 = sub_2e5(var_dcb, var17);
            var17 += 2;
            var_cb6[var6 * 23 + 22] = var7 - 88;
            int var9;
            Sprite var13 = GameEngine.loadSpriteSet(var9 = var_dcb[var17++] & 255);
            byte[] var10000;
            if ((var5 & 1) == 0 && var2 == -1) {
               var_d07[var6 * 2] = var13;
               var10000 = GameEngine.getSpritePalette(var_d07[var6 * 2]);
            } else {
               int var18 = var2 != -1 ? var2 : sub_2e5(var_dcb, var17);
               if ((var5 & 1) != 0) {
                  var17 += 2;
               }

               var14 = sub_afd(var18);
               var_d07[var6 * 2] = GameEngine.recolorSprite(var13, var14, -1);
               var16 = true;
               var10000 = var14;
            }

            var_1129 = GameEngine.getPaletteColor(var10000, 0);
            var_cb6[var6 * 23 + 19] = sub_2e5(var_dcb, var17);
            var17 += 2;
            var_cb6[var6 * 23 + 20] = sub_2e5(var_dcb, var17);
            var17 += 2;
            var_cb6[var6 * 23 + 21] = var_dcb[var17++] & 255;
            if (!sub_e55(var6, var7, var_d07[var6 * 2])) {
               sub_c0e();
               var_dcb = null;
               return false;
            }

            if ((var_cb6[var6 * 23 + 0] & 2) != 0) {
               if (var14 == null) {
                  var14 = GameEngine.extractPaletteData(var13.var_3b);
               }

               var_d07[var6 * 2 + 1] = GameEngine.recolorSprite(var13, var14, var3);
            }

            if (var16) {
               GameEngine.freeSprite(var13);
            }

            var_cb6[var6 * 23 + 17] = var9;

            while(var17 < var12) {
               if (sub_2ad(var_dcb, var17) == 1515146821) {
                  var17 = sub_e9e(var6, var_dcb, var17);
               } else if (sub_2ad(var_dcb, var17) == 1346458696) {
                  var17 += sub_2ad(var_dcb, var17 + 4);
               } else {
                  var17 += sub_2ad(var_dcb, var17 + 4);
               }
            }

            ++var6;
         } else {
            var17 += sub_2ad(var_dcb, var17 + 4);
         }

         var_e25 = var6 << 16 | var17 & '\uffff';
         return true;
      }
   }

   private static boolean sub_e55(int var0, int var1, Sprite var2) {
      int var19 = var0 * 23;
      int var20 = var0 * 1;
      BinaryReader var21;
      byte[] var18 = GameEngine.readBytes(var21 = GameEngine.openDataStream(var1), GameEngine.getStreamSize(var21));
      var21.buffer = null;
      byte var9 = 0;
      if (sub_2ad(var18, 0) != 1347174745) {
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
         var_cb6[var19 + 18] = var17;
         if ((var13 & 1) != 0) {
            var7 = 1 << var7;
            var8 = 1 << var8;
         }

         var_cb6[var19 + 1] = var5;
         var_cb6[var19 + 2] = var6;
         var_cb6[var19 + 6] = var7;
         var_cb6[var19 + 7] = var8;
         var_cb6[var19 + 3] = var5 * var6;
         var_cb6[var19 + 4] = var5 * var7;
         var_cb6[var19 + 5] = var6 * var8;
         var_cb6[var19 + 14] = var2.var_8a[0].getWidth() / var7;
         var_cb6[var19 + 16] = 0;
         var_cb6[var19 + 10] = 0;
         var_cb6[var19 + 11] = 0;
         var_cd8[var20] = new TileMap(var5, var6, var2, var7, var8);
         boolean var12 = false;
         boolean var11 = false;
         int[] var10000;
         byte var23;
         byte var25;
         if ((var13 & 4) != 0) {
            var10000 = var_cb6;
            var10000[var19 + 0] |= 4;
            var23 = 4;
            var25 = 8;
         } else {
            var23 = 1;
            var25 = 2;
         }

         byte var24 = var25;
         if ((var13 & 2) != 0) {
            var10000 = var_cb6;
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

               GameEngine.setTile(var_cd8[var20], var3, var4, var10, var16, false);
            }
         }

         GameEngine.initBitReader((byte[])null);
         return true;
      }
   }

   private static int sub_e9e(int var0, byte[] var1, int var2) {
      if (sub_2ad(var1, var2) != 1515146821) {
         return var2;
      } else {
         var2 += 8;
         var_f77 = var1[var2++] & 255;
         if (var_f77 == 0) {
            return var2;
         } else {
            int[] var10000 = var_cb6;
            var10000[var0 * 23 + 0] |= 1;
            var_f81 = new short[var_f77 * 5];
            int var3 = 0;

            for(int var4 = 0; var3 < var_f77; var4 += 5) {
               var_f81[var4] = sub_2e5(var1, var2);
               var2 += 2;
               var_f81[var4 + 1] = (short)(sub_2e5(var1, var2) << 1);
               var2 += 2;
               var_f81[var4 + 2] = (short)(sub_2e5(var1, var2) << 1);
               var2 += 2;
               var_f81[var4 + 3] = (short)(var_f81[var4 + 1] + ((var1[var2++] & 255) << 1));
               var_f81[var4 + 4] = (short)(var_f81[var4 + 2] + ((var1[var2++] & 255) << 1));
               ++var3;
            }

            return var2;
         }
      }
   }

   static int sub_edd(int var0, int var1, int var2, int var3) {
      var0 >>= 8;
      var2 >>= 8;
      var1 >>= 8;
      var3 >>= 8;
      int var5 = 0;
      int var4 = 0;
      var_fd5 = -1;
      var_1013 = -1;
      var_1026 = -1;
      int var12 = 0;

      while(true) {
         while(var4 < var_f77) {
            int var11;
            if ((var11 = var_f81[var5] & '\ue000') != 0 && var11 != 8192 && var11 != 57344 && var11 != 32768) {
               int var10 = var_f81[var5++] & 8191;
               short var6 = var_f81[var5++];
               short var7 = var_f81[var5++];
               short var8 = var_f81[var5++];
               short var9 = var_f81[var5++];
               if (var2 >= var6 && var3 >= var7 && var0 <= var8 && var1 <= var9) {
                  label67: {
                     switch(var11) {
                     case 16384:
                        if (var_fd5 != -1 || (var10 & 4096) != 0) {
                           break label67;
                        }

                        var_fd5 = (var4 & '\uffff') << 16 | (var10 & '\uffff') << 0;
                        break;
                     case 24576:
                        if (var_1013 != -1) {
                           break label67;
                        }

                        var_1013 = var10;
                        break;
                     case 40960:
                        if (var_1026 == -1) {
                           var_1026 = var4 << 16 | var10 & '\uffff';
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

   static boolean sub_efa(int var0) {
      int var14 = 23 * var0;
      var_1064 = new byte[var_cb6[var14 + 3]];

      int var1;
      for(var1 = 0; var1 < var_1064.length; ++var1) {
         var_1064[var1] = 1;
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
               if (var1 >= var_f77) {
                  continue label98;
               }

               if ((var_f81[var2] & '\ue000') == var10) {
                  if (var9 == 2 && (var_f81[var2] & 4096) == 0 || var9 == 3 && (var_f81[var2] & 4096) == 0) {
                     var2 += 5;
                     ++var1;
                     continue;
                  }

                  if (var9 == 1) {
                     var11 = (var_f81[var2] & 1) == 0 ? 1 : 3;
                  }

                  int var12 = var_f81[var2++] & 8191;
                  if (var9 == 3) {
                     var12 = (var12 &= 4032) >> 6;
                     var11 = (var11 &= 3) | var12 << 2;
                  }

                  int var3 = var_f81[var2++] / var_cb6[var14 + 6];
                  int var4 = var_f81[var2++] / var_cb6[var14 + 7];
                  int var5 = (var_f81[var2++] + (var_cb6[var14 + 6] >> 1)) / var_cb6[var14 + 6];
                  int var6 = (var_f81[var2++] + (var_cb6[var14 + 7] >> 1)) / var_cb6[var14 + 7];
                  if (var3 > var_cb6[var14 + 1]) {
                     var3 = var_cb6[var14 + 1];
                  }

                  if (var5 > var_cb6[var14 + 1]) {
                     var5 = var_cb6[var14 + 1];
                  }

                  if (var4 > var_cb6[var14 + 2]) {
                     var4 = var_cb6[var14 + 2];
                  }

                  if (var6 > var_cb6[var14 + 2]) {
                     var6 = var_cb6[var14 + 2];
                  }

                  for(int var8 = var4; var8 < var6; ++var8) {
                     int var13 = var8 * var_cb6[var14 + 1];

                     for(int var7 = var3; var7 < var5; ++var7) {
                        var_1064[var13 + var7] = (byte)var11;
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

   static void sub_f4f(int var0, int var1, int var2, int var3, int var4, byte var5) {
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var10000;
      label63: {
         var15 = 23 * var0;
         int var9 = var_cb6[var15 + 6];
         int var10 = var_cb6[var15 + 7];
         var11 = (var1 >> 8) / var9;
         var12 = (var2 >> 8) / var10;
         var13 = ((var3 >> 8) + var9 - 1) / var9;
         var14 = ((var4 >> 8) + var10 - 1) / var10;
         if (var11 < 0) {
            var10000 = 0;
         } else {
            if (var11 <= var_cb6[var15 + 1]) {
               break label63;
            }

            var10000 = var_cb6[var15 + 1];
         }

         var11 = var10000;
      }

      label57: {
         if (var13 < 0) {
            var10000 = 0;
         } else {
            if (var13 <= var_cb6[var15 + 1]) {
               break label57;
            }

            var10000 = var_cb6[var15 + 1];
         }

         var13 = var10000;
      }

      label51: {
         if (var12 < 0) {
            var10000 = 0;
         } else {
            if (var12 <= var_cb6[var15 + 2]) {
               break label51;
            }

            var10000 = var_cb6[var15 + 2];
         }

         var12 = var10000;
      }

      label45: {
         if (var14 < 0) {
            var10000 = 0;
         } else {
            if (var14 <= var_cb6[var15 + 2]) {
               break label45;
            }

            var10000 = var_cb6[var15 + 2];
         }

         var14 = var10000;
      }

      for(int var7 = var12; var7 < var14; ++var7) {
         int var8 = var7 * var_cb6[var15 + 1];

         for(int var6 = var11; var6 < var13; ++var6) {
            var_1064[var8 + var6] = var5;
         }
      }

   }

   static void sub_f76(int var0, int var1, int var2, byte var3) {
      int var4 = 23 * var0;
      var1 = (var1 >> 8) / var_cb6[var4 + 6];
      var2 = (var2 >> 8) / var_cb6[var4 + 7];
      if (var1 >= 0 && var1 < var_cb6[var4 + 1] && var2 >= 0 && var2 < var_cb6[var4 + 2]) {
         var_1064[var2 * var_cb6[var4 + 1] + var1] = var3;
      }
   }

   static int sub_fa2(int var0, int var1, int var2) {
      int var3 = 23 * var0;
      var1 = (var1 >> 8) / var_cb6[var3 + 6];
      var2 = (var2 >> 8) / var_cb6[var3 + 7];
      return var1 >= 0 && var1 < var_cb6[var3 + 1] && var2 >= 0 && var2 < var_cb6[var3 + 2] ? var_1064[var2 * var_cb6[var3 + 1] + var1] & 3 : 1;
   }

   static int sub_fc6(int var0, int var1, int var2, boolean var3) {
      int var5 = -1;
      int var4 = 23 * var0;
      int var6 = var_cb6[var4 + 1];
      int var7 = var_cb6[var4 + 2];
      var1 = (var1 >> 8) / var_cb6[var4 + 6];
      if ((var2 = (var2 >> 8) / var_cb6[var4 + 7]) >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = var_1064[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 = -17;
      }

      --var2;
      if (var2 >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = var_1064[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 &= -2;
      }

      var2 += 2;
      if (var2 >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = var_1064[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 &= -5;
      }

      --var2;
      ++var1;
      if (var2 >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = var_1064[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 &= -3;
      }

      var1 -= 2;
      if (var2 >= 0 && var2 < var7 && var1 >= 0 && var1 < var6 && ((var4 = var_1064[var2 * var6 + var1] & 3) == 0 || var4 == 3 && var3)) {
         var5 &= -9;
      }

      return var5;
   }

   public static int sub_fdd(int var0, int[] var1, int var2, int var3, int var4, int var5) {
      int var10;
      int var10000;
      label75: {
         var10 = 23 * var0;
         var2 >>= 8;
         var4 >>= 8;
         var3 >>= 8;
         var5 >>= 8;
         var2 /= var_cb6[var10 + 6];
         var3 /= var_cb6[var10 + 7];
         var4 /= var_cb6[var10 + 6];
         var5 /= var_cb6[var10 + 7];
         if (var2 < 0) {
            var10000 = 0;
         } else {
            if (var2 < var_cb6[var10 + 1]) {
               break label75;
            }

            var10000 = var_cb6[var10 + 1] - 1;
         }

         var2 = var10000;
      }

      label69: {
         if (var4 < 0) {
            var10000 = 0;
         } else {
            if (var4 < var_cb6[var10 + 1]) {
               break label69;
            }

            var10000 = var_cb6[var10 + 1] - 1;
         }

         var4 = var10000;
      }

      label63: {
         if (var3 < 0) {
            var10000 = 0;
         } else {
            if (var3 < var_cb6[var10 + 2]) {
               break label63;
            }

            var10000 = var_cb6[var10 + 2] - 1;
         }

         var3 = var10000;
      }

      label57: {
         if (var5 < 0) {
            var10000 = 0;
         } else {
            if (var5 < var_cb6[var10 + 2]) {
               break label57;
            }

            var10000 = var_cb6[var10 + 2] - 1;
         }

         var5 = var10000;
      }

      int var11 = 0;

      for(int var7 = var3; var7 <= var5; ++var7) {
         for(int var6 = var2; var6 <= var4; ++var6) {
            int var9 = var7 * var_cb6[var10 + 1] + var6;
            int var8;
            if (((var8 = var_1064[var9] & 255) & 3) == 2) {
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
