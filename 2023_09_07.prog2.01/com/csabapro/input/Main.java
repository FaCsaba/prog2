package com.csabapro.input;

public class Main {
    public static void main(String[] args) {
        boolean withName = args.length > 0;
        if (withName) {
            System.out.println("Hello "+args[0]);
        } else {
            System.out.println("Hello");
        }
    }
}
