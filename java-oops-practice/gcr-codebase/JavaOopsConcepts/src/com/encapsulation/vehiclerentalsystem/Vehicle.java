package com.encapsulation.vehiclerentalsystem;

abstract class Vehicle {
    private String vehicleNumber;        // encapsulated
    protected String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    abstract double calculateRentalCost(int days); // Abstraction
}
