package com.day9.homenest;

class Camera extends Device {

    Camera(String deviceId) {
        super(deviceId, 1.2);
    }

    public void turnOn() {
        setStatus(true);
        firmwareLog("Camera recording");
    }

    public void turnOff() {
        setStatus(false);
        firmwareLog("Camera stopped");
    }

    public void reset() {
        firmwareLog("Camera recalibrated");
    }
}
