package com.day3.cabbygo;

abstract class Vehicle implements IRideService {
    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    private double fare; // sensitive

    Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    protected void setFare(double fare) {
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }
}
