package com.objectmodelling.compositionandaggregationproblem;

import java.util.ArrayList;

public class University {

    private String universityName;
    private ArrayList<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showUniversityDetails() {
        System.out.println("\nUniversity: " + universityName);
        for (Department dept : departments) {
            dept.showDepartmentDetails();
        }
    }

    // Simulate deletion of University
    public void closeUniversity() {
        departments.clear(); // deletes all departments
        System.out.println("\nUniversity closed. All departments removed.");
    }
}
