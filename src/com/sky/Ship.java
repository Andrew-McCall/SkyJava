package com.sky;

public abstract class Ship extends Vehicle {
    private double EngineSize;

    @Override
    public String toString() {
        return "Ship{" +
                "EngineSize=" + EngineSize +
                '}' + super.toString();
    }

    public void Sail(double x, double y){
        Coordinate oldPosition = getPosition();
        Coordinate newPosition = new Coordinate(oldPosition.X + x, oldPosition.Y + y, oldPosition.Z);
        setPosition(newPosition);
    }

    public double getEngineSize() {
        return EngineSize;
    }

    public void setEngineSize(double engineSize) {
        EngineSize = engineSize;
    }
}
