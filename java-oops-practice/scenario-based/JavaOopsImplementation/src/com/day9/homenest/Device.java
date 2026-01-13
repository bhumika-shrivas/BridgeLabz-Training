package com.day9.homenest;

abstract class Device implements IControllable {

    private String deviceId;      // encapsulated
    private boolean status;       // cannot be modified externally
    protected double energyUsage; // accessible to subclasses

    // secure firmware logs
    protected void firmwareLog(String msg) {
        System.out.println("[Firmware] " + msg);
    }

    Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isOn() {
        return status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    // operator usage
    public double calculateEnergy(int days) {
        return energyUsage * days;
    }
}
