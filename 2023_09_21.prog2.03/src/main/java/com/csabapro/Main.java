package com.csabapro;

import java.util.Scanner;

public class Main {
    public static final int amountOfEmbers = 2;

    public static void main(String[] args) {
        Human[] humans = new Human[amountOfEmbers];
        final Scanner s = new Scanner(System.in);

        for (int i = 0; i < amountOfEmbers; i++) {
            humans[i] = Human.askForHuman(s);
        }

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].toString());
        }
        s.close();
    }
}