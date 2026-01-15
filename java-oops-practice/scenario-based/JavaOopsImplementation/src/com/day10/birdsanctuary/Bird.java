package com.day10.birdsanctuary;

// Base class
abstract class Bird {

    private int id;
    private String name;
    private String species;

    Bird(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}
