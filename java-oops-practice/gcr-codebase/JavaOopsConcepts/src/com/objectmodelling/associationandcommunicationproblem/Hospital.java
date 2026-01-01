package com.objectmodelling.associationandcommunicationproblem;

import java.util.ArrayList;

public class Hospital {

    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("\nHospital: " + hospitalName);
        System.out.println("Doctors available: " + doctors.size());
        System.out.println("Patients registered: " + patients.size());
    }
}
