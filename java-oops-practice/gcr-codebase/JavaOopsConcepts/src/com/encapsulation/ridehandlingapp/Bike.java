package com.encapsulation.ridehandlingapp;

class Bike extends Vehicle {

    public Bike(String id, String driver, double ratePerKm) {
        super(id, driver, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return distance * ratePerKm; // economical
    }
}
