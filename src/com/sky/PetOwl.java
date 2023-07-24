package com.sky;

public class PetOwl extends Owl implements ITame{
    @Override
    public void Feed() {
        Eat(0);
    }

    @Override
    public void Pet() {
        Hoot();
    }
}
