package com.day5.petpal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-10);
        changeMood(10);
        System.out.println(name + " pecked at the seeds.");
    }

    @Override
    public void play() {
        changeEnergy(-15);
        changeMood(20);
        System.out.println(name + " is flying happily.");
    }

    @Override
    public void sleep() {
        changeEnergy(25);
        System.out.println(name + " is resting in its nest.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}