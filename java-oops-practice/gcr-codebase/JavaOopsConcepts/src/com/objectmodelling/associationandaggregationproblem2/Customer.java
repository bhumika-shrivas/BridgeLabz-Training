package com.objectmodelling.associationandaggregationproblem2;

public class Customer {

    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    // Communication with Order
    public void placeOrder(Order order) {
        System.out.println("\nCustomer " + customerName + " placed an order.");
        order.showOrderDetails();
    }
}
