package com.day3.smartcheckout;

/* SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
● Add/remove customers from the queue.
● Fetch item prices from map.
● Update stock on purchase.*/

import java.util.Scanner;

public class SmartCheckoutApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();

        while (true) {
            System.out.println("""
            1. Add Item to Store
            2. Add Customer
            3. Process Checkout
            4. Exit
            """);

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Item name: ");
                    String item = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    checkout.addItemToStore(item, price, stock);
                }

                case 2 -> {
                    System.out.print("Customer name: ");
                    Customer c = new Customer(sc.nextLine());
                    System.out.print("Number of items: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Item: ");
                        c.addItem(sc.nextLine());
                    }
                    checkout.addCustomer(c);
                }

                case 3 -> checkout.processCustomer();
                case 4 -> { return; }
            }
        }
    }
}
