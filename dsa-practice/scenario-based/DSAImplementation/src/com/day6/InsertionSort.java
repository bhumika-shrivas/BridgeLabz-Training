package com.day7;

import java.util.Scanner;

/*ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering*/

public class InsertionSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of artists registered

    // Create array
    int[] createArray(int n) {
        int[] regTime = new int[n];
        return regTime;
    }

    // Method to add registration time (dynamic insertion)
    void addRegistrationTime(int time, int[] arr) {
        if (count == arr.length) {
            System.out.println("Registration list is full.");
            return;
        }

        arr[count++] = time;

        // Insertion Sort logic to maintain time-based order
        for (int i = count - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            } else {
                break;
            }
        }

        System.out.println("Artist registered and list updated.");
    }

    // Method to display array (no empty values)
    void display(int[] arr) {
        if (count == 0) {
            System.out.println("No artists registered yet.");
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

        System.out.println("ArtExpo – Artist Registration Sorting\n");

        System.out.print("Enter maximum number of artists: ");
        int n = ob.input.nextInt();

        int[] regTime = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Register artist (enter time)");
            System.out.println("2. Show registration order");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter registration time (e.g., minutes since opening): ");
                    int time = ob.input.nextInt();
                    ob.addRegistrationTime(time, regTime);
                    break;

                case 2:
                    System.out.print("Artists Sorted by Registration Time: ");
                    ob.display(regTime);
                    break;

                case 3:
                    System.out.println("Exited from the system");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 3);

        ob.input.close();
    }
}
