package com.encapsulation.ridehandlingapp;

class Auto extends Vehicle {

    public Auto(String id, String driver, double ratePerKm) {
        super(id, driver, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return distance * ratePerKm + 20; // small surcharge
    }
}
