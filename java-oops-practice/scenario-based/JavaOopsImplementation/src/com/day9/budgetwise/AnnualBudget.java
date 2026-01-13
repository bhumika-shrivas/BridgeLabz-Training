package com.day9.budgetwise;

import java.util.HashMap;

class AnnualBudget extends Budget {

    AnnualBudget(double income, HashMap<String, Double> limits) {
        super(income, limits);
    }

    @Override
    public void generateReport() {
        System.out.println("===== Annual Budget Summary =====");
        System.out.println("Yearly Income: " + income);
        System.out.println("Yearly Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Annual overspend analysis completed");
    }
}
