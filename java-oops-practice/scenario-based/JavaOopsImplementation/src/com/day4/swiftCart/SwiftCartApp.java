package com.day4.swiftCart;

import java.util.Scanner;

public class SwiftCartApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        int choice;

        do {
            System.out.println("\n1.Add Perishable Item");
            System.out.println("2.Add Non-Perishable Item");
            System.out.println("3.View Cart");
            System.out.println("4.Generate Bill");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    if (choice == 1)
                        cart.addProduct(new PerishableProduct(name, price, qty));
                    else
                        cart.addProduct(new NonPerishableProduct(name, price, qty));
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    double total = cart.generateBill();
                    double finalAmount = cart.applyDiscount();
                    System.out.println("Total Price: " + total);
                    System.out.println("Final Price after Discount: " + finalAmount);
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
