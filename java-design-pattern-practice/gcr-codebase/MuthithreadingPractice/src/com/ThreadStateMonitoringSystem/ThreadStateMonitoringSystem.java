package com.ThreadStateMonitoringSystem;

public class ThreadStateMonitoringSystem {

    public static void main(String[] args) throws InterruptedException {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(task1, task2);

        // NEW state visible here
        monitor.start();

        Thread.sleep(500); // allow monitor to detect NEW

        task1.start();
        task2.start();

        task1.join();
        task2.join();
        monitor.join();
    }
}