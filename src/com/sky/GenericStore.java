package com.sky;

public class GenericStore<E> implements ParkingSpace<E>{

    private E Space;

    @Override
    public void Park(E item) {
        Space = item;
    }

    @Override
    public E Take() {
        if (Space == null) return null;

        E temp = Space;
        Space = null;
        return temp;
    }
}
