package com.day6.parkease;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, "Car", 50);
    }

    @Override
    public double calculateCharges(int hours) {
        int penalty = hours > 5 ? 100 : 0;
        return (baseRate * hours) + penalty;
    }
}
