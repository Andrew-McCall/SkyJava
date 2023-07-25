package com.sky;

public abstract class Vehicle extends Object {

    private int Seats;
    private int Worth;
    private String Manufacturer;
    private Coordinate Position = new Coordinate();

    @Override
    public String toString() {
        return "Vehicle{" +
                "Seats=" + Seats +
                ", Worth=" + Worth +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", Position=" + Position +
                '}';
    }

    protected void setPosition(Coordinate position){
        Position = position;
    }

    protected void setWorth(int worth){
        Worth = worth;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public int getSeats() {
        return Seats;
    }

    public int getWorth() {
        return Worth;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public Coordinate getPosition() {
        return Position;
    }
}
