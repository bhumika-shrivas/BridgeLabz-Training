package com.inheritance.hybridinheritance.vehiclemanagement;

// Subclass ( Inherits Vehicle, adds its own behavior)
public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}
