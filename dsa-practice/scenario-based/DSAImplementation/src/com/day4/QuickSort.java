package com.day5;

import java.util.Scanner;

/* EventManager – Ticket Price Optimizer (Quick Sort)
Story: An event booking portal sorts millions of tickets by price before showing the top 50
cheapest or most expensive. Since speed is crucial and data is unsorted, Quick Sort is used for
its average-case performance.
Key Concepts:
● Fast average time
● Recursive partitioning
● Ideal for large, random datasets*/

public class QuickSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // tracks number of valid ticket prices entered

    // Create array
    int[] createArray(int n) {
        int[] prices = new int[n];
        return prices;
    }

    // Method to add ticket prices
    void addPrices(int m, int n, int[] arr) {
        if (count + m > n) {
            System.out.println("Array is full. Cannot add more ticket prices.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter ticket price " + (count + 1) + ": ");
            arr[count++] = input.nextInt();
        }
    }

    // Method to display array (no empty values)
    void display(int[] arr) {
        if (count == 0) {
            System.out.println("No ticket prices available.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // Partition method
    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort method
    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        QuickSort ob = new QuickSort();

        System.out.println("Ticket Price Optimizer using Quick Sort\n");

        System.out.print("Enter number of tickets: ");
        int n = ob.input.nextInt();

        int[] prices = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add ticket prices");
            System.out.println("2. Show unsorted ticket prices");
            System.out.println("3. Show sorted ticket prices");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many prices do you want to enter: ");
                    int m = ob.input.nextInt();
                    ob.addPrices(m, n, prices);
                    break;

                case 2:
                    System.out.print("Unsorted Ticket Prices: ");
                    ob.display(prices);
                    break;

                case 3:
                    ob.quickSort(prices, 0, ob.count - 1);
                    System.out.print("Sorted Ticket Prices: ");
                    ob.display(prices);
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
