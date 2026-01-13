package com.day9.homenest;


class Thermostat extends Device {

    Thermostat(String deviceId) {
        super(deviceId, 2.0);
    }

    public void turnOn() {
        setStatus(true);
        firmwareLog("Thermostat ON");
    }

    public void turnOff() {
        setStatus(false);
        firmwareLog("Thermostat OFF");
    }

    public void reset() {
        firmwareLog("Temperature reset to default");
    }
}
