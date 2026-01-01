package com.inheritance.assistedproblems.animalhierarchy;

// Subclasss
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
