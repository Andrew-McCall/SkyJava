package com.sky;

public class Trawler extends Ship implements IRadioable {
    public Trawler(){
        setEngineSize(150);
        setManufacturer("Sail'n'smiths");
//        setPosition(new Coordinate());
        setSeats(6);
        setWorth(10000);
    }

    @Override
    public String RadioMessage(String message) {
        return "k.";
    }

    @Override
    public void BroadCase(String message) {
        System.out.println(message);
    }
}
