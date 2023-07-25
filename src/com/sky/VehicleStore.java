package com.sky;

public class VehicleStore implements ParkingSpace<Vehicle>{

    private  Vehicle space;

    @Override
    public void Park(Vehicle item) {
        space = item;
    }

    @Override
    public Vehicle Take() {
        if (space == null) return null;

        Vehicle temp = space;
        space = null;
        return temp;
    }
}
