package com.sky;

public class CowBuilder {

    private int Height;
    private int Weight;
    private int Age;
    private boolean IsPrimate;

    public CowBuilder(){

    }

    public Cow Build(){
        return new Cow(Height, Weight, Age, IsPrimate);
    }

    public CowBuilder AddHeight(int height){
        this.Height = height;
        return this;
    }

    public CowBuilder AddWeight(int weight){
        this.Weight = weight;
        return this;
    }

    public CowBuilder AddWeightKg(int weight){
        this.Weight = weight*16;
        return this;
    }

    public CowBuilder AddAge(int age){
        this.Age = age;
        return this;
    }

    public CowBuilder AddIsPrimate(boolean isPrimate){
        this.IsPrimate = isPrimate;
        return this;
    }
}
