package com.generics.university;

import java.util.List;

public class Department {

    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayCourses(List<? extends CourseType> courses) {
        System.out.println("\nDepartment: " + departmentName);
        for (CourseType course : courses) {
            System.out.println("Evaluation Method: " + course.getEvaluationMethod());
        }
    }
}
