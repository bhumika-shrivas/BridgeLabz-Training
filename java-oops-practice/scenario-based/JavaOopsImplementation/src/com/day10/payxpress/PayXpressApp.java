/* "PayXpress – Utility Bill Payment System"
Story: PayXpress enables users to pay utility bills (electricity, water, internet) with tracking and
reminders.
Requirements:
● Bill class: type, amount, dueDate, isPaid.
● Interface IPayable with pay() and sendReminder().
● Use constructors to create recurring bills.
● Operators for calculating late fees: baseAmount + penalty.
● Encapsulation: prevent direct payment status changes.
● Inheritance: ElectricityBill, InternetBill, WaterBill.
● Polymorphism: reminders vary depending on utility type.
● Access Modifiers: payment details are internal only.*/

package com.day10.payxpress;

import java.util.*;

public class PayXpressApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Bill> bills = new ArrayList<>();

        while (true) {
            System.out.println("""
            1. Add Bill
            2. Pay Bill
            3. Send Reminders
            4. Exit
            """);

            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Type (Electricity/Water/Internet): ");
                    String t = sc.next();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    System.out.print("Due Date: ");
                    String date = sc.next();

                    Bill b = switch (t.toLowerCase()) {
                        case "electricity" -> new ElectricityBill(amt, date);
                        case "water" -> new WaterBill(amt, date);
                        default -> new InternetBill(amt, date);
                    };
                    bills.add(b);
                }

                case 2 -> bills.forEach(b -> { if (!b.isPaid()) b.pay(); });
                case 3 -> bills.forEach(Bill::sendReminder);
                case 4 -> { return; }
            }
        }
    }
}
