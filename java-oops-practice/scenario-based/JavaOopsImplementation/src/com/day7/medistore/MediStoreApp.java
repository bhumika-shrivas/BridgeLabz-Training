package com.day7.medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class MediStoreApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sample medicines (inventory side)
        Medicine tablet = new Tablet(
                "Paracetamol", 5.0, LocalDate.now().plusMonths(6));

        Medicine syrup = new Syrup(
                "Cough Syrup", 80.0, LocalDate.now().plusDays(20));

        Medicine injection = new Injection(
                "Insulin", 250.0, LocalDate.now().plusMonths(1));

        System.out.print("Choose medicine (1-Tablet, 2-Syrup, 3-Injection): ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity to sell: ");
        int qty = sc.nextInt();

        Medicine selected;
        if (choice == 1) {
            selected = tablet;
        } else if (choice == 2) {
            selected = syrup;
        } else {
            selected = injection;
        }

        double bill = selected.sell(qty);

        if (bill > 0) {
            System.out.println("Medicine: " + selected.getName());
            System.out.println("Total Bill: ₹" + bill);
            System.out.println("Remaining Stock: " + selected.getQuantity());
        } else {
            System.out.println("Sale failed (expired or insufficient stock).");
        }
    }
}
