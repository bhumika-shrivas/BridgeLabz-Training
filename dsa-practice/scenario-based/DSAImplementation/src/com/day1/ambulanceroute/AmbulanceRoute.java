package com.day1.ambulanceroute;

class AmbulanceRoute {

    private HospitalUnitNode head = null;
    private HospitalUnitNode current = null;

    // Add unit to circular route
    public void addUnit(String name, boolean available) {
        HospitalUnitNode newNode = new HospitalUnitNode(name, available);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            HospitalUnitNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }

        System.out.println("Unit added: " + name);
    }

    // Find nearest available unit
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        HospitalUnitNode temp = current;
        do {
            if (temp.available) {
                System.out.println("Redirect patient to: " + temp.unitName);
                current = temp;
                return;
            }
            temp = temp.next;
        } while (temp != current);

        System.out.println("No units currently available");
    }

    // Mark unit under maintenance (remove)
    public void removeUnit(String unitName) {
        if (head == null) {
            System.out.println("Route is empty");
            return;
        }

        HospitalUnitNode temp = head;
        HospitalUnitNode prev = null;

        do {
            if (temp.unitName.equalsIgnoreCase(unitName)) {

                if (temp == head && temp.next == head) {
                    head = null;
                    current = null;
                } else {
                    if (temp == head) {
                        HospitalUnitNode last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = temp.next;
                    }

                    if (temp == current) {
                        current = temp.next;
                    }
                }

                System.out.println("Unit removed (Maintenance): " + unitName);
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Unit not found");
    }

    // Display route
    public void displayRoute() {
        if (head == null) {
            System.out.println("No hospital route defined");
            return;
        }

        HospitalUnitNode temp = head;
        System.out.print("Ambulance Route: ");
        do {
            System.out.print(temp.unitName + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}