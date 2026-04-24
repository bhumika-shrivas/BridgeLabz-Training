package com.librarymanagementsystem;
class Student implements User {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Student.");
    }

    public int getBorrowLimit() {
        return 7; // limited days
    }

    public void update(String msg) {
        System.out.println("Student " + name + " notified: " + msg);
    }
}