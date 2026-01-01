package com.objectmodelling.associationandaggregationproblem3;

import java.util.ArrayList;

public class University {

    private String universityName;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    public University(String universityName) {
        this.universityName = universityName;
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showUniversityDetails() {
        System.out.println("\nUniversity: " + universityName);
        System.out.println("Students: " + students.size());
        System.out.println("Professors: " + professors.size());
        System.out.println("Courses: " + courses.size());
    }
}
