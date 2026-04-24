package com.sorting;

import java.util.Scanner;

public class SelectionSort{

    // Selection Sort method
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap with first unsorted element
            if (minIndex != i) {
                int temp = scores[i];
                scores[i] = scores[minIndex];
                scores[minIndex] = temp;
            }
        }
    }

    // Main method (usage)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        selectionSort(scores);

        System.out.println("Sorted Exam Scores (Ascending):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
