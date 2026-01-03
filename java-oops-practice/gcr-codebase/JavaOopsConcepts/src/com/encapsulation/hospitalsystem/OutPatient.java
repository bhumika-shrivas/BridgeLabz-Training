package com.encapsulation.hospitalsystem;

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        setMedicalDetails("Consulted", record);
    }

    public void viewRecords() {
        System.out.println("Out-Patient medical record available");
    }
}
