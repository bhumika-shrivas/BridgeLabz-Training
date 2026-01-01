package com.inheritance.hybridinheritance.vehiclemanagement;

// Main class
public class VehicleTest {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        ev.displayInfo();
        ev.charge();

        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}
