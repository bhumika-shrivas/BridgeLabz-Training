package com.day5.fittrack;

public class UserProfile {

    private String name;
    private int age;
    private double weight;   // 🔒 protected health data
    private String goal;
    private int dailyCalorieTarget;

    // Constructor with default goal
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Maintain Fitness");
    }

    // Constructor with custom goal
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        calculateDailyTarget();
    }

    // Encapsulation → no direct access to weight
    public double getWeight() {
        return weight;
    }

    public int getDailyCalorieTarget() {
        return dailyCalorieTarget;
    }

    private void calculateDailyTarget() {
        // simple logic using operators
        dailyCalorieTarget = (int) (weight * 30);
    }

    public void showProfile() {
        System.out.println("User: " + name);
        System.out.println("Age: " + age);
        System.out.println("Goal: " + goal);
        System.out.println("Daily Calorie Target: " + dailyCalorieTarget);
    }
}
