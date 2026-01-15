package com.day10.birdsanctuary;

// Derived class
public class Duck extends Bird implements Flyable, Swimmable {

    Duck(int id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }

    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}
