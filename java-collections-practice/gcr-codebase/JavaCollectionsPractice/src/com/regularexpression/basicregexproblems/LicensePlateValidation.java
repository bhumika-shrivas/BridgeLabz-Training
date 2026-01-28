package com.regularexpression.basicregexproblems;

import java.util.Scanner;

public class LicensePlateValidation {

    // Method to check if license plate is valid
    static boolean isValidPlate(String plate) {

        // Rule 1: Total length must be exactly 6
        if (plate.length() != 6) {
            return false;
        }

        // Rule 2: First two characters must be capital letters
        char first = plate.charAt(0);
        char second = plate.charAt(1);

        if (!Character.isUpperCase(first) || !Character.isUpperCase(second)) {
            return false;
        }

        // Rule 3: Next four characters must be digits
        for (int i = 2; i < 6; i++) {
            char ch = plate.charAt(i);

            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        // All rules passed
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter license plate number");
        String plate = sc.nextLine();

        if (isValidPlate(plate)) {
            System.out.println("Valid license plate");
        } else {
            System.out.println("Invalid license plate");
        }

        sc.close();
    }
}
