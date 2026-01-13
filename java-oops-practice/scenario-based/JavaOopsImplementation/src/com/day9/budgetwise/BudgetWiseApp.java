package com.day9.budgetwise;

import java.util.*;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Budget budget = null;

        while (true) {
            System.out.println("""
            1. Create Budget
            2. Add Transaction
            3. Generate Report
            4. Detect Overspend
            5. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Monthly or Annual? ");
                    String type = sc.nextLine();

                    System.out.print("Enter Income: ");
                    double income = sc.nextDouble();

                    System.out.print("Number of categories: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    HashMap<String, Double> limits = new HashMap<>();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Category name: ");
                        String cat = sc.nextLine();
                        System.out.print("Limit: ");
                        double lim = sc.nextDouble();
                        sc.nextLine();
                        limits.put(cat, lim);
                    }

                    budget = type.equalsIgnoreCase("monthly")
                            ? new MonthlyBudget(income, limits)
                            : new AnnualBudget(income, limits);

                    System.out.println("Budget created");
                }

                case 2 -> {
                    if (budget == null) {
                        System.out.println("Create budget first");
                        break;
                    }

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Type (income/expense): ");
                    String t = sc.nextLine();

                    System.out.print("Date: ");
                    String date = sc.nextLine();

                    System.out.print("Category: ");
                    String cat = sc.nextLine();

                    budget.addTransaction(
                        new Transaction(amt, t, date, cat)
                    );
                    System.out.println("Transaction added");
                }

                case 3 -> budget.generateReport();
                case 4 -> budget.detectOverspend();

                case 5 -> {
                    System.out.println("BudgetWise closed");
                    return;
                }
            }
        }
    }
}
