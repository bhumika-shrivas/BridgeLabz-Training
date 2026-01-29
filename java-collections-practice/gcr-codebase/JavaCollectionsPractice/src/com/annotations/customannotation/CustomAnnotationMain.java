package com.annotations.customannotation;

import java.lang.reflect.Method;

public class CustomAnnotationMain {

	public static void main(String[] args) {
        // Create object of TaskManager
        TaskManager taskManager = new TaskManager();

        try {
            // Get the specific method we want
            Method method = TaskManager.class.getMethod("completeTask");

            // Check if the method has @TaskInfo annotation
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo info = method.getAnnotation(TaskInfo.class);

                // Print the annotation details
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + info.priority());
                System.out.println("Assigned To: " + info.assignedTo());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
