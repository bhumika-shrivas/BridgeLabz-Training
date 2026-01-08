package com.day6.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, "Truck", 100);
    }

    @Override
    public double calculateCharges(int hours) {
        int penalty = hours > 4 ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
