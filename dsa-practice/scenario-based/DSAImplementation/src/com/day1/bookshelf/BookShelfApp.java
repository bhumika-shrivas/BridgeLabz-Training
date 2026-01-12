package com.day1.bookshelf;

/*BookShelf – Library Organizer (HashMap + Linked List)
Story: In a library system, books are arranged based on genre and author. A HashMap maps genre → list of books (LinkedList). Each list is dynamically updated when books are borrowed or returned.
Requirements:
● Maintain genre-wise catalog.
● Efficient insert, delete using LinkedList.
● Avoid duplication using HashSet (optional).*/

import java.util.Scanner;

public class BookShelfApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to BookSelf Application");
        
        while (true) {
            System.out.println("\n1.Add Book  2.Borrow Book  3.Display  4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    library.addBook(genre, title, author);
                    break;

                case 2:
                    System.out.print("Genre: ");
                    genre = sc.nextLine();
                    System.out.print("Title: ");
                    title = sc.nextLine();
                    library.borrowBook(genre, title);
                    break;

                case 3:
                    library.display();
                    break;

                case 4:
                    System.out.println("Exited");
                    return;
            }
        }
    }
}
