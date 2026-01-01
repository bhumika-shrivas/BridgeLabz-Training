package com.objectmodelling.compositionandaggregationproblem;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Faculty> facultyMembers;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    // Aggregation: add existing faculty
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);
        for (Faculty faculty : facultyMembers) {
            faculty.displayFaculty();
        }
    }
}
