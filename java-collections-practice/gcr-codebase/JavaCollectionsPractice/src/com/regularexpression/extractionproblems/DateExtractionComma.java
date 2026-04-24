package com.regularexpression.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractionComma {

    // Method to extract and print dates in one line
    static void extractDates(String text) {

        // Regex for dd/mm/yyyy format
        String datePattern =
                "\\b" +
                "(0[1-9]|[12][0-9]|3[01])" +  // day 01 to 31
                "/" +
                "(0[1-9]|1[0-2])" +           // month 01 to 12
                "/" +
                "[0-9]{4}" +                 // year
                "\\b";

        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(text);

        boolean first = true;
        boolean found = false;

        while (matcher.find()) {

            if (!first) {
                System.out.print(", ");
            }

            System.out.print(matcher.group());
            first = false;
            found = true;
        }

        if (!found) {
            System.out.println("No dates found");
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text");
        String input = sc.nextLine();

        extractDates(input);

        sc.close();
    }
}
