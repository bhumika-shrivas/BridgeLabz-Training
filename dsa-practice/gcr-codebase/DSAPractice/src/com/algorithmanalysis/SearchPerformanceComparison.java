package com.algorithmanalysis;

import java.util.Arrays;
import java.util.Random;

public class SearchPerformanceComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1_000_000};
        Random random = new Random();

        for (int size : sizes) {
            int[] data = new int[size];

            // Fill array with random numbers
            for (int i = 0; i < size; i++) {
                data[i] = random.nextInt(size);
            }

            int target = data[size - 1]; // target at end (worst case)

            // -------- Linear Search --------
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();

            long linearTime = endLinear - startLinear;

            // -------- Binary Search --------
            Arrays.sort(data); // required for binary search

            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();

            long binaryTime = endBinary - startBinary;

            System.out.println("\nDataset Size: " + size);
            System.out.println("Linear Search Time (ms): " + linearTime / 1_000_000.0);
            System.out.println("Binary Search Time (ms): " + binaryTime / 1_000_000.0);
        }
    }
}
