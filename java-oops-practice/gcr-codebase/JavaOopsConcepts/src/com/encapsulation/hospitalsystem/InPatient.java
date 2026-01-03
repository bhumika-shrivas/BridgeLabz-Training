package com.encapsulation.hospitalsystem;

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    @Override
    double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String record) {
        setMedicalDetails("Under Treatment", record);
    }

    public void viewRecords() {
        System.out.println("In-Patient medical record available");
    }
}
