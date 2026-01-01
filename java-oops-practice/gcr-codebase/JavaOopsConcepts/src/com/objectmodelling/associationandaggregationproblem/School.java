package com.objectmodelling.associationandaggregationproblem;

import java.util.ArrayList;

public class School {

    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Aggregation: school has students
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("\nStudents in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
