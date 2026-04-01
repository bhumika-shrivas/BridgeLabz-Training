package com.regularexpression.basicregexproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNValidation {

    // Method to check and extract valid SSN
    static void checkSSN(String text) {

        // Regex pattern for SSN: 123-45-6789
        String ssnPattern = "\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b";

        Pattern pattern = Pattern.compile(ssnPattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println(matcher.group() + " is valid");
        } else {
            System.out.println("No valid SSN found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence containing SSN");
        String input = sc.nextLine();

        checkSSN(input);

        sc.close();
    }
}

