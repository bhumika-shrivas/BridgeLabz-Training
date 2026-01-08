package com.day6.parkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    // 🔒 internal booking logs
    private List<String> bookingLogs = new ArrayList<>();

    public ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // Encapsulation: slot availability managed internally
    public boolean assignSlot(Vehicle vehicle) {
        if (!isOccupied && vehicle.getType().equalsIgnoreCase(vehicleTypeAllowed)) {
            isOccupied = true;
            bookingLogs.add("Slot " + slotId + " assigned to " + vehicle.getType());
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLogs.add("Slot " + slotId + " released.");
    }

    public void showLogs() {
        System.out.println("\n--- Booking Logs for Slot " + slotId + " ---");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }

    public boolean isAvailable() {
        return !isOccupied;
    }
}
