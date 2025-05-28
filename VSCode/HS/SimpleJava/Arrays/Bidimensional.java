package HS.SimpleJava.Arrays;

// Source code is decompiled from a .class file using FernFlower decompiler.
class Bidimensional {
   Bidimensional() {
   }

   public static void main(String[] var0) {
      int[][] var1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

      int var2;
      int var3;
      for(var2 = 0; var2 < var1.length; ++var2) {
         for(var3 = 0; var3 < var1.length; ++var3) {
            System.out.println("Valor de la fila " + var2 + " y la columna " + var3 + "=" + var1[var2][var3]);
         }
      }

      for(var2 = 0; var2 < var1.length; ++var2) {
         for(var3 = 0; var3 < var1.length; ++var3) {
            System.out.print(var1[var2][var3] + " ");
         }

         System.out.println();
      }

   }
}

