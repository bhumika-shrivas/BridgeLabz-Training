package com.regularexpression.basicregexproblems;

import java.util.Scanner;

public class UsernameValidation {

    // Method to check if username is valid
    static boolean isValidUsername(String name) {

        int length = name.length();

        // Rule 1: Length must be between 5 and 15
        if (length < 5 || length > 15) {
            return false;
        }

        // Rule 2: First character must be a letter
        char firstChar = name.charAt(0);
        if (!Character.isLetter(firstChar)) {
            return false;
        }

        // Rule 3: All characters must be letter, digit or underscore
        for (int i = 0; i < length; i++) {
            char ch = name.charAt(i);

            if (Character.isLetter(ch) || Character.isDigit(ch) || ch == '_') {
                // allowed character, do nothing
            } else {
                return false;
            }
        }

        // All rules passed
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username");
        String username = sc.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }

        sc.close();
    }
}

