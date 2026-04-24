package com.collectors;

/*
Order Revenue Summary
○ Scenario: Sum order totals per customer.
○ Task: Use Collectors.summingDouble()
 */
import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    static class Order {
        String customer;
        double amount;

        Order(String customer, double amount) {
            this.customer = customer;
            this.amount = amount;
        }

        String getCustomer() { return customer; }
        double getAmount() { return amount; }
    }

    public static void main(String[] args) {

        List<Order> orders = List.of(
            new Order("Bhumi", 250.5),
            new Order("Arya", 100.0),
            new Order("Disha", 300.0)
        );

        Map<String, Double> revenueByCustomer =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      Order::getCustomer,
                      Collectors.summingDouble(Order::getAmount)
                  ));

        System.out.println(revenueByCustomer);
    }
}
