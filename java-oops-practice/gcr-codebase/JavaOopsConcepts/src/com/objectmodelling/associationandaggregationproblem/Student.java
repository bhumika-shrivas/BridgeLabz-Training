package com.objectmodelling.associationandaggregationproblem;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association: student enrolls in course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void showCourses() {
        System.out.println("\nCourses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}
