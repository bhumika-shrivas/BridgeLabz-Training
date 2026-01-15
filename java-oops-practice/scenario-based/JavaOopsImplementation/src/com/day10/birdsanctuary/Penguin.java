package com.day10.birdsanctuary;

// Derived class
public class Penguin extends Bird implements Swimmable {

    Penguin(int id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}
