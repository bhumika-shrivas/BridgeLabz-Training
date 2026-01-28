package com.regularexpression.basicregexproblems;

import java.util.Scanner;

public class CreditCardValidation {

    // Method to check card type and validity
    static String checkCard(String card) {

        // Regex for Visa: starts with 4 and total 16 digits
        String visaPattern = "^4[0-9]{15}$";

        // Regex for MasterCard: starts with 5 and total 16 digits
        String masterPattern = "^5[0-9]{15}$";

        if (card.matches(visaPattern)) {
            return "Valid Visa card number";
        } else if (card.matches(masterPattern)) {
            return "Valid MasterCard number";
        } else {
            return "Invalid card number";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter credit card number");
        String cardNumber = sc.nextLine();

        String result = checkCard(cardNumber);
        System.out.println(result);

        sc.close();
    }
}

