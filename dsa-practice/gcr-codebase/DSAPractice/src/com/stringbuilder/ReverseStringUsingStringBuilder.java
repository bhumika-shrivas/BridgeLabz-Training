package com.stringbuilder;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

    // Method to reverse a string
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    // Main method (usage)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }
}
