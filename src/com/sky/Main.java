package com.sky;

public class Main {
    public static void main(String[] args){

        // OOP Principles
        // Abstraction    - When a Dog is saved as an Animal
        // Polymorphism   - "@Override"
        // Encapsulation  - Private vs Public (Protected)
        // Inheritance    - "Extends" Keyword

        // Abstraction Example
        Animal joe = new Owl();

        joe.Eat(5);
//        joe.fly();
//        joe.Hoot;

        if (joe instanceof Owl){
            Owl joeAsOwl = (Owl) joe;
            joeAsOwl.Hoot();
            joeAsOwl.Fly();
        }

        // Mammal James = new Mammal(...) // CANNOT DO SINCE Mammal IS ABSTRACT
        Mammal james = new Dog(10,10,10);

        james.Walk(10,10);
        james.Walk(-3,-5);
        james.Walk(53,19);

//      Abstract classes cannot be INSTANTIATED
//      Animal example = new Animal();


    }
}