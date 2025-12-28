package com.constructor.level1;

import java.util.Scanner;

public class BookTwoMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for normal Book
        System.out.println("Enter ISBN for Book:");
        String isbn1 = sc.nextLine();
        System.out.println("Enter title for Book:");
        String title1 = sc.nextLine();
        System.out.println("Enter author for Book:");
        String author1 = sc.nextLine();

        BookTwo b1 = new BookTwo(isbn1, title1, author1);
        System.out.println("\n--- Book Details ---");
        b1.displayBookDetails();

        // Input for EBook
        System.out.println("Enter ISBN for EBook:");
        String isbn2 = sc.nextLine();
        System.out.println("Enter title for EBook:");
        String title2 = sc.nextLine();
        System.out.println("Enter author for EBook:");
        String author2 = sc.nextLine();
        System.out.println("Enter file size (MB) for EBook:");
        double size = sc.nextDouble();

        Ebook ebook = new Ebook(isbn2, title2, author2, size);
        System.out.println("\n--- EBook Details ---");
        ebook.displayEBookDetails();

        sc.close();
    }
}
