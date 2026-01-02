package com.day2.vehiclerentalsystem;

// Base Class – Vehicle (Encapsulation + Inheritance)
abstract class Vehicle implements Rentable {
    protected String vehicleNumber;
    protected double baseRate;

    Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }
}
