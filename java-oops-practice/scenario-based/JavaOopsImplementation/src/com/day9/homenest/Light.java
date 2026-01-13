package com.day9.homenest;

class Light extends Device {

    Light(String deviceId) {
        super(deviceId, 0.5);
    }

    public void turnOn() {
        setStatus(true);
        firmwareLog("Light ON");
    }

    public void turnOff() {
        setStatus(false);
        firmwareLog("Light OFF");
    }

    public void reset() {
        firmwareLog("Light brightness reset");
    }
}
