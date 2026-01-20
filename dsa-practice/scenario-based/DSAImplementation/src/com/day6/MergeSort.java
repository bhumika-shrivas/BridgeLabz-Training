package com.day7;

import java.util.Scanner;

/*FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists*/

public class MergeSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of vehicles added

    // Create array
    int[] createArray(int n) {
        int[] mileage = new int[n];
        return mileage;
    }

    // Method to add vehicle mileage
    void addMileage(int m, int n, int[] arr) {
        if (count + m > n) {
            System.out.println("Schedule list is full.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter mileage for vehicle " + (count + 1) + ": ");
            arr[count++] = input.nextInt();
        }
    }

    // Method to display array (no empty values)
    void display(int[] arr) {
        if (count == 0) {
            System.out.println("No vehicles scheduled.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // Merge method
    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < n1)
            arr[k++] = left[i++];

        while (j < n2)
            arr[k++] = right[j++];
    }

    // Merge Sort method
    void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {

        MergeSort ob = new MergeSort();

        System.out.println("Fleet Maintenance Scheduler using Merge Sort\n");

        System.out.print("Enter maximum number of vehicles: ");
        int n = ob.input.nextInt();

        int[] mileage = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add vehicle mileage data");
            System.out.println("2. Show unsorted maintenance list");
            System.out.println("3. Show sorted maintenance schedule");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many vehicles do you want to add: ");
                    int m = ob.input.nextInt();
                    ob.addMileage(m, n, mileage);
                    break;

                case 2:
                    System.out.print("Unsorted Maintenance List: ");
                    ob.display(mileage);
                    break;

                case 3:
                    ob.mergeSort(mileage, 0, ob.count - 1);
                    System.out.print("Sorted Maintenance Schedule (by mileage): ");
                    ob.display(mileage);
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
