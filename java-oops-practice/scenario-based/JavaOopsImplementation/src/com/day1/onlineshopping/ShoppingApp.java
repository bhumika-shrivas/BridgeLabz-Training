package com.day1.onlineshopping;

// Main Class
public class ShoppingApp 
{
    public static void main(String[] args) 
    {

        Product p1 = new PhysicalProduct(1, "Laptop", 55000, 2.3);
        Product p2 = new DigitalProduct(2, "Java Course", 1200, "www.download.com/java");

        Customer customer = new Customer("Rohan");

        customer.addToCart(p1);
        customer.addToCart(p2);

        // Polymorphism
        Payment payment = new UpiPayment();
        customer.checkout(payment);
    }
}
