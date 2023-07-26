package com.sky;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // Enums*
        // Inputs*
        // Exceptions - Try and Catch*
        // Lambdas
        // EOD Task

//        throw new Exception();

        // Person Object
        // Static Method - public Person PersonForm() - Scanner with inputs
        // Ext: 2Player Rock paper scissors

        // A person Object must include
        // Job Enum, age, name
        // Checks for vaild inputs
        // STATIC

        // Ext: If the input is invaild, Messge why - Not to reset progress.

//        Person p = Person.PersonCreator(); // static

//        Person p = new Person();           // instance
//        p.setup()

        int b = 19;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            int a = sc.nextInt();

            // %d integer
            // %s String
            // %f decimal number, float
            // String.format("template", inputs)
            System.out.println(String.format("%d / %d = %f", b , a, ((double) b) / a));
            int check = b/a;

        } catch (ArithmeticException e){
            System.out.println("Arthimetic Error");

        } catch (Exception e){
            System.out.println("Execption");

        } finally {
            System.out.println("Always Run");

        }


    }

}