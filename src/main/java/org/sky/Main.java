package org.sky;

public class Main {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        double a = 36;
        double b = 3;

        System.out.println(c.Addition(a,b));
        System.out.println(c.Subtraction(a,b));
        System.out.println(c.Multiplication(a,b));
        System.out.println(c.Division(a,b));

        // Maven Project
        // Add junit4 to dep
        /// Create a method, returns the n'th number of the Fibonacci sequence
        // public int Fibonacci(3) = 1              0 1 1 2 3 5 8 13 21
        // Ext: Create a recursive version. No whiles or fors, the loop is via self calling the method

        // Create a test suite for your method

        /// Convert a number to binary.
        // public String DenaryToBinary(5) 0101
        // Ext: Allow any size of number

        // Create test suite for this
        // at least 5 test methods for each class you create
        // Use parameters in your test class
    }

}