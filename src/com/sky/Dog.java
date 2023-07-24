package com.sky;

public class Dog extends Mammal{
    public Dog(int height, int weight, int age) {
        super(height, weight, age, false);
    }

    public Dog(int height, int age) {
        this(height, 4, age);
    }

    public Dog(int age){
        this(5,age);
    }

    public Dog(){
        this (6);
    }

    public Dog OldDog(){
        return new Dog(100);
    }

    public void Bark(){
        System.out.println("Woof!");
    }
}
