package com.day3.cabbygo;

class Sedan extends Vehicle {
    Sedan(String number) {
        super(number, 4, "Sedan");
    }

    public void bookRide(double distance) {
        setFare(70 + distance * 15);
        System.out.println("Sedan booked. Fare: " + getFare());
    }

    public void endRide() {
        System.out.println("Sedan ride ended");
    }
}
