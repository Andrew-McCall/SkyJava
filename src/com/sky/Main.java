package com.sky;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ARDictionary.HelloWorld();

        Car.SetGlobalCounter(987256);
        Car c1 = new Car("Black");
        Car c2 = new Car("Pink");
        System.out.println(Car.GetGlobalCounter());
        Car c3 = new Car("White");
        System.out.println(Car.GetGlobalCounter());
        Car c4 = new Car("Yellow");
        Car c5 = new Car("Red");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        System.out.println(Util.add(145921,5123582));
    }

}