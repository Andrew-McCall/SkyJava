package org.sky;

public class Student {
    
    private String Name;
    private int Score;
    private int Age;

    public Student(String name, int score, int age) {
        Name = name;
        Score = score;
        Age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Name='" + Name + '\'' +
                ", Score=" + Score +
                ", age=" + Age +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

}
