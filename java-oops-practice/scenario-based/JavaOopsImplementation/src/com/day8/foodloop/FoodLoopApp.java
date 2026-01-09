package com.day8.foodloop;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodLoopApp {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<FoodItem> menu = new ArrayList<>();

    public static void main(String[] args) {

        Order order = new Order();
        int choice;

        do {
            System.out.println("\n=== FoodLoop ===");
            System.out.println("1. Add Food Item (Admin)");
            System.out.println("2. View Menu");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addFoodItem();
                case 2 -> viewMenu();
                case 3 -> orderFood(order);
                case 4 -> order.cancelOrder();
                case 5 -> System.out.println("Thank you for using FoodLoop!");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }

    // ---------- ADD FOOD ----------
    static void addFoodItem() {
        System.out.print("Enter food type (1. Veg 2. Non-Veg): ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Stock: ");
        int stock = sc.nextInt();

        FoodItem item = (type == 1)
                ? new VegItem(name, price, stock)
                : new NonVegItem(name, price, stock);

        menu.add(item);
        System.out.println("Food item added!");
    }

    // ---------- VIEW MENU ----------
    static void viewMenu() {
        if (menu.isEmpty()) {
            System.out.println("Menu is empty.");
            return;
        }
        for (int i = 0; i < menu.size(); i++) {
            FoodItem f = menu.get(i);
            System.out.println((i + 1) + ". " + f.getName() + " - ₹" + f.getPrice());
        }
    }

    // ---------- ORDER FOOD ----------
    static void orderFood(Order order) {
        viewMenu();
        System.out.print("Select item number (0 to stop): ");
        int opt = sc.nextInt();

        if (opt > 0 && opt <= menu.size()) {
            order.addItem(menu.get(opt - 1));
            order.placeOrder();
        }
    }
}
