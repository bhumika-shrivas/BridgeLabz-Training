package com.day9;

import java.util.Scanner;

/*TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting*/

public class TailorShop {

    static Scanner sc = new Scanner(System.in);

    // Arrays for order details
    String[] orderNames = new String[50];
    String[] deliveryDate = new String[50]; // format: YYYY-MM-DD

    static int count = 0;

    // Method to add order (real-time insertion)
    public void addOrder() {

        System.out.print("Enter Order Name: ");
        orderNames[count] = sc.nextLine();

        System.out.print("Enter Delivery Date (YYYY-MM-DD): ");
        deliveryDate[count] = sc.nextLine();

        // Insertion Sort logic (maintain sorted order by date)
        for (int i = count; i > 0; i--) {
            if (deliveryDate[i].compareTo(deliveryDate[i - 1]) < 0) {

                // swap dates
                String tempDate = deliveryDate[i];
                deliveryDate[i] = deliveryDate[i - 1];
                deliveryDate[i - 1] = tempDate;

                // swap order names to maintain mapping
                String tempOrder = orderNames[i];
                orderNames[i] = orderNames[i - 1];
                orderNames[i - 1] = tempOrder;

            } else {
                break;
            }
        }

        System.out.println("Order added and sorted successfully");
        count++;
    }

    // Method to show orders (sorted by deadline)
    public void displayOrders() {

        if (count == 0) {
            System.out.println("No orders available");
            return;
        }

        System.out.println("Orders Sorted by Delivery Deadline:");
        for (int i = 0; i < count; i++) {
            System.out.println(orderNames[i] + " -> " + deliveryDate[i]);
        }
    }

    // Method to show orders in added sequence
    public void showOrders() {

        if (count == 0) {
            System.out.println("No orders available");
            return;
        }

        System.out.println("Orders in Entry Sequence:");
        for (int i = 0; i < count; i++) {
            System.out.println(orderNames[i] + " -> " + deliveryDate[i]);
        }
    }

    public static void main(String[] args) {

        TailorShop ob = new TailorShop();
        int choice;

        System.out.println("TailorShop – Order Scheduling System\n");

        do {
            System.out.println(
                "1. Add New Order\n" +
                "2. View Orders Sorted by Deadline\n" +
                "3. View Orders (Entry Sequence)\n" +
                "4. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    ob.addOrder();
                    break;

                case 2:
                    ob.displayOrders();
                    break;

                case 3:
                    ob.showOrders();
                    break;

                case 4:
                    System.out.println("You are out of the program. Thank you!");
                    break;

                default:
                    System.out.println("Please enter a valid option");
            }

        } while (choice != 4);
    }
}
