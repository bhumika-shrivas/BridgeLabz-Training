package com.day8.skillforge;

class Student extends User {
    private int progress;   // % completed

    public Student(String name) {
        super(name);
        this.progress = 0;
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules; // operator usage
    }

    public int getProgress() {
        return progress;
    }
}
