package com.encapsulation.hospitalsystem;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis; // sensitive
    private String medicalHistory; // sensitive

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation
    protected void setMedicalDetails(String diagnosis, String history) {
        this.diagnosis = diagnosis;
        this.medicalHistory = history;
    }

    abstract double calculateBill(); // Abstraction

    public void getPatientDetails() {
        System.out.println(
            "ID: " + patientId +
            ", Name: " + name +
            ", Age: " + age
        );
    }
}
