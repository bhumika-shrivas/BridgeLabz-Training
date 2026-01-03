package com.encapsulation.hospitalsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient(101, "Amit", 45, 5, 3000));
        patients.add(new OutPatient(102, "Neha", 30, 800));

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: ₹" + p.calculateBill());
            System.out.println();
        }
    }
}
