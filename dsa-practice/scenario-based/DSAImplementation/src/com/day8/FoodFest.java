package com.day8;

import java.util.Scanner;

/*FoodFest – Sorting Stalls by Customer Footfall (Merge Sort)
Story: At a multi-day food festival, organizers track footfall at every stall each day. They collect
daily logs from all zones (already sorted by count), and use Merge Sort to combine zone-wise
data into a master list for performance evaluation.
Concepts Involved:
● Merge Sort
● Combining multiple sorted datasets
● Stability in data with equal values*/

public class FoodFest {

    static Scanner sc = new Scanner(System.in);

    // Arrays for stall names and footfall
    String[] stallNames = new String[50];
    int[] footfall = new int[50];

    static int count = 0;

    // Method to add stall data
    public void addStall() {

        System.out.print("Enter Stall Name: ");
        stallNames[count] = sc.nextLine();

        System.out.print("Enter Customer Footfall: ");
        footfall[count] = sc.nextInt();
        sc.nextLine();

        System.out.println("Stall data added successfully");
        count++;
    }

    // Method to display stalls
    public void displayStalls() {

        if (count == 0) {
            System.out.println("No stall data available");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(stallNames[i] + " -> " + footfall[i]);
        }
    }

    // Merge method (stable)
    static void merge(int[] arr, String[] names, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];
        String[] leftNames = new String[n1];
        String[] rightNames = new String[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
            leftNames[i] = names[l + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
            rightNames[j] = names[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {   // stability maintained
                arr[k] = left[i];
                names[k] = leftNames[i];
                i++;
            } else {
                arr[k] = right[j];
                names[k] = rightNames[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            names[k] = leftNames[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            names[k] = rightNames[j];
            j++;
            k++;
        }
    }

    // Merge Sort method
    void mergeSort(int[] arr, String[] names, int l, int r) {

        if (l >= r)
            return;

        int mid = (l + r) / 2;

        mergeSort(arr, names, l, mid);
        mergeSort(arr, names, mid + 1, r);
        merge(arr, names, l, mid, r);
    }

    public static void main(String[] args) {

        FoodFest ob = new FoodFest();
        int choice;

        System.out.println("FoodFest – Stall Footfall Analysis using Merge Sort");

        do {
            System.out.println(
                "\n1. Add Stall Footfall Data" +
                "\n2. View Unsorted Stall List" +
                "\n3. View Sorted Stall List (by Footfall)" +
                "\n4. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    ob.addStall();
                    break;

                case 2:
                    System.out.println("Unsorted Stall Data:");
                    ob.displayStalls();
                    break;

                case 3:
                    ob.mergeSort(ob.footfall, ob.stallNames, 0, count - 1);
                    System.out.println("Sorted Stall Data (by Footfall):");
                    ob.displayStalls();
                    break;

                case 4:
                    System.out.println("You are out of the program. Thank you!");
                    break;

                default:
                    System.out.println("Please enter a valid option");
            }

        } while (choice != 4);
    }
}
