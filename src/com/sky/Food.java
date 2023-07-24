package com.sky;

public class Food {
    // primatives have default values
    // objects (like string) are null
    private int Calories;
    private String Taste;

    public void AddSugar(int sugar){
        this.Calories += sugar * 974;
    }

    public double Consume(){
        // Calories to Kj
        return this.Calories / 239.005736d;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        // Validation
        if (calories < 0){
            Calories = 0;
        }else{
            Calories = calories;
        }
    }

    public String getTaste() {
        return Taste;
    }

    public void setTaste(String taste) {
        Taste = taste;
    }

    @Override
    public String toString() {
        return "Food{" +
                "Calories=" + Calories +
                ", Taste='" + Taste + '\'' +
                '}';
    }
}
