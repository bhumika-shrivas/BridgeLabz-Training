package com.inheritance.assistedproblems.animalhierarchy;

// Main class
public class AnimalTest {
    public static void main(String[] args) {

        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Whiskers", 2);
        Animal a3 = new Bird("Tweety", 1);

        a1.makeSound(); // Dog's sound
        a2.makeSound(); // Cat's sound
        a3.makeSound(); // Bird's sound
    }
}
