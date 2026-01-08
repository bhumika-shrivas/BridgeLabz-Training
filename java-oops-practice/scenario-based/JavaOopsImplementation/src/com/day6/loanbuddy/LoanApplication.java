package com.day6.loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term;              // months
    protected double interestRate;   // annual %

    private boolean approved;        // 🔒 status controlled internally

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    // 🔒 Approval logic encapsulated
    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 &&
            applicant.getIncome() >= applicant.getLoanAmount() / 10) {
            approved = true;
        } else {
            approved = false;
        }
        return approved;
    }

    protected double baseEMI(double rateModifier) {
        double P = applicant.getLoanAmount();
        double R = (interestRate + rateModifier) / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }

    public void showStatus() {
        System.out.println("Loan Status: " + (approved ? "APPROVED" : "REJECTED"));
    }
}
