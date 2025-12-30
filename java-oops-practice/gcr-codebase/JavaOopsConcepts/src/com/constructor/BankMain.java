package com.constructor.level1;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        long accNo = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();
        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();
        System.out.println("Enter Interest Rate:");
        double rate = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(accNo, name, balance, rate);
        System.out.println("\n--- Account Details ---");
        sa.displaySavingsDetails();

        // Deposit
        System.out.println("\nEnter amount to deposit:");
        double deposit = sc.nextDouble();
        sa.deposit(deposit);

        // Withdraw
        System.out.println("Enter amount to withdraw:");
        double withdraw = sc.nextDouble();
        sa.withdraw(withdraw);

        System.out.println("\n--- Updated Account Details ---");
        sa.displaySavingsDetails();

        sc.close();
    }
}
