package com.lambdaexpression.printpatient;

/*Hospital Patient ID Printing
○ Scenario: Need to print all patient IDs from a list for admin verification.
○ Task: Use method references instead of lambdas.*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
                new Patient(101, "Alice"),
                new Patient(102, "Bob"),
                new Patient(103, "Charlie")
        );

        System.out.println("---- Patient IDs ----");

        // Method reference instead of lambda
        patients.stream()
                .map(Patient::getId)          // instance method reference
                .forEach(System.out::println); // static method reference
    }
}