package com.day11.geomeasure;

/*
 You're working at GeoMeasure Solutions, a company that builds custom software for civil
engineers and architects. One of their core requirements is to compare line segments on
blueprints to determine if they are of equal length, or which one is longer.
 Problem Statement:
Build a Java application that:
● Allows a user to input the coordinates (x1, y1, x2, y2) of two lines.
● Uses a method to calculate the length of each line.
● Compares the two lengths and prints whether they are equal, or which is longer.
● Uses encapsulation to hide the internal data of each line.
● Uses constructors to initialize line objects.
Bonus: Support multiple line comparisons and store them in a list.
 */

import java.util.*;

public class GeoMeasureApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Line> lines = new ArrayList<>();

        System.out.print("Enter number of pair line comparisons: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\n--- Line Pair " + (i + 1) + " ---");

            System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2):");
            Line line1 = new Line(
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble()
            );

            System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2):");
            Line line2 = new Line(
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble()
            );

            double len1 = line1.calculateLength();
            double len2 = line2.calculateLength();

            System.out.printf("Length of Line 1: %.2f%n", len1);
            System.out.printf("Length of Line 2: %.2f%n", len2);

            if (len1 == len2) {
                System.out.println("Result: Both lines are equal in length.");
            } else if (len1 > len2) {
                System.out.println("Result: Line 1 is longer.");
            } else {
                System.out.println("Result: Line 2 is longer.");
            }

            // Store lines
            lines.add(line1);
            lines.add(line2);
        }

        System.out.println("\nTotal Lines Stored: " + lines.size());
        sc.close();
    }
}