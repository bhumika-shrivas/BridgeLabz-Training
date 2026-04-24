package com.functionalinterface.markerinterface.cloningobject;

public class Employee implements Cloneable {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}