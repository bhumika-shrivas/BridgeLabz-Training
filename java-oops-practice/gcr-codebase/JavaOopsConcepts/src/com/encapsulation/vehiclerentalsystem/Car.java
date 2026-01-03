package com.encapsulation.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNo; // sensitive data

    public Car(String number, double rate, String policyNo) {
        super(number, "Car", rate);
        this.insurancePolicyNo = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // flat insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (Policy Hidden)";
    }
}
