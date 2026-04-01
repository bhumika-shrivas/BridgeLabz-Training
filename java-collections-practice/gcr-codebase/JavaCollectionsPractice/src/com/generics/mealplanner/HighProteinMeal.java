package com.generics.mealplanner;

public class HighProteinMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "High Protein";
    }

    @Override
    public int getMinCalories() {
        return 1600;
    }

    @Override
    public int getMaxCalories() {
        return 2800;
    }

    @Override
    public int getMinProtein() {
        return 90;
    }
}
