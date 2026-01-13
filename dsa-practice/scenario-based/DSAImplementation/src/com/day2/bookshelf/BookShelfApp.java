package com.day2.bookshelf;

import java.util.Scanner;

public class BookShelfApp {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
            1. Add Book
            2. Borrow Book
            3. Display Catalog
            4. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    library.addBook(genre, title, author);
                }

                case 2 -> {
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    library.borrowBook(genre, title);
                }

                case 3 -> library.displayCatalog();

                case 4 -> {
                    System.out.println("Exiting Library System");
                    return;
                }
            }
        }
    }
}
