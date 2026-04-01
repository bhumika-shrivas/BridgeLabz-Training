package com.exceptions;

import java.util.Scanner;

public class ThrowVsThrowsDemonstration {

	// method propagates exception using 'throws'
    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        // using 'throw' to explicitly raise exception
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        return (amount * rate * years) / 100; // Simple Interest
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter years: ");
            int years = sc.nextInt();

            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");

        } finally {
            sc.close();
        }
    }
}
