package com.inheritance.mutilevelinheritance.ordermanagement;

// Main class
public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order(101, "01-Sep-2025");
        ShippedOrder shipped = new ShippedOrder(102, "02-Sep-2025", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder(
                103, "03-Sep-2025", "TRK67890", "05-Sep-2025"
        );

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
