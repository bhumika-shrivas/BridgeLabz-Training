package com.day7.tourmate;

public class Activity {

    private String activityName;
    private double cost; // 🔒 hidden cost

    public Activity(String activityName, double cost) {
        this.activityName = activityName;
        this.cost = cost;
    }

    protected double getCost() {
        return cost;
    }

    public String getActivityName() {
        return activityName;
    }
}
