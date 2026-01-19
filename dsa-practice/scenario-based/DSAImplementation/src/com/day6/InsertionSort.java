package com.day6;

import java.util.Scanner;

/*RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions*/

public class InsertionSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of packages currently on shelf

    // Create array
    int[] createArray(int n) {
        int[] weights = new int[n];
        return weights;
    }

    // Method to add package weight (dynamic insertion)
    void addPackage(int weight, int[] arr) {
        if (count == arr.length) {
            System.out.println("Shelf is full. Cannot add more packages.");
            return;
        }

        arr[count++] = weight;

        // Maintain sorted order using insertion sort logic
        for (int i = count - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            } else {
                break;
            }
        }

        System.out.println("Package added and shelf reordered.");
    }

    // Method to display array (no empty values)
    void display(int[] arr) {
        if (count == 0) {
            System.out.println("Shelf is empty.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        InsertionSort ob = new InsertionSort();

        System.out.println("Shelf Loading using Insertion Sort\n");

        System.out.print("Enter shelf capacity: ");
        int n = ob.input.nextInt();

        int[] weights = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add package weight");
            System.out.println("2. Show shelf weights");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter package weight: ");
                    int weight = ob.input.nextInt();
                    ob.addPackage(weight, weights);
                    break;

                case 2:
                    System.out.print("Current Shelf Weights: ");
                    ob.display(weights);
                    break;

                case 3:
                    System.out.println("Exited from the program");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 3);

        ob.input.close();
    }
}
