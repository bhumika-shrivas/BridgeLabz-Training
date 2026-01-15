package com.day10.birdsanctuary;

// Derived Class
public class Eagle extends Bird implements Flyable {

    Eagle(int id, String name) {
        super(id, name, "Eagle");
    }

    public void fly() {
        System.out.println(getName() + " is flying high");
    }
}
