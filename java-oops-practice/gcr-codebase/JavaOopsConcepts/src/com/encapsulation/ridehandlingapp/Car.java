package com.encapsulation.ridehandlingapp;

class Car extends Vehicle {

    public Car(String id, String driver, double ratePerKm) {
        super(id, driver, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return distance * ratePerKm + 50; // base charge
    }
}
