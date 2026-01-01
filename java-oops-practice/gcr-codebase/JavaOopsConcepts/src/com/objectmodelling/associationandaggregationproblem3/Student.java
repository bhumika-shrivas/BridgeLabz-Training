package com.objectmodelling.associationandaggregationproblem3;

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

    // Communication: student enrolls in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void showCourses() {
        System.out.println("\nCourses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }
}
