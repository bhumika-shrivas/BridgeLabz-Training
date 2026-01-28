package com.regularexpression.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtraction {

    // Method to extract and print currency values
    static void extractAmounts(String text) {

        // Regex for amounts like $45.99 or 10.50 or 100
        String amountPattern = "\\$?[0-9]+(\\.[0-9]{1,2})?";

        Pattern pattern = Pattern.compile(amountPattern);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No amounts found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text");
        String input = sc.nextLine();

        extractAmounts(input);

        sc.close();
    }
}

