package com.generics.university;

public class Course<T extends CourseType> {

    private String courseName;
    private String courseCode;
    private T courseType;

    public Course(String courseName, String courseCode, T courseType) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseType = courseType;
    }

    public String getCourseDetails() {
        return "Course Name: " + courseName +
               ", Course Code: " + courseCode +
               ", Evaluation: " + courseType.getEvaluationMethod();
    }
}
