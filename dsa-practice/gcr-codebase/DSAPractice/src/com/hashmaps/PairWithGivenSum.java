package com.hashmaps;

import java.util.*;

import java.util.*;

public class PairWithGivenSum {

    // Method to check if pair exists
    public static boolean hasPairWithSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                System.out.println(
                    "Pair found: (" + complement + ", " + num + ")"
                );
                return true;
            }

            map.put(num, 1); // mark as visited
        }
        return false;
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

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean result = hasPairWithSum(arr, target);

        if (!result) {
            System.out.println("No pair with given sum found.");
        }
    }
}
