package com.regularexpression.replaceandmodifystrings;

import java.util.Scanner;

public class ReplaceSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String text = sc.nextLine();

        // Replace multiple spaces with a single space
        String cleanedText = text.replaceAll("\\s+", " ");

        System.out.println("Output:");
        System.out.println(cleanedText);

        sc.close();
    }
}

