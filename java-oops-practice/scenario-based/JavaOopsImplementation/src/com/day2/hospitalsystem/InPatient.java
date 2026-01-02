package com.day2.hospitalsystem;

// Subclass, Inheritance
class InPatient extends Patient {
    private int daysAdmitted;

    InPatient(String name, int age, int days) {
        super(name, age);
        this.daysAdmitted = days;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient | Days admitted: " + daysAdmitted);
    }
}

class OutPatient extends Patient {
    OutPatient(String name, int age) {
        super(name, age);
    }
}
