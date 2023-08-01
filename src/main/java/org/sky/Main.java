package org.sky;

public class Main {

    public static void main(String[] args) {

        ClassList myClass = new ClassList();

        myClass.addStudent(new Student("David", 49, 61));
        myClass.addStudent(new Student("Andrew", 99, 21));
        myClass.addStudent(new Student("McCall", 89, 23));
        myClass.addStudent(new Student("Jon", 100, 16));


        System.out.println("Function: myClass.getStudents()");
        myClass.getStudents().forEach(s -> System.out.println(s));

        System.out.println("Function: myClass.getPassedStudents()");
        myClass.getPassedStudents(90).forEach(s -> System.out.println(s));

        System.out.println(String.format("Count: %d", myClass.getCount()));

        System.out.println("Function: myClass.getAgeSortedStudents()");
        myClass.getAgeSortedStudents().forEach(System.out::println);

        System.out.println("Function: myClass.getNameSortedAdultsStudents()");
        myClass.getNameSortedAdultsStudents().forEach(System.out::println);

    }

}