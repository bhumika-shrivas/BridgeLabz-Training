package com.day8;

import java.util.Scanner;

/*FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization*/

public class QuickSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of products added

    // Create array
    int[] createArray(int n) {
        int[] discounts = new int[n];
        return discounts;
    }

    // Method to add product discounts
    void addDiscounts(int m, int n, int[] arr) {
        if (count + m > n) {
            System.out.println("Product limit reached.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter discount percentage for product " + (count + 1) + ": ");
            arr[count++] = input.nextInt();
        }
    }

    // Method to display array (no empty values)
    void display(int[] arr) {
        if (count == 0) {
            System.out.println("No product data available.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // Partition method (for descending order: highest discount first)
    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
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

        System.out.println("FlashDealz – Product Discount Sorting using Quick Sort\n");

        System.out.print("Enter maximum number of products: ");
        int n = ob.input.nextInt();

        int[] discounts = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add product discounts");
            System.out.println("2. Show unsorted discounts");
            System.out.println("3. Show sorted discounts (Top Deals)");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many products do you want to add: ");
                    int m = ob.input.nextInt();
                    ob.addDiscounts(m, n, discounts);
                    break;

                case 2:
                    System.out.print("Unsorted Discounts: ");
                    ob.display(discounts);
                    break;

                case 3:
                    ob.quickSort(discounts, 0, ob.count - 1);
                    System.out.print("Top Discounted Products: ");
                    ob.display(discounts);
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
