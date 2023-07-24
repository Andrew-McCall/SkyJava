package com.sky;

import java.util.Objects;

public class Animal {
    private int Height;
    private int Weight;
    private int Age;

    // Public ClassName ClassName(inputs){}
    // Public ClassName(inputs){}
//    public Animal(){
//        System.out.println("Animal Was Created");
//    }

    public Animal(int height, int weight, int age){
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public void Eat(int food){
        int new_weight = getWeight() + food;
        setWeight(new_weight);
    }

    public void EatTwo(int food){
        this.Weight = getWeight() + food + food;
    }

    public int getHeight(){
        return this.Height;
    }

    public void setHeight(int height){
        this.Height = height;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    @Override // Secret "Extends Object" behaviour override
    public String toString(){
        return "Animal[ Weight=" +this.Weight + ", Height=" +this.Height + ", Age=" + this.getAge() +" ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getHeight() == animal.getHeight() && getWeight() == animal.getWeight() && getAge() == animal.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWeight(), getAge());
    }
}
