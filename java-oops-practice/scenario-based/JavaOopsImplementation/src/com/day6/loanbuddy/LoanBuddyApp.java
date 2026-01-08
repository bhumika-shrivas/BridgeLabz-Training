package com.day6.loanbuddy;

import java.util.Scanner;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Applicant details
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        // Loan type
        System.out.print("Choose loan type (1-Home, 2-Auto): ");
        int choice = sc.nextInt();

        System.out.print("Enter loan term (months): ");
        int term = sc.nextInt();

        LoanApplication loan;
        if (choice == 1) {
            loan = new HomeLoan(applicant, term);
        } else {
            loan = new AutoLoan(applicant, term);
        }

        // Approval & EMI
        boolean approved = loan.approveLoan();
        loan.showStatus();

        if (approved) {
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        }
    }
}
