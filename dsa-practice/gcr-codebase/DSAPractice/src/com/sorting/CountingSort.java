package com.sorting;

import java.util.Scanner;

public class CountingSort {

    // Counting Sort method
    public static void countingSort(int[] ages) {
        int n = ages.length;

        // Find min and max age (no hard coding)
        int min = ages[0];
        int max = ages[0];

        for (int age : ages) {
            if (age < min) min = age;
            if (age > max) max = age;
        }

        int range = max - min + 1;

        // Count array
        int[] count = new int[range];

        // Store frequency
        for (int age : ages) {
            count[age - min]++;
        }

        // Cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Output array
        int[] output = new int[n];

        // Build output array (stable sort)
        for (int i = n - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - min] - 1] = age;
            count[age - min]--;
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            ages[i] = output[i];
        }
    }

    // Main method (usage)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter student ages:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        countingSort(ages);

        System.out.println("Sorted Student Ages (Ascending):");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
