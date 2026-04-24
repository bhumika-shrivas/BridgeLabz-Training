package com.regularexpression.basicregexproblems;

import java.util.Scanner;

public class HexColorValidation {

    // Method to check if hex color code is valid
    static boolean isValidHex(String color) {

        // Rule 1: Length must be exactly 7
        if (color.length() != 7) {
            return false;
        }

        // Rule 2: First character must be #
        if (color.charAt(0) != '#') {
            return false;
        }

        // Rule 3: Next 6 characters must be hexadecimal
        for (int i = 1; i < 7; i++) {
            char ch = color.charAt(i);

            boolean isDigit = Character.isDigit(ch);
            boolean isUpperHex = (ch >= 'A' && ch <= 'F');
            boolean isLowerHex = (ch >= 'a' && ch <= 'f');

            if (isDigit || isUpperHex || isLowerHex) {
                // valid hex character
            } else {
                return false;
            }
        }

        // All rules passed
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hex color code");
        String color = sc.nextLine();

        if (isValidHex(color)) {
            System.out.println("Valid hex color code");
        } else {
            System.out.println("Invalid hex color code");
        }

        sc.close();
    }
}
