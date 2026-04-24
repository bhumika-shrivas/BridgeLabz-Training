package com.lambdaexpression.billing;

/*Invoice Object Creation
○ Scenario: Generate invoice objects from transaction IDs.
○ Task: Use a constructor reference.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);

        System.out.println("---- Generated Invoices ----");

        List<Invoice> invoices =
                transactionIds.stream()
                              .map(Invoice::new)   // constructor reference
                              .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
