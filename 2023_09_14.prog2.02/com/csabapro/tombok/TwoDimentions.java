package com.csabapro.tombok;

public class TwoDimentions {
    public static void main(String[] args) {
        int[][] twoD = new int[5][5];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < i+1; j++) {
                twoD[i][j] = 1;
            }
        }
        
        for (int[] is : twoD) {
            for (int is2 : is) {
                System.out.print(is2+"\t");
            }
            System.out.println();
        }

        // Gyakorlat otthon
        // Lotto
        //
        // Torpedo jatek
    }
}
