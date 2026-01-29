package com.annotations.beginnerlevel.customannotation;

public class ServiceClass {

    @ImportantMethod                 // default level = HIGH
    public void saveData() {
        System.out.println("Saving data...");
    }

    @ImportantMethod(level = "LOW")   // custom level
    public void showData() {
        System.out.println("Showing data...");
    }

    public void normalMethod() {
        System.out.println("This is a normal method.");
    }
}

