package com.regularexpression.replaceandmodifystrings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensorBadWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // List of bad words to censor
        String[] badWords = {"damn", "stupid", "ugly"}; // you can add more

        String censoredSentence = sentence;

        for (String word : badWords) {
            // Create regex pattern with word boundaries to match whole words
            String pattern = "\\b" + word + "\\b";

            // Replace bad word with **** using regex (case-insensitive)
            censoredSentence = censoredSentence.replaceAll("(?i)" + pattern, "****");
        }

        System.out.println("Censored sentence:");
        System.out.println(censoredSentence);

        sc.close();
    }
}

