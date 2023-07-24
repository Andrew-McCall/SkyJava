package com.sky;

public class Dog extends Mammal{
    public Dog(int height, int weight, int age) {
        super(height, weight, age, false);
    }

    public Dog(int height, int age) {
        this(height, 10, age);
    }

    public Dog(int age){
        this(10,age);
    }

    public Dog(){
        this (10);
    }

    public void Bark(){
        System.out.println("Woof!");
    }
}
