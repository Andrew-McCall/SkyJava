package com.sky;

public class Main {
    public static void main(String[] args){

        Food orange = new Food();
        Food apple = new Food();
//
//        orange.Calories = 100;
//        apple.Calories = 50;
//
//        System.out.println(orange.Calories);
//        System.out.println(apple.Calories);

        apple.setCalories(-59025);
        System.out.println(apple.getCalories());

        orange.setCalories(100);
        apple.setCalories(50);

        System.out.println(orange.getCalories());
        System.out.println(apple.getCalories());

        apple.AddSugar(15);

        System.out.println(apple.Consume());
        System.out.println(orange.Consume());

        System.out.println(orange);
        System.out.println(apple);

    }
}