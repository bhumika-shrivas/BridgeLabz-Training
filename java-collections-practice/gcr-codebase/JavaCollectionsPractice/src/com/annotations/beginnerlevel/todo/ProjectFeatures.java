package com.annotations.beginnerlevel.todo;

public class ProjectFeatures {

    @Todo(
        task = "Implement user login validation",
        assignedTo = "Arya",
        priority = "HIGH"
    )
    public void loginFeature() {
        System.out.println("Login feature in progress...");
    }

    @Todo(
        task = "Add payment gateway integration",
        assignedTo = "Ravi"
        // priority not given → default MEDIUM
    )
    public void paymentFeature() {
        System.out.println("Payment feature pending...");
    }

    @Todo(
        task = "Improve UI responsiveness",
        assignedTo = "Neha",
        priority = "LOW"
    )
    public void uiImprovement() {
        System.out.println("UI improvement pending...");
    }

    public void completedFeature() {
        System.out.println("This feature is completed.");
    }
}

