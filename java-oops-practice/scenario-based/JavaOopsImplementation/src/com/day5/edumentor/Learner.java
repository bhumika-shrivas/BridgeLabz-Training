package com.day5.edumentor;

public class Learner extends User implements ICertifiable {

    private boolean fullTime;

    public Learner(String name, String email, int userId, boolean fullTime) {
        super(name, email, userId);
        this.fullTime = fullTime;
    }

    @Override
    public void generateCertificate() {
        if (fullTime) {
            System.out.println("Full-Time Course Certificate generated for " + name);
        } else {
            System.out.println("Short Course Certificate generated for " + name);
        }
    }
}
