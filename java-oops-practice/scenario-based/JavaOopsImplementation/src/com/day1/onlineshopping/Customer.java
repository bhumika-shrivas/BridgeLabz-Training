package com.day1.onlineshopping;

// Uses everything
public class Customer 
{

    private String name;
    private Cart cart;

    public Customer(String name) 
    {
        this.name = name;
        this.cart = new Cart();
    }

    public void addToCart(Product product) 
    {
        cart.addProduct(product);
    }

    public void checkout(Payment payment) 
    {
        double total = cart.calculateTotal();
        System.out.println("\nCustomer: " + name);
        payment.pay(total);
    }
}
