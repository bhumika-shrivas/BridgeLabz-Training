package com.day7;

import java.util.Scanner;

/* IceCreamRush – Sorting Flavors by Popularity (Bubble Sort)
Story: At “IceCreamRush,” a small local vendor sells 8 different ice cream flavors. At the end of
each week, the shopkeeper wants to sort these flavors based on how many times each was
sold. Since the list is short and he updates it manually, he prefers a simple sorting method —
Bubble Sort — where he repeatedly compares adjacent sales figures and swaps them if
Needed.

Concepts Involved:
● Bubble Sort
● Small data size
● Repeated adjacent comparisons*/

public class BubbleSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of flavors entered

    // Create array
    int[] createArray(int n) {
        int[] sales = new int[n];
        return sales;
    }

    // Method to add sales count for flavors
    void addSales(int m, int n, int[] arr) {
        if (count + m > n) {
            System.out.println("Maximum flavor limit reached.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter sales count for flavor " + (count + 1) + ": ");
            arr[count++] = input.nextInt();
        }
    }

    // Method to display array (no empty values)
    void display(int[] arr) {
        if (count == 0) {
            System.out.println("No sales data available.");
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

        System.out.println("Ice Cream Flavor Popularity Sorting\n");

        System.out.print("Enter maximum number of flavors: ");
        int n = ob.input.nextInt();

        int[] sales = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add flavor sales data");
            System.out.println("2. Show unsorted sales data");
            System.out.println("3. Show sorted sales data");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many flavors do you want to enter: ");
                    int m = ob.input.nextInt();
                    ob.addSales(m, n, sales);
                    break;

                case 2:
                    System.out.print("Unsorted Sales Data: ");
                    ob.display(sales);
                    break;

                case 3:
                    ob.bubbleSort(sales);
                    System.out.print("Sorted Sales Data (Popularity Order): ");
                    ob.display(sales);
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
