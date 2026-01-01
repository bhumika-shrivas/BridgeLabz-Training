package com.objectmodelling.associationandcommunicationproblem;

import java.util.ArrayList;

public class Doctor {

    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Communication method
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println(
            "Doctor " + name +
            " (" + specialization + ")" +
            " is consulting Patient " + patient.getName()
        );
    }
}
