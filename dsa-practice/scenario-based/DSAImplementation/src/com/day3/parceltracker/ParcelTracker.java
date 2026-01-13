package com.day3.parceltracker;

class ParcelTracker {

    private StageNode head;

    // Add stage at end
    void addStage(String stage) {
        StageNode node = new StageNode(stage);

        if (head == null) {
            head = node;
            return;
        }

        StageNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = node;
    }

    // Add intermediate checkpoint
    void addAfter(String target, String stage) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stage.equals(target)) {
                StageNode node = new StageNode(stage);
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage not found");
    }

    // Track parcel
    void track() {
        if (head == null) {
            System.out.println("Parcel lost (null pointer)");
            return;
        }

        StageNode temp = head;
        while (temp != null) {
            System.out.println("Parcel at: " + temp.stage);
            temp = temp.next;
        }
        System.out.println("Tracking complete");
    }
}
