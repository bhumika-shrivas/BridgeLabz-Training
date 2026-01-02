package com.day2.hospitalsystem;

// Polymorphism
class Doctor {
    String name;
    String specialization;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor: " + name + " (" + specialization + ")");
    }
}
