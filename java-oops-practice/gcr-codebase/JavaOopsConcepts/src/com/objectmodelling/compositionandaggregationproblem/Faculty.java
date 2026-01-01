package com.objectmodelling.compositionandaggregationproblem;

public class Faculty {

    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void displayFaculty() {
        System.out.println("Faculty: " + name + " | Specialization: " + specialization);
    }
}
