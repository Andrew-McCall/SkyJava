package com.sky;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Update Garage to use Arrays
        // Garage size of 5 or whatever you'd like
        // Function which loops through and prints them all (foreach)

        // Ext:
        // Check there's no vehicle duplicates in the garage

        Garage g = new Garage();
        System.out.println("£"+ g.TotalWorth());

        Car c = new Micra();

        System.out.println(g.StoreVehicle(c));                 // 0
        System.out.println(g.StoreVehicle(new Trawler()));     // 1
        System.out.println(g.StoreVehicle(new Lamborghini())); // 2
        System.out.println(g.StoreVehicle(c));                 // 0
        System.out.println(g.StoreVehicle(new Lamborghini())); // 3
        System.out.println(g.StoreVehicle(new Lamborghini())); // -1

        System.out.println(g);

        System.out.println("£"+ g.TotalWorth());

        System.out.println(g.RemoveVehicle(0));

        System.out.println("£"+ g.TotalWorth());

    }

}