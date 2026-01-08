package com.day6.parkease;

public abstract class Vehicle implements IPayable {

    protected String vehicleNumber;
    protected String type;
    protected double baseRate;

    public Vehicle(String vehicleNumber, String type, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.baseRate = baseRate;
    }

    public String getType() {
        return type;
    }
}
