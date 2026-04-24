package com.stringbuffer;

import java.util.Scanner;

public class ConcatenateStrings{

    // Method to concatenate strings using StringBuffer
    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }

    // Main method (usage)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String result = concatenateStrings(arr);
        System.out.println("Concatenated String: " + result);
    }
}
