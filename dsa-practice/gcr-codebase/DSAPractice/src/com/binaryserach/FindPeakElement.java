package com.binaryserach;

import java.util.Scanner;

public class FindPeakElement {

    // Method to find index of a peak element
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is smaller than next, peak lies on right side
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } 
            // Else peak lies on left side (including mid)
            else {
                right = mid;
            }
        }

        // left == right → peak index
        return left;
    }

    // Main method (usage)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeak(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}
