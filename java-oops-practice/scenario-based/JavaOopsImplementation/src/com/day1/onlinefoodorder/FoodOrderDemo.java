package com.day1.onlinefoodorder;

public class FoodOrderDemo
{
    public static void main(String[] args) 
    {

        Customer customer = new Customer("Amit");
        FoodItem pizza = new FoodItem("Pizza", 250);
        FoodItem burger = new FoodItem("Burger", 150);

        customer.orderFood(pizza);
        customer.orderFood(burger);

        Order order = new Order();
        order.placeOrder(customer.cart.calculateTotal());
    }
}
