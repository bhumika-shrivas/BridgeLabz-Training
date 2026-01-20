package com.day6;

import java.util.Scanner;

/*CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestamps*/

public class QuickSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of sensor readings entered

    // Create array
    long[] createArray(int n) {
        long[] timestamps = new long[n];
        return timestamps;
    }

    // Method to add sensor timestamps
    void addTimestamps(int m, int n, long[] arr) {
        if (count + m > n) {
            System.out.println("Storage full. Cannot add more sensor data.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter timestamp for reading " + (count + 1) + ": ");
            arr[count++] = input.nextLong();
        }
    }

    // Method to display array (no empty values)
    void display(long[] arr) {
        if (count == 0) {
            System.out.println("No sensor data available.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // Partition method
    int partition(long[] arr, int low, int high) {
        long pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        long temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort method
    void quickSort(long[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        QuickSort ob = new QuickSort();

        System.out.println("Sensor Data Ordering using Quick Sort\n");

        System.out.print("Enter maximum number of sensor readings: ");
        int n = ob.input.nextInt();

        long[] timestamps = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add sensor timestamps");
            System.out.println("2. Show unsorted sensor data");
            System.out.println("3. Show sorted sensor data");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many readings do you want to add: ");
                    int m = ob.input.nextInt();
                    ob.addTimestamps(m, n, timestamps);
                    break;

                case 2:
                    System.out.print("Unsorted Sensor Data: ");
                    ob.display(timestamps);
                    break;

                case 3:
                    ob.quickSort(timestamps, 0, ob.count - 1);
                    System.out.print("Sorted Sensor Data: ");
                    ob.display(timestamps);
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
