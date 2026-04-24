package com.regularexpression.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguageExtraction {

    // Method to extract and print language names
    static void extractLanguages(String text) {

        // Regex for specific programming languages
        String langPattern = "\\b(JavaScript|Java|Python|Go)\\b";

        Pattern pattern = Pattern.compile(langPattern);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No programming language found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text");
        String input = sc.nextLine();

        extractLanguages(input);

        sc.close();
    }
}

