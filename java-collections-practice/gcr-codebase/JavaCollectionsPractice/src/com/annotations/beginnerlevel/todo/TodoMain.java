package com.annotations.beginnerlevel.todo;

import java.lang.reflect.Method;

public class TodoMain {

    public static void main(String[] args) {

        ProjectFeatures obj = new ProjectFeatures();

        // Get all methods of class
        Method[] methods = obj.getClass().getDeclaredMethods();

        System.out.println("Pending Tasks List:\n");

        for (Method m : methods) {

            // Check if @Todo is present
            if (m.isAnnotationPresent(Todo.class)) {

                // Get annotation object
                Todo todo = m.getAnnotation(Todo.class);

                // Print task details
                System.out.println("Method Name : " + m.getName());
                System.out.println("Task        : " + todo.task());
                System.out.println("Assigned To : " + todo.assignedTo());
                System.out.println("Priority    : " + todo.priority());
                System.out.println("--------------------------------");
            }
        }
    }
}

