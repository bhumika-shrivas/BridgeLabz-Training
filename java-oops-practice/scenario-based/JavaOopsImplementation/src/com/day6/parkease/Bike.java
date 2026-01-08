package com.day6.parkease;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, "Bike", 20);
    }

    @Override
    public double calculateCharges(int hours) {
        int penalty = hours > 6 ? 50 : 0;
        return (baseRate * hours) + penalty;
    }
}