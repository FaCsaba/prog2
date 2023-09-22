package com.csabapro.helloworld;

/**
 * Java doc
 */
public class Main {

    public static void main(String[] args) {
        String name = "World";
        boolean withName = true;
        // int i = 1
        // if (i) { The compiler does not allow you to use non bool values
        if (withName) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("Hello");
        }
    }

}
