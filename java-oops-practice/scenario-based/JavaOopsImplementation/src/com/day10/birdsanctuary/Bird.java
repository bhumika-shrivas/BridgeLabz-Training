package com.day10.birdsanctuary;

// Base class
abstract class Bird {
    String name;
    String species;
    int id;

    Bird(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}
