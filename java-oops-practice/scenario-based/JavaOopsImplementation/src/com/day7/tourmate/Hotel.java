package com.day7.tourmate;

public class Hotel {

    private String name;
    private double costPerNight; // 🔒 hidden pricing
    private int nights;

    public Hotel(String name, double costPerNight, int nights) {
        this.name = name;
        this.costPerNight = costPerNight;
        this.nights = nights;
    }

    protected double getCost() {
        return costPerNight * nights;
    }

    public String getName() {
        return name;
    }
}
