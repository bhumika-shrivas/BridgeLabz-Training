package com.day8;

import java.util.Scanner;

/*FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting*/

public class BubbleSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of users with step data

    // Create array
    int[] createArray(int n) {
        int[] steps = new int[n];
        return steps;
    }

    // Method to add step counts
    void addSteps(int m, int n, int[] arr) {
        if (count + m > n) {
            System.out.println("User limit reached. Cannot add more data.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter steps for user " + (count + 1) + ": ");
            arr[count++] = input.nextInt();
        }
    }

    // Method to display array (no empty values)
    void display(int[] arr) {
        if (count == 0) {
            System.out.println("No step data available.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // Bubble Sort method (descending for ranking)
    void bubbleSort(int[] arr) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        BubbleSort ob = new BubbleSort();

        System.out.println("Fitness Tracker – Daily Step Ranking\n");

        System.out.print("Enter maximum number of users: ");
        int n = ob.input.nextInt();

        int[] steps = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add step counts");
            System.out.println("2. Show unsorted step data");
            System.out.println("3. Show ranked leaderboard");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many users do you want to add: ");
                    int m = ob.input.nextInt();
                    ob.addSteps(m, n, steps);
                    break;

                case 2:
                    System.out.print("Unsorted Step Data: ");
                    ob.display(steps);
                    break;

                case 3:
                    ob.bubbleSort(steps);
                    System.out.print("Leaderboard (Highest Steps First): ");
                    ob.display(steps);
                    break;

                case 4:
                    System.out.println("Exited from the system");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 4);

        ob.input.close();
    }
}
