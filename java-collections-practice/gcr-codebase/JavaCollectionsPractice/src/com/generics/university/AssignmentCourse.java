package com.generics.university;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        this.evaluationMethod = "Assignments & Projects";
    }

    @Override
    public String getEvaluationMethod() {
        return evaluationMethod;
    }
}
