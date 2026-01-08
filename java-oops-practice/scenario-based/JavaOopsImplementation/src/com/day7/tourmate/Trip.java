package com.day7.tourmate;

import java.util.List;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration; // days

    protected Transport transport;
    protected Hotel hotel;
    protected List<Activity> activities;

    protected double budget;

    // Constructor generates complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, List<Activity> activities) {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activities = activities;
        calculateBudget();
    }

    // Operators: hotel + transport + activities
    protected void calculateBudget() {
        budget = transport.getCost() + hotel.getCost();
        for (Activity a : activities) {
            budget += a.getCost();
        }
    }

    public void showSummary() {
        System.out.println("\nDestination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Budget: ₹" + budget);
    }
}
