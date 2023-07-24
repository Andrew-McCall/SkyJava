package com.sky;

// Methods that the class will have. A class can have multiple interfaces but only one super class
public interface ITame {

    // Will HAVE to be overridden, Abstract Classes have default behaviour
    public void Feed();
    public void Pet();

    public default void DONTDOTHIS(){
        System.out.println("Hello?");
    }

}
