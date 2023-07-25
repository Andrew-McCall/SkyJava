package com.sky;

public class Car {

    private static long GlobalCounter = 0;
    private String Colour;
    private long VIM;

    public static long GetGlobalCounter(){
        return GlobalCounter;
    }

    public static void SetGlobalCounter(long newNumber){
        GlobalCounter = newNumber;
    }

    public Car(String colour){
        this.Colour = colour;
        this.VIM = GlobalCounter++;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public long getVIM() {
        return VIM;
    }

    protected void setVIM(long VIM) {
        this.VIM = VIM;
    }

    @Override
    public String toString() {
        return "{" +
                "C='" + Colour + '\'' +
                ", V=" + VIM +
                '}';
    }
}
