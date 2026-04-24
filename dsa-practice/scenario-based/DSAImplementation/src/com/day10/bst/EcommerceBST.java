package com.day10.bst;

import java.util.Scanner;

/* Story: E-Commerce Product Inventory
An online store categorizes products by SKU numbers.
Scenarios:
● 🔹 Scenario 1: Lookup — Customers search for a product using SKU.
● 🔹 Scenario 2: Price Update — Admin updates products using SKU key.
● 🔹 Scenario 3: Sorted List — Display all products in sorted SKU order. */

class ProductNode {
    int sku;
    String name;
    double price;
    ProductNode left, right;

    ProductNode(int sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }
}

public class EcommerceBST {

    ProductNode root;
    static Scanner sc = new Scanner(System.in);

    ProductNode insert(ProductNode root, int sku, String name, double price) {
        if (root == null) return new ProductNode(sku, name, price);
        if (sku < root.sku) root.left = insert(root.left, sku, name, price);
        else if (sku > root.sku) root.right = insert(root.right, sku, name, price);
        return root;
    }

    ProductNode search(ProductNode root, int sku) {
        if (root == null || root.sku == sku) return root;
        return sku < root.sku ? search(root.left, sku) : search(root.right, sku);
    }

    void inorder(ProductNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("SKU: " + root.sku + " | " + root.name + " | ₹" + root.price);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        EcommerceBST bst = new EcommerceBST();
        int choice;

        do {
            System.out.println("\n🛒 E-Commerce Inventory");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Price");
            System.out.println("4. Display Sorted Products");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("SKU: ");
                    int sku = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    bst.root = bst.insert(bst.root, sku, name, price);
                }
                case 2 -> {
                    System.out.print("SKU: ");
                    ProductNode p = bst.search(bst.root, sc.nextInt());
                    System.out.println(p != null ? p.name + " ₹" + p.price : "Not Found");
                }
                case 3 -> {
                    System.out.print("SKU: ");
                    ProductNode p = bst.search(bst.root, sc.nextInt());
                    if (p != null) {
                        System.out.print("New Price: ");
                        p.price = sc.nextDouble();
                    }
                }
                case 4 -> bst.inorder(bst.root);
            }
        } while (choice != 5);
    }
}
