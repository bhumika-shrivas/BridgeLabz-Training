package com.generics.onlinemarketplace;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalog catalog = new Catalog();

        System.out.println("Choose Product Type:");
        System.out.println("1. Book");
        System.out.println("2. Clothing");
        System.out.println("3. Gadget");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        Product<?> product = null;

        switch (choice) {
            case 1:
                product = new Product<>(name, price, new BookCategory());
                break;
            case 2:
                product = new Product<>(name, price, new ClothingCategory());
                break;
            case 3:
                product = new Product<>(name, price, new GadgetCategory());
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        DiscountUtil.applyDiscount(product, discount);
        catalog.addProduct(product);

        System.out.println("\n📦 Product Catalog:");
        catalog.displayCatalog();

        sc.close();
    }
}
