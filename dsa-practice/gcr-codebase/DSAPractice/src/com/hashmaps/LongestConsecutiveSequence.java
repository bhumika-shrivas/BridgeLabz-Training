package com.hashmaps;

import java.util.*;

public class LongestConsecutiveSequence {

    // Method to find longest consecutive sequence length
    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // Check if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
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

        int result = longestConsecutive(arr);
        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}
