package com.inheritance.singleinheritance.smarthomedevices;

// Main Class
public class SmartHomeTest {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("THERMO-101", true, 22.5);
        thermostat.displayStatus();
    }
}
