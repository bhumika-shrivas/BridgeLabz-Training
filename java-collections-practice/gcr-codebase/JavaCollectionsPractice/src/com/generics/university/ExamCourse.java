package com.generics.university;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        this.evaluationMethod = "Written Exams";
    }

    @Override
    public String getEvaluationMethod() {
        return evaluationMethod;
    }
}
