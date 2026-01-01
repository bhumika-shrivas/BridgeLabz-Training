package com.inheritance.assistedproblems.animalhierarchy;

// Superclass
public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
