package com.objectmodelling.associationandaggregationproblem3;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " +
                (professor != null ? professor.getName() : "Not Assigned"));

        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}
