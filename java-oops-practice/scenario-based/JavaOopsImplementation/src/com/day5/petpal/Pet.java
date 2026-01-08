package com.day5.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // 🔒 Encapsulated internal state
    private int hunger;   // 0 (full) → 100 (very hungry)
    private int energy;   // 0 (tired) → 100 (energetic)
    private int mood;     // 0 (sad) → 100 (happy)

    // Constructor with random defaults
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random rand = new Random();
        this.hunger = rand.nextInt(40) + 30;
        this.energy = rand.nextInt(40) + 30;
        this.mood = rand.nextInt(40) + 30;
    }

    // Protected helpers (only subclasses can affect internals)
    protected void changeHunger(int value) {
        hunger = Math.max(0, Math.min(100, hunger + value));
    }

    protected void changeEnergy(int value) {
        energy = Math.max(0, Math.min(100, energy + value));
    }

    protected void changeMood(int value) {
        mood = Math.max(0, Math.min(100, mood + value));
    }

    // Read-only access
    public void showStatus() {
        System.out.println("\n--- " + name + " Status ---");
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }

    // Polymorphic behavior
    public abstract void makeSound();
}