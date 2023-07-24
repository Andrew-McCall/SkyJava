package com.sky;

public abstract class Lizard extends Animal{
    public int Salary;

    public Lizard(int height, int weight, int age, int salary) {
        super(height, weight, age);
        Salary = salary;
    }
    public void Swim(){
        System.out.println("Swimming...");
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

}
