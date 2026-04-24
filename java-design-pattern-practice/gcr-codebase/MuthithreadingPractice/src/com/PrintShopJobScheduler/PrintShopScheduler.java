package com.PrintShopJobScheduler;


public class PrintShopScheduler {

    public static void main(String[] args) throws InterruptedException {

        long overallStart = System.currentTimeMillis();

        System.out.println("Starting print jobs...\n");

        Thread t1 = new Thread(new PrintJob("Job1", 10, 5));
        Thread t2 = new Thread(new PrintJob("Job2", 5, 8));
        Thread t3 = new Thread(new PrintJob("Job3", 15, 3));
        Thread t4 = new Thread(new PrintJob("Job4", 8, 6));
        Thread t5 = new Thread(new PrintJob("Job5", 12, 7));

        // Set thread priorities
        t1.setPriority(5);  // Medium
        t2.setPriority(8);  // High
        t3.setPriority(3);  // Low
        t4.setPriority(6);  // Medium
        t5.setPriority(7);  // Medium-High

        // Start all jobs concurrently
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for all jobs to finish
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        long overallEnd = System.currentTimeMillis();

        System.out.println(
            "\nAll jobs completed in " + (overallEnd - overallStart) + " ms"
        );
    }
}