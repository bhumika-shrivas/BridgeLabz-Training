package com.day9.budgetwise;

import java.util.HashMap;

class MonthlyBudget extends Budget {

    MonthlyBudget(double income, HashMap<String, Double> limits) {
        super(income, limits);
    }

    @Override
    public void generateReport() {
        System.out.println("----- Monthly Budget Report -----");
        System.out.println("Income: " + income);
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        HashMap<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                spent.put(
                    t.getCategory(),
                    spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
                );
            }
        }

        for (String cat : categoryLimits.keySet()) {
            if (spent.getOrDefault(cat, 0.0) > categoryLimits.get(cat)) {
                System.out.println("Overspent in category: " + cat);
            }
        }
    }
}
