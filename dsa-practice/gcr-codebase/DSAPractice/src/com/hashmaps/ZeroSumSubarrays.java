package com.hashmaps;

import java.util.*;

public class ZeroSumSubarrays {

    // Method to find and print all zero-sum subarrays
    public static void findZeroSumSubarrays(int[] arr) {

        // Map: prefixSum -> list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        // Handle subarrays starting from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println(
                        "Subarray found from index " + (startIndex + 1) + " to " + i
                    );
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
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

        System.out.println("Zero-sum subarrays:");
        findZeroSumSubarrays(arr);
    }
}
