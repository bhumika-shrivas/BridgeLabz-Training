package com.RestaurantOrderSystem;

class Chef extends Thread {

    private String dish;
    private int totalTime; // in milliseconds

    public Chef(String name, String dish, int totalTime) {
        super(name); // set thread name
        this.dish = dish;
        this.totalTime = totalTime;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " started preparing " + dish);

            int stepTime = totalTime / 4;
            int progress = 25;

            for (int i = 1; i <= 4; i++) {
                Thread.sleep(stepTime);
                System.out.println(
                    getName() + " preparing " + dish + ": " + progress + "% complete"
                );
                progress += 25;
            }

            System.out.println(getName() + " completed " + dish);

        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted while preparing " + dish);
        }
    }
}