package com.day2.hospitalsystem;

// Encapsulation
class Patient {
    private String name;
    private int age;
    private String medicalHistory;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Patient(String name, int age, String medicalHistory) { // emergency
        this(name, age);
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient: " + name + ", Age: " + age;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}
