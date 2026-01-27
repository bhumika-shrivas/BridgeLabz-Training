package com.generics.mealplanner;

public class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public int getMinCalories() {
        return 1300;
    }

    @Override
    public int getMaxCalories() {
        return 2300;
    }

    @Override
    public int getMinProtein() {
        return 45;
    }
}
