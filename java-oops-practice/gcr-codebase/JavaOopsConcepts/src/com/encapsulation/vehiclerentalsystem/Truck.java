package com.encapsulation.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNo;

    public Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate);
        this.insurancePolicyNo = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // heavy vehicle charge
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (Policy Hidden)";
    }
}
