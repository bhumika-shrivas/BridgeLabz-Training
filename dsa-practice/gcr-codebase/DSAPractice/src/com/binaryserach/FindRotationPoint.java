package com.binaryserach;

import java.util.Scanner;

public class FindRotationPoint {

    // Method to find index of smallest element
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Smallest element is in right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // Smallest element is in left half (including mid)
            else {
                right = mid;
            }
        }

        // left == right -> index of smallest element
        return left;
    }

    // Main method (usage)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter rotated sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = findRotationPoint(arr);

        System.out.println("Index of smallest element (rotation point): " + index);
        System.out.println("Smallest element value: " + arr[index]);
    }
}
