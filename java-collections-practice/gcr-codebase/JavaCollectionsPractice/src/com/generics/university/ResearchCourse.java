package com.generics.university;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        this.evaluationMethod = "Research Work & Thesis";
    }

    @Override
    public String getEvaluationMethod() {
        return evaluationMethod;
    }
}
