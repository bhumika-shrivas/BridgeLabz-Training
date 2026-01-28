package com.day11.bagballorganizer;

/*
 * Bag-n-Ball Organizer
 OOP Concepts:
Classes, Objects, Inheritance (optional), Encapsulation, Method Design
Scenario:
You’re building a toy storage system for TinyTown Play School, which wants to keep track of
bags and the balls inside them.
Each Bag has:
● A unique ID, color, and capacity (number of balls it can hold)
Each Ball has:
● A unique ID, color, and size (small/medium/large)

 Problem Statement:
Develop a Java system to:
● Add balls to a bag (up to capacity)
● Remove a ball from a bag
● Display all balls in a bag
● Display all bags and their ball count
● Prevent adding a ball if the bag is full

Encapsulate fields, use appropriate getters/setters, and model real-world object
relations through composition (i.e., Bag "has-a" list of Balls)
Bonus: Use an interface to define Storable behavior for both Bag and Ball.
 */

import java.util.*;

public class BagBallApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Bag> bags = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Bag-n-Ball Organizer =====");
            System.out.println("1. Add Bag");
            System.out.println("2. Add Ball to Bag");
            System.out.println("3. Remove Ball from Bag");
            System.out.println("4. Display Balls in a Bag");
            System.out.println("5. Display All Bags");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Bag ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Bag Color: ");
                    String bcolor = sc.nextLine();
                    System.out.print("Enter Capacity: ");
                    int cap = sc.nextInt();

                    bags.add(new Bag(bid, bcolor, cap));
                    System.out.println("✅ Bag added.");
                    break;

                case 2:
                    System.out.print("Enter Bag ID: ");
                    int bagId = sc.nextInt();
                    Bag bag = findBag(bags, bagId);

                    if (bag != null) {
                        System.out.print("Enter Ball ID: ");
                        int ballId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Ball Color: ");
                        String color = sc.nextLine();
                        System.out.print("Enter Ball Size: ");
                        String size = sc.nextLine();

                        bag.addBall(new Ball(ballId, color, size));
                    }
                    break;

                case 3:
                    System.out.print("Enter Bag ID: ");
                    int rbid = sc.nextInt();
                    Bag rbag = findBag(bags, rbid);

                    if (rbag != null) {
                        System.out.print("Enter Ball ID to remove: ");
                        rbag.removeBall(sc.nextInt());
                    }
                    break;

                case 4:
                    System.out.print("Enter Bag ID: ");
                    int dbid = sc.nextInt();
                    Bag dbag = findBag(bags, dbid);

                    if (dbag != null) {
                        dbag.displayBalls();
                    }
                    break;

                case 5:
                    for (Bag b : bags) {
                        b.displayInfo();
                    }
                    break;

                case 6:
                    System.out.println("Exiting System");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private static Bag findBag(List<Bag> bags, int id) {
        for (Bag b : bags) {
            if (b.getId() == id) {
                return b;
            }
        }
        System.out.println("Bag not found!");
        return null;
    }
}