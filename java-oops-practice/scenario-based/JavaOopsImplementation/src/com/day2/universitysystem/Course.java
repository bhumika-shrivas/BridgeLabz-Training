package com.day2.universitysystem;

class Course {
    private String courseCode;
    private String courseName;

    Course(String code, String name) {
        this.courseCode = code;
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }
}
