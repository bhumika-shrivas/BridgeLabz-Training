package com.day10.birdsanctuary;

import java.util.*;

public class SanctuaryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        System.out.println("Welcome to EcoWing Bird Sanctuary");

        while (true) {
            System.out.println("""
            1. Add Bird
            2. Display All Birds
            3. Display All Flying Birds
            4. Display All Swimming Birds
            5. Display Both Flying & Swimming Birds
            6. Delete Bird by ID
            7. Sanctuary Report
            8. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Bird Type (Eagle/Duck/Penguin/Kiwi): ");
                    String type = sc.nextLine();

                    System.out.print("Bird ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Bird Name: ");
                    String name = sc.nextLine();

                    Bird bird = switch (type.toLowerCase()) {
                        case "eagle" -> new Eagle(id, name);
                        case "duck" -> new Duck(id, name);
                        case "penguin" -> new Penguin(id, name);
                        case "kiwi" -> new Kiwi(id, name);
                        default -> null;
                    };

                    if (bird != null) {
                        birds.add(bird);
                        System.out.println("Bird added successfully");
                    } else {
                        System.out.println("Invalid bird type");
                    }
                }

                case 2 -> {
                    for (Bird b : birds) {
                        System.out.println(
                            "ID: " + b.getId() +
                            ", Name: " + b.getName() +
                            ", Species: " + b.getSpecies()
                        );
                        b.eat();
                    }
                }

                case 3 -> {
                    for (Bird b : birds) {
                        if (b instanceof Flyable f) {
                            System.out.println(b.getName());
                            f.fly();
                        }
                    }
                }

                case 4 -> {
                    for (Bird b : birds) {
                        if (b instanceof Swimmable s) {
                            System.out.println(b.getName());
                            s.swim();
                        }
                    }
                }

                case 5 -> {
                    for (Bird b : birds) {
                        if (b instanceof Flyable && b instanceof Swimmable) {
                            System.out.println(b.getName());
                        }
                    }
                }

                case 6 -> {
                    System.out.print("Enter Bird ID to delete: ");
                    int delId = sc.nextInt();
                    birds.removeIf(b -> b.getId() == delId);
                    System.out.println("Bird removed (if existed)");
                }

                case 7 -> {
                    int fly = 0, swim = 0, both = 0, neither = 0;

                    for (Bird b : birds) {
                        boolean f = b instanceof Flyable;
                        boolean s = b instanceof Swimmable;

                        if (f && s) both++;
                        else if (f) fly++;
                        else if (s) swim++;
                        else neither++;
                    }

                    System.out.println("Sanctuary Report:");
                    System.out.println("Flyable: " + fly);
                    System.out.println("Swimmable: " + swim);
                    System.out.println("Both: " + both);
                    System.out.println("Neither: " + neither);
                }

                case 8 -> {
                    System.out.println("Exiting Sanctuary System");
                    return;
                }
            }
        }
    }
}
