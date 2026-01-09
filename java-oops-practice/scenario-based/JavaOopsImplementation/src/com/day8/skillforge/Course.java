package com.day8.skillforge;

import java.util.ArrayList;

abstract class Course implements ICertifiable {

    private String title;
    private Instructor instructor;
    protected double rating;            // protected logic
    private final ArrayList<String> reviews; // read-only internally
    protected ArrayList<String> modules;

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this(title, instructor, new ArrayList<>());
        modules.add("Introduction");
        modules.add("Basics");
        modules.add("Final Project");
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, ArrayList<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new ArrayList<>();
        this.rating = 0.0;
    }

    // Encapsulated rating logic
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    public ArrayList<String> getModules() {
        return modules;
    }

    public String getTitle() {
        return title;
    }
}
