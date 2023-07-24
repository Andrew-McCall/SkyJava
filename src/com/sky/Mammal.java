package com.sky;

public abstract class Mammal extends Animal{
    private boolean isPrimate = false;

    public Mammal(int height, int weight, int age, boolean isprimate) {
        super(height, weight, age);
        isPrimate = isprimate;
    }

    public void Walk(double x, double y){
        Coordinate oldLocation = getLocation();
        Coordinate newLocation = new Coordinate(oldLocation.X + x, oldLocation.Y + y, oldLocation.Z);
        super.setLocation(newLocation); // Encapsulation. SetLocation is Protected
        System.out.println("Walking... "+newLocation.toString());
    }

    public boolean isPrimate() {
        return isPrimate;
    }
}
