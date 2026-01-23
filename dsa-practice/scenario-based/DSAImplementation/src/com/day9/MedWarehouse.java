package com.day9;

import java.util.Scanner;

/*MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory*/

public class MedWarehouse {

    static Scanner sc = new Scanner(System.in);

    // Arrays for medicine name and expiry date
    String[] medicineName = new String[50];
    String[] expiryDate = new String[50];   // format: YYYY-MM-DD

    static int count = 0;

    // Method to add medicine record
    public void addMedicine() {

        System.out.print("Enter Medicine Name: ");
        medicineName[count] = sc.nextLine();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        expiryDate[count] = sc.nextLine();

        System.out.println("Medicine record added successfully");
        count++;
    }

    // Method to display medicines
    public void displayMedicines() {

        if (count == 0) {
            System.out.println("No medicine data available");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(medicineName[i] + " -> " + expiryDate[i]);
        }
    }

    // Merge method (stable, based on expiry date)
    static void merge(String[] dates, String[] names, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        String[] leftDates = new String[n1];
        String[] rightDates = new String[n2];
        String[] leftNames = new String[n1];
        String[] rightNames = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftDates[i] = dates[l + i];
            leftNames[i] = names[l + i];
        }

        for (int j = 0; j < n2; j++) {
            rightDates[j] = dates[mid + 1 + j];
            rightNames[j] = names[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (leftDates[i].compareTo(rightDates[j]) <= 0) { // stability
                dates[k] = leftDates[i];
                names[k] = leftNames[i];
                i++;
            } else {
                dates[k] = rightDates[j];
                names[k] = rightNames[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            dates[k] = leftDates[i];
            names[k] = leftNames[i];
            i++;
            k++;
        }

        while (j < n2) {
            dates[k] = rightDates[j];
            names[k] = rightNames[j];
            j++;
            k++;
        }
    }

    // Merge Sort method
    void mergeSort(String[] dates, String[] names, int l, int r) {

        if (l >= r)
            return;

        int mid = (l + r) / 2;

        mergeSort(dates, names, l, mid);
        mergeSort(dates, names, mid + 1, r);
        merge(dates, names, l, mid, r);
    }

    public static void main(String[] args) {

        MedWarehouse ob = new MedWarehouse();
        int choice;

        System.out.println("MedWarehouse – Medicine Expiry Management System\n");

        do {
            System.out.println(
                "1. Add Medicine Record\n" +
                "2. View Unsorted Medicine List\n" +
                "3. View Medicines Sorted by Expiry\n" +
                "4. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    ob.addMedicine();
                    break;

                case 2:
                    System.out.println("Unsorted Medicine Data:");
                    ob.displayMedicines();
                    break;

                case 3:
                    ob.mergeSort(ob.expiryDate, ob.medicineName, 0, count - 1);
                    System.out.println("Medicines Sorted by Expiry Date:");
                    ob.displayMedicines();
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
