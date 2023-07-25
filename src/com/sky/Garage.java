package com.sky;

public class Garage {

    private Vehicle[] spaces = new Vehicle[4];

    public int StoreVehicle(Vehicle v){
        int currentSpace = FindVehicle(v); // Check if vehicle is already stored
        if (currentSpace == -1) {
            for (int i = 0; i < spaces.length; i++) {
                if (spaces[i] == null) { // Find first empty space
                    spaces[i] = v;
                    return i;
                }
            }
        }else{
            return currentSpace;
        }
        return -1;
    }

    public Vehicle RemoveVehicle(int index){
        if (index < 0 || index >= spaces.length) return null;
        Vehicle v = spaces[index];
        spaces[index] = null;
        return v;
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
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == v){
                return i;
            }
        }
        return -1;
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

    public Vehicle[] getSpaces() {
        return spaces;
    }


}
