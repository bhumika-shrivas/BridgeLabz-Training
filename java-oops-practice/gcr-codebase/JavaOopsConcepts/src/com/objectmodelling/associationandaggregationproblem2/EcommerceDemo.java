package com.objectmodelling.associationandaggregationproblem2;

public class EcommerceDemo {
    public static void main(String[] args) {

        // Products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Keyboard", 1500);

        // Order
        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        // Customer
        Customer customer = new Customer("Rohan");

        // Customer places order
        customer.placeOrder(order1);
    }
}
