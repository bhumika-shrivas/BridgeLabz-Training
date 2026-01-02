package com.day2.hospitalsystem;

// Main (usage)
public class HospitalApp {
    public static void main(String[] args) {

        Patient p1 = new InPatient("Riya", 25, 5);
        Patient p2 = new OutPatient("Aman", 30);

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");

        Bill bill = new Bill(10000);

        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill: " + bill.calculatePayment());
    }
}
