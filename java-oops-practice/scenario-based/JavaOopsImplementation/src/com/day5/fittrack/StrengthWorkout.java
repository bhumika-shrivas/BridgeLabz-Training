package com.day5.fittrack;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    // Strength burns calories differently
    @Override
    protected void calculateCalories() {
        caloriesBurned = duration * 7; // operator usage
    }
}