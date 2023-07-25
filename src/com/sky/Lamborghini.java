package com.sky;

public class Lamborghini extends Car{
    private boolean IsSunRoofOpen;

    public Lamborghini(){
//        setPosition(new Coordinate());
        setWorth(25000);
        setDoors(3);
        setManufacturer("Ferrari");
        setWheels(4);
        setSunRoofOpen(false);
    }

    public boolean isSunRoofOpen() {
        return IsSunRoofOpen;
    }

    public void setSunRoofOpen(boolean sunRoofOpen) {
        IsSunRoofOpen = sunRoofOpen;
    }
}
