package com.annotations.customannotation;

public class TaskManager {

    // Apply the @TaskInfo annotation to this method
    @TaskInfo(priority = "High", assignedTo = "Arya")
    public void completeTask() {
        System.out.println("Task is being completed...");
    }

    @TaskInfo(priority = "Medium", assignedTo = "Alex")
    public void reviewTask() {
        System.out.println("Task is under review...");
    }
}
