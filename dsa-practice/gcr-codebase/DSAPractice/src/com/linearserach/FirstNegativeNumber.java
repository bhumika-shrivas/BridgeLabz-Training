package com.linearserach;

import java.util.Scanner;

public class FirstNegativeNumber {

    // Linear search method
    public static int findFirstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // first negative found
            }
        }
        return -1; // no negative number
    }

    // Main method (usage)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = findFirstNegativeIndex(arr);

        if (index != -1) {
            System.out.println(
                "First negative number found at index: " + index +
                " (value = " + arr[index] + ")"
            );
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}
