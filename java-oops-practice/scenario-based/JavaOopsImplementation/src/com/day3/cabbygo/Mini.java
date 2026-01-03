package com.day3.cabbygo;

class Mini extends Vehicle {
    Mini(String number) {
        super(number, 4, "Mini");
    }

    public void bookRide(double distance) {
        double baseFare = 50;
        double rate = 10;
        setFare(baseFare + distance * rate);
        System.out.println("Mini booked. Fare: " + getFare());
    }

    public void endRide() {
        System.out.println("Mini ride ended");
    }
}
