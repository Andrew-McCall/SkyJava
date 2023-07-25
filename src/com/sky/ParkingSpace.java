package com.sky;

public interface ParkingSpace<T> {

    public void Park(T item);
    public T Take();

}
