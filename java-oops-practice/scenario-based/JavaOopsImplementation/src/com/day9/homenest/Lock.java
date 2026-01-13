package com.day9.homenest;

class Lock extends Device {

    Lock(String deviceId) {
        super(deviceId, 0.2);
    }

    public void turnOn() {
        setStatus(true);
        firmwareLog("Door Locked");
    }

    public void turnOff() {
        setStatus(false);
        firmwareLog("Door Unlocked");
    }

    public void reset() {
        firmwareLog("Security codes refreshed");
    }
}
