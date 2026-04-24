package com.regularexpression.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalWordExtraction {

    // Method to extract and print capitalized words
    static void extractCapitalWords(String text) {

        // Regex: word starting with capital letter followed by small letters
        String patternString = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No capitalized words found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();

        extractCapitalWords(sentence);

        sc.close();
    }
}
