package com.csvdatahandling.csvtojavaobject;

public class Student {

    private int id;
    private String name;
    private int age;
    private int marks;

    // Constructor
    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // toString() to print object easily
    @Override
    public String toString() {
        return "Student {" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Marks=" + marks +
                '}';
    }
}

