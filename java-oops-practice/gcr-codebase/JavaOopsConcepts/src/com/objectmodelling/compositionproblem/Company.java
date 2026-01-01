package com.objectmodelling.compositionproblem;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompanyDetails() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    // Simulate company deletion
    public void closeCompany() {
        departments.clear();
        System.out.println("\nCompany closed. All departments and employees removed.");
    }
}
