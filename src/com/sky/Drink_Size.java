package com.sky;

import java.util.ArrayList;

public enum Drink_Size {
    SMALL(1.90, 350),
    MEDIUM(2.55, 470),
    LARGE(3.10, 560);

    private final double price;
    private final int volume;

    Drink_Size(double price, int volume) {
        this.price = price;
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public double pricePer100Ml() {
        return price / (volume / 100);
    }

    public double multipleDrinkPrice(int numberOrdered) {
        return price * numberOrdered;
    }

}