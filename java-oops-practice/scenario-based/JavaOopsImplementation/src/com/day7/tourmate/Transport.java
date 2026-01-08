package com.day7.tourmate;

public class Transport {

    private String mode;
    private double cost; // 🔒 hidden cost breakdown

    public Transport(String mode, double cost) {
        this.mode = mode;
        this.cost = cost;
    }

    protected double getCost() {
        return cost;
    }

    public String getMode() {
        return mode;
    }
}
