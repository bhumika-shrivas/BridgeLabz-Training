package com.day6;

import java.util.Scanner;

/*CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: A small local cinema lists daily movie shows. The screen manager updates showtimes
manually and prefers a simple sorting logic. Since the number of shows is small (~10), Bubble
Sort is used.
Key Concepts:
● Manual data entry, simple logic
● Small dataset
● Minimal code complexity*/

public class BubbleSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of valid show times entered

    // Create array
    int[] createArray(int n) {
        int[] showTimes = new int[n];
        return showTimes;
    }

    // Method to add show times
    void addShowTimes(int m, int n, int[] arr) {
        if (count + m > n) {
            System.out.println("Array is full. Cannot add more show times.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter show time (in minutes) for show " + (count + 1) + ": ");
            arr[count++] = input.nextInt();
        }
    }

    // Method to display array (no empty values)
    void display(int[] arr) {
        if (count == 0) {
            System.out.println("No show times available.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // Bubble Sort method
    void bubbleSort(int[] arr) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        BubbleSort ob = new BubbleSort();

        System.out.println("Movie Time Sorting using Bubble Sort\n");

        System.out.print("Enter maximum number of shows: ");
        int n = ob.input.nextInt();

        int[] showTimes = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add movie show times");
            System.out.println("2. Show unsorted show times");
            System.out.println("3. Show sorted show times");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many show times do you want to enter: ");
                    int m = ob.input.nextInt();
                    ob.addShowTimes(m, n, showTimes);
                    break;

                case 2:
                    System.out.print("Unsorted Show Times: ");
                    ob.display(showTimes);
                    break;

                case 3:
                    ob.bubbleSort(showTimes);
                    System.out.print("Sorted Show Times: ");
                    ob.display(showTimes);
                    break;

                case 4:
                    System.out.println("Exited from the program");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 4);

        ob.input.close();
    }
}
