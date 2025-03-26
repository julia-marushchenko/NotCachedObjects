//Program to demonstrate comparing two Integers
package com.integers;

// Class Main
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating two Integer variables
        Integer x = 350;
        Integer y = 350;

        // Comparing x and y
        if (x == y) {
            System.out.println("The same");
        } else {
            System.out.println("Not the same"); // Because Integer pool is from -128 to 127
        }

    }
}