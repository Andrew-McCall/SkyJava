package com.sky;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Lambdas

//        Integer[] numbersOne = {1,2,3,4,5}; // Prepopulated Arrays
//        List<Integer> numbersTwo = new ArrayList<Integer>(List.of(new Integer[]{1, 2, 3, 4, 5})); // Can prepopulateArrayLists

        List<Integer> numbers = new ArrayList();

        for (int i = 1; i < 10; i++) {
            numbers.add(i*19);
        }

        System.out.println(numbers);

//        for (int i : numbers){
//            System.out.println(i);
//        }

        // Lambda
        numbers.forEach(x -> {x *= 2; System.out.println(x);});

        numbers.forEach(i -> System.out.println(i));

        int output = Operate(1420, 2014, (int x, int y) -> {return x * y;});
        System.out.println(output);

        output = Operate(666666, 2014, new Example());
        System.out.println(output);
    }

    public static int Operate(int a, int b, FuncInterface func){
        return func.Operation(a, b);
    }

    // ArrayList.forEach
    // Print every number
    // Print only numbers divisible by 3

    // Create a FuncInterface
    // double Operation(double a, double b);
    // Have a "Calculator Static Function"
    // be used with 3 lamdas

    // e.g int output = Operate(1420, 2014, (int x, int y) -> {return x * y;});
    // Each lamda doing a different operation, return a+b, return a/b or return a*a+b*b

    // Ext: Add to the Personform task
}

interface FuncInterface{
    int Operation(int a, int b);
}

class Example implements  FuncInterface{
    @Override
    public int Operation(int a, int b) {
        return a/b;
    }
}