package com.generics.mealplanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WeeklyMealPlan weeklyPlan = new WeeklyMealPlan();

        System.out.print("Enter number of days for meal planning: ");
        int days = sc.nextInt();

        for (int i = 1; i <= days; i++) {

            System.out.println("\nChoose Meal Type for Day " + i + ":");
            System.out.println("1. Vegetarian");
            System.out.println("2. Vegan");
            System.out.println("3. Keto");
            System.out.println("4. High Protein");

            int choice = sc.nextInt();

            System.out.print("Enter Daily Calories: ");
            int calories = sc.nextInt();

            System.out.print("Enter Daily Protein (grams): ");
            int protein = sc.nextInt();

            MealPlan plan = null;

            switch (choice) {
                case 1: plan = new VegeterianMeal(); break;
                case 2: plan = new VeganMeal(); break;
                case 3: plan = new KetoMeal(); break;
                case 4: plan = new HighProteinMeal(); break;
                default:
                    System.out.println("Invalid choice");
                    i--;
                    continue;
            }

            Meal<MealPlan> meal = new Meal<>(plan, calories, protein);

            if (MealValidator.validateMeal(meal)) {
                weeklyPlan.addMeal(meal);
                System.out.println("Meal added successfully");
            } else {
                System.out.println("Meal does not meet dietary requirements");
                i--;
            }
        }

        weeklyPlan.displayWeeklyPlan();
        sc.close();
    }
}
