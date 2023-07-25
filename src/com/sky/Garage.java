package com.sky;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> spaces = new ArrayList<Vehicle>();

    public int StoreVehicle(Vehicle v){
        int currentSpace = FindVehicle(v); // Check if vehicle is already stored
        if (currentSpace == -1) {
            spaces.add(v);
            return spaces.size() - 1; // Returns last element
        }else{
            return currentSpace;
        }
    }

    public Vehicle RemoveVehicle(int index){
        if (index < 0 || index >= spaces.size()) return null;
        return spaces.remove(index);
    }

    // Uses interface
    public void Maintain(){
        for (Vehicle v: spaces){
            if (v instanceof IRadioable){
                ((IRadioable) v).BroadCase("Test");
            }
            if (v instanceof Car){
                Car vAsCar = (Car) v;
                vAsCar.Drive(100);
                vAsCar.Drive(-100);
            }
        }
    }

    // == Checks memory
    // .equals checks inside - object
    public int FindVehicle(Vehicle v){
        return spaces.indexOf(v);
    }

    public int TotalWorth(){
        int currentSum = 0;

        for (Vehicle v: spaces){
            if (v != null){
                currentSum += v.getWorth();
            }
        }

        return currentSum;
    }

    public List<Vehicle> getSpaces() {
        return spaces;
    }


}
