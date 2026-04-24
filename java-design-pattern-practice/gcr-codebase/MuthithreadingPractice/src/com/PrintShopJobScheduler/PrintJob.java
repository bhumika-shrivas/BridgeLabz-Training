package com.PrintShopJobScheduler;

class PrintJob implements Runnable {

    private String jobName;
    private int pages;
    private int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        String priorityLabel = getPriorityLabel(priority);

        for (int page = 1; page <= pages; page++) {
            System.out.println(
                "[" + priorityLabel + "] Printing " + jobName +
                " - Page " + page + " of " + pages
            );

            try {
                Thread.sleep(100); // 100ms per page
            } catch (InterruptedException e) {
                System.out.println(jobName + " interrupted");
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println(jobName + " completed in " + (endTime - startTime) + " ms");
    }

    private String getPriorityLabel(int priority) {
        if (priority >= 8) return "High Priority";
        if (priority >= 5) return "Medium Priority";
        return "Low Priority";
    }
}