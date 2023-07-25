package com.sky;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /// Vehicle Class
        // Car Class
        // Boat Class
        // AirPlane Class

        // Make an instantiatable class for each.

        // Make a garage class
        // With at least 3 variables
        // At least 1 of the variables should be for a more specific class than Vehicle
        // (Abstraction)

        // Setters and Getters for each
        // ToString

        // public int StoreVehicle(Vehicle v);
        // Write a function which will check the variables for you and change the correct one
        // (if statements)

        // Write a function which calculates the total cost of the garage vehicles

        Car CarOne = new Micra();
        Vehicle CarTwo = new Lamborghini();
        Trawler BoatOne = new Trawler();

        System.out.println(CarOne);
        System.out.println(CarTwo);
        System.out.println(BoatOne);

        Garage g = new Garage();
        System.out.println(g);

//        g.setSlot1(BoatOne);
//        g.setSlot2((Car) CarTwo); // CarTwo is a Vehicle... which is not enough infomation
//        g.setSlot3(BoatOne);      // BoatOne is a Trawler WHICH IS A BOAT
//
//        System.out.println(g);
        int StoredSlot = g.StoreVehicle(CarOne);
        System.out.println(StoredSlot);
        System.out.println(g);

        int StoredSlotAgain = g.StoreVehicle(BoatOne);
        System.out.println(StoredSlotAgain);
        System.out.println(g);

        int StoredSlotAgainAgain = g.StoreVehicle(BoatOne);
        System.out.println(StoredSlotAgainAgain);
        System.out.println(g);

        System.out.println(g.TotalWorth());
    }

}