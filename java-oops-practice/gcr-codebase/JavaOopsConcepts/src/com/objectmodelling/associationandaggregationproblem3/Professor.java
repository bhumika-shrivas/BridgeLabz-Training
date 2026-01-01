package com.objectmodelling.associationandaggregationproblem3;

import java.util.ArrayList;

public class Professor {

    private String name;
    private ArrayList<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Communication: professor assigned to a course
    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
        System.out.println(name + " assigned to teach " + course.getCourseName());
    }
}
