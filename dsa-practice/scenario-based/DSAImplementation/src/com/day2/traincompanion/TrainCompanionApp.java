package com.day2.traincompanion;

import java.util.Scanner;

public class TrainCompanionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrainCompanion train = new TrainCompanion();

        while (true) {
            System.out.println("""
            1. Add Compartment
            2. Move Next
            3. Move Previous
            4. Show Adjacent Compartments
            5. Remove Compartment
            6. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Compartment name: ");
                    train.addCompartment(sc.nextLine());
                }
                case 2 -> train.moveNext();
                case 3 -> train.movePrevious();
                case 4 -> train.showAdjacent();
                case 5 -> {
                    System.out.print("Remove compartment: ");
                    train.removeCompartment(sc.nextLine());
                }
                case 6 -> {
                    System.out.println("Train navigation closed");
                    return;
                }
            }
        }
    }
}
