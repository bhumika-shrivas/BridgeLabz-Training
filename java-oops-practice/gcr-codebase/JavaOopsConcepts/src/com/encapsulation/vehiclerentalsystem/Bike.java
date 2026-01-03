package com.encapsulation.vehiclerentalsystem;

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNo;

    public Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate);
        this.insurancePolicyNo = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return (rentalRate * days) - 100; // discount
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance (Policy Hidden)";
    }
}
