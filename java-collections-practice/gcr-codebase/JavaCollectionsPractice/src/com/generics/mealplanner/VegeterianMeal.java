package com.generics.mealplanner;

public class VegeterianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public int getMinCalories() {
        return 1200;
    }

    @Override
    public int getMaxCalories() {
        return 2500;
    }

    @Override
    public int getMinProtein() {
        return 40;
    }
}
