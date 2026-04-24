package com.day5;

import java.util.Arrays;
import java.util.Scanner;

/*ExamCell – Student Rank Generator (Merge Sort)
Story: An online exam system collects scores from multiple test centers. To publish a
state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
performance and accuracy.
Key Concepts:
● Merging pre-sorted center-wise scores
● Sorting across centers
● High efficiency for big data*/

public class MergeSort2 {

    Scanner input = new Scanner(System.in);

    // Create array
    int[] createArray(int n) {
        int[] scores = new int[n];
        return scores;
    }

    // Method to add elements in array
    void addScores(int m, int n, int[] arr) {
        if (m > n) {
            System.out.println("Array is full");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter score of student " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    // Method to display array
    void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Merge method
    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < n1)
            arr[k++] = left[i++];

        while (j < n2)
            arr[k++] = right[j++];
    }

    // Method to do merge sort
    void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {

        MergeSort ob = new MergeSort();

        System.out.println("Student Rank Generator using Merge Sort\n");

        System.out.print("Enter number of students: ");
        int n = ob.input.nextInt();

        int[] scores = ob.createArray(n);

        System.out.println("\nScore array of size " + n + " created\n");

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add student scores");
            System.out.println("2. Show unsorted scores");
            System.out.println("3. Show sorted scores (Rank List)");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many scores do you want to enter: ");
                    int m = ob.input.nextInt();
                    ob.addScores(m, n, scores);
                    break;

                case 2:
                    System.out.print("Unsorted Scores: ");
                    ob.display(scores);
                    break;

                case 3:
                    ob.mergeSort(scores, 0, scores.length - 1);
                    System.out.print("Sorted Scores (Rank List): ");
                    ob.display(scores);
                    break;

                case 4:
                    System.out.println("Exited from the program");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 4);

        ob.input.close();
    }
}
