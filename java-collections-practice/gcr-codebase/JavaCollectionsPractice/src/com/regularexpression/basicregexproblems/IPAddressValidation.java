package com.regularexpression.basicregexproblems;

import java.util.Scanner;

public class IPAddressValidation {

	// Method to check valid IPv4 using regex
    static boolean isValidIP(String ip) {

        // Regex for numbers between 0 and 255
        String number =
                "(25[0-5])" +        // 250 to 255
                "|(2[0-4][0-9])" +   // 200 to 249
                "|(1[0-9][0-9])" +   // 100 to 199
                "|([1-9][0-9])" +    // 10 to 99
                "|([0-9])";          // 0 to 9

        // Full IP pattern: number.number.number.number
        String ipPattern =
                "^(" + number + ")\\.(" + number + ")\\.(" + number + ")\\.(" + number + ")$";

        return ip.matches(ipPattern);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter IP address");
        String ip = sc.nextLine();

        if (isValidIP(ip)) {
            System.out.println("Valid IPv4 address");
        } else {
            System.out.println("Invalid IPv4 address");
        }

        sc.close();
    }
}
