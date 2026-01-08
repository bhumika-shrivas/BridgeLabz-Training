package com.stackandqueue.slidingwindowmax;

// Usage
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        int[] max = SlidingWindowMaximum.maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximum:");
        for (int val : max) {
            System.out.print(val + " ");
        }
    }
}
