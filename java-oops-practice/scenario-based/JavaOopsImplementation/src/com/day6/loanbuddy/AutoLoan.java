package com.day6.loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 9.0); // base interest rate
    }

    @Override
    public double calculateEMI() {
        return baseEMI(1.5); // higher risk → higher rate
    }
}
