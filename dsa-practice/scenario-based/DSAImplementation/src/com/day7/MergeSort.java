package com.day8;

import java.util.Scanner;

/*EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting*/

public class MergeSort {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of student marks added

    // Create array
    int[] createArray(int n) {
        int[] marks = new int[n];
        return marks;
    }

    // Method to add student marks
    void addMarks(int m, int n, int[] arr) {
        if (count + m > n) {
            System.out.println("Maximum student limit reached.");
            return;
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Enter marks for student " + (count + 1) + ": ");
            arr[count++] = input.nextInt();
        }
    }

    // Method to display array 
    void display(int[] arr) {
        if (count == 0) {
            System.out.println("No student data available.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
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

    // Merge Sort method
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

        System.out.println("EduResults – Rank Sheet Generator using Merge Sort\n");

        System.out.print("Enter maximum number of students: ");
        int n = ob.input.nextInt();

        int[] marks = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add student marks");
            System.out.println("2. Show unsorted marks");
            System.out.println("3. Show sorted rank list");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many students do you want to add: ");
                    int m = ob.input.nextInt();
                    ob.addMarks(m, n, marks);
                    break;

                case 2:
                    System.out.print("Unsorted Marks: ");
                    ob.display(marks);
                    break;

                case 3:
                    ob.mergeSort(marks, 0, ob.count - 1);
                    System.out.print("State-wise Rank List (Sorted Marks): ");
                    ob.display(marks);
                    break;

                case 4:
                    System.out.println("Exited from the system");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 4);

        ob.input.close();
    }
}
