package com.inheritance.mutilevelinheritance.coursehierarchy;

// Subclass
public class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount; // in %

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: ₹" + finalFee);
    }
}
