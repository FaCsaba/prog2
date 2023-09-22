package com.csabapro.tombok;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Random r = new Random();

        int[] ints = new int[10];
        // ints[0] = 1;

        Arrays.fill(ints, r.nextInt(20));
        Arrays.fill(ints, 5, 7, r.nextInt(10));
        System.out.println(Arrays.toString(ints));
        
        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(20);
        }
        
        // Arrays.sort(ints);
        // Sorting an array with a shitty algorith
        for (int i = 0; i < ints.length-1; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(ints));

        System.out.println("Melyik szamot keresed");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println(Arrays.binarySearch(ints, a) == -1 ? "Nincs benne" : "Benne van");

        s.close();
    }
}