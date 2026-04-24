package com.linkedlist.doublylinkedlist.librarymanagement;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryList list = new LibraryList();
        int choice;

        do {
            System.out.println("\n1.Add Begin 2.Add End 3.Add Position");
            System.out.println("4.Remove Book 5.Search Title 6.Search Author");
            System.out.println("7.Update Availability 8.Display Forward");
            System.out.println("9.Display Reverse 10.Count Books 0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Available (true/false): ");
                    boolean avail = sc.nextBoolean();

                    BookNode node = new BookNode(id, title, author, genre, avail);

                    if (choice == 1) list.addAtBeginning(node);
                    else if (choice == 2) list.addAtEnd(node);
                    else {
                        System.out.print("Position: ");
                        list.addAtPosition(sc.nextInt(), node);
                    }
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    list.removeById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Title: ");
                    list.searchByTitle(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Author: ");
                    list.searchByAuthor(sc.nextLine());
                    break;

                case 7:
                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Available (true/false): ");
                    list.updateAvailability(bid, sc.nextBoolean());
                    break;

                case 8:
                    list.displayForward();
                    break;

                case 9:
                    list.displayReverse();
                    break;

                case 10:
                    list.countBooks();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
