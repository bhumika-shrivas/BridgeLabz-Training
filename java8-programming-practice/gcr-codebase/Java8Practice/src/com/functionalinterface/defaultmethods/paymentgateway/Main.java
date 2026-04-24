package com.functionalinterface.defaultmethods.paymentgateway;

/*Payment Gateway Integration
○ Scenario: Multiple payment providers integrate with your app. A new refund
method needs to be added without breaking old providers.
○ Task: Add a default refund() method in the PaymentProcessor interface.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaymentProcessor processor;

        System.out.println("Choose payment provider: upi / card / wallet");
        String provider = sc.nextLine().toLowerCase();

        switch (provider) {
            case "upi":
                processor = new UpiPayment();
                break;
            case "card":
                processor = new CardPayment();
                break;
            case "wallet":
                processor = new WalletPayment();
                break;
            default:
                System.out.println("Invalid provider");
                sc.close();
                return;
        }

        System.out.println("Choose action: pay / refund");
        String action = sc.nextLine().toLowerCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (action.equals("pay")) {
            processor.processPayment(amount);
        } else if (action.equals("refund")) {
            processor.refund(amount);
        } else {
            System.out.println("Invalid action");
        }

        sc.close();
    }
}
