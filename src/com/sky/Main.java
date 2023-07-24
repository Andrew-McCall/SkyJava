package com.sky;

import java.util.ArrayList;

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

        PetOwl Hedwig = new PetOwl();
        Hedwig.Pet();

        // Abstraction.
        // I can treat any of my classes and an animal.
        // Because tehy are all chilrden of animal
        ArrayList<Animal> zoo = new ArrayList();
        zoo.add(Hedwig); // Pet Owl
        zoo.add(new Owl());
        zoo.add(james);  // Dog

        // Abstraction.
        // I can treat any of my classes and an animal.
        // Because tehy are all chilrden of animal
        ArrayList<ITame> pets = new ArrayList();
        pets.add(Hedwig); // Pet Owl
        // OWL is not ITame
//        pets.add(new Owl());
        // James is a Mammal. which is not Tamed
//        pets.add(james);  // Dog
        pets.add((ITame) james);

        ((ITame) james).DONTDOTHIS();

        // Builder Pattern
        Cow dasiy = new CowBuilder().AddAge(10).AddHeight(54).AddWeight(52).AddIsPrimate(false).Build();
        Cow dasiy2 = new CowBuilder().AddAge(10).AddHeight(54).AddWeightKg(14).AddIsPrimate(false).Build();

        CowBuilder lotsofsteps = new CowBuilder();
        lotsofsteps.AddAge(523);
        // other logic
        lotsofsteps.AddHeight(56356);
        // other logic
        Cow two = lotsofsteps.Build();

        System.out.println(dasiy);
        System.out.println(dasiy2);

    }
}