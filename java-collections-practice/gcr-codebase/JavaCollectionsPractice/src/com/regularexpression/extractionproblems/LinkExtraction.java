package com.regularexpression.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtraction {

    // Method to extract and print all links
    static void extractLinks(String text) {

        // Regex for http and https URLs
        String urlPattern = "https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}[^\\s,]*";

        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No links found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text");
        String input = sc.nextLine();

        extractLinks(input);

        sc.close();
    }
}

