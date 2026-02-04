package com.functionalinterface.markerinterface.cloningobject;

public class CloneApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee("Amit", 50000);
        Employee e2 = (Employee) e1.clone();

        System.out.println(e1.name + " " + e1.salary);
        System.out.println(e2.name + " " + e2.salary);
    }
}