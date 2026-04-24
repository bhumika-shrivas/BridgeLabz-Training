package com.generics.mealplanner;

public class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public int getMinCalories() {
        return 1500;
    }

    @Override
    public int getMaxCalories() {
        return 3000;
    }

    @Override
    public int getMinProtein() {
        return 70;
    }
}
