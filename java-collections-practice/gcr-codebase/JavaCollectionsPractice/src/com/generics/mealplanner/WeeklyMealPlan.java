package com.generics.mealplanner;

import java.util.ArrayList;
import java.util.List;

public class WeeklyMealPlan {

    private List<Meal<? extends MealPlan>> meals = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        meals.add(meal);
    }

    public void displayWeeklyPlan() {
        System.out.println("\n🍽 Weekly Meal Plan:");
        for (Meal<? extends MealPlan> meal : meals) {
            System.out.println(meal.getMealDetails());
        }
    }
}
