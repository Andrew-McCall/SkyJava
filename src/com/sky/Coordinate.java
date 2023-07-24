package com.sky;

public class Coordinate {
    public double X;
    public double Y;
    public double Z;

    public Coordinate(){

    }

    public Coordinate(double x, double y, double z){
        X = x;
        Y = y;
        Z = z;
    }

    @Override
    public String toString() {
        return "Coordinate[" +
                "X=" + X +
                ", Y=" + Y +
                ", Z=" + Z +
                ']';
    }
}
