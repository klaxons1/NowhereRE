import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

final class Class_201 {
   static int var_1c = -1;
   private static int var_3e = -1;
   private static int var_4e = 0;
   static Class_de var_9f;
   static Class_de var_b7;
   static Class_1ac var_111;
   static int var_11d;
   static Class_de var_15b;
   static Class_de var_204;
   static int[] var_228;
   static short[] var_240;
   static int var_26c;
   static char[] var_2f1 = null;
   static short[] var_307 = null;
   static int[] var_343;
   static int[] var_39b;
   static short[] var_3c4;
   static short[] var_412;
   static byte[] var_454;
   static byte[] var_49a;
   static byte[] var_4e8;
   static short[] var_534;
   static short[] var_57c;
   static byte[] var_5ab;
   static byte[] var_5fa;
   static byte[] var_607;
   static int var_61f;
   static char[] var_634;
   static int[] var_64b;
   static Class_1ac[] var_670;
   static Class_de[] var_686;
   static int[] var_6a4;
   static int[] var_6be;
   static int[] var_6d1;
   static short[] var_710;
   static short[] var_71a;
   static int[] var_72a;
   static int var_769;
   static byte[] var_788;
   static byte[] var_7d8;
   static int var_805;
   static int var_82a;
   static int var_835;
   static int var_881;
   static short[] var_89d;
   static short[] var_8c7;
   static int[] var_8e2;
   static int[] var_96c;
   static int[] var_9a9;
   static int var_9d8;
   static int var_a0a;
   static int var_a45;
   static Class_147 var_a69;
   static int[] var_aab;
   static int var_ac5;
   static int var_aed;
   static int var_b02;
   static Class_de[] var_b22;
   static int var_b72;
   static char[] var_bd6;
   static int[] var_c04;
   static int var_c45;
   static int var_c83;
   static int var_cba;
   static int var_ccb = 0;
   static int var_d14 = 0;
   static int var_d22;
   static int var_d55;
   static int var_d82;
   static int var_db7;
   static int var_dfb;
   static int var_e34;
   static int var_e42;
   static int var_e4f;
   static int var_eab;
   static int[] var_ec9;
   static Class_de var_f1b;
   static int var_f43;
   static int var_f6b;
   static int var_f7e;
   static int var_f8f;
   static byte[] var_fc7;
   static byte[] var_ff5;
   static byte[] var_102a;
   static int var_1068;
   static int var_109c;
   static int var_10ca;
   static int var_10d5;
   static int var_10f1;
   static int var_112a;
   static int var_113c;
   static int var_114a;
   static int var_119e;
   static int var_11c0;
   static int var_11d4;
   static int var_11ff;
   static int var_1250;
   static int var_129e;
   static String var_12dd = null;
   static int var_1311;

   static boolean sub_2f(int var0, int var1) {
      if (var0 != -1) {
         var_1c = var0;
         var_4e |= 1;
         Class_ec.var_18a = (var1 & 2) != 0;
         if ((var1 & 4) != 0) {
            var_3e = -1;
         }

         return true;
      } else {
         return false;
      }
   }

   static boolean sub_50() {
      if ((var_4e & 1) != 0 && var_1c != -1 && (!Class_ec.var_18a || var_1c != var_3e)) {
         var_4e &= -2;
         var_3e = var_1c;
         Class_ec.sub_41e();
         StringBuffer var0 = (new StringBuffer(4)).append("/m").append(var_3e);
         Class_ec.sub_3e6(Class_1d4.var_22, var0.toString());
         return true;
      } else {
         return false;
      }
   }

   static void sub_a7() {
      Class_ec.sub_41e();
      Class_ec.var_18a = false;
      var_3e = -1;
      var_1c = -1;
      var_4e &= -2;
   }

   static void sub_c0() {
      var_228 = new int[33];
      int var0 = Class_1d4.var_205 * 9;
      var_228[0] = var_307[var0 + 0];
      var_228[1] = var_307[var0 + 1];
      var_228[5] = var_307[var0 + 2];
      var_228[6] = var_307[var0 + 3];
      var_228[13] = var_307[var0 + 6];
      var_228[14] = var_307[var0 + 7];
      var_228[9] = var_307[var0 + 8];
      var_228[25] = var_307[var0 + 4];
      var_228[32] = 0;
      sub_2f(var_228[25], 2);
      int[] var10000;
      byte var10001;
      short var1;
      int var10002;
      if ((var1 = var_307[var0 + 5]) == 1) {
         var10000 = var_228;
         var10001 = 8;
         var10002 = 16777215;
      } else {
         if (var1 == 2) {
         }

         var10000 = var_228;
         var10001 = 8;
         var10002 = 0;
      }

      label52: {
         var10000[var10001] = var10002;
         switch(Class_1d4.var_205) {
         case 0:
         case 1:
            var_228[3] = 24;
            var_228[7] = 64;
            var10000 = var_228;
            var10001 = 4;
            var10002 = 5;
            break;
         case 2:
            var_eab = 8;
            var_228[3] = 272631552;
            var_228[4] = 3;
            String var3 = "02.00.00";
            var_2f1 = new char["02.00.00".length() + 1];

            int var2;
            for(var2 = 0; var2 < var3.length(); ++var2) {
               var_2f1[var2] = var3.charAt(var2);
            }

            var_2f1[var2] = 0;
            break label52;
         case 3:
            var_228[3] = 13312;
            var10000 = var_228;
            var10001 = 4;
            var10002 = 2;
            break;
         case 4:
            var_228[3] = 135168;
            var10000 = var_228;
            var10001 = 4;
            var10002 = 3;
            break;
         case 5:
            var_15b = Class_ec.sub_b1(46);
            var_204 = Class_ec.sub_b1(49);
            var_228[3] = 4265216;
            var_228[18] = 0;
            var_228[14] = 3;
            var_228[11] = sub_170f() ? 1 : 0;
            var_228[21] = 2;
            var_228[22] = 3;
            var_228[20] = Class_1d4.var_205 == 5 ? 11 : 9;
            break label52;
         case 6:
            var10000 = var_228;
            var10001 = 3;
            var10002 = 20480;
            break;
         case 7:
            var_228[3] = 12583936;
            var_228[4] = 4;
            var10000 = var_228;
            var10001 = 7;
            var10002 = 96;
            break;
         case 8:
            var10000 = var_228;
            var10001 = 3;
            var10002 = 21504;
            break;
         case 9:
            var10000 = var_228;
            var10001 = 3;
            var10002 = 2228224;
            break;
         case 10:
            var10000 = var_228;
            var10001 = 3;
            var10002 = 536891392;
            break;
         case 11:
            var_228[3] = 4265984;
            var10000 = var_228;
            var10001 = 4;
            var10002 = 1;
            break;
         case 12:
            var_228[3] = 1077936392;
            var_228[4] = 2;
            var_228[22] = 3;
            if (var_1311 == 2) {
               var_228[21] = 2;
               var10000 = var_228;
               var10001 = 20;
               var10002 = 10;
            } else {
               var_228[21] = 1;
               var10000 = var_228;
               var10001 = 20;
               var10002 = 11;
            }
            break;
         default:
            break label52;
         }

         var10000[var10001] = var10002;
      }

      sub_143();
   }

   static void sub_11c() {
      var_2f1 = null;
      Class_ec.sub_828(var_9f);
      Class_ec.sub_828(var_15b);
      Class_ec.sub_828(var_204);
      var_9f = null;
      var_15b = null;
      var_204 = null;
      Class_ec.sub_828(var_b7);
      var_b7 = null;
      if (var_111 != null) {
         var_111.sub_6f();
         var_111 = null;
         Class_17f.sub_9fa(var_11d, 3);
      }

      Class_17f.sub_c0e();
      var_228 = null;
      var_240 = null;
      Class_17f.sub_4d7();
   }

   private static void sub_143() {
      int var2 = Class_17f.sub_5a0(var_228[32]);
      int var3 = (Class_17f.var_dd - 108) / var2 - 1;
      if (var_228 != null) {
         if ((var_228[3] & 4096) != 0) {
            var_9f = Class_ec.sub_b1(52);
         }

         if ((var_228[3] & 8) != 0) {
            var_b7 = (var_228[3] & 1073741824) != 0 ? (Class_de)Class_ec.sub_2ae(Class_1d4.var_22, var_1311 == 2 ? "/WapLink1.png" : "/NoWapLink1.png", 2) : Class_ec.sub_b1(var_228[6]);
            if ((var_228[3] & 128) != 0) {
               var_228[10] = -var_b7.var_8a[0].getHeight();
            }

            if (var_228[19] == -1) {
               var_228[19] = Class_17f.var_dd - var_b7.var_8a[0].getHeight() >> 1;
            }
         }

         if (var_228[9] != 0) {
            Class_17f.sub_52a(var_228[9]);
         }

         if ((var_228[3] & 3072) != 0) {
            sub_2f5();
         }

         int[] var10000;
         label76: {
            byte var10001;
            int var10002;
            if ((var_228[3] & 8192) != 0) {
               var10000 = var_228;
               var10000[3] |= 65536;
               var_228[18] = 0;
               sub_26f();
               var_228[14] = var_240.length;
               if (var_228[14] > var3) {
                  var10000 = var_228;
                  var10001 = 17;
                  var10002 = 0;
               } else {
                  var10000 = var_228;
                  var10001 = 17;
                  var10002 = Class_17f.var_dd - var_228[14] * var2 >> 1;
               }

               var10000[var10001] = var10002;
               var_228[16] = 0;
               int var1 = 0;

               for(boolean var0 = false; var1 < var_240.length; ++var1) {
                  int var4;
                  if ((var4 = Class_17f.sub_5f5(var_228[32], var_240[var1] & 255)) > var_228[16]) {
                     var_228[16] = var4;
                  }
               }

               var10000 = var_228;
               var10001 = 16;
               var10002 = Class_17f.var_89 - var_228[16] >> 1;
            } else if ((var_228[3] & 16384) != 0) {
               var10000 = var_228;
               var10000[4] &= -2;
               var10000 = var_228;
               var10000[4] |= 2;
               var_228[14] = 1 + Class_17f.sub_657((Graphics)null, var_228[13], 0, 0, 11, Class_17f.var_89, 0, var_228[32]);
               if (var_228[14] > var3) {
                  var10000 = var_228;
                  var10001 = 17;
                  var10002 = 54;
               } else {
                  var10000 = var_228;
                  var10001 = 17;
                  var10002 = Class_17f.var_dd - (1 + var_228[14]) * var2 >> 1;
               }

               var10000[var10001] = var10002;
               var_228[18] = 0;
               var10000 = var_228;
               var10001 = 14;
               var10002 = 2;
            } else {
               if ((var_228[3] & 131072) == 0) {
                  break label76;
               }

               var_228[11] = (var_228[14] & 255) << 24 | (var3 & 255) << 16 | Class_17f.var_89;
               var_228[15] = 0;
               var_228[14] = Class_17f.sub_657((Graphics)null, var_228[13], 0, 0, 11, var_228[11], 0, var_228[32]);
               if (var_228[14] >= var3) {
                  var_228[17] = 54 + var2;
                  var10000 = var_228;
                  var10000[14] -= var3;
                  var10000 = var_228;
                  var10001 = 3;
                  var10002 = var10000[3] | 262144;
               } else {
                  var_228[17] = Class_17f.var_dd - (var_228[19] + var_228[14] * var2) >> 1;
                  var10000 = var_228;
                  var10001 = 14;
                  var10002 = 0;
               }
            }

            var10000[var10001] = var10002;
         }

         if (var_228[22] > 0) {
            sub_3f8(var_228[20], var_228[21]);
         }

         var10000 = var_228;
         var10000[3] |= 97;
         Class_17f.var_30f = 0;
         Class_1d4.var_278 &= -65;
      }
   }

   public static boolean sub_18b() {
      if (var_228 == null) {
         return false;
      } else {
         if ((Class_1d4.var_278 & 65536) != 0 && sub_2f(var_228[25], 6)) {
            Class_1d4.var_278 &= -65537;
         }

         if ((var_228[3] & 1) == 0) {
            return false;
         } else {
            sub_21b();
            if ((Class_1d4.var_278 & 1048576) != 0) {
               sub_11c();
               Class_1d4.var_278 |= 266;
               return true;
            } else {
               int var10002 = var_228[24]++;
               if ((var_228[3] & 134217728) != 0) {
                  sub_2f5();
                  return false;
               } else {
                  if ((var_228[3] & 268435456) != 0) {
                     sub_311();
                  }

                  int[] var10000;
                  if (var_228[7] > 0) {
                     var10002 = var_228[7]--;
                     if (var_228[7] <= 0) {
                        var_228[7] = 0;
                        if ((var_228[3] & 8388608) != 0) {
                           sub_302();
                        }

                        if ((var_228[3] & 16) != 0) {
                           var10000 = var_228;
                           var10000[3] |= 2;
                        }
                     }
                  }

                  if ((Class_1d4.var_278 & 64) != 0 && (var_228[3] & 6) != 0) {
                     Class_1d4.var_278 |= 10;
                     var10000 = var_228;
                     var10000[3] &= -2;
                     byte var10001;
                     if ((var_228[3] & 2) == 0 && var_228[1] != -1) {
                        var10000 = var_228;
                        var10001 = 1;
                     } else {
                        var10000 = var_228;
                        var10001 = 0;
                     }

                     Class_1d4.var_266 = var10000[var10001];
                     sub_11c();
                     if (Class_1d4.var_266 == -1) {
                        Class_1d4.var_278 |= 256;
                     }

                     return true;
                  } else {
                     return false;
                  }
               }
            }
         }
      }
   }

   public static void sub_1ba(Graphics var0) {
      if (var_228 != null && (var_228[3] & 1) != 0) {
         int var5 = Class_17f.sub_5a0(var_228[32]);
         Class_1d4.var_278 |= 64;
         int[] var10000;
         if ((var_228[3] & 64) != 0 && (var_228[3] & 32) != 0) {
            var0.setColor(var_228[8]);
            var0.fillRect(Class_17f.var_104, Class_17f.var_13c, Class_17f.var_89, Class_17f.var_dd);
            if ((var_228[3] & 512) == 0) {
               var10000 = var_228;
               var10000[3] &= -33;
            }
         }

         if ((var_228[3] & 262144) != 0) {
            if (var_228[15] > 0) {
               Class_17f.sub_645(var0, '²', Class_17f.var_89 - Class_17f.sub_645((Graphics)null, '²', 0, 0, var_228[32], -1), 54, var_228[32], -1);
            }

            if (var_228[15] < var_228[14]) {
               Class_17f.sub_645(var0, '°', Class_17f.var_89 - Class_17f.sub_645((Graphics)null, '°', 0, 0, var_228[32], -1), Class_17f.var_dd - Class_17f.sub_5a0(var_228[32]), var_228[32], -1);
            }
         }

         if ((var_228[3] & 4096) != 0) {
            if ((var_228[3] & 64) != 0) {
               if ((var_228[3] & 536870912) == 0) {
                  sub_3a2(var0, Class_17f.var_89, Class_17f.var_dd, false);
               }

               if (var_228[5] != -1) {
                  Class_17f.sub_657(var0, var_228[5], Class_17f.var_89 - Class_17f.sub_5f5(var_228[32], var_228[5]) + 10, (54 - var5 >> 1) + 1, 11, 0, 0, var_228[32]);
               }
            }

            if (var_228[22] > 0 && Class_1d4.var_205 != 12 && (var_228[22] - 1 & 2) != 0) {
               sub_439(var0);
            }
         }

         if ((var_228[3] & 64) != 0) {
            if ((var_228[3] & 1024) != 0) {
               sub_370(var0);
            }

            if ((var_228[3] & 8) != 0) {
               if ((var_228[3] & 128) != 0) {
                  if (var_228[10] < var_228[19]) {
                     var10000 = var_228;
                     var10000[10] += 4;
                  }

                  int var4 = var_b7.var_8a[0].getWidth();
                  var0.drawImage(var_b7.var_8a[0], Class_17f.var_104 + (Class_17f.var_89 - var4 >> 1), Class_17f.var_13c + var_228[10], 20);
               } else {
                  Class_17f.sub_3b(var0, var_b7, (byte)15);
               }

               if (var_228[22] > 0 && Class_1d4.var_205 == 12 && (var_228[22] - 1 & 2) != 0) {
                  if ((var_228[3] & 536870912) == 0) {
                     sub_3a2(var0, Class_17f.var_89, Class_17f.var_dd, true);
                  }

                  sub_439(var0);
               }
            }

            int var3;
            if ((var_228[3] & 8192) != 0) {
               boolean var2 = false;
               var3 = var_228[17] + -58;

               for(int var1 = 0; var1 < var_240.length; ++var1) {
                  if (var1 == var_228[18]) {
                     Class_ec.sub_58f(var0, var_9f, Class_17f.var_104 - 92 + var_228[16], Class_17f.var_13c + var3 - -13 + (var5 >> 1), 20, 0, 54, 108, 18, 0);
                  }

                  Class_17f.sub_657(var0, var_240[var1] & 255, var_228[16] + 0, var3 + 22, 0, 0, 0, var_228[32]);
                  var3 += var5 + 18;
               }
            } else if ((var_228[3] & 16384) != 0) {
               boolean var6 = false;
               var3 = var_228[17];
               var3 = Class_17f.sub_657(var0, var_228[13], Class_17f.var_89 >> 1, var3 - 28, 11, Class_17f.var_89, 0, var_228[32]);
               var3 += 18;
               int var7 = (Class_17f.var_89 - Class_17f.sub_5f5(var_228[32], 2)) / 2 - 23;
               Class_ec.sub_58f(var0, var_9f, Class_17f.var_104 + var7 - 0, Class_17f.var_13c + var3 + 0 + (var_228[18] == 0 ? 0 : 1) * (var5 + 18), 20, 108, 54, 18, 18, 0);
               var7 += 23;
               Class_17f.sub_657(var0, 1, var7, var3, 0, 0, 0, var_228[32]);
               var3 += var5 + 18;
               Class_17f.sub_657(var0, 2, var7, var3, 0, 0, 0, var_228[32]);
            } else if ((var_228[3] & 131072) != 0) {
               var_228[23] = Class_17f.sub_657(var0, var_228[13], Class_17f.var_89 >> 1, var_228[17], 11, var_228[11], var_228[15], var_228[32]);
            }

            if ((var_228[3] & 2048) != 0) {
               sub_370(var0);
            }

            if ((var_228[3] & 256) == 0) {
               var10000 = var_228;
               var10000[3] &= -65;
            }

            if ((var_228[3] & 2097152) != 0) {
               var10000 = var_228;
               var10000[3] |= 2;
            }

         }
      }
   }

   private static void sub_21b() {
      if (Class_17f.var_33f) {
         Class_17f.var_33f = false;
         if (var_228 != null && (var_228[3] & 1) != 0) {
            if ((var_228[3] & 4194304) == 0 || !sub_32f(Class_17f.var_363)) {
               int[] var10000;
               if (Class_17f.var_363 == 42) {
                  if ((var_228[3] & 1572864) == 0 && (var_228[4] & 2) == 0) {
                     if ((var_228[4] & 4) != 0) {
                        var10000 = var_228;
                        var10000[3] |= 2;
                     }
                  } else {
                     var10000 = var_228;
                     var10000[3] |= 4;
                  }
               } else {
                  int var10002;
                  if (Class_17f.var_30f == 2) {
                     if ((var_228[3] & 65536) != 0) {
                        var10002 = var_228[18]--;
                        if (var_228[18] < 0) {
                           var_228[18] = var_228[14] - 1;
                        }
                     } else if ((var_228[3] & 262144) != 0) {
                        if (var_228[15] > 0) {
                           var10002 = var_228[15]--;
                        }
                     } else if ((var_228[3] & 16384) != 0) {
                        var_228[18] = 0;
                     }
                  } else if (Class_17f.var_30f == 4) {
                     if ((var_228[3] & 65536) != 0) {
                        var10002 = var_228[18]++;
                        if (var_228[18] >= var_228[14]) {
                           var_228[18] = 0;
                        }
                     } else if ((var_228[3] & 262144) != 0) {
                        if (var_228[15] < var_228[14]) {
                           var10002 = var_228[15]++;
                        }
                     } else if ((var_228[3] & 16384) != 0) {
                        var_228[18] = 1;
                     }
                  } else if (Class_17f.var_30f == 1 && (var_228[3] & 524288) == 0) {
                     if ((var_228[4] & 1) != 0) {
                        var10000 = var_228;
                        var10000[3] |= 2;
                     } else if ((var_228[3] & 8192) != 0) {
                        var_228[0] = var_240[var_228[18]] >> 8;
                        var10000 = var_228;
                        var10000[3] |= 2;
                     } else if ((var_228[3] & 81920) != 0) {
                        sub_2c2();
                     }
                  }
               }

               var10000 = var_228;
               var10000[3] |= 96;
            }
         }
      }
   }

   private static void sub_26f() {
      byte var0 = 0;
      boolean var1 = var_1311 != 0;
      if (Class_1d4.var_205 == 3) {
         var_240 = new short[5];
         int var2 = var0 + 1;
         var_240[0] = 1284;
         if (var1) {
            ++var2;
            var_240[1] = 3081;
         }

         var_240[var2++] = 1029;
         var_240[var2] = 2822;
         if (!var1) {
            var_240[3] = 1799;
         }

         var_240[4] = 2056;
      }

   }

   private static void sub_2c2() {
      int[] var10000;
      byte var10001;
      int var10002;
      byte var10003;
      label52: {
         label51: {
            switch(Class_1d4.var_205) {
            case 5:
               label46: {
                  var_10ca = var_228[18];
                  byte var0;
                  int var1;
                  if ((sub_179c(var_10ca, 0, 8) & 1) == 0) {
                     var0 = 0;
                     var1 = 0;
                  } else {
                     sub_1757(var_10ca, 0);
                     if (var_ff5[32] == 0) {
                        break label46;
                     }

                     var0 = var_ff5[31];
                     var1 = Class_17f.sub_2ad(var_ff5, 27);
                  }

                  sub_1994(var0, var1);
                  sub_1757(var_10ca, 1);
                  sub_17b7();
               }

               sub_ea2();
               var_228[11] = sub_170f() ? 1 : 0;
               var_228[0] = 9;
               break;
            case 6:
            case 8:
            case 10:
               if (var_228[18] == 0) {
                  if (Class_1d4.var_205 == 6) {
                     sub_17a9(var_26c, 0, 0, 8);
                     sub_17b7();
                     var_228[0] = 5;
                  } else if (Class_1d4.var_205 == 10) {
                     Class_ec.sub_38b(false);
                     Class_1d4.sub_125(true);
                  }

                  var10000 = var_228;
                  break label51;
               }

               if (Class_1d4.var_205 != 10) {
                  if (var_228[1] == -1) {
                     return;
                  }

                  var10000 = var_228;
                  var10001 = 3;
                  var10002 = var10000[3];
                  var10003 = 4;
                  break label52;
               }

               Class_ec.sub_38b(true);
               break;
            case 7:
            case 9:
            default:
               return;
            }

            var10000 = var_228;
         }

         var10001 = 3;
         var10002 = var10000[3];
         var10003 = 2;
      }

      var10000[var10001] = var10002 | var10003;
   }

   private static void sub_2f5() {
      switch(Class_1d4.var_205) {
      case 2:
         var_9f = Class_ec.sub_b1(48);
         var_228[19] = Class_17f.var_dd * 24 / 320;
         var_111 = new Class_1ac();
         var_11d = Class_17f.sub_97a(24, -1, 3);
         var_111.var_11 = (byte[])Class_17f.sub_9d4(var_11d);
         var_111.sub_292(0);
         Class_17f.sub_e12(160, -1, -1, -1);
         Class_17f.sub_c18(0, 0, Class_17f.var_89, Class_17f.var_dd);
         Class_17f.sub_c7b(0, Class_17f.var_89, Class_17f.var_dd, false);
         Class_ec.sub_6fd(Class_17f.var_cd8[0], Class_17f.var_104, Class_17f.var_13c);
         var_228[11] = Class_17f.var_cb6[4] - Class_17f.var_89 >> 1;
         var_228[12] = Class_17f.var_cb6[5] - Class_17f.var_dd;
         if (var_228[12] < 0) {
            var_228[12] = 0;
         }

         Class_17f.sub_ccb(0, var_228[11], var_228[12], true, false);
         return;
      case 3:
         Class_17f.sub_e12(157, -1, -1, -1);
         Class_17f.sub_c18(0, 0, Class_17f.var_89, Class_17f.var_dd);
         Class_17f.sub_c7b(0, Class_17f.var_cb6[4], Class_17f.var_cb6[5], true);
         Class_17f.sub_ccb(0, 0, 0, true, false);
         return;
      case 5:
         Class_17f.sub_e12(159, -1, -1, -1);
         Class_17f.sub_c18(0, 0, Class_17f.var_89, Class_17f.var_dd);
         Class_17f.sub_c7b(0, Class_17f.var_cb6[4], Class_17f.var_cb6[5], true);
         Class_17f.sub_ccb(0, 0, 0, true, false);
         return;
      case 7:
         var_228[14] = Class_17f.var_543.length;
         var_228[15] = 0;
         Class_17f.sub_738(0, 0, 0, Class_1d4.var_22.getAppProperty("MIDlet-Version").toCharArray(), 0, Class_1d4.var_22.getAppProperty("MIDlet-Version").toCharArray().length);
         return;
      case 8:
         Class_17f.sub_e12(158, -1, -1, -1);
         Class_17f.sub_c18(0, 0, Class_17f.var_89, Class_17f.var_dd);
         Class_17f.sub_c7b(0, Class_17f.var_cb6[4], Class_17f.var_cb6[5], true);
         Class_17f.sub_ccb(0, 0, 0, true, false);
         return;
      case 11:
         var_240 = new short[2];
         var_240[0] = 3;
         var_240[1] = 4;
         var_228[14] = var_240.length;
      case 4:
      case 6:
      case 9:
      case 10:
      default:
      }
   }

   private static void sub_302() {
      int[] var10000;
      byte var10001;
      int var10002;
      if (Class_1d4.var_205 == 7) {
         var10000 = var_228;
         var10000[3] |= 96;
         var_228[7] = 96;
         var10000 = var_228;
         var10000[15] += 4;
         if (var_228[15] < var_228[14]) {
            return;
         }

         var10000 = var_228;
         var10001 = 3;
         var10002 = var10000[3] | 2;
      } else {
         if (Class_1d4.var_205 != 2) {
            return;
         }

         var10000 = var_228;
         var10001 = 3;
         var10002 = var10000[3] & -16777217;
      }

      var10000[var10001] = var10002;
   }

   private static void sub_311() {
      if (Class_1d4.var_205 == 2) {
         Class_17f.sub_ccb(0, var_228[11], var_228[12], true, false);
      }

   }

   private static boolean sub_32f(int var0) {
      int[] var10000;
      if (Class_1d4.var_205 == 5) {
         if (var0 == 48) {
            if (var_228[11] != 0 && (sub_179c(var_228[18], 0, 8) & 1) != 0) {
               var_26c = var_228[18];
               var_228[0] = 6;
               var10000 = var_228;
               var10000[3] |= 2;
            }
         } else if (Class_1d4.var_205 == 5 && var0 == 42) {
            var10000 = var_228;
            var10000[3] |= 4;
         }
      } else if (Class_1d4.var_205 == 7) {
         if (var0 == 8 || var0 == 53) {
            var10000 = var_228;
            var10000[3] |= 2;
         }
      } else if (Class_1d4.var_205 == 2) {
         if (var0 == 35) {
            var10000 = var_228;
            var10000[3] |= 25165824;
            var_228[7] = 96;
         }
      } else if (Class_1d4.var_205 == 12) {
         if (var0 == 8 && var_1311 == 2) {
            Class_1d4.var_266 = -1;
            Class_1d4.var_278 |= 1048576;
            return true;
         }
      } else if (Class_1d4.var_205 == 11) {
         if (var0 != 42 && var0 != 53) {
            if ((Class_17f.var_30f & 24) != 0) {
               switch(var_240[var_228[18]] & 255) {
               case 3:
                  if (!Class_ec.sub_37d()) {
                     sub_2f(var_228[25], 6);
                  }
                  break;
               case 4:
                  var_129e ^= 1;
               }
            }
         } else {
            sub_17b7();
         }
      }

      return false;
   }

   private static void sub_370(Graphics var0) {
      int var1;
      int var2;
      int var3;
      int var5;
      int var6;
      switch(Class_1d4.var_205) {
      case 2:
         Class_17f.sub_cf9(0, var0, 0, Class_17f.var_dd - Class_17f.var_cb6[5], false);
         var6 = Class_17f.sub_5a0(var_228[32]);
         sub_161f(var0, 0);
         var_111.sub_2ce(var0, Class_17f.var_89 >> 1, (Class_17f.var_dd >> 1) + -20);
         var_111.sub_315();
         var1 = var_9f.var_8a[0].getWidth();
         var2 = Class_17f.var_dd - var6;
         var0.drawImage(var_9f.var_8a[0], Class_17f.var_104 + (Class_17f.var_89 - var1 >> 1), Class_17f.var_13c + var2 - 4, 20);
         var2 = Class_17f.var_dd - var6;
         if ((var_228[3] & 16777216) != 0 && var_2f1 != null) {
            char[] var11 = Class_17f.var_51a;
            Class_17f.var_51a = var_2f1;
            Class_17f.sub_546();
            Class_17f.sub_657(var0, 0, Class_17f.var_89 >> 1, var2 - 24, 11, Class_17f.var_89, 0, var_228[32]);
            Class_17f.var_51a = var11;
            Class_17f.sub_546();
            return;
         }

         Class_17f.sub_657(var0, 12, Class_17f.var_89 >> 1, var2 - 24, 11, Class_17f.var_89, 0, var_228[32]);
         return;
      case 3:
         var1 = Class_17f.var_89 - Class_17f.var_cb6[4] >> 1;
         var2 = Class_17f.var_dd - Class_17f.var_cb6[5] >> 1;
         Class_17f.sub_cf9(0, var0, var1, var2, false);
         return;
      case 4:
      case 6:
      case 9:
      case 10:
      default:
         break;
      case 5:
         var1 = Class_17f.var_89 - Class_17f.var_cb6[4] >> 1;
         var2 = Class_17f.var_dd - Class_17f.var_cb6[5] >> 1;
         Class_17f.sub_cf9(0, var0, var1, var2, false);

         for(var5 = 0; var5 < 3; ++var5) {
            if (var5 == var_228[18]) {
               Class_ec.sub_58f(var0, var_9f, Class_17f.var_104 + var1 - 24, Class_17f.var_13c + var2, 20, 0, 54, 108, 18, 0);
            }

            if (var_228[11] != 0 && (sub_179c(var5, 0, 8) & 1) != 0) {
               var0.setColor(5046272);
               if ((sub_179c(var5, 31, 8) & 255 & 2) == 0) {
                  var0.drawRect(Class_17f.var_104 + var1 + 184, Class_17f.var_13c + var2 + 0 + 1, 15, 15);
               } else {
                  var0.drawImage(var_15b.var_8a[0], Class_17f.var_104 + var1 + 184 - 1, Class_17f.var_13c + var2 + 0, 20);
               }

               if ((sub_179c(var5, 31, 8) & 255 & 4) == 0) {
                  var0.drawRect(Class_17f.var_104 + var1 + 184 + 18, Class_17f.var_13c + var2 + 0 + 1, 15, 15);
               } else {
                  var0.drawImage(var_204.var_8a[0], Class_17f.var_104 + var1 + 184 + 18 - 1, Class_17f.var_13c + var2 + 0, 20);
               }

               var0.setColor(16711680);
               var0.drawLine(Class_17f.var_104 + Class_17f.var_89 >> 1, Class_17f.var_13c + var2 + 18, Class_17f.var_104 + Class_17f.var_89 >> 1, Class_17f.var_13c + var2 + 6 + 18);
               var0.drawLine(Class_17f.var_104 + Class_17f.var_89 >> 1, Class_17f.var_13c + var2 + 6 + 18, (Class_17f.var_104 + Class_17f.var_89 >> 1) + 30, Class_17f.var_13c + var2 + 6 + 18);
               int var7 = ((sub_179c(var5, 30, 8) & 255) << 24) + ((sub_179c(var5, 29, 8) & 255) << 16) + ((sub_179c(var5, 28, 8) & 255) << 8) + (sub_179c(var5, 27, 8) & 255);
               sub_ddf(var0, var7, var1 + 72, var2 + 0, true, true, false, false);
               var3 = Class_17f.sub_6de(var0, (sub_179c(var5, 4, 8) & 255) * 100 / 199, var1 + 144, var2 + 18, 0, 14, var_228[32]);
               Class_17f.sub_657(var0, 8, var3, var2 + 18, 65536, 0, 0, var_228[32]);
            } else {
               Class_17f.sub_657(var0, 5, var1 + 66 + (66 - Class_17f.sub_5f5(var_228[32], 5) >> 1), var2 + 0, 0, 0, 0, var_228[32]);
            }

            var2 += 36;
         }

         return;
      case 7:
         var6 = Class_17f.sub_5a0(var_228[32]);
         var2 = Class_17f.var_dd - 4 * var6 >> 1;

         for(var5 = 0; var_228[15] + var5 < Class_17f.var_543.length && var5 < 4; var2 += var6) {
            Class_17f.sub_657(var0, var_228[15] + var5, Class_17f.var_89 >> 1, var2, 11, 0, 0, var_228[32]);
            ++var5;
         }

         return;
      case 8:
         var1 = Class_17f.var_89 - Class_17f.var_cb6[4] >> 1;
         var2 = Class_17f.var_dd - Class_17f.var_cb6[5] >> 1;
         Class_17f.sub_cf9(0, var0, var1, var2, false);
         return;
      case 11:
         int var8 = Class_17f.sub_5f5(var_228[32], 1);
         var3 = Class_17f.sub_5f5(var_228[32], 2);
         var5 = 0;

         int var4;
         int var9;
         for(var4 = 0; var5 < var_240.length; ++var5) {
            if ((var9 = Class_17f.sub_5f5(var_228[32], var_240[var5])) > var4) {
               var4 = var9;
            }
         }

         var9 = var4 + Math.max(var8, var3) + Class_17f.sub_645((Graphics)null, '³', 0, 0, var_228[32], -1) * 2 + 10 + 12;
         var8 = Class_17f.var_89 - var9 >> 1;
         var2 = 54 + (Class_17f.var_dd - 108 - var_240.length * 15 >> 1);
         var5 = 0;

         for(int var10 = 0; var5 < var_240.length; var2 += 15) {
            Class_17f.sub_657(var0, var_240[var5], var8, var2, 0, 0, 0, var_228[32]);
            var1 = var8 + var4 + 10;
            var1 = Class_17f.sub_645(var_228[18] == var5 ? var0 : null, '³', var1, var2, var_228[32], -1);
            var1 += 4;
            switch(var_240[var5]) {
            case 3:
               var10 = !Class_ec.sub_31a() ? 1 : 2;
               break;
            case 4:
               var10 = (var_129e & 1) != 0 ? 1 : 2;
            }

            var1 = Class_17f.sub_657(var0, var10, var1, var2, 65536, 0, 0, var_228[32]);
            var1 += 4;
            Class_17f.sub_645(var_228[18] == var5 ? var0 : null, '±', var1, var2, var_228[32], -1);
            ++var5;
         }
      }

   }

   private static void sub_3a2(Graphics var0, int var1, int var2, boolean var3) {
      if (var_9f != null) {
         if (var3) {
            int var6 = (var1 + 18 - 1) / 18;
            int var5 = 0;

            for(int var4 = 0; var4 < var6; var5 += 18) {
               Class_ec.sub_58f(var0, var_9f, Class_17f.var_104 + var5, Class_17f.var_13c + var2 - 54, 20, 252, 0, 18, 54, 1);
               ++var4;
            }
         } else {
            Class_ec.sub_58f(var0, var_9f, Class_17f.var_104 + var1 - 252, Class_17f.var_13c, 20, 0, 0, 252, 54, 0);
         }

      }
   }

   private static void sub_3f8(int var0, int var1) {
      var_228[29] = (var1 & '\uffff') << 16 | var0 & '\uffff';
      var_228[28] = 0;
      var_228[26] = Class_17f.var_89 << 8;
      var_228[27] = -Class_17f.sub_5f5(var_228[32], var0 + var_228[28]) << 8;
   }

   private static boolean sub_439(Graphics var0) {
      int[] var10000 = var_228;
      var10000[3] |= 96;
      boolean var4 = false;
      int var3 = var_228[29] >> 16;
      int var2 = Class_17f.var_dd - 24;
      var10000 = var_228;
      var10000[26] -= 1024;
      if (var_228[26] < var_228[27]) {
         var4 = true;
         int var10002 = var_228[28]++;
         if (var_228[28] >= var3) {
            var_228[28] = 0;
         }

         var_228[26] = Class_17f.var_89 << 8;
         var_228[27] = -Class_17f.sub_5f5(var_228[32], (var_228[29] & '\uffff') + var_228[28]) << 8;
      }

      int var1 = var_228[26] >> 8;
      Class_17f.sub_657(var0, var_228[28] + (var_228[29] & '\uffff'), var1, var2, 0, 0, 0, var_228[32]);
      return var4;
   }

   private static void sub_49a(int var0) {
      var_61f = var0;
   }

   private static void sub_4d1() {
      switch(var_61f) {
      case 0:
         sub_54c();
         sub_644();
         sub_d16();
         break;
      case 1:
         sub_ca3();
         sub_524();
         break;
      case 2:
         sub_668(false, false, true);
         sub_668(false, false, false);
         sub_7c9();
         break;
      case 3:
         var_7d8 = null;
         sub_e06();
      }

      ++var_61f;
   }

   private static void sub_524() {
      sub_6a3();

      int var0;
      for(var0 = 0; var0 < 16; ++var0) {
         var_670[1 + var0] = new Class_1c2(1 + var0);
      }

      for(var0 = 0; var0 < var_788.length; ++var0) {
         var_788[var0] = -1;
      }

      var_7d8 = new byte[35];

      for(var0 = 0; var0 < var_7d8.length; ++var0) {
         var_7d8[var0] = -1;
      }

      var_835 = 0;
      var_805 = 0;
      var_82a = -1;
      var_881 = 0;
   }

   private static void sub_54c() {
      var_686 = new Class_de[3];
      var_6a4 = new int[4];
      var_6be = new int[16];
      var_670 = new Class_1ac[17];
      var_6d1 = new int[35];
      var_788 = new byte[13];
      sub_55e();
      sub_9ae(30);
   }

   private static void sub_55e() {
      int var0;
      if (var_686 != null) {
         for(var0 = 0; var0 < var_686.length; ++var0) {
            Class_ec.sub_828(var_686[var0]);
            var_686[var0] = null;
         }
      }

      if (var_6a4 != null) {
         for(var0 = 0; var0 < var_6a4.length; ++var0) {
            var_6a4[var0] = 0;
         }
      }

      if (var_6be != null) {
         for(var0 = 0; var0 < var_6be.length; ++var0) {
            var_6be[var0] = 0;
         }
      }

      if (var_6d1 != null) {
         for(var0 = 0; var0 < var_6d1.length; ++var0) {
            var_6d1[var0] = -1;
         }
      }

   }

   private static void sub_5b5() {
      sub_9d1();
      if (var_670 != null) {
         for(int var0 = 0; var0 < var_670.length; ++var0) {
            if (var_670[var0] != null) {
               var_670[var0].sub_2a();
               var_670[var0] = null;
            }
         }

         sub_55e();
      }

      var_670 = null;
      var_686 = null;
      var_6a4 = null;
      var_6be = null;
      var_6d1 = null;
      var_788 = null;
   }

   private static void sub_5e1() {
      var_343 = Class_17f.sub_ac4(440);
      var_39b = Class_17f.sub_ac4(447);
      var_3c4 = Class_17f.sub_aaf(444);
      var_412 = Class_17f.sub_aaf(448);
      var_454 = Class_17f.sub_a5d(449);
      var_49a = Class_17f.sub_a5d(439);
      var_4e8 = Class_17f.sub_a5d(446);
      var_534 = Class_17f.sub_aaf(442);
      var_57c = Class_17f.sub_aaf(441);
      var_5fa = Class_17f.sub_a5d(438);
      var_607 = Class_17f.sub_a5d(450);
      var_307 = Class_17f.sub_aaf(445);
      var_5ab = Class_17f.sub_a5d(443);
      Class_17f.sub_52a(263);
      var_634 = Class_17f.var_51a;
      var_64b = Class_17f.var_543;
   }

   private static void sub_5fd() {
      var_343 = null;
      var_39b = null;
      var_3c4 = null;
      var_412 = null;
      var_454 = null;
      var_49a = null;
      var_4e8 = null;
      var_5ab = null;
      var_534 = null;
      var_57c = null;
      var_5fa = null;
      var_607 = null;
      var_307 = null;
      var_634 = null;
      var_64b = null;
   }

   private static void sub_644() {
      var_686[0] = Class_ec.sub_b1(82);
      var_686[1] = Class_ec.sub_b1(81);
      var_686[2] = Class_ec.sub_b1(40);
      int var1 = 0;

      for(int var0 = 0; var0 < 4; ++var0) {
         var_6d1[var0] = Class_17f.sub_97a(var_3c4[var1 + 0], var_3c4[var1 + 1], 3);
         var1 += 2;
      }

   }

   private static void sub_668(boolean var0, boolean var1, boolean var2) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var7 = false;
      int var9 = -1;
      boolean var10 = false;
      if (!var0) {
         var_835 = 0;
         var_805 = 0;
         var_82a = -1;
         var_881 = 0;

         for(int var3 = 0; var3 < var_7d8.length; ++var3) {
            var_7d8[var3] = -1;
         }
      }

      int var8 = Class_17f.var_f77 * 5;

      while(true) {
         while(var_835 < var8) {
            int var6;
            if ((var6 = Class_17f.var_f81[var_835] & '\ue000') != 32768 && (var6 != 49152 || (Class_17f.var_f81[var_835] & 4096) != 0)) {
               var_835 += 5;
            } else {
               boolean var11;
               short var14;
               int var16;
               byte var17;
               label79: {
                  boolean var10000;
                  label78: {
                     var11 = false;
                     if (var6 == 32768) {
                        var17 = 1;
                        if ((var16 = ((var14 = Class_17f.var_f81[var_835]) & 8160) >> 5) != 17) {
                           if ((var_343[var16 * 5 + 4] & 1) == 0 && !var1) {
                              var17 = 1;
                              if (sub_1539(1, var16) >= 0) {
                                 var16 = sub_1539(1, var16);
                              }
                           } else {
                              var17 = 2;
                           }

                           var9 = (var14 & 31) >> 0;
                           var9 = sub_18c9(sub_1914(6) - 153, var9);
                           if ((var_343[var16 * 5 + 4] & 2) != 0) {
                              var_9d8 |= 2048;
                           }

                           if (!Class_17f.sub_39b(var_ff5, var9, 0, 1, var_10f1)) {
                              break label79;
                           }

                           if ((var_9d8 & 2048) != 0) {
                              var_9d8 |= 4096;
                           }

                           var10000 = true;
                           break label78;
                        }
                     } else {
                        var17 = 3;
                        var16 = ((var14 = Class_17f.var_f81[var_835]) & 4032) >> 6;
                        if ((var_39b[var16 * 2 + 0] & 16384) != 0) {
                           var11 = true;
                        }

                        var9 = (var14 & 63) >> 0;
                        var9 = sub_1890(sub_1914(6) - 153, var9);
                        if (!Class_17f.sub_39b(var_ff5, var9, 0, 1, 33)) {
                           break label79;
                        }
                     }

                     var10000 = true;
                  }

                  var11 = var10000;
               }

               if (var11) {
                  var_835 += 5;
               } else {
                  ++var_835;
                  short var12 = Class_17f.var_f81[var_835++];
                  ++var_835;
                  int var13 = var12 + Class_17f.var_f81[var_835++];
                  var14 = Class_17f.var_f81[var_835++];
                  var13 >>= 1;
                  int var15 = var14 - 1;
                  if (sub_68a(var17, var16, var13, var15, true, var9, var2) && var0) {
                     --var_61f;
                     return;
                  }

                  if (var_82a != -1) {
                     if (sub_68a(1, var_82a, 0, 0, false, var9, var2) && var0) {
                        var_82a = -1;
                        --var_61f;
                        return;
                     }

                     var_82a = -1;
                  }
               }
            }
         }

         return;
      }
   }

   private static boolean sub_68a(int var0, int var1, int var2, int var3, boolean var4, int var5, boolean var6) {
      boolean var9 = false;
      boolean var10 = false;
      boolean var13 = false;
      byte[] var10000;
      int var10001;
      byte var10002;
      if (var0 != 1 && var0 != 2) {
         var10000 = var_4e8;
         var10001 = var1;
         var10002 = 5;
      } else {
         var10000 = var_49a;
         var10001 = var1;
         var10002 = 17;
      }

      int var15 = var10000[var10001 * var10002 + 0] & 255;
      int var7 = var_7d8[var15];
      if (var0 == 1) {
         var_82a = var_49a[var1 * 17 + 13];
         if (var_82a != -1) {
            var_82a &= 255;
         }
      }

      if (var7 == -1 && var_805 < 13) {
         var_788[var_805] = (byte)var15;
         if (!var6) {
            short var14 = var_3c4[var15 * 2 + 1];
            short var12 = var_3c4[var15 * 2 + 0];
            var_6d1[var15] = Class_17f.sub_97a(var12, var14, 3);
         }

         var_7d8[var15] = (byte)var_805;
         var7 = var_805++;
         var13 = true;
      }

      if (var4) {
         int var8 = 0;
         if (var0 == 1) {
            var8 = 1 * (var_49a[var1 * 17 + 5] & 255) * ((var_ff5[31] & 4) != 0 ? 2 : 1);
            sub_1409(1, (Class_1c2)null);
         }

         var_89d[var_881] = (short)var2;
         var_8c7[var_881] = (short)var3;
         var_8e2[var_881] = (var7 & 255) << 24 | (var0 & 255) << 16 | (var1 & 255) << 8 | 0;
         var_96c[var_881] = var8 << 16 | (var5 & 255) << 8 | 0;
         var_9a9[var_881] = var5;
         ++var_881;
      }

      return var13;
   }

   private static void sub_6a3() {
      int var2 = 0;
      int var1 = 0;

      int var0;
      for(var0 = 0; var0 < Class_17f.var_f77; ++var0) {
         int var3;
         if ((var3 = Class_17f.var_f81[var1] & '\ue000') == 32768 || var3 == 49152 && (Class_17f.var_f81[var1] & 4096) == 0) {
            ++var2;
         }

         var1 += 5;
      }

      var_8e2 = new int[var2];
      var_96c = new int[var2];
      var_9a9 = new int[var2];
      var_89d = new short[var2];
      var_8c7 = new short[var2];

      for(var0 = 0; var0 < var2; ++var0) {
         var_8e2[var0] = 1;
      }

   }

   static void sub_6f3(Class_1c2 var0) {
      if (var0.var_9dd != -1) {
         int[] var10000 = var_8e2;
         int var10001 = var0.var_9dd;
         var10000[var10001] |= 1;
      }

   }

   static void sub_707() {
      int var10 = Class_17f.var_cb6[10];
      int var11 = Class_17f.var_cb6[11];
      int var12 = var10 + Class_17f.var_cb6[12];
      int var13 = var11 + Class_17f.var_cb6[13];

      int var1;
      int[] var10000;
      for(var1 = 0; var1 < var_8e2.length; ++var1) {
         var10000 = var_8e2;
         var10000[var1] &= -5;
      }

      boolean var9 = false;
      int var2 = 0;
      int var0 = 0;

      for(var_881 = 0; var0 < Class_17f.var_f77; ++var0) {
         if ((Class_17f.var_f81[var2] & '\ue000') == 0) {
            ++var2;
            short var3 = Class_17f.var_f81[var2++];
            short var4 = Class_17f.var_f81[var2++];
            short var5 = Class_17f.var_f81[var2++];
            short var6 = Class_17f.var_f81[var2++];
            if (var12 >= var3 && var13 >= var4 && var10 <= var5 && var11 <= var6) {
               for(var1 = 0; var1 < var_8e2.length; ++var1) {
                  if ((var_8e2[var1] & 5) == 0 && var_89d[var1] >= var3 && var_89d[var1] <= var5 && var_8c7[var1] >= var4 && var_8c7[var1] <= var6) {
                     var10000 = var_8e2;
                     var10000[var1] |= 4;
                  }
               }
            }
         } else {
            var2 += 5;
         }
      }

      Class_1c2 var14;
      for(var1 = 0; var1 < var_8e2.length; ++var1) {
         if ((var_8e2[var1] & 1) == 0 && (var_8e2[var1] & 2) != 0 && (var_8e2[var1] & 4) == 0) {
            var2 = var_96c[var1] & 255;
            if (((var14 = (Class_1c2)var_670[var2]).var_21a & 524288) == 0 && (var14.var_824 & 1048576) == 0) {
               if (var14.var_954 == 12) {
                  var14.var_591 += var14.var_28b * var14.var_373;
                  var14.var_5d1 += var14.var_28b * var14.var_3cd;
               }

               var10000 = var_96c;
               int var10001 = var14.var_9dd;
               var10000[var10001] &= 65535;
               var10000 = var_96c;
               var10001 = var14.var_9dd;
               var10000[var10001] |= var14.var_899 << 16;
               var_89d[var1] = (short)(var14.var_591 >> 8);
               var_8c7[var1] = (short)(var14.var_5d1 >> 8);
               var14.sub_a4();
               sub_1409(-1, (Class_1c2)null);
               var10000 = var_8e2;
               var10000[var1] &= -3;
            }
         }
      }

      for(var1 = 0; var1 < var_8e2.length; ++var1) {
         if ((var_8e2[var1] & 1) == 0 && (var_8e2[var1] & 2) == 0 && (var_8e2[var1] & 4) != 0) {
            int var15 = var_8e2[var1] >> 24 & 255;
            int var8 = var_8e2[var1] >> 16 & 255;
            int var7 = var_8e2[var1] >> 8 & 255;
            if ((var_8e2[var1] & 16) == 0) {
               if ((var2 = sub_10f1(var_89d[var1] << 8, var_8c7[var1] << 8, 1, var8, var7, var15, 0)) == -1) {
                  return;
               }

               (var14 = (Class_1c2)var_670[var2]).var_9dd = (byte)var1;
               var14.var_355 = var_9a9[var1];
               var14.var_899 = var_96c[var1] >> 16;
               var10000 = var_96c;
               var10000[var1] &= -256;
               var10000 = var_96c;
               var10000[var1] |= var2 & 255;
               var10000 = var_8e2;
               var10000[var1] |= 2;
            }
         }
      }

   }

   private static void sub_749(boolean var0) {
      int var1;
      for(var1 = 1; var1 < 17; ++var1) {
         Class_1c2 var2;
         if ((var2 = (Class_1c2)var_670[var1]) != null) {
            var2.sub_5e(var0);
            var_670[var1] = null;
         }
      }

      if (var0) {
         ((Class_147)var_670[0]).sub_51(var0);
         var_670[0] = null;
      }

      for(var1 = var0 ? 0 : 4; var1 < var_6d1.length; ++var1) {
         Class_17f.sub_9fa(var_6d1[var1], 3);
         var_6d1[var1] = -1;
      }

      var_8e2 = null;
      var_96c = null;
      var_9a9 = null;
      var_89d = null;
      var_8c7 = null;
   }

   static void sub_76f(int var0, int var1, int var2) {
      var_670[var1].var_9a0 = var0;
      var_670[var1].var_11 = (byte[])Class_17f.sub_9d4(var2);
      var_670[var1].sub_14(-65536);
   }

   static void sub_7c9() {
      for(int var4 = 0; var4 < var_8e2.length; ++var4) {
         if ((var_8e2[var4] & 1) == 0) {
            int var0 = var_8e2[var4] >> 16 & 255;
            int var1 = var_8e2[var4] >> 8 & 255;
            byte var2 = -1;
            if (var0 == 1) {
               var2 = 1;
            }

            if (var0 == 2) {
               var2 = 5;
            }

            if (var0 == 3) {
               var2 = 2;
            }

            if (var2 != -1) {
               int[] var10000;
               int var10001;
               int var10002;
               label43: {
                  int var3;
                  switch(var3 = sub_1539(var2, var1)) {
                  case -2:
                     var10000 = var_8e2;
                     var10001 = var4;
                     var10002 = var10000[var4] | 16;
                     break label43;
                  case -1:
                     var10000 = var_8e2;
                     break;
                  default:
                     if (var0 == 2 && sub_1914(6) != var3) {
                        var10000 = var_8e2;
                        var10001 = var4;
                        var10002 = var10000[var4] | 16;
                        break label43;
                     }

                     var10000 = var_8e2;
                  }

                  var10001 = var4;
                  var10002 = var10000[var4] & -17;
               }

               var10000[var10001] = var10002;
            }
         }
      }

   }

   public static void sub_81a() {
      Class_147 var10000 = var_a69;
      var10000.var_824 |= 512;

      for(int var0 = 0; var0 < 16; ++var0) {
         Class_1c2 var2 = (Class_1c2)var_670[1 + var0];
         var2.var_824 |= 128;
      }

   }

   public static int sub_852(int var0) {
      int var2 = 0;

      for(int var1 = 0; var1 < 16; ++var1) {
         Class_1c2 var3;
         if (((var3 = (Class_1c2)var_670[1 + var1]).var_824 & 8) != 0 && var3.var_9a0 == var0) {
            ++var2;
         }
      }

      return var2;
   }

   private static int sub_877(int var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var10;
      int var13;
      int var14;
      int var15;
      int var16;
      byte var19;
      byte var20;
      label76: {
         var16 = 0;
         var15 = 0;
         boolean var12 = false;
         boolean var11 = false;
         boolean var7 = false;
         boolean var6 = false;
         var10 = true;
         var13 = var0;
         var14 = var1;
         var19 = var_454[16 + var4 * 6 + 0 + 0];
         var20 = var_454[16 + var4 * 6 + 0 + 1];
         if (var19 != 0) {
            if (var1 == var3) {
               break label76;
            }
         } else if (var0 == var2) {
            break label76;
         }

         var10 = false;
      }

      int var8 = Class_17f.var_cb6[1];
      int var9 = Class_17f.var_cb6[2];

      for(int var17 = 0; var17 < var5; ++var17) {
         var15 = var0 + var19 * var17;
         var16 = var1 + var20 * var17;
         byte var18;
         if (var15 < 0 || var16 < 0 || var15 >= var8 || var16 >= var9 || ((var18 = Class_17f.var_1064[var16 * var8 + var15]) & 3) == 1 || (var18 & 3) == 2) {
            break;
         }

         var13 = var15;
         var14 = var16;
      }

      if (!var10) {
         return (var13 << 16) + (var14 & '\uffff');
      } else {
         switch(var4) {
         case 0:
            if (var3 >= var16 && var3 <= var1) {
               return -1;
            }
            break;
         case 1:
            if (var2 >= var0 && var2 <= var15) {
               return -1;
            }
            break;
         case 2:
            if (var3 >= var1 && var3 <= var16) {
               return -1;
            }
            break;
         case 3:
            if (var2 >= var15 && var2 <= var0) {
               return -1;
            }
         }

         return (var13 << 16) + (var14 & '\uffff');
      }
   }

   public static boolean sub_8bf(Class_1c2 var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         return false;
      } else {
         int var10 = Class_17f.var_cb6[6];
         int var11 = Class_17f.var_cb6[7];
         int var6 = (var0.var_591 >> 8) / var10;
         int var7 = (var0.var_5d1 >> 8) / var11;
         int var8 = (var4 >> 8) / var10;
         int var9 = (var5 >> 8) / var11;
         if (var6 == var8 && var7 == var9) {
            return true;
         } else {
            byte var17 = var_454[16 + var3 * 6 + 0 + 0];
            byte var18 = var_454[16 + var3 * 6 + 0 + 1];

            int var14;
            for(int var12 = -(var14 = var1 / 2); var12 <= var14; ++var12) {
               int var10000;
               int var10001;
               int var19;
               if (var17 != 0) {
                  var19 = var6 + var17;
                  var10000 = var7;
                  var10001 = var12;
               } else {
                  var19 = var6 + var12;
                  var10000 = var7;
                  var10001 = var18;
               }

               int var20 = var10000 + var10001;
               if (sub_877(var19, var20, var8, var9, var3, var2) == -1) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public static boolean sub_8ea(int var0, int var1, int var2, int var3, Class_1c2 var4, int var5, int var6) {
      boolean var12 = false;
      int var11 = 0;
      int var15 = Class_17f.var_cb6[6];
      int var16 = Class_17f.var_cb6[7];
      byte var13 = var_454[16 + var3 * 6 + 0 + 0];
      byte var14 = var_454[16 + var3 * 6 + 0 + 1];
      if (var4 == null) {
         var1 += var_607[72 + var3 * 2 + 0];
         var2 += var_607[72 + var3 * 2 + 1];
      }

      int var8 = (var1 >> 8) / var15;
      int var9 = (var2 >> 8) / var16;
      int var10 = 0;
      int var22 = Class_17f.var_cb6[1];
      int var23 = Class_17f.var_cb6[2];
      int var20 = var8 + var13;
      int var21 = var9 + var14;

      while(var10 < var0 && var20 >= 0 && var21 >= 0 && var20 < var22 && var21 < var23 && (var11 = Class_17f.var_1064[var21 * var22 + var20] & 3) != 1) {
         var20 += var13;
         var21 += var14;
         ++var10;
         if (var11 == 2) {
            break;
         }
      }

      if (var10 < 0 && var11 != 2) {
         return false;
      } else {
         if (var13 > 0 || var14 > 0) {
            --var10;
         }

         var20 = var8 * var15;
         var21 = var9 * var16;
         var22 = (var8 + var13 * (var10 + 1)) * var15 + var15 - 1;
         var23 = (var9 + var14 * (var10 + 1)) * var16 + var16 - 1;
         int var10000;
         if (var13 != 0) {
            var15 = var22 << 8;
            var10000 = var23 + var21 >> 1;
         } else {
            var15 = var22 + var20 >> 1 << 8;
            var10000 = var23;
         }

         var16 = var10000 << 8;
         int var7;
         if (var13 < 0) {
            var7 = var20;
            var20 = var22;
            var22 = var7;
         }

         if (var14 < 0) {
            var7 = var21;
            var21 = var23;
            var23 = var7;
         }

         if (var13 != 0) {
            var21 -= var6;
            var23 += var6;
         } else {
            var20 -= var6;
            var22 += var6;
         }

         var10 = var4 == null ? 72 : 80;
         var13 = var_607[var10 + var3 * 2 + 0];
         var14 = var_607[var10 + var3 * 2 + 1];
         var20 += var13;
         var21 += var14;
         var22 += var13;
         var23 += var14;
         var20 <<= 8;
         var21 <<= 8;
         var22 <<= 8;
         var23 <<= 8;
         if (var4 == null) {
            var11 = 0;
            var_a69.sub_1eb(var20, var21, var22, var23, (Class_1c2)null, 1);
            if (var15 != Class_17f.var_cb6[4] - 1 << 8 && var16 != Class_17f.var_cb6[5] - 1 << 8 && var15 != 0 && var16 != 0) {
               int var10001;
               byte var10002;
               short var10003;
               if (var5 == 7) {
                  var10000 = var15 >> 8;
                  var10001 = var16 >> 8;
                  var10002 = 2;
                  var10003 = 0;
               } else {
                  short var19;
                  label84: {
                     var19 = 0;
                     boolean var18 = false;
                     boolean var17 = false;
                     short var24;
                     if (var_ff5[5] == 2) {
                        var24 = 190;
                     } else {
                        if (var_ff5[5] != 4) {
                           break label84;
                        }

                        var24 = 204;
                     }

                     var19 = var24;
                  }

                  if (var19 == 0) {
                     return var11 > 0;
                  }

                  int var25;
                  int var26;
                  if (var_a69.var_721 != 0 && var_a69.var_721 != 2) {
                     var25 = var15 >> 8;
                     var26 = 0 + (var_a69.var_5d1 >> 8) + var_a69.var_6c3;
                     if (Class_1ac.sub_15e(var_a69) > 0) {
                        var26 += Class_1ac.sub_1c7(var_a69, 0);
                     }
                  } else {
                     var25 = var_a69.var_591 >> 8;
                     var26 = (var16 >> 8) + var_a69.var_6c3;
                     if (Class_1ac.sub_15e(var_a69) > 0) {
                        var25 += Class_1ac.sub_18e(var_a69, 0);
                     }
                  }

                  var10000 = var25;
                  var10001 = var26;
                  var10002 = 2;
                  var10003 = var19;
               }

               sub_a29(var10000, var10001, var10002, var10003, 0, 4, 0);
            }
         }

         return var11 > 0;
      }
   }

   public static int sub_93e(int var0, int var1) {
      boolean var9 = false;
      boolean var8 = false;
      int var2 = Class_17f.var_cb6[1];
      int var3 = Class_17f.var_cb6[2];
      int var6 = -1;
      int var7 = -var2;
      int var10;
      if ((var10 = var1 / var2 - 1) < 0) {
         var7 += var2;
         ++var10;
      }

      while(true) {
         while(var7 < var2 + 1) {
            int var11 = var1 + var6 + var7;
            ++var6;
            if (var6 > 2) {
               var6 = -1;
               var7 += var2;
               ++var10;
               if (var10 > var3) {
                  var7 = var2 + 1;
                  continue;
               }
            }

            if (var11 >= 0 && var11 <= var2 * var3 - 1 && var11 / var2 == var10 && (Class_17f.var_1064[var11] & 3) == 2) {
               int var12 = var11 % var2;
               int var13 = var11 / var2;
               Class_17f.var_1064[var11] = (byte)(var11 + 1 << 2 | 0);
               Class_ec.sub_69e(Class_17f.var_cd8[0], var12, var13, 44, 0, true);
               sub_a29(var12 * 36 + 18, var13 * 36 + 18, 2, 92, 0, 4, 0);
               if (!Class_17f.sub_39b(var_ff5, Class_17f.var_cb6[var0 * 23 + 22], 1, 1, var_113c)) {
                  Class_17f.sub_3b0(var_ff5, Class_17f.var_cb6[var0 * 23 + 22], 1, 1, var_113c);
               }
            }
         }

         return 0;
      }
   }

   private static void sub_96e(Graphics var0, int var1, int var2, int var3) {
      int var4 = Class_17f.sub_6de((Graphics)null, var1, 0, 0, 1, -2, 0);

      while(true) {
         --var4;
         if (var4 < 0) {
            return;
         }

         Class_ec.sub_58f(var0, var_686[1], var2, var3, 20, (Class_17f.var_4bb[var4] - 48) * 10, 0, 10, 12, 0);
         var2 += 10;
      }
   }

   private static void sub_9ae(int var0) {
      var_710 = new short[var0];
      var_71a = new short[var0];
      var_72a = new int[var0];
      sub_9f3();
   }

   private static void sub_9d1() {
      var_710 = null;
      var_71a = null;
      var_72a = null;
   }

   private static void sub_9f3() {
      var_769 = 0;

      for(int var0 = 0; var0 < var_72a.length; ++var0) {
         var_72a[var0] = -1;
      }

   }

   static void sub_a29(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var_769 < var_72a.length) {
         int var8 = 0;

         for(int var7 = 0; var7 < var_72a.length && var_72a[var8] != -1; ++var7) {
            ++var8;
            if (var8 >= var_72a.length) {
               var8 = 0;
            }
         }

         var_710[var8] = (short)var0;
         var_71a[var8] = (short)var1;
         var_72a[var8] = (var4 & 127) << 0 | (var2 & 31) << 7 | (var3 & 511) << 12 | (var6 & 255) << 21 | (var5 & 7) << 29;
         ++var_769;
      }
   }

   private static int sub_a3d(int var0) {
      for(int var1 = 0; var1 < var_72a.length; ++var1) {
         if (var_72a[var1] != -1) {
            if (var0 >= var_aab.length) {
               break;
            }

            var_aab[var0++] = (var_710[var1] & 2047) << 7 | (var_71a[var1] & 2047) << 18 | (var1 + 17 & 127) << 0 | (var_72a[var1] >> 29 & 7 & 7) << 29;
         }
      }

      return var0;
   }

   private static void sub_a72() {
      for(int var0 = 0; var0 < var_72a.length; ++var0) {
         int var1;
         if ((var1 = var_72a[var0]) != -1) {
            int[] var10000;
            int var10001;
            int var10002;
            int var10003;
            byte var10004;
            label39: {
               int var2 = var1 >> 7 & 31;
               int var4 = var1 >> 0 & 127;
               int var5 = var1 >> 12 & 511;
               int var3 = var1 >> 29 & 7;
               int var7 = var1 >> 21 & 255;
               int var6;
               if ((var3 & 4) != 0 && (var6 = Class_17f.sub_265(var4, var5, (byte[])Class_17f.sub_9d4(var_6d1[var2]))) != -1) {
                  ++var7;
                  if (var7 < var6) {
                     var10000 = var_72a;
                     var10000[var0] &= -534773761;
                     var10000 = var_72a;
                     var10001 = var0;
                     var10002 = var10000[var0];
                     var10003 = var7 & 255;
                     var10004 = 21;
                     break label39;
                  }
               }

               ++var4;
               if (var4 >= Class_17f.sub_244(var5, (byte[])Class_17f.sub_9d4(var_6d1[var2]))) {
                  if ((var3 & 2) == 0) {
                     var_72a[var0] = -1;
                     --var_769;
                     continue;
                  }

                  var4 = 0;
               }

               var10000 = var_72a;
               var10000[var0] &= -128;
               var10000 = var_72a;
               var10001 = var0;
               var10002 = var10000[var0];
               var10003 = var4 & 127;
               var10004 = 0;
            }

            var10000[var10001] = var10002 | var10003 << var10004;
         }
      }

   }

   private static void sub_aa1(Graphics var0, int var1, int var2, int var3) {
      int var6;
      if ((var6 = var_72a[var1]) != -1) {
         int var9 = var6 >> 0 & 127;
         int var7 = var6 >> 7 & 31;
         int var8 = var6 >> 12 & 511;
         int var4 = Class_17f.sub_d20(0, var2);
         int var5 = Class_17f.sub_d31(0, var3);
         Class_17f.sub_292(var0, var4, var5, var8, var9, -1, true, 0, (byte[])Class_17f.sub_9d4(var_6d1[var7]));
      }
   }

   public static void sub_ad9() {
      sub_5e1();
      var_ec9 = new int[224];
      var_dfb = Class_17f.var_dd - 0 - 6;
      var_dfb -= 152;
      var_dfb /= 36;
   }

   public static void sub_aef() {
      sub_5fd();
      var_ec9 = null;
   }

   static void sub_b34() {
      var_aed = -1;
      var_a69 = null;
      Class_17f.sub_52a(265);
      var_bd6 = Class_17f.var_51a;
      var_c04 = Class_17f.var_543;
      var_b22 = new Class_de[var_5ab.length];
      sub_15d4(0);
      Class_1d4.var_278 &= -16385;
      var_c45 = 0;
      var_9d8 = 1027;
      var_a0a = 0;
      var_61f = 0;
      var_ac5 = 0;
      var_f43 = -1;
   }

   static void sub_b8b() {
      sub_bde(true);
      sub_5b5();
      var_a69 = null;
      sub_1354();
      var_bd6 = null;
      var_c04 = null;
      var_b22 = null;
   }

   private static boolean sub_bde(boolean var0) {
      var_aab = null;
      Class_17f.sub_c0e();
      sub_749(var0);
      if (var_f1b != null) {
         Class_ec.sub_828(var_f1b);
         var_f1b = null;
      }

      var_9d8 |= 1024;
      return sub_c12();
   }

   static boolean sub_c12() {
      if ((var_9d8 & '耀') != 0) {
         var_9d8 &= -32769;
         sub_1813();
         return true;
      } else {
         return false;
      }
   }

   static boolean sub_c66(int var0) {
      boolean var1 = (var0 & 2048) != 0;
      int var2 = var0 >> 9 & 3;
      int var10000;
      if (var1) {
         if ((var_9d8 & 524288) == 0) {
            return true;
         }

         var10000 = var_9d8 | 33554432;
      } else {
         var10000 = var_9d8 & -33554433;
      }

      var_9d8 = var10000;
      int var3;
      var_c45 = (var3 = sub_1539(7, var0 & 511)) >= 0 ? var3 : var0 & 511;
      var_c45 |= (var2 & 3) << 9;
      var_9d8 |= 1032;
      var_9d8 &= -536577;
      Class_147 var4 = var_a69;
      var4.var_824 &= -17;
      return false;
   }

   private static void sub_ca3() {
      if (sub_1914(6) != -1) {
         sub_9f3();
         var_9d8 &= -67635713;
         sub_1506(3, sub_1914(6));
         sub_1506(4, sub_1914(7));
         var_ff5[9] = 0;
         if (!Class_17f.sub_39b(var_ff5, sub_1914(6) - 153, 0, 1, var_112a)) {
            Class_17f.sub_3b0(var_ff5, sub_1914(6) - 153, 0, 1, var_112a);
            ++var_ff5[4];
         }

         while(Class_17f.sub_e12(sub_1914(6), -1, var_57c[var_ff5[8] * 8 + 4], -1)) {
         }

         var_e34 = Class_17f.var_1129;
         int var2 = Class_17f.var_89;
         int var3;
         if ((var3 = Class_17f.var_dd) > Class_17f.var_cb6[5]) {
            var3 = Class_17f.var_cb6[5];
         }

         if (var2 > Class_17f.var_cb6[4]) {
            var2 = Class_17f.var_cb6[4];
         }

         int var0 = Class_17f.var_89 - var2 >> 1;
         int var1 = Class_17f.var_dd - var3 >> 1;
         Class_17f.sub_c18(var0, var1, var2, var3);
         if (Class_17f.var_c77 > 1) {
            Class_17f.sub_c7b(Class_17f.var_10a3, var2, var3 - Class_17f.var_cb6[23 * Class_17f.var_10eb + 5], true);
            var3 = Class_17f.var_cb6[23 * Class_17f.var_10eb + 5];
         }

         Class_17f.sub_c7b(Class_17f.var_10eb, var2, var3, true);
         Class_17f.sub_efa(0);
         sub_cc0();
      }
   }

   private static void sub_cc0() {
      int var0;
      int var10000;
      label93: {
         var_b02 = 0;
         var_aed = Class_17f.var_d50 == -1 ? -1 : Class_17f.var_d50 + 262;
         if ((var0 = sub_1539(0, var_aed)) != -2 && !Class_17f.sub_39b(var_ff5, var_aed - 262, 0, 1, var_10d5)) {
            if (var0 <= -1) {
               break label93;
            }

            var10000 = var0;
         } else {
            var10000 = -1;
         }

         var_aed = var10000;
      }

      short var1;
      label74: {
         short var2;
         if ((var1 = var_57c[var_ff5[8] * 8 + 5]) > -1) {
            var2 = var1;
         } else {
            if (var1 != -2) {
               break label74;
            }

            var2 = -1;
         }

         Class_17f.var_d6b = var2;
      }

      label68: {
         if ((var0 = sub_1539(8, Class_17f.var_d6b)) > -1) {
            var10000 = var0;
         } else {
            if (var0 != -2) {
               break label68;
            }

            var10000 = -1;
         }

         Class_17f.var_d6b = var10000;
      }

      if (((var1 = var_57c[var_ff5[8] * 8 + 3]) & 512) != 0) {
         var_ff5[5] = 0;
         var_a69.var_160 = var_ff5[5];
      }

      int var10001;
      Class_147 var3;
      if ((var1 & 2048) != 0) {
         var3 = var_a69;
         var10001 = var3.var_824 | 65536;
      } else {
         var3 = var_a69;
         var10001 = var3.var_824 & ~65536;
      }

      var3.var_824 = var10001;
      if ((var1 & 4096) != 0) {
         var_e42 = 2560;
      }

      if ((var1 & 8192) != 0 && var_e42 == 0) {
         var_e42 = 2560;
      }

      if ((var1 & 1024) != 0) {
         Class_17f.sub_344(var_ff5, 2, (short)var_a69.var_d);
         var_a69.sub_e3();
         var_ff5[5] = 0;
         var_a69.var_160 = var_ff5[5];
      }

      var_eab = 0;
      var_eab = sub_1539(3, sub_1914(6));
      if (var_eab <= 0) {
         var_eab = 0;
      }

      if ((var_eab & 1) == 0) {
         var_eab = var_57c[var_ff5[8] * 8 + 3];
      }

      var_f1b = (var_eab & 2) != 0 ? Class_ec.sub_b1(33) : ((var_eab & 128) != 0 ? Class_ec.sub_b1(33) : null);
      sub_15d4(var_eab);
   }

   private static void sub_d16() {
      var_670[0] = new Class_147();
      sub_76f(0, 0, var_6d1[0]);
      var_6a4[0] = 0;
      var_6a4[1] = 0;
      var_670[0].sub_14(var_6a4);
      var_a69 = (Class_147)var_670[0];
      var_a69.sub_a6();
      var_9d8 |= 2;
      var_a69.var_160 = var_ff5[5];
      var_e42 = 0;
   }

   private static void sub_d6f(Graphics var0) {
      sub_96e(var0, var_f43, Class_17f.var_104 + var_ccb + (Class_17f.sub_d60(0, (var_f6b >> 16 << 8) + 1024) >> 8), Class_17f.var_13c + var_d14 + (Class_17f.sub_db8(0, ((var_f6b & '\uffff') << 8) + -1536) >> 8));
   }

   private static void sub_dd2(Graphics var0, int var1, int var2, int var3) {
      var0.setColor(0);
      var0.fillRect(Class_17f.var_104 + (Class_17f.var_89 >> 1) - 28, Class_17f.var_13c + var3, 56, 24);
      if (var_e4f != var1 / 32) {
         int var6 = Class_17f.var_104 + (Class_17f.var_89 >> 1) - 26;
         int var7 = Class_17f.var_13c + var3;
         int var4 = var6 + 53;
         int var5 = var7 + 21;
         var0.setColor(16711680);
         var0.drawLine(var6, var7, var4, var7);
         var0.drawLine(var6, var7, var6, var5);
         var0.drawLine(var4, var7, var4, var5);
         var0.drawLine(var6, var5, var4, var5);
         var_e4f = var1 / 32;
      }

      var3 += 2;
      Class_17f.sub_6de(var0, var1 / 32, var2 + 5, var3, 2, -1, 0);
   }

   private static void sub_ddf(Graphics var0, int var1, int var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      boolean var8 = false;
      int var9;
      if (var4) {
         var2 = Class_17f.sub_6de(var0, var1 / 3600, var2, var3, 2, -1, 0);
         if (var5) {
            var2 = Class_17f.sub_645(var0, 'h', var2, var3, 0, -1);
         }

         var9 = (var9 = var1 / 3600) * 3600;
         var1 -= var9;
      }

      if (var5) {
         var2 = Class_17f.sub_6de(var0, var1 / 60, var2, var3, 2, -1, 0);
         if (var6) {
            var2 = Class_17f.sub_645(var0, ':', var2, var3, 0, -1);
         }

         var9 = (var9 = var1 / 60) * 60;
         var1 -= var9;
      }

      if (var6) {
         var2 = Class_17f.sub_6de(var0, var1, var2, var3, 2, -1, 0);
         if (var7) {
            Class_17f.sub_645(var0, ':', var2, var3, 0, -1);
         }
      }

   }

   private static void sub_e06() {
      var_cba = 0;
      var_9d8 &= -4194309;
      var_9d8 |= 2;
      var_aab = new int[51];
      var_ac5 = 0;
      var_a69.sub_133();
      sub_707();
      var_a0a = 1;
      var_f43 = -1;
      sub_119c();
      sub_9f3();
      if ((var_9d8 & 1) != 0) {
         Class_17f.var_30f = 0;
      }

      var_9d8 &= -2;
      if (Class_17f.var_d6b != -1) {
         sub_2f(Class_17f.var_d6b, 2);
      } else {
         sub_a7();
      }

      if ((var_9d8 & 4096) != 0) {
         sub_14a1();
         var_9d8 |= 524288;
      }

      if (Class_17f.sub_39b(var_ff5, Class_17f.var_cb6[22], 1, 1, var_113c)) {
         sub_14a1();
      }

   }

   private static void sub_e26() {
      if (Class_17f.var_33f) {
         Class_17f.var_33f = false;
         if ((var_9d8 & 128) != 0) {
            Class_17f.sub_81d(Class_17f.var_363);
         } else if (var_a0a == 11) {
            sub_ff6(Class_17f.var_363, false);
         } else {
            if (var_a0a == 1 || var_a0a == 10) {
               if (Class_17f.var_363 == 48 && var_a0a != 9 && Class_17f.var_481 != 2 && var_a69.var_954 != 3) {
                  if ((var_57c[var_ff5[8] * 8 + 3] & 512) != 0 && (var_9d8 & 128) == 0) {
                     var_b02 = 0;
                     var_aed = 280;
                     return;
                  }

                  var_d82 = 0;
                  var_a0a = 11;
                  var_d55 = 0;
                  return;
               }

               if (Class_17f.var_363 == 8 && Class_17f.var_1026 != -1 && (var_9d8 & 128) == 0 && (var_9d8 & 2097152) != 0 && var_d22 <= 0 && var_aed == -1) {
                  var_b02 = 0;
                  var_aed = 262 + ((Class_17f.var_1026 & '\uffff') >> 0 & 4095);
                  int var0;
                  int var10000;
                  if ((var0 = sub_1539(0, var_aed)) != -2 && !Class_17f.sub_39b(var_ff5, var_aed - 262, 0, 1, var_10d5)) {
                     if (var0 <= -1) {
                        return;
                     }

                     var10000 = var0;
                  } else {
                     var10000 = -1;
                  }

                  var_aed = var10000;
               }
            }

         }
      }
   }

   static boolean sub_e55() {
      if ((Class_1d4.var_278 & 65536) != 0 && (var_9d8 & 6144) != 6144 && sub_2f(Class_17f.var_d6b, 6)) {
         Class_1d4.var_278 &= -65537;
      }

      int var0;
      if (Class_17f.var_3b7 % 32 == 0) {
         var0 = Class_17f.sub_2ad(var_ff5, 27);
         ++var0;
         Class_17f.sub_300(var_ff5, 27, var0);
      }

      sub_e26();
      if ((var_9d8 & 128) != 0) {
         if (!Class_17f.sub_831()) {
            Class_17f.sub_4f7(var_bd6, var_c04);
            if (Class_17f.var_696 == 31) {
               sub_1295();
               Class_17f.var_696 = 34;
            } else if (Class_17f.var_696 == 33) {
               sub_1365(Class_17f.var_735, Class_17f.var_7a4 >> 8 & 255, Class_17f.var_7a4 & 255, (Class_17f.var_7a4 >> 16 & 255) == 0);
            }
         } else {
            sub_11e5(true);
         }
      }

      if ((var_9d8 & 128) == 0 || (var_9d8 & 128) != 0 && (Class_17f.var_6e3 & 1) != 0) {
         switch(var_a0a) {
         case 0:
            sub_4d1();
            return true;
         case 2:
         case 3:
         case 6:
         default:
            break;
         case 4:
            Class_1d4.var_266 = 7;
            Class_1d4.var_278 |= 16394;
            sub_b8b();
            return true;
         case 5:
            sub_bde(false);
            var0 = Class_17f.sub_2ad(var_ff5, 27);
            sub_1757(var_10ca, 0);
            Class_17f.sub_300(var_ff5, 27, var0);
            sub_ea2();
            var_a69.sub_a6();
            sub_49a(1);
            var_a0a = 0;
            var_9d8 &= -17;
            return true;
         case 7:
            var_9d8 &= -9;
            sub_bde(false);
            sub_1959(7, sub_1914(6));
            sub_1959(6, var_c45 & 511);
            sub_49a(1);
            var_a0a = 0;
            return true;
         case 8:
            sub_c12();
            Class_1d4.var_266 = 2;
            Class_1d4.var_278 |= 10;
            sub_b8b();
            return true;
         case 9:
            var_9d8 |= 262144;
         case 1:
         case 10:
            if ((var_9d8 & 4) == 0) {
               if (var_d22 > 0) {
                  --var_d22;
               }

               sub_a72();
               --var_b02;
               if (var_b02 <= 0) {
                  var_b02 = 0;
                  if ((var_9d8 & 514) == 0) {
                     sub_11fa();
                  }
               }

               if ((var_9d8 & 128) != 0) {
                  return false;
               }

               if ((var_9d8 & 16) != 0) {
                  --var_a45;
                  if (var_a45 == 0) {
                     var_a45 = 0;
                     sub_1051(false, 0, false);
                  }
               }

               var_ac5 = 0;
               if ((var_9d8 & 4) == 0) {
                  var_a69.sub_37c();
               }

               var_a69.sub_42d(false);
               var_a69.var_743 = Class_17f.sub_d60(0, var_a69.var_591);
               var_a69.var_77c = Class_17f.sub_db8(0, var_a69.var_5d1);
               var_aab[var_ac5++] = (var_a69.var_591 >> 8 & 2047) << 7 | (var_a69.var_5d1 >> 8 & 2047) << 18 | (var_a69.var_9b3 & 127) << 0;
               var_ff5[9] = 0;

               for(var0 = 0; var0 < 16; ++var0) {
                  Class_1c2 var2;
                  if (((var2 = (Class_1c2)var_670[1 + var0]).var_824 & 8) != 0) {
                     var2.sub_2d1();
                     if ((var2.var_824 & 8) != 0) {
                        var2.var_743 = Class_17f.sub_d60(0, var2.var_591);
                        var2.var_77c = Class_17f.sub_db8(0, var2.var_5d1);
                        if (var2.var_4af < 1024) {
                           var_aab[var_ac5++] = (var2.var_591 >> 8 & 2047) << 7 | (var2.var_5d1 >> 8 & 2047) << 18 | (var2.var_9b3 & 127) << 0;
                        }
                     }
                  }
               }

               if (var_a0a == 10) {
                  int var1 = sub_1914(6);
                  var0 = sub_1539(6, var1);
                  if (var_ff5[9] == var0) {
                     sub_1506(6, var1);
                     sub_14bb();
                     sub_119c();
                  }
               }

               var_9d8 |= 64;
               if ((var_9d8 & 8) != 0) {
                  var_a0a = 7;
               }
            }
            break;
         case 11:
            if (var_d22 > 0) {
               --var_d22;
            }

            if ((Class_17f.var_30f & 2) != 0) {
               sub_ff6(1, true);
            } else if ((Class_17f.var_30f & 4) != 0) {
               sub_ff6(6, true);
            } else if ((Class_17f.var_30f & 8) != 0) {
               sub_ff6(2, true);
            } else if ((Class_17f.var_30f & 16) != 0) {
               sub_ff6(5, true);
            }
         }
      }

      return false;
   }

   private static void sub_ea2() {
      var_ff5[5] = 0;
      sub_1959(6, var_57c[var_ff5[8] * 8 + 6]);
      sub_1959(7, var_57c[var_ff5[8] * 8 + 7]);
   }

   static void sub_ed9(Graphics var0) {
      Class_17f.sub_4f7(var_bd6, var_c04);
      if ((var_9d8 & 1024) != 0) {
         var_9d8 &= -1025;
         var0.setColor(var_e34);
         var0.fillRect(Class_17f.var_104, Class_17f.var_13c, Class_17f.var_89, Class_17f.var_dd);
         var_9d8 |= 2097152;
      }

      if ((var_9d8 & 128) != 0) {
         Class_17f.var_6e3 |= 1;
      }

      label93: {
         int var10000;
         if ((var_a0a == 1 || var_a0a == 9 || var_a0a == 10) && (var_9d8 & 64) != 0) {
            if ((var_9d8 & 67108864) != 0) {
               var0.setColor(var_e34);
               var0.fillRect(Class_17f.var_104, Class_17f.var_13c, Class_17f.var_89, Class_17f.var_dd);
               sub_f50(var0, 1);
               break label93;
            }

            Class_17f.sub_cf9(0, var0, var_ccb, var_d14, false);
            var_ac5 = sub_a3d(var_ac5);
            sub_f50(var0, var_ac5);
            if ((var_9d8 & 67108864) == 0) {
               for(int var1 = 0; var1 < 16; ++var1) {
                  Class_1c2 var2;
                  if (((var2 = (Class_1c2)var_670[1 + var1]).var_824 & 8) != 0 && var2.var_4af >= 1024) {
                     var2.sub_487(var0);
                  }
               }
            }

            if (var_f43 != -1) {
               sub_d6f(var0);
            }

            var_d14 = 0;
            var_ccb = 0;
            sub_161f(var0, 0);
            Class_17f.sub_1c2(var0, var_e34);
            if ((var_9d8 & 16777216) != 0) {
               var_9d8 &= -16777217;
               var0.setColor(var_e34);
               var0.fillRect(Class_17f.var_104, Class_17f.var_13c, Class_17f.var_89, Class_17f.var_dd);
            }

            if ((var_57c[var_ff5[8] * 8 + 3] & 8192) != 0) {
               sub_dd2(var0, var_e42, (Class_17f.var_89 >> 1) - 15, Class_17f.var_eaa);
            }

            var10000 = var_9d8;
         } else {
            if (var_a0a != 11) {
               break label93;
            }

            if ((Class_1d4.var_278 & 524288) != 0) {
               var_d55 = 0;
            }

            if ((var_9d8 & 128) == 0 || (Class_1d4.var_278 & 524288) != 0) {
               sub_fba(var0);
            }

            var10000 = var_9d8;
         }

         var_9d8 = var10000 & -3;
      }

      if ((var_9d8 & 128) != 0) {
         Class_17f.sub_83e(var0, 0, Class_17f.var_dd - Class_17f.var_a20, 0);
         Class_17f.sub_4f7(var_bd6, var_c04);
         sub_12ef(var0);
      }

   }

   private static int sub_eff(int var0) {
      return (var0 >> 0 & 127) >= 17 && (var0 >> 0 & 127) < 47 && (var0 >> 29 & 7) == 1 ? 1025 : var0 >> 18 & 2047;
   }

   private static void sub_f50(Graphics var0, int var1) {
      int var7 = var1;

      int var2;
      int var3;
      int var5;
      int var6;
      for(var2 = 0; var2 < var7 - 1; ++var2) {
         for(var3 = var2 + 1; var3 < var7; ++var3) {
            var5 = var_aab[var2];
            var6 = var_aab[var3];
            if (sub_eff(var5) > sub_eff(var6)) {
               var_aab[var2] = var6;
               var_aab[var3] = var5;
            }
         }
      }

      for(var2 = 0; var2 < var7; ++var2) {
         int var4;
         var3 = (var4 = var_aab[var2]) >> 0 & 127;
         var5 = var4 >> 7 & 2047;
         var6 = var4 >> 18 & 2047;
         if (var3 < 17) {
            var_670[var3].sub_487(var0);
         } else if (var3 < 47) {
            sub_aa1(var0, var3 - 17, var5, var6);
         }
      }

   }

   private static void sub_f88(Graphics var0) {
      int var9 = (var_d82 & 255) >> 0;
      int var1 = Class_17f.sub_5f5(0, 46);
      int var2 = Class_17f.sub_5f5(0, 47);
      int var4 = 0;
      if (var1 > 0) {
         var4 = var1;
      }

      if (var2 > var4) {
         var4 = var2;
      }

      var1 = Class_17f.sub_5f5(0, 44);
      var2 = Class_17f.sub_5f5(0, 45);
      int var3 = var4 + Math.max(var1, var2) + Class_17f.sub_645((Graphics)null, '³', 0, 0, 0, -1) + 10 + 12;
      var1 = Class_17f.var_89 - var3 >> 1;
      int var6 = Class_17f.var_dd - 0 - 6 - 40;
      var6 += 101;
      var6 >>= 1;
      var6 -= 10;
      Class_17f.sub_657(var0, 46, var1, var6, 0, 0, 0, 0);
      int var5 = var1 + var4 + 10;
      var5 = Class_17f.sub_645(var9 == 1 ? var0 : null, '³', var5, var6, 0, -1);
      var5 += 4;
      int var7 = !Class_ec.sub_31a() ? 44 : 45;
      var5 = Class_17f.sub_657(var0, var7, var5, var6, 65536, 0, 0, 0);
      var5 += 4;
      Class_17f.sub_645(var9 == 1 ? var0 : null, '±', var5, var6, 0, -1);
      var6 += 15;
      Class_17f.sub_657(var0, 47, var1, var6, 0, 0, 0, 0);
      var5 = var1 + var4 + 10;
      var5 = Class_17f.sub_645(var9 == 2 ? var0 : null, '³', var5, var6, 0, -1);
      var5 += 4;
      var7 = (var_129e & 1) != 0 ? 44 : 45;
      var5 = Class_17f.sub_657(var0, var7, var5, var6, 65536, 0, 0, 0);
      var5 += 4;
      Class_17f.sub_645(var9 == 2 ? var0 : null, '±', var5, var6, 0, -1);
   }

   private static void sub_fba(Graphics var0) {
      boolean var20 = false;
      boolean var21 = false;
      int var19 = Class_17f.sub_5a0(0);
      int var1;
      if ((var_d82 & 134217728) == 0) {
         for(var1 = 0; var1 < 6 && var_607[123 + var1] >= 0; ++var1) {
         }

         var_d82 = 134217728 | var1 << 16 | var1 << 8;
      }

      int var14 = (var_d82 & 983040) >> 16;
      int var15 = (var_d82 & 15728640) >> 20;
      int var17 = (var_d82 & '\uff00') >> 8;
      int var16 = (var_d82 & 255) >> 0;
      int var4 = Class_17f.var_104 + 0 + 3;
      int var5 = Class_17f.var_13c + 0 + 3;
      int var10 = Class_17f.var_89 - 0 - 6;
      int var11 = Class_17f.var_dd - 0 - 6;
      if ((var_d55 & 4) == 0) {
         var_d55 |= 4;
         var0.setColor(16711680);
         var0.fillRect(Class_17f.var_104, Class_17f.var_13c, Class_17f.var_89, Class_17f.var_dd);
         var0.setColor(9043968);
         var0.fillRect(var4, var5, var10 - 1, var11 - 1);
      }

      if ((var_d55 & 8) == 0) {
         var_d55 |= 8;
         var0.setColor(16711680);
         var0.fillRect(var4, var5, var10 - 100, 98);
         var0.setColor(9043968);
         var0.fillRect(var4, var5, var10 - 100, 97);
      }

      var5 += 5;
      if (Class_17f.var_3b7 % 16 != 0) {
         var0.drawImage(var_686[2].var_8a[0], var4, var5, 20);
      }

      short var18;
      int var22 = (var18 = Class_17f.sub_2e5(var_ff5, 2)) == var_a69.var_d ? '\uff00' : (var18 > var_a69.var_d >> 1 ? 16776960 : 16711680);
      int var8;
      int var9;
      if (Class_17f.var_3b7 % 16 == 0) {
         var8 = var_686[2].var_8a[0].getWidth() - 3;
         var9 = var_686[2].var_8a[0].getHeight() - 3;
         ++var4;
         ++var5;
         var0.setColor(var22);
         var0.drawRect(var4, var5, var8, var9);
         --var4;
         --var5;
      }

      var4 -= Class_17f.var_104;
      var5 -= Class_17f.var_13c;
      if ((var_d55 & 16) == 0) {
         var_d55 |= 16;
         Class_17f.sub_657(var0, 36, var4 + 77, var5, 0, 0, 0, 0);
         Class_17f.sub_292(var0, var4 + 84, var5 + 26, 98, var_ff5[5], -1, true, 0, (byte[])Class_17f.sub_9d4(var_6d1[1]));
      }

      if ((var_d55 & 32) == 0) {
         var_d55 |= 32;
         if (var_ff5[25] < 8) {
            var_ff5[25] = 15;
         }

         Class_17f.sub_292(var0, var4 + 84, var5 + 26 + 30, 98, var_ff5[25], -1, true, 0, (byte[])Class_17f.sub_9d4(var_6d1[1]));
      }

      if ((var_d55 & 64) == 0) {
         var_d55 |= 64;
         var4 = 3 + (var10 - 100);
         var5 = 3;
         var9 = var19 + -2;
         var0.setColor(16711680);
         var0.fillRect(Class_17f.var_104 + var4, Class_17f.var_13c + 3, 100, 98);
         var0.setColor(4210752);
         var0.fillRect(Class_17f.var_104 + var4 + 1, Class_17f.var_13c + 3, 99, 97);

         for(var1 = 0; var1 < var14; var5 += var9) {
            if (var1 == var15) {
               var0.setColor(16711680);
               var0.fillRect(Class_17f.var_104 + var4 + 1, Class_17f.var_13c + var5, 99, var9 + 1);
               if ((var_d82 & 268435456) == 0) {
                  Class_17f.sub_292(var0, var4 + 4, var5 + 0, 0, 0, -1, true, 0, (byte[])Class_17f.sub_9d4(var_6d1[1]));
               }
            }

            Class_17f.sub_657(var0, 0 + var_607[123 + var1], var4 + 28, var5 + 0, 0, 0, 0, 0);
            ++var1;
         }
      }

      var4 = Class_17f.var_104 + 0 + 3;
      if ((var_d55 & 128) == 0) {
         var_d55 |= 128;
         var5 = Class_17f.var_13c + 0 + 3 + 98;
         var8 = Class_17f.sub_5f5(0, 38) + 30 + 20;
         int var6 = (var_d82 & 268435456) != 0 ? var_db7 : 0;
         var0.setColor(0);
         var0.fillRect(var4, var5 + 1, var10, var11 - 98 - 40 - 14 + 36 + 4 - 1);
         if (var6 >= 15 - var_dfb) {
            var6 = 15 - var_dfb;
         }

         if (var15 == 0 || var15 == 1 || var15 == 2) {
            int var3 = 0;
            int var7 = var_dfb;

            for(var1 = var6; var1 < 15 && var3 < var_dfb; ++var1) {
               label184: {
                  boolean var10000;
                  if (var1 < 8) {
                     if (var15 == 0) {
                        var20 = (var_ff5[0] & 1 << var1) != 0;
                        break label184;
                     }

                     var10000 = false;
                  } else if (10 + var1 >= 21) {
                     if (var15 == 2) {
                        var20 = var_ff5[10 + var1] != 0;
                        break label184;
                     }

                     var10000 = false;
                  } else {
                     if (var15 == 0 || var15 == 1) {
                        var20 = var_ff5[10 + var1] != 0;
                        break label184;
                     }

                     var10000 = false;
                  }

                  var20 = var10000;
               }

               if (var20) {
                  --var7;
                  if (var7 <= 0 && var1 != var16 && (var_d82 & 268435456) != 0) {
                     ++var7;
                  } else {
                     if (var1 == var16 && (var_d82 & 268435456) != 0) {
                        ++var7;
                        var21 = true;
                        var0.setColor(16711680);
                        var0.fillRect(var4, var5, var10, 36);
                        var0.setColor(16711680);
                        var0.drawLine(var4, var5, var4 + var10, var5);
                        var0.drawLine(var4, var5 + 36 - 1, var4 + var10, var5 + 36 - 1);
                        if (var16 > sub_1011(var16, var17, -1, var15, 0)) {
                           Class_17f.sub_292(var0, var10 - 7 - 10, var5 - Class_17f.var_13c, 0, 1, -1, true, 0, (byte[])Class_17f.sub_9d4(var_6d1[1]));
                        }

                        if (var16 < sub_1011(var16, var17, 1, var15, 0)) {
                           Class_17f.sub_292(var0, var10 - 7 - 10, var5 + 20 - Class_17f.var_13c, 0, 2, -1, true, 0, (byte[])Class_17f.sub_9d4(var_6d1[1]));
                        }
                     } else {
                        var0.setColor((var5 / 36 & 1) == 0 ? 3158064 : 4210752);
                        var0.fillRect(var4, var5, var10, 36);
                     }

                     label201: {
                        Class_17f.sub_292(var0, var4 + 4 - Class_17f.var_104, var5 + 4 + 0 - Class_17f.var_13c, 98, var1, -1, true, 0, (byte[])Class_17f.sub_9d4(var_6d1[1]));
                        Class_17f.sub_657(var0, 6 + var1, var4 + 36 + 4 - Class_17f.var_104, var5 + 0 - Class_17f.var_13c, 0, 0, 0, 0);
                        int var2;
                        byte var10001;
                        int var10002;
                        Graphics var23;
                        if (var1 < 8) {
                           if (var_607[var1 * 9 + 6] == -1) {
                              break label201;
                           }

                           var23 = var0;
                           var10001 = 38;
                           var10002 = var4 + var10 - var8;
                        } else {
                           if (var1 < 7 && var_607[88 + var1 * 5 + 1] >= 10) {
                              var2 = Class_17f.sub_657(var0, 38, var4 + var10 - var8 - Class_17f.var_104, var5 + 36 - var19 - 1 - Class_17f.var_13c, 65536, 0, 0, 0);
                              sub_96e(var0, var_607[88 + var1 * 5 + 2], var2 + Class_17f.var_104 + 3, var5 + 36 - var19 - -3);
                           }

                           if (10 + var1 >= 21) {
                              break label201;
                           }

                           var23 = var0;
                           var10001 = 37;
                           var10002 = var4 + 4 + 36;
                        }

                        var2 = Class_17f.sub_657(var23, var10001, var10002 - Class_17f.var_104, var5 + var19 - 1 - Class_17f.var_13c, 65536, 0, 0, 0);
                        sub_96e(var0, var_ff5[10 + var1], var2 + Class_17f.var_104 + 3, var5 + 36 - var19 - -3);
                     }

                     var5 += 36;
                     ++var3;
                  }
               }
            }
         }

         if (var15 == 0 || var15 == 1 || var15 == 2) {
            var5 = Class_17f.var_13c + 0 + 3 + 98 + var_dfb * 36;
            var8 = var10 - 2;
            var0.setColor(16711680);
            var0.fillRect(var4, var5, var10, 40);
            var0.setColor(9043968);
            var0.fillRect(var4, var5 + 1, var10, 38);
            if ((var_d82 & 268435456) != 0 && var21) {
               Class_17f.sub_657(var0, 21 + var16, var4 + 1 - Class_17f.var_104, var5 - Class_17f.var_13c, 0, 16973824 | var8, 0, 0);
            }
         }
      }

      var5 = 141 + var_dfb * 36;
      var8 = var10 - 2;
      if ((var9 = var11 - (98 + var_dfb * 36 + 40)) > 30) {
         var9 = 20;
         var5 = Class_17f.var_dd - 20 - 2;
      }

      if ((var_d55 & 256) == 0) {
         var_d55 |= 256;
         var0.setColor(0);
         var0.fillRect(var4, Class_17f.var_13c + var5, var10, var9);
      }

      var5 += 3;
      Class_17f.sub_657(var0, 48, var4 + 1 - Class_17f.var_104, var5, 0, 16842752 | var8, 0, 0);
      int var12 = Class_17f.sub_5f5(0, 49);
      Class_17f.sub_657(var0, 49, var8 - var12 - 1, var5, 0, 16842752 | var8, 0, 0);
      if ((var_d55 & 1) != 0 || (var_d55 & 2) != 0) {
         var4 = Class_17f.var_104 + 0 + 3;
         var5 = Class_17f.var_13c + 0 + 3;
         var12 = (var_d55 & 1) != 0 ? 41 : 42;
         var8 = Class_17f.sub_5f5(0, var12);
         var0.setColor(16711680);
         var0.fillRect(var4 + (var10 - (var8 + 16) >> 1), var5 + (var11 - 32 >> 1), 16 + var8, 32);
         var0.setColor(9043968);
         var0.fillRect(var4 + (var10 - (var8 + 16) >> 1) + 3, var5 + (var11 - 32 >> 1) + 3, var8 + 16 - 6, 26);
         Class_17f.sub_657(var0, var12, var4 + (var10 - var8 >> 1) - Class_17f.var_104, var5 + 6 + (var11 - 32 >> 1) - Class_17f.var_13c, 0, 0, 0, 0);
      }

      if (var15 == 3) {
         var9 = 40 + 36 * var_dfb;
         var0.setColor(0);
         var0.fillRect(Class_17f.var_104 + 0 + 3, Class_17f.var_13c + 0 + 3 + 98, var10, var9);
         sub_f88(var0);
      }

   }

   private static void sub_ff6(int var0, boolean var1) {
      if ((var_d82 & 134217728) != 0) {
         int var2 = (var_d82 & 983040) >> 16;
         int var3 = (var_d82 & 15728640) >> 20;
         int var5 = (var_d82 & '\uff00') >> 8;
         int var4 = (var_d82 & 255) >> 0;
         boolean var10 = false;
         int var7;
         if (var1) {
            if (var_d22 <= 0) {
               int var9;
               if ((Class_17f.var_30f & 2) != 0) {
                  if ((var_d55 & 1) != 0 || (var_d55 & 2) != 0) {
                     var_d55 = 0;
                  }

                  if ((var_d82 & 268435456) == 0) {
                     var_d55 &= -193;
                     --var3;
                     var_d82 &= -15728641;
                     if (var3 > 0) {
                        var_d82 |= var3 << 20;
                     }
                  } else {
                     if (var3 == 3) {
                        if (var4 > 1) {
                           --var4;
                        }
                     } else {
                        var4 = sub_1011(var4, var5, -1, var3, 1);
                     }

                     var_d82 &= -256;
                     var_d82 |= var4 << 0;
                     var_d55 &= -129;
                     var7 = 0;

                     for(var9 = 0; var9 < var4; ++var9) {
                        if (var9 < 8) {
                           var10 = (var_ff5[0] & 1 << var9) != 0;
                        } else {
                           var10 = var_ff5[10 + var9] != 0;
                        }

                        if (var10) {
                           ++var7;
                        }
                     }

                     if (var7 < var_db7) {
                        --var_db7;
                     }

                     if (var_db7 < 0) {
                        var_db7 = 0;
                     }
                  }

                  var_d22 = 8;
                  return;
               }

               if ((Class_17f.var_30f & 4) != 0) {
                  if ((var_d55 & 1) != 0 || (var_d55 & 2) != 0) {
                     var_d55 = 0;
                  }

                  if ((var_d82 & 268435456) == 0) {
                     var_d55 &= -193;
                     ++var3;
                     var_d82 &= -15728641;
                     if (var3 < var2) {
                        var_d82 |= var3 << 20;
                     } else {
                        var_d82 |= var3 - 1 << 20;
                     }
                  } else {
                     var_d55 &= -129;
                     if (var3 == 3) {
                        if (var4 < 2) {
                           ++var4;
                        }
                     } else {
                        var4 = sub_1011(var4, var5, 1, var3, 0);
                     }

                     var_d82 &= -256;
                     var_d82 |= var4 << 0;
                     var7 = 0;

                     for(var9 = 0; var9 < var4; ++var9) {
                        if (var9 < 8) {
                           var10 = (var_ff5[0] & 1 << var9) != 0;
                        } else {
                           var10 = var_ff5[10 + var9] != 0;
                        }

                        if (var10) {
                           ++var7;
                        }
                     }

                     if (var7 >= var_db7 + var_dfb) {
                        ++var_db7;
                     }
                  }

                  var_d22 = 8;
                  return;
               }

               if ((Class_17f.var_30f & 24) != 0) {
                  if (var3 == 3) {
                     var_d55 = 0;
                     switch(var4) {
                     case 1:
                        if (!Class_ec.sub_37d()) {
                           sub_2f(Class_17f.var_d6b, 6);
                        }
                        break;
                     case 2:
                        var_129e ^= 1;
                     }
                  }

                  var_d22 = 8;
                  return;
               }
            }
         } else if ((Class_17f.var_30f & 1) != 0) {
            if ((var_d55 & 1) == 0 && (var_d55 & 2) == 0) {
               short var10000;
               switch(var3) {
               case 0:
                  if ((var_d82 & 268435456) == 0) {
                     var_db7 = 0;
                     var_d82 &= -65536;
                     var_d82 |= 268439296;
                     if ((var4 = sub_1011(-1, 11, 1, var3, 0)) < 0) {
                        var4 = 0;
                     }

                     var_d82 &= -256;
                     var_d82 |= var4 << 0;
                     var_d55 &= -129;
                     return;
                  } else if (var4 < 8) {
                     if ((var_ff5[0] & 1 << var4) != 0) {
                        Class_147 var13 = var_a69;
                        var13.var_824 &= -17;
                        var_a69.var_954 = 0;
                        var_ff5[5] = (byte)var4;
                        var_a69.var_160 = var_ff5[5];
                        var_d55 |= 1;
                        var_d55 &= -17;
                     } else {
                        var_d55 |= 2;
                     }

                     return;
                  } else {
                     if (var_ff5[var4 + 10] != 0) {
                        var_ff5[25] = (byte)var4;
                        var_d55 |= 1;
                        var_d55 &= -33;
                     } else {
                        var_d55 |= 2;
                     }

                     return;
                  }
               case 1:
                  if ((var_d82 & 268435456) == 0) {
                     var_db7 = 0;
                     var_d82 &= -65536;
                     var_d82 |= 268439296;
                     if ((var4 = sub_1011(-1, 11, 1, var3, 0)) < 0) {
                        var4 = 0;
                     }

                     var_d82 &= -256;
                     var_d82 |= var4 << 0;
                     var_d55 &= -129;
                  } else {
                     var_d55 |= 2;
                     byte var6;
                     if (var4 < 8 || var_ff5[var4 + 10] == 0 || (var6 = var_607[(var4 - 8) * 5 + 88 + 1]) == 12 && (var_ff5[0] & 4) == 0) {
                        return;
                     }

                     if (var6 != 14 || (var_ff5[0] & 16) != 0) {
                        int var8;
                        int var11;
                        label306: {
                           var7 = var_ff5[var6];
                           var8 = 0;
                           if (var6 >= 10 && var6 < 18) {
                              var11 = 1;
                           } else {
                              if (var6 != 2) {
                                 break label306;
                              }

                              var11 = var_a69.var_d;
                           }

                           var8 = var11;
                        }

                        if (var7 >= var8) {
                           return;
                        }

                        label307: {
                           if (var6 >= 10 && var6 < 18) {
                              var11 = var_607[(var4 - 8) * 5 + 88 + 2];
                           } else {
                              if (var6 != 2) {
                                 break label307;
                              }

                              var11 = var_a69.var_d * var_607[100] / 99;
                           }

                           var8 = var11;
                           var7 += var8;
                        }

                        if (var7 > var8) {
                           var7 = var8;
                        }

                        Class_17f.sub_344(var_ff5, var6, (short)var7);
                        --var_ff5[var4 - 8 + 18];
                        var_9d8 |= 2;
                        var_9d8 |= 2;
                        var_d55 &= -3;
                        var_d55 |= 1;
                        return;
                     }
                  }

                  return;
               case 2:
                  if ((var_d82 & 268435456) != 0) {
                     return;
                  }

                  var_db7 = 0;
                  var_d82 &= -65536;
                  var_d82 |= 268439296;
                  if ((var4 = sub_1011(-1, 11, 1, var3, 0)) < 0) {
                     var4 = 0;
                  }

                  var_d82 &= -256;
                  var_d82 |= var4 << 0;
                  var_d55 &= -129;
                  return;
               case 3:
                  if ((var_d82 & 268435456) == 0) {
                     var_db7 = 0;
                     var_d82 &= -65536;
                     var_d82 |= 268435968;
                     var_d82 &= -256;
                     var_d82 |= 1;
                     var_d55 &= -129;
                  } else {
                     var_db7 = 0;
                     var_d82 &= -65536;
                     var_d82 &= -268435457;
                  }

                  return;
               case 4:
                  var10000 = 280;
                  break;
               case 5:
                  var10000 = 278;
                  break;
               default:
                  return;
               }

               sub_11a8(var10000);
               return;
            } else {
               if ((var_d55 & 1) != 0) {
                  var_d82 &= -268500992;
                  var_d82 |= var2 << 8 | var3 << 0;
                  var_d55 &= -129;
               }

               if ((var_d55 & 1) != 0 || (var_d55 & 2) != 0) {
                  var_d55 = 0;
                  return;
               }
            }
         } else if (var0 == 48) {
            var_d55 = 0;
            if ((var_d82 & 268435456) != 0) {
               var_d82 &= -268500992;
               var_d82 |= var2 << 8 | var3 << 0;
               var_d55 &= -129;
               return;
            }

            var_a0a = 1;
            sub_119c();
         }

      }
   }

   private static int sub_1011(int var0, int var1, int var2, int var3, int var4) {
      int var5 = var0;

      boolean var6;
      do {
         var6 = false;
         var5 = var2 < 0 ? var5 - 1 : var5 + 1;
         if (var4 > 0 && var5 < 0) {
            var_d82 &= -268435457;
            return 0;
         }

         if (var5 < 8) {
            if (var3 == 0) {
               var6 = (var_ff5[0] & 1 << var5) != 0;
            }
         } else if (10 + var5 < 25) {
            if (10 + var5 >= 21) {
               if (var3 == 2) {
                  var6 = var_ff5[10 + var5] != 0;
               }
            } else if (var3 == 0 || var3 == 1) {
               var6 = var_ff5[10 + var5] != 0;
            }
         }
      } while(!var6 && var5 <= var1 && var5 >= 0);

      return var6 ? var5 : var0;
   }

   static void sub_1051(boolean var0, int var1, boolean var2) {
      Class_147 var10000;
      if (var0) {
         if (var1 == 0) {
            return;
         }

         var_a45 = var1;
         var_9d8 |= 16;
         if (var2 && (var_a69.var_824 & 2) == 0) {
            var_9d8 |= 32;
            var10000 = var_a69;
            var10000.var_824 |= 2;
         }
      } else {
         if ((var_9d8 & 32) != 0) {
            var10000 = var_a69;
            var10000.var_824 &= -3;
         }

         var_9d8 &= -49;
      }

      for(int var3 = 0; var3 < 16; ++var3) {
         Class_1c2 var4;
         if (((var4 = (Class_1c2)var_670[1 + var3]).var_824 & 8) != 0) {
            int var10001;
            Class_1c2 var5;
            if (var0) {
               var5 = var4;
               var10001 = var4.var_824 | 2;
            } else {
               var5 = var4;
               var10001 = var4.var_824 & -3;
            }

            var5.var_824 = var10001;
         }
      }

   }

   static void sub_10b2() {
      var_ccb = Class_17f.sub_cd(-1, 1);
      var_d14 -= var_ccb;
   }

   public static int sub_10f1(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < 16; ++var7) {
         Class_1c2 var12;
         if (((var12 = (Class_1c2)var_670[1 + var7]).var_824 & 8) == 0) {
            switch(var2) {
            case 1:
               if (var6 == 0) {
                  var12.sub_1ac(var0, var1, var3, var4);
               } else if (var6 == 1) {
                  byte var10;
                  if ((var10 = var_49a[var3 * 17 + 8]) == -1) {
                     return -1;
                  }

                  int var13 = var10 & 255;
                  int var9 = var_49a[var13 * 17 + 0] & 255;
                  int var11 = -1;

                  for(int var8 = 0; var8 < var_788.length; ++var8) {
                     if (var_788[var8] == var9) {
                        var11 = var8;
                        break;
                     }
                  }

                  if (var11 == -1) {
                     return -1;
                  }

                  var12.sub_1ac(var0, var1, var2, var13);
                  var12.var_824 |= 512;
                  var12.var_4f2 = var5;
                  var12.var_9dd = -1;
               }
               break;
            case 6:
               var12.sub_18e(var2, var0, var1, var4, var3);
               break;
            case 10:
            case 11:
               var12.sub_18e(var2, var0, var1, var5, var3);
            }

            return 1 + var7;
         }
      }

      return -1;
   }

   public static boolean sub_1146() {
      for(int var0 = 0; var0 < 16; ++var0) {
         if ((((Class_1c2)var_670[1 + var0]).var_824 & 8) == 0) {
            return true;
         }
      }

      return false;
   }

   public static int sub_1164() {
      int var1 = 0;

      for(int var0 = 0; var0 < 16; ++var0) {
         if ((((Class_1c2)var_670[1 + var0]).var_824 & 520) == 520) {
            ++var1;
         }
      }

      return var1;
   }

   private static void sub_119c() {
      int var0 = sub_1914(6);
      byte var10000;
      if ((var0 = sub_1539(6, var0)) == -2) {
         var10000 = 9;
      } else {
         if (var0 == -1) {
            return;
         }

         var10000 = 10;
      }

      var_a0a = var10000;
   }

   static void sub_11a8(int var0) {
      var_f8f = -1;
      var_cba = 0;
      sub_1051(true, -1, true);
      Class_147 var10000 = var_a69;
      var10000.var_824 &= -17;
      var_9d8 |= 128;
      Class_17f.sub_785(var0, -1, Class_17f.var_89, 0, 0, 0);
   }

   private static void sub_11e5(boolean var0) {
      sub_1051(false, 0, false);
      if (var0) {
         sub_119c();
      }

      if (Class_17f.var_735 == 291) {
         var_a0a = 5;
      } else if ((var_9d8 & 65536) != 0) {
         var_eab = 0;
         var_a0a = 8;
         var_9d8 &= -65537;
      }

      var_9d8 &= -129;
      var_9d8 |= 1024;
      var_d22 = 32;
      sub_1354();
      if ((var_9d8 & 4194304) == 0) {
         sub_1506(0, Class_17f.var_735);
         sub_14bb();
      }

      var_9d8 &= -2097153;
      if (var_a0a == 11) {
         var_d55 = 0;
      }

   }

   private static void sub_11fa() {
      if (var_aed != -1) {
         sub_1254(var_aed);
         var_aed = -1;
      }

   }

   private static void sub_1254(int var0) {
      boolean var1 = true;
      if (sub_1882(var0)) {
         if (Class_17f.sub_39b(var_ff5, var0 - 262, 0, 1, var_10d5)) {
            var1 = false;
         } else {
            Class_17f.sub_3b0(var_ff5, var0 - 262, 0, 1, var_10d5);
         }
      }

      if (var1) {
         sub_11a8(var0);
      }

   }

   private static void sub_1295() {
      if (Class_17f.var_b49 != null) {
         int var0;
         for(var0 = 0; var0 < var_b22.length; ++var0) {
            var_b22[var0] = null;
         }

         for(var0 = 0; var0 < Class_17f.var_b49.length; ++var0) {
            if (Class_17f.var_b49[var0] == '@') {
               ++var0;
               int var1;
               if ((var1 = (Class_17f.var_b49[var0] | 32) - 97) != 13 && var1 != 25 && var1 < var_b22.length && var_b22[var1] == null) {
                  Class_de[] var10000;
                  int var10001;
                  Class_de var10002;
                  if (var_5ab[var1] != -1) {
                     var10000 = var_b22;
                     var10001 = var1;
                     var10002 = Class_ec.sub_b1(var_5ab[var1] & 255);
                  } else {
                     var10000 = var_b22;
                     var10001 = var1;
                     var10002 = null;
                  }

                  var10000[var10001] = var10002;
               }
            }
         }

         if (Class_17f.var_735 >= 272 && Class_17f.var_735 < 285) {
            int var2 = (Class_17f.var_735 - 272) * 16;
            int var3 = var_5fa[0 + var2] & 255;
            int var4 = var_5fa[2 + var2] & 255;
            byte var5 = var_5fa[7 + var2];
            int var6 = var_5fa[5 + var2] & 255;
            int var7 = var_5fa[3 + var2] & 255;
            int var8 = var5 == -1 ? 1 : var_ff5[var5] & 255;
            Class_17f.sub_738(0, 0, var6 * var8, (char[])null, 0, 0);
            if (var3 == 3) {
               var_ff5[var4] = (byte)var7;
               sub_13a3();
            }

            var_ff5[9] = 0;
         }

      }
   }

   private static void sub_12ef(Graphics var0) {
      if (Class_17f.var_87e >= 0) {
         int var10000;
         int var6;
         label85: {
            var6 = 0;
            boolean var5 = false;
            if ((Class_17f.var_8df == -1 || Class_17f.var_8df == Class_17f.var_87e) && var_f8f != -1) {
               var_f7e -= 20;
               if (var_f7e >= 0) {
                  break label85;
               }

               var10000 = 0;
            } else {
               var_f8f = 1;
               var10000 = Class_17f.var_87e >= 0 && Class_17f.var_87e < var_b22.length && var_b22[Class_17f.var_87e] != null ? var_b22[Class_17f.var_87e].var_8a[0].getWidth() : 0;
            }

            var_f7e = var10000;
         }

         int var1 = Class_17f.var_dd - Class_17f.var_a20;
         if (Class_17f.var_87e < var_b22.length && var_b22[Class_17f.var_87e] != null) {
            int var3;
            byte var4;
            int var7;
            label52: {
               var3 = var_b22[Class_17f.var_87e].var_8a[0].getHeight();
               int var2 = var_b22[Class_17f.var_87e].var_8a[0].getWidth();
               if (Class_17f.var_87e >= 8) {
                  var_b72 = Class_17f.var_89 - var2 >> 1;
                  var4 = 0;
                  var10000 = var2;
               } else {
                  if (Class_17f.var_87e >= 1) {
                     var4 = 2;
                     var7 = var2;
                     var_b72 = Class_17f.var_89 - var2 + var_f7e;
                     break label52;
                  }

                  var_b72 = 0;
                  var4 = 0;
                  if ((var6 = var_f7e - 1) < 0) {
                     var6 = 0;
                  }

                  var10000 = var2 - var_f7e;
               }

               var7 = var10000;
            }

            Class_ec.sub_58f(var0, var_b22[Class_17f.var_87e], Class_17f.var_104 + var_b72, Class_17f.var_13c + var1 - var3, 20, var6, 0, var7, var3, var4);
         } else {
            sub_1314(var0, var1);
         }

         if (Class_17f.var_87e >= 0 && Class_17f.var_87e < var_b22.length && (var_9d8 & 8192) == 0 && (Class_17f.var_87e == 7 || Class_17f.var_87e == 6)) {
            var_9d8 |= 8192;
         }

      }
   }

   private static void sub_1314(Graphics var0, int var1) {
      if (var_64b != null && Class_17f.var_87e < var_64b.length) {
         Class_17f.sub_4f7(var_634, var_64b);
         int var2 = Class_17f.sub_5a0(0) - 2 + 3;
         var1 -= var2;
         var0.setColor(4737080);
         var0.fillRect(Class_17f.var_104, Class_17f.var_13c + var1, Class_17f.var_89, var2);
         var0.setColor(6897408);
         var0.drawRect(Class_17f.var_104, Class_17f.var_13c + var1, Class_17f.var_89 - 1, var2);
         Class_17f.sub_657(var0, Class_17f.var_87e, 2, var1 + 2, 0, 0, 0, 0);
         Class_17f.sub_4f7(var_bd6, var_c04);
      }

   }

   private static void sub_1354() {
      if (var_b22 != null) {
         for(int var0 = 0; var0 < var_b22.length; ++var0) {
            Class_ec.sub_828(var_b22[var0]);
            var_b22[var0] = null;
         }
      }

   }

   private static void sub_1365(int var0, int var1, int var2, boolean var3) {
      boolean var16 = false;
      var_9d8 |= 4194304;
      int var13 = (var0 - 272) * 16;
      byte var4 = var_5fa[0 + var13];
      byte var5 = var_5fa[1 + var13];
      byte var6 = var_ff5[var5];
      byte var7 = var_5fa[2 + var13];
      byte var8 = var_ff5[var7];
      byte var14 = var_5fa[3 + var13];
      int var9 = var_5fa[4 + var13] & 255;
      int var10 = var_5fa[5 + var13] & 255;
      byte var11 = var_5fa[6 + var13];
      byte var12 = (var12 = var_5fa[7 + (Class_17f.var_735 - 272) * 16]) == -1 ? 1 : var_ff5[var12];
      int var15 = (var1 - 1) * 2 + var13;
      int var10000;
      byte[] var10001;
      byte var10002;
      if (var3) {
         var10000 = var_cba;
         var10001 = var_5fa;
         var10002 = 8;
      } else {
         var10000 = var_cba;
         var10001 = var_5fa;
         var10002 = 9;
      }

      var_cba = var10000 + var10001[var10002 + var15];
      if (var1 < var2) {
         Class_17f.var_971 = 2;
      } else {
         if (var6 >= var10 * var12 && var8 < var9 && var_cba == var11) {
            var16 = true;
            if (var4 == 1 || var4 == 0) {
               byte[] var17 = var_ff5;
               var17[var5] = (byte)(var17[var5] - var10 * var12);
               byte var18;
               byte var20;
               if (var14 == -1) {
                  var17 = var_ff5;
                  var18 = var7;
                  var20 = (byte)(var17[var7] + 1);
               } else {
                  var17 = var_ff5;
                  var18 = var7;
                  var20 = var_ff5[var14];
               }

               var17[var18] = var20;
            }

            var_9d8 &= -4194305;
         } else {
            var16 = false;
         }

         if (var4 == 0 || var4 == 5) {
            label87: {
               byte var19;
               switch(var_cba) {
               case 0:
                  var_9d8 |= 65536;
                  break label87;
               case 1:
                  var_9d8 |= 65536;
               case 3:
                  sub_1813();
                  var_9d8 &= -4194433;
                  sub_11e5(false);
                  if (var_a0a != 1 && var_a0a != 10) {
                     break label87;
                  }

                  var19 = 0;
                  break;
               case 2:
               default:
                  sub_11e5(false);
                  var_9d8 &= -4194433;
                  if (var4 != 0 || var_a0a != 1 && var_a0a != 10) {
                     break label87;
                  }

                  var19 = 0;
               }

               var_b02 = var19;
               var_aed = 278;
            }
         }

         Class_17f.var_971 = var16 ? 3 : 4;
         var_a69.sub_e3();
         sub_13a3();
      }
   }

   static void sub_13a3() {
      for(int var0 = 0; var0 < 8; ++var0) {
         if (var_ff5[var0 + 10] != 0) {
            byte[] var10000 = var_ff5;
            var10000[0] = (byte)(var10000[0] | 1 << var0 + 0);
         }
      }

   }

   public static int sub_13d2(int var0, int var1) {
      return var1 != 6 && var1 != 5 ? var_607[var_a69.var_160 * 9 + 4] : var0;
   }

   static void sub_1409(int var0, Class_1c2 var1) {
      if (var1 != null && var0 < 0 && (var1.var_1b4 & 524288) != 0) {
         Class_17f.sub_3b0(var_ff5, var1.var_355, 0, 1, var_10f1);
         ++var_ff5[4];
         var_9d8 |= 4096;
         sub_14a1();
         sub_1506(1, var1.var_c4);
         sub_7c9();
         sub_14bb();
      }

   }

   static void sub_144b() {
      for(int var0 = 0; var0 < 16; ++var0) {
         Class_1c2 var1;
         if (((var1 = (Class_1c2)var_670[1 + var0]).var_1b4 & 16) != 0) {
            var1.var_2f9 = Integer.MAX_VALUE;
            var1.sub_328();
         }
      }

   }

   private static void sub_14a1() {
      for(int var0 = 0; var0 < Class_17f.var_1064.length; ++var0) {
         int var1;
         if (((var1 = Class_17f.var_1064[var0] & 255) & 3) == 2) {
            var1 >>= 2;
            Class_17f.var_1064[var0] = (byte)(var1 + 1 << 2 | 0);
            int var3 = var0 / Class_17f.var_cb6[1];
            int var2 = var0 - var3 * Class_17f.var_cb6[1];
            Class_ec.sub_69e(Class_17f.var_cd8[0], var2, var3, 44, 0, true);
         }
      }

   }

   private static void sub_14bb() {
      int var0 = 0;

      while(var0 < 16) {
         int var2;
         Class_1c2 var4;
         if ((var2 = (var4 = (Class_1c2)var_670[1 + var0]).var_9a0) == 1) {
            var2 = 1;
         }

         if (var2 == 2) {
            var2 = 5;
         }

         if (var2 == 3) {
            var2 = 2;
         }

         int var3 = var4.var_c4;
         switch(sub_1539(var2, var3)) {
         case -2:
            if ((var4.var_21a & 524288) == 0) {
               var4.var_824 &= -9;
            }
         default:
            ++var0;
         }
      }

   }

   static void sub_1506(int var0, int var1) {
      for(int var6 = 0; var6 < 77; ++var6) {
         int var5 = var6 * 8;
         short var3 = var_57c[var5];
         if (var_57c[var5 + 1] == var1 && var3 == var0) {
            short var4 = var_57c[var5 + 2];
            byte[] var10000;
            if (var_ff5[8] == var6) {
               var10000 = var_ff5;
               var10000[8] = (byte)(var10000[8] + var4);
               ++var_ff5[4];
               var_9d8 |= 524288;
               return;
            }

            if (var4 <= 0) {
               var10000 = var_ff5;
               var10000[8] = (byte)(var10000[8] - var4);
               var_9d8 |= 524288;
            }
         }
      }

   }

   static int sub_1539(int var0, int var1) {
      short var4 = -1;

      for(int var5 = 0; var5 < 129; ++var5) {
         short var3 = var_534[var5];
         if (var_534[var5 + 129] == var1 && var3 == var0) {
            var4 = var_534[var5 + (2 + var_ff5[8]) * 129];
            break;
         }
      }

      return var4;
   }

   static void sub_1576(boolean var0) {
      if (var_ff5[25] != 15) {
         if (var_ff5[25] >= 8 && var_ff5[25] <= 11) {
            int var3 = var_ff5[25] - 8;
            byte var4;
            if (((var4 = var_607[var3 * 5 + 88 + 1]) != 12 || (var_ff5[0] & 4) != 0) && (var4 != 14 || (var_ff5[0] & 16) != 0)) {
               byte var1;
               int var2;
               label100: {
                  var1 = var_ff5[var4];
                  var2 = 0;
                  int var10000;
                  if (var4 >= 10 && var4 < 18) {
                     var10000 = var_607[(var4 - 10) * 9 + 6];
                  } else {
                     if (var4 != 2) {
                        break label100;
                     }

                     var10000 = var_a69.var_d;
                  }

                  var2 = var10000;
               }

               if (var1 <= 0) {
                  int var6;
                  if (var4 >= 10 && var4 < 18 && !var0) {
                     var6 = var1 + var_607[var3 * 5 + 88 + 2];
                  } else {
                     if (var4 != 2 || !var0) {
                        return;
                     }

                     var6 = var1 + var_a69.var_d * var_607[100] / 99;
                  }

                  if (var6 > var2) {
                     var6 = var2;
                  }

                  Class_17f.sub_344(var_ff5, var4, (short)var6);
                  --var_ff5[var3 + 18];
                  var_9d8 |= 2;
                  if ((var6 = sub_10f1(var_a69.var_591, var_a69.var_5d1, 6, var3, 1028, 0, 0)) != -1) {
                     sub_1051(true, -1, true);
                     ((Class_1c2)var_670[var6]).sub_2b1();
                  }

                  if (var_ff5[var3 + 18] <= 0) {
                     var_ff5[25] = 15;
                  }

                  var_f43 = var_ff5[25] != 15 ? var_ff5[var_ff5[25] - 8 + 18] : 0;
               }

            }
         }
      }
   }

   static void sub_159c(Class_1ac var0, int var1, int var2) {
      var0.sub_530((byte)(1 << var2), (byte)var_412[0 + var2]);
      if (Class_1ac.sub_22c(var0) != var1) {
         var0.sub_292(var1);
      }

   }

   private static void sub_15d4(int var0) {
      int var1;
      if ((var0 & 4) != 0) {
         for(var1 = 0; var1 < 224; var1 += 7) {
            var_ec9[var1 + 0] = Class_17f.sub_cd(0, Class_17f.var_89) + Class_17f.var_104;
            var_ec9[var1 + 1] = Class_17f.sub_cd(0, Class_17f.var_dd) + Class_17f.var_13c;
            int var2 = var_ec9[var1 + 2] = Class_17f.sub_cd(2, 3);
            int var3 = var_ec9[var1 + 3] = Class_17f.sub_cd(20, 24);
            int var4 = Class_17f.sub_cd(80, 200);
            var_ec9[var1 + 4] = var4 * var2 >> 8;
            var_ec9[var1 + 5] = var4 * var3 >> 8;
            var_ec9[var1 + 6] = 24;
         }
      }

      if ((var0 & 128) != 0) {
         for(var1 = 0; var1 < 112; var1 += 7) {
            sub_15f8(var1);
            var_ec9[var1 + 6] = Class_17f.sub_cd(0, 27);
         }
      }

   }

   private static void sub_15f8(int var0) {
      if (var_a69 != null) {
         int var3 = Class_17f.sub_cd(40960, 58880);
         int var4 = Class_17f.sub_cd(0, 256);
         int var1 = Class_ec.sub_abc((long)var3, var4);
         int var2 = Class_ec.sub_acf((long)var3, var4);
         var_ec9[var0 + 0] = var_a69.var_591 + var1;
         var_ec9[var0 + 1] = var_a69.var_5d1 + var2;
         var_ec9[var0 + 2] = -(var1 * Class_17f.sub_cd(0, 2) >> 8);
         var_ec9[var0 + 3] = -(var2 * Class_17f.sub_cd(0, 2) >> 8);
      }
   }

   private static void sub_161f(Graphics var0, int var1) {
      var_eab |= var1;
      if ((var_eab & 0) == 0 && var_eab >= 0) {
         int[] var10000;
         int var10002;
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         if ((var_eab & 128) != 0) {
            for(var2 = 0; var2 < 112; var2 += 7) {
               var10002 = var_ec9[var2 + 6]++;
               var4 = Class_17f.var_104 + (Class_17f.sub_d60(0, var_ec9[var2 + 0]) >> 8);
               var6 = Class_17f.var_13c + (Class_17f.sub_db8(0, var_ec9[var2 + 1]) >> 8);
               Class_ec.sub_58f(var0, var_f1b, var4, var6, 20, 0, var_ec9[var2 + 6] / 3 * 72, 72, 72, 0);
               if (var_ec9[var2 + 6] > 27) {
                  sub_15f8(var2);
                  var_ec9[var2 + 6] = 0;
               }

               var10000 = var_ec9;
               var10000[var2 + 0] += var_ec9[var2 + 2];
               var10000 = var_ec9;
               var10000[var2 + 1] += var_ec9[var2 + 3];
            }
         } else if ((var_eab & 2) != 0) {
            var4 = Class_17f.var_cb6[10];
            var6 = Class_17f.var_cb6[11];
            var3 = var4 / 96 * 96;
            var5 = var6 / 96 * 96;
            var7 = var4 - var3;
            var8 = var6 - var5;
            Class_17f.sub_7f(var0, Class_17f.var_104 - var7, Class_17f.var_13c - var8, Class_17f.var_89 + var7, Class_17f.var_dd - var8, var_f1b, 0, 96, 96);
         } else if ((var_eab & 4) != 0) {
            var0.setColor(12303291);

            for(var2 = 0; var2 < 224; var2 += 7) {
               var3 = var_ec9[var2 + 0];
               var5 = var_ec9[var2 + 1];
               var10002 = var_ec9[var2 + 6]--;
               int var9;
               if (var_ec9[var2 + 6] > 0) {
                  var4 = var3 + var_ec9[var2 + 4];
                  var9 = var5 + var_ec9[var2 + 5];
               } else {
                  var4 = var3;
                  var9 = var5;
               }

               var6 = var9;
               var0.drawLine(var3, var5, var4, var6);
               var10000 = var_ec9;
               var10000[var2 + 0] += var_ec9[var2 + 2];
               var10000 = var_ec9;
               var10000[var2 + 1] += var_ec9[var2 + 3];
               if (var_ec9[var2 + 0] > Class_17f.var_89 - Class_17f.var_104 || var3 == var4 || var_ec9[var2 + 1] > Class_17f.var_dd - Class_17f.var_13c) {
                  var_ec9[var2 + 6] = 24;
                  var_ec9[var2 + 0] = Class_17f.sub_cd(0, Class_17f.var_89) + Class_17f.var_104;
                  var_ec9[var2 + 1] = Class_17f.sub_cd(0, Class_17f.var_dd) + Class_17f.var_13c;
               }
            }
         }

         if ((var_eab & 8) != 0 && Class_17f.sub_cd(0, 2) == 0) {
            for(var2 = 0; var2 < Class_17f.sub_cd(0, 6); ++var2) {
               var3 = Class_17f.sub_cd(0, Class_17f.var_89) + Class_17f.var_104;
               var5 = Class_17f.sub_cd(0, Class_17f.var_dd) + Class_17f.var_13c;
               var4 = var3 + Class_17f.sub_cd(-1, 12);
               var6 = var5 + Class_17f.sub_cd(-12, 12);
               var7 = var4 - Class_17f.sub_cd(-1, 12);
               var8 = var6 - Class_17f.sub_cd(-12, 12);
               var0.setColor(12303291);
               var0.drawLine(var3, var5, var4, var6);
               var0.drawLine(var4, var6, var7, var8);
            }
         }

         if ((var_eab & 32) != 0 && (var_129e & 1) != 0 && Class_17f.var_3b7 % 16 == 0) {
            Class_ec.sub_550();
         }

         if ((var_eab & 16) != 0) {
            sub_10b2();
         }

         if ((var_eab & 256) != 0 && Class_17f.sub_cd(0, 1) + Class_17f.sub_cd(0, 2) == 0) {
            var_9d8 |= 16777216;
         }

      }
   }

   static int sub_1654(int var0) {
      return var0 + 3;
   }

   static void sub_167e() {
      Class_9c var0;
      if ((var0 = Class_ec.sub_bc(31)) != null) {
         var_fc7 = Class_ec.sub_1a1(var0, Class_ec.sub_109(var0));
         var0.var_a6 = null;
         Class_ec.sub_b47(var_fc7);
         var_114a = Class_ec.sub_b95(8);
         var_11c0 = Class_ec.sub_b95(8);
         var_11d4 = Class_ec.sub_b95(16);
         var_11ff = Class_ec.sub_b95(16);
         var_1250 = 3;
         var_119e = 65;
      }

      var_1068 = 33 + (1 * var_11d4 + 7 >> 3);
      var_10d5 = var_1068;
      var_1068 += 1 * var_11c0 + 7 >> 3;
      var_10f1 = var_1068;
      var_1068 += 1 * var_11ff + 7 >> 3;
      var_1068 += 2 * var_1250 + 7 >> 3;
      var_112a = var_1068;
      var_1068 += 1 * var_114a + 7 >> 3;
      var_113c = var_1068;
      var_1068 += 1 * var_119e + 7 >> 3;
      var_109c = 3 * var_1068;
      var_102a = new byte[var_109c + 8];
      var_ff5 = new byte[var_1068];
      sub_1994(0, 0);
      sub_1765();
      if (!sub_170f()) {
         var_129e = 1;
      }

      sub_19ef(Class_1d4.var_22);
   }

   static void sub_16cb() {
      var_fc7 = null;
      var_ff5 = null;
      var_102a = null;
   }

   private static boolean sub_170f() {
      Class_ec.sub_b47(var_102a);
      Class_ec.var_46b = 0;
      byte var0 = (byte)Class_ec.sub_b95(8);
      byte var1 = (byte)Class_ec.sub_b95(8);
      byte var2 = (byte)Class_ec.sub_b95(8);
      var_129e = (byte)Class_ec.sub_b95(8);
      int var4 = (Class_ec.sub_b95(16) << 16) + Class_ec.sub_b95(16);
      if (var0 == 1 && var1 == 22 && var2 == -127) {
         return sub_186a(8, var_109c) == var4;
      } else {
         return false;
      }
   }

   private static void sub_1757(int var0, int var1) {
      Class_ec.sub_b47(var_102a);
      Class_ec.var_46b = 8 + var0 * var_1068 << 3;
      int var2;
      if (var1 == 0) {
         for(var2 = 0; var2 < var_1068; ++var2) {
            var_ff5[var2] = (byte)Class_ec.sub_b95(8);
         }
      } else if (var1 == 1) {
         for(var2 = 0; var2 < var_1068; ++var2) {
            Class_ec.sub_bb3(var_ff5[var2] & 255, 8);
         }
      }

   }

   private static void sub_1765() {
      Class_ec.sub_506(var_102a);
   }

   private static int sub_179c(int var0, int var1, int var2) {
      Class_ec.sub_b47(var_102a);
      Class_ec.var_46b = 8 + var0 * var_1068 + var1 << 3;
      return Class_ec.sub_b95(var2);
   }

   private static void sub_17a9(int var0, int var1, int var2, int var3) {
      Class_ec.sub_b47(var_102a);
      Class_ec.var_46b = 8 + var0 * var_1068 + var1 << 3;
      Class_ec.sub_bb3(var2, var3);
   }

   private static void sub_17b7() {
      Class_ec.sub_b47(var_102a);
      Class_ec.var_46b = 0;
      Class_ec.sub_bb3(1, 8);
      Class_ec.sub_bb3(22, 8);
      Class_ec.sub_bb3(-127, 8);
      Class_ec.sub_bb3(var_129e, 8);
      int var0;
      Class_ec.sub_bb3((var0 = sub_186a(8, var_109c)) >> 16, 16);
      Class_ec.sub_bb3(var0 & '\uffff', 16);
      Class_ec.sub_52a(var_102a);
   }

   static void sub_1813() {
      sub_1765();
      sub_1757(var_10ca, 1);
      sub_17b7();
   }

   private static int sub_186a(int var0, int var1) {
      int var2 = 0;

      for(int var3 = var0; var3 < var0 + var1; ++var3) {
         var2 += var_102a[var3];
      }

      return var2;
   }

   private static boolean sub_1882(int var0) {
      Class_ec.sub_b47(var_fc7);
      Class_ec.var_46b = (6 + var_114a * 4 << 3) + (var0 - 262);
      return Class_ec.sub_b95(1) != 0;
   }

   private static int sub_1890(int var0, int var1) {
      Class_ec.sub_b47(var_fc7);
      Class_ec.var_46b = 6 + var0 * 2 << 3;
      return var1 + Class_ec.sub_b95(16);
   }

   private static int sub_18c9(int var0, int var1) {
      Class_ec.sub_b47(var_fc7);
      Class_ec.var_46b = 6 + var_114a * 2 + var0 * 2 << 3;
      return var1 + Class_ec.sub_b95(16);
   }

   static int sub_1914(int var0) {
      return var_ff5[var0] >= 0 ? 153 + var_ff5[var0] : -1;
   }

   private static void sub_1959(int var0, int var1) {
      var_ff5[var0] = (byte)(var1 >= 153 ? var1 - 153 : var1);
   }

   private static void sub_1994(int var0, int var1) {
      for(int var2 = 0; var2 < var_ff5.length; ++var2) {
         var_ff5[var2] = 0;
      }

      var_ff5[0] = 1;
      var_ff5[1] = 0;
      var_ff5[31] = (byte)var0;
      Class_17f.sub_300(var_ff5, 27, var1);
      var_ff5[4] = 0;
      var_ff5[5] = 0;
      sub_1959(6, 154);
      sub_1959(7, -1);
      var_ff5[8] = 0;
      Class_17f.sub_344(var_ff5, 2, (short)sub_1654(var_ff5[1] & 255));
   }

   private static void sub_19ef(MIDlet var0) {
      var_12dd = var0.getAppProperty("WAP-LINK");
      if (var_12dd != null && !var_12dd.equals("")) {
         if (var_12dd.toLowerCase().equals("NO".toLowerCase())) {
            var_1311 = 1;
         } else {
            var_1311 = 2;
            var_12dd = "http://".concat(var_12dd);
         }
      } else {
         var_1311 = 0;
      }
   }

   public static boolean sub_1a34(MIDlet var0) {
      try {
         boolean var1 = false;
         var0.platformRequest(var_12dd);
         return true;
      } catch (Exception var2) {
         return false;
      }
   }
}
