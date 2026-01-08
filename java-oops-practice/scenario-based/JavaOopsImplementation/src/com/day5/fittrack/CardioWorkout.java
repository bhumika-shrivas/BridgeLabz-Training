package com.day5.fittrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    // Cardio burns more calories
    @Override
    protected void calculateCalories() {
        caloriesBurned = duration * 10; // operator usage
    }
}
