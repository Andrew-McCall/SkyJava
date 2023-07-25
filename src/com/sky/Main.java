package com.sky;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car c = new Micra();
        ParkingSpace<Vehicle> space = new VehicleStore();

        space.Park(c);
        System.out.println(space.Take()); // Micra
        System.out.println(space.Take()); // Null

        ParkingSpace<Ship> dock = new GenericStore<Ship>();
        dock.Park(new Trawler());
//        dock.Park(new Micra()); - Not a ship
        System.out.println(dock.Take()); // Trawler
        System.out.println(dock.Take()); // Null

    }

}