package com.sky;

public abstract class Car extends Vehicle{

    @Override
    public String toString() {
        return "Car{" +
                "Wheels=" + Wheels +
                ", Doors=" + Doors +
                ", LicensePlate='" + LicensePlate + '\'' +
                '}' + super.toString();
    }

    private int Wheels;
    private int Doors;
    private String LicensePlate;

    public void Drive(double x){
        Coordinate oldPosition = getPosition();
        Coordinate newPosition = new Coordinate(oldPosition.X + x, oldPosition.Y, oldPosition.Z);
        super.setPosition(newPosition);
    }

    public int getWheels() {
        return Wheels;
    }

    public void setWheels(int wheels) {
        Wheels = wheels;
    }

    public int getDoors() {
        return Doors;
    }

    public void setDoors(int doors) {
        Doors = doors;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }
}
