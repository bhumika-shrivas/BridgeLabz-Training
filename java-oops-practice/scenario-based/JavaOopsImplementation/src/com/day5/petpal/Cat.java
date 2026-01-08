package com.day5.petpal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
        changeMood(5);
        System.out.println(name + " ate calmly.");
    }

    @Override
    public void play() {
        changeEnergy(-10);
        changeMood(15);
        System.out.println(name + " is playing with a ball of yarn.");
    }

    @Override
    public void sleep() {
        changeEnergy(40);
        changeMood(10);
        System.out.println(name + " is napping.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}