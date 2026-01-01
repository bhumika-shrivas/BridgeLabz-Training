package com.inheritance.hybridinheritance.restaurantmanagement;

// Main Class
public class RestaurantTest {
    public static void main(String[] args) {

        Worker w1 = new Chef("Rahul", 101);
        Worker w2 = new Waiter("Amit", 102);

        // Polymorphism through interface
        w1.performDuties();
        w2.performDuties();
    }
}
