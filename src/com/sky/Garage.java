package com.sky;

public class Garage {

    private Vehicle Slot1; // null
    private Car Slot2; // null
    private Ship Slot3; // null

    public int StoreVehicle(Vehicle v){
        if (Slot1 == null){
            Slot1 = v;
            return 1;
        }

        if (Slot2 == null && v instanceof Car){
            Slot2 = (Car) v;
            return 2;
        }

        if (Slot3 == null && v instanceof Ship){
            Slot3 = (Ship) v;
            return 3;
        }

        return -1;
    }

    public int TotalWorth(){
        int currentSum = 0;
        if (Slot1 != null){
            currentSum += Slot1.getWorth();
        }
        if (Slot2 != null){
            currentSum += Slot2.getWorth();
        }
        if (Slot3 != null){
            currentSum += Slot3.getWorth();
        }
        return currentSum;
    }

    public Vehicle getSlot1() {
        return Slot1;
    }

    public void setSlot1(Vehicle slot1) {
        Slot1 = slot1;
    }

    public Car getSlot2() {
        return Slot2;
    }

    public void setSlot2(Car slot2) {
        Slot2 = slot2;
    }

    public Ship getSlot3() {
        return Slot3;
    }

    public void setSlot3(Ship slot3) {
        Slot3 = slot3;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "Slot1=" + Slot1 +
                ", Slot2=" + Slot2 +
                ", Slot3=" + Slot3 +
                '}';
    }
}
