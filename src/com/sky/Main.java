package com.sky;

public class Main {
    public static void main(String[] args){

        Animal cow = new Animal(10,20,03);
        Animal cat = new Animal(10,20,03);

        System.out.println(cow.getAge());
        cow.setAge(10);

        System.out.println(cow.getAge());
        System.out.println(cat.getAge());

        cat.Eat(99);
        System.out.println(cat.getWeight());

        System.out.println(cat.toString());
        System.out.println(cow.toString());

        // Calls the inbuilt secret Object method toString
        Object cowAsObject = (Object) cow;
        Object anObject = new Object();
        System.out.println(anObject);

        System.out.println(cow);

        // even though this is an object. Its still storing the properites of cow
        // AND the behaviours such as the custom toString
        System.out.println(cowAsObject);

        Dog doug = new Dog();
        doug.setAge(100);
        doug.Eat(4);
        System.out.println("Dog! "+ doug.toString());

        doug.Bark();

        Animal dogAsAnimal = new Dog(); // Instance is what controls the behaviour
        dogAsAnimal.setAge(21);
        dogAsAnimal.Eat(200);

//        dogAsAnimal.getBreed();
//        dogAsAnimal.Bark();

        System.out.println(dogAsAnimal);
        if (dogAsAnimal instanceof Dog) {
//            ((Dog) dogAsAnimal).Bark();

            Dog dogAsDog = (Dog) dogAsAnimal;
            dogAsDog.Bark();
            dogAsDog.setBreed("Collie");
            System.out.println(dogAsDog.getBreed());
        }

        Animal breededDog = new Dog("Fluffy");
        System.out.println(((Dog) breededDog).getBreed());

        Dog completeDog = new Dog("Fluffy", 10, 20, 30);
        System.out.println(((Dog) completeDog).getBreed());
        System.out.println(completeDog);
    }
}