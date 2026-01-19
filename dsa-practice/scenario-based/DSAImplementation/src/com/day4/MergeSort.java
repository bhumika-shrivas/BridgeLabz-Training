package com.day4;

import java.util.Arrays;
import java.util.Scanner;

/* ZipZipMart – Daily Sales Summary Report (Merge Sort)
   Key Concepts:
   - Divide and conquer
   - Large-scale sorting
   - Stable sorting
*/

public class MergeSort {

    Scanner input = new Scanner(System.in);

    // Create arrays
    int[] createarr1(int n) {
        return new int[n];
    }

    String[] createarr2(int n) {
        return new String[n];
    }

    // Add records
    void addRecords(int m, int n, int[] arr, String[] arr2) {
        if (m > n) {
            System.out.println("Array is full. Cannot add more records.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter Amount for record " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            input.nextLine(); // consume newline

            System.out.print("Enter Date for record " + (i + 1) + ": ");
            arr2[i] = input.nextLine();
        }
    }

    // Display records
    void display(int[] arr, String[] arr2) {
        System.out.println("Amount Array: " + Arrays.toString(arr));
        System.out.println("Date Array  : " + Arrays.toString(arr2));
    }

    // Remove record by date
    void removeRecords(String removeDate, String[] date) {
        for (int i = 0; i < date.length; i++) {
            if (date[i] != null && date[i].equals(removeDate)) {
                for (int j = i; j < date.length - 1; j++) {
                    date[j] = date[j + 1];
                }
                date[date.length - 1] = null;
                System.out.println("Record removed successfully.");
                return;
            }
        }
        System.out.println("Date not found.");
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

    // Merge sort
    void mergesort(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int mid = (l + r) / 2;
        mergesort(arr, l, mid);
        mergesort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {

        MergeSort ob = new MergeSort();

        System.out.println("Merge Sort Program\n");
        System.out.print("Enter the size of array: ");
        int n = ob.input.nextInt();
        ob.input.nextLine();

        int[] arr = ob.createarr1(n);
        String[] arr2 = ob.createarr2(n);

        System.out.println("\nDate and Amount array of size " + n + " has been created\n");

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add records");
            System.out.println("2. Remove record by date");
            System.out.println("3. Show unsorted records");
            System.out.println("4. Show sorted records");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();
            ob.input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("How many records do you want to enter: ");
                    int m = ob.input.nextInt();
                    ob.input.nextLine();
                    ob.addRecords(m, n, arr, arr2);
                    break;

                case 2:
                    System.out.print("Enter date to remove: ");
                    String removeDate = ob.input.nextLine();
                    ob.removeRecords(removeDate, arr2);
                    break;

                case 3:
                    ob.display(arr, arr2);
                    break;

                case 4:
                    ob.mergesort(arr, 0, arr.length - 1);
                    System.out.println("Sorted Amount Array: " + Arrays.toString(arr));
                    break;

                case 5:
                    System.out.println("Exited from the program");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 5);

        ob.input.close();
    }
}
