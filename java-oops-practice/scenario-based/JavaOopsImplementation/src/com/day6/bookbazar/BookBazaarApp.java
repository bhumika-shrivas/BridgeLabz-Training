package com.day6.bookbazar;

import java.util.Scanner;

public class BookBazaarApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create books (inventory side)
        Book ebook = new EBook(
                "Java Mastery", "James Gosling", 500, 10, true);

        Book printed = new PrintedBook(
                "Data Structures", "Mark Allen", 800, 5, false);

        // Order creation
        System.out.print("Enter user name: ");
        String user = sc.nextLine();

        Order order = new Order(user);

        System.out.print("Enter ebook quantity: ");
        int q1 = sc.nextInt();
        order.addBook(ebook, q1);

        System.out.print("Enter printed book quantity: ");
        int q2 = sc.nextInt();
        order.addBook(printed, q2);

        order.showOrderSummary();
    }
}
