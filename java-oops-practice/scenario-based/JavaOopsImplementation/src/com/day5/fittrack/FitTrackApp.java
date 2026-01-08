package com.day5.fittrack;

import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User creation
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight: ");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter fitness goal (or press enter for default): ");
        String goal = sc.nextLine();

        UserProfile user;
        if (goal.isEmpty()) {
            user = new UserProfile(name, age, weight);
        } else {
            user = new UserProfile(name, age, weight, goal);
        }

        user.showProfile();

        // Workout selection
        System.out.print("Choose workout (1-Cardio, 2-Strength): ");
        int choice = sc.nextInt();

        System.out.print("Enter duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;
        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        workout.startWorkout();
        workout.stopWorkout();

        int burned = workout.getCaloriesBurned();
        int remaining = user.getDailyCalorieTarget() - burned; // operator usage

        System.out.println("Calories Burned: " + burned);
        System.out.println("Remaining Calories for Today: " + remaining);
    }
}