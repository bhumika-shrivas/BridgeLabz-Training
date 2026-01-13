package com.day2.traincompanion;

class TrainCompanion {

    private Compartment head;
    private Compartment tail;
    private Compartment current;

    // Insert compartment at end
    void addCompartment(String name) {
        Compartment node = new Compartment(name);

        if (head == null) {
            head = tail = current = node;
            System.out.println(name + " added as first compartment");
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;

        System.out.println(name + " added");
    }

    // Move to next compartment
    void moveNext() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved to: " + current.name);
        } else {
            System.out.println("No next compartment");
        }
    }

    // Move to previous compartment
    void movePrevious() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved to: " + current.name);
        } else {
            System.out.println("No previous compartment");
        }
    }

    // Display adjacent compartments
    void showAdjacent() {
        if (current == null) {
            System.out.println("Train has no compartments");
            return;
        }

        String prevName = (current.prev != null) ? current.prev.name : "None";
        String nextName = (current.next != null) ? current.next.name : "None";

        System.out.println("Current  : " + current.name);
        System.out.println("Previous : " + prevName);
        System.out.println("Next     : " + nextName);
    }

    // Remove a compartment
    void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next; // removing head

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev; // removing tail

                if (current == temp)
                    current = (temp.next != null) ? temp.next : temp.prev;

                System.out.println(name + " removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }
}
