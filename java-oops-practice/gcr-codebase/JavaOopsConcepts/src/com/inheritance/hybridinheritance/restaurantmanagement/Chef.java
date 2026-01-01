package com.inheritance.hybridinheritance.restaurantmanagement;

// Subclass ( Inherits Person + Implements Worker)
public class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is preparing meals.");
    }
}
