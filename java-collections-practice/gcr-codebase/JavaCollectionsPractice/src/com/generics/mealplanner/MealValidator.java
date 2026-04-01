package com.generics.mealplanner;

public class MealValidator {

    public static <T extends MealPlan> boolean validateMeal(
            Meal<T> meal) {

        T plan = meal.getMealPlan();

        boolean caloriesValid =
                meal.getCalories() >= plan.getMinCalories() &&
                meal.getCalories() <= plan.getMaxCalories();

        boolean proteinValid =
                meal.getProtein() >= plan.getMinProtein();

        return caloriesValid && proteinValid;
    }
}
