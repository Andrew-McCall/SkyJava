package com.sky;

public abstract class Avain extends Animal{
    private double Wingspan;

    public Avain(int height, int weight, int age, double wingspan){
        super(height,weight,age);
        Wingspan = wingspan;
    }

    public void Fly(){
        System.out.println("Flying...");
    }

    public double getWingspan() {
        return Wingspan;
    }

    public void setWingspan(double wingspan) {
        Wingspan = wingspan;
    }
}
