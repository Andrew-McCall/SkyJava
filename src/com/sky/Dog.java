package com.sky;

// Extends is inheritance
public class Dog extends Animal {

    public Dog(){
        super(10,20,03); // new Animal()
        System.out.println("Dog was created");
    }

    public Dog(String breed){
        super(10,20,03);
        setBreed(breed);
    }

    public Dog(String breed, int height, int weight, int age){
        super(height, weight, age);
        setBreed(breed);
    }

    // Extra properties
    private String Breed;

    // Override PolyMorphism
    @Override
    public void setAge(int age) {
        if (age > 20){
            System.out.println("Old Dog");
        }
        super.setAge(age);
    }

    @Override
    public void Eat(int food){
        setHeight(getHeight() + food);
    }

    public void Bark(){
        System.out.println("BARKKK!");
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }
}
