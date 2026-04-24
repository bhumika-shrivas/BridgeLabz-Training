package com.day7;

import java.util.Scanner;

/*SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data*/

public class InsertionSort2 {

    Scanner input = new Scanner(System.in);
    int count = 0;   // number of books borrowed

    // Create array
    String[] createArray(int n) {
        String[] books = new String[n];
        return books;
    }

    // Method to add book title (dynamic insertion)
    void addBook(String title, String[] arr) {
        if (count == arr.length) {
            System.out.println("Borrowing limit reached.");
            return;
        }

        arr[count++] = title;

        // Insertion Sort logic to keep titles alphabetically sorted
        for (int i = count - 1; i > 0; i--) {
            if (arr[i].compareToIgnoreCase(arr[i - 1]) < 0) {
                String temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            } else {
                break;
            }
        }

        System.out.println("Book added and list auto-sorted.");
    }

    // Method to display array (no empty values)
    void display(String[] arr) {
        if (count == 0) {
            System.out.println("No books borrowed.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        InsertionSort2 ob = new InsertionSort2();

        System.out.println("Smart Library – Borrowed Books Sorting\n");

        System.out.print("Enter maximum borrowing limit: ");
        int n = ob.input.nextInt();
        ob.input.nextLine();

        String[] books = ob.createArray(n);

        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Issue new book");
            System.out.println("2. Show borrowed books");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            choice = ob.input.nextInt();
            ob.input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    String title = ob.input.nextLine();
                    ob.addBook(title, books);
                    break;

                case 2:
                    System.out.print("Borrowed Books (Alphabetical Order): ");
                    ob.display(books);
                    break;

                case 3:
                    System.out.println("Exited from the system");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 3);

        ob.input.close();
    }
}
