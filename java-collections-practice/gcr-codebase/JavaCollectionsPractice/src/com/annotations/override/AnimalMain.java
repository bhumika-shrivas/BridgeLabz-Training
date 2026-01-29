package com.annotations.override;

public class AnimalMain {

	public static void main(String[] args) {

        Animal a = new Dog(); // polymorphism
        a.sound();            // calls Dog's sound()
    }
}
