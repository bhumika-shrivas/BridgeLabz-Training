package com.day3.parceltracker;

/*ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List.
Requirements:
● Forward tracking through stages.
● Add custom intermediate checkpoints.
● Handle lost/missing parcels (null pointers).
*/

import java.util.Scanner;

public class ParcelTrackerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        while (true) {
            System.out.println("""
            1. Add Stage
            2. Add Checkpoint
            3. Track Parcel
            4. Exit
            """);

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Stage name: ");
                    tracker.addStage(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("After which stage: ");
                    String after = sc.nextLine();
                    System.out.print("New stage: ");
                    tracker.addAfter(after, sc.nextLine());
                }
                case 3 -> tracker.track();
                case 4 -> { return; }
            }
        }
    }
}
