package com.day3.cabbygo;

class SUV extends Vehicle {
    SUV(String number) {
        super(number, 6, "SUV");
    }

    public void bookRide(double distance) {
        setFare(100 + distance * 20);
        System.out.println("SUV booked. Fare: " + getFare());
    }

    public void endRide() {
        System.out.println("SUV ride ended");
    }
}
