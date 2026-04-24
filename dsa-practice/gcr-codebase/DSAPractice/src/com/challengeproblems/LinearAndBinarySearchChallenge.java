package com.challengeproblems;

import java.util.Arrays;
import java.util.Scanner;

public class LinearAndBinarySearchChallenge {

    // -------- Linear Search --------
    // Find first missing positive integer
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // Mark valid elements
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Find first missing positive
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    // -------- Binary Search --------
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // -------- Main (Usage) --------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Linear Search result
        int missing = firstMissingPositive(arr.clone());
        System.out.println("First Missing Positive Integer: " + missing);

        // Binary Search input
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        // Sort array for binary search
        Arrays.sort(arr);
        int index = binarySearch(arr, target);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Binary Search Index: " + index);
    }
}
