package com.sky;

// Only ever one SuperClass (Parent) - Multiple Interfaces
public class Dog extends Mammal implements ITame, ILarge {
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

    @Override
    public void Feed() {
        System.out.println("Snack");
    }

    @Override
    public void Pet() {
        System.out.println("Belly Rub");
    }


    @Override
    public void Ride() {
        System.out.println("Oww!");
    }

}
