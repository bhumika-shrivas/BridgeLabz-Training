package com.inheritance.hybridinheritance.vehiclemanagement;

// Subclass (Inherits Vehicle + Implements Refuelable)
public class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }
}
