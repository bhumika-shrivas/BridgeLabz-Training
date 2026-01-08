package com.day5.fittrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // minutes
    protected int caloriesBurned;

    // internal workout logs (not exposed directly)
    private boolean active;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    @Override
    public void startWorkout() {
        active = true;
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() {
        active = false;
        calculateCalories();
        System.out.println(type + " workout stopped.");
    }

    // Polymorphic behavior
    protected abstract void calculateCalories();

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}