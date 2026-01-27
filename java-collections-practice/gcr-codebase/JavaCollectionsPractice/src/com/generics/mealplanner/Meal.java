package com.generics.mealplanner;

public class Meal<T extends MealPlan> {

    private T mealPlan;
    private int calories;
    private int protein;

    public Meal(T mealPlan, int calories, int protein) {
        this.mealPlan = mealPlan;
        this.calories = calories;
        this.protein = protein;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public int getCalories() {
        return calories;
    }

    public int getProtein() {
        return protein;
    }

    public String getMealDetails() {
        return "Meal Type: " + mealPlan.getMealType() +
               ", Calories: " + calories +
               ", Protein: " + protein + "g";
    }
}
