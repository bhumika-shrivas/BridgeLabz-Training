package com.day6.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 7.0); // base interest rate
    }

    // Polymorphic EMI calculation
    @Override
    public double calculateEMI() {
        return baseEMI(0); // lowest interest
    }
}
