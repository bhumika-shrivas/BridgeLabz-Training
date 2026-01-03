package com.encapsulation.ridehandlingapp;

abstract class Vehicle implements GPS {
    private String vehicleId;      // encapsulated
    private String driverName;     // encapsulated
    protected double ratePerKm;
    private String currentLocation = "Unknown";

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation (controlled access)
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String location) {
        this.currentLocation = location;
    }

    abstract double calculateFare(double distance); // Abstraction
}
