package com.functionalinterface;
/*Background Job Execution
○ Scenario: Execute tasks asynchronously.
○ Task: Use Runnable functional interface.*/

import java.util.Scanner;

public class JobExecution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose background task:");
        System.out.println("1. File Upload");
        System.out.println("2. Email Sending");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        Runnable task;

        switch (choice) {
            case 1:
                task = () -> {
                    System.out.println("File upload started");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("File upload completed");
                };
                break;

            case 2:
                task = () -> {
                    System.out.println("Email sending started");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Email sent successfully");
                };
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        Thread backgroundThread = new Thread(task);
        backgroundThread.start();

        System.out.println("Task is running in background");
        sc.close();
    }
}
