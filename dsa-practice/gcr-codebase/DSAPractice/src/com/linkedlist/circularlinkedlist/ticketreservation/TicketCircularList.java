package com.linkedlist.circularlinkedlist.ticketreservation;

class TicketCircularList {
    private TicketNode head = null;

    // Add ticket at end
    void addTicket(TicketNode node) {
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    // Remove ticket by ID
    void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        TicketNode curr = head, prev = null;

        do {
            if (curr.ticketId == ticketId) {
                if (curr == head) {
                    TicketNode last = head;
                    while (last.next != head)
                        last = last.next;

                    if (head.next == head) {
                        head = null; // only one node
                    } else {
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Ticket removed");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            print(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer name
    void searchByCustomer(String name) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for this customer");
    }

    // Search by movie name
    void searchByMovie(String movie) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                print(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for this movie");
    }

    // Count tickets
    void countTickets() {
        if (head == null) {
            System.out.println("Total tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total tickets booked: " + count);
    }

    private void print(TicketNode t) {
        System.out.println(
            t.ticketId + " | " + t.customerName + " | " +
            t.movieName + " | Seat: " + t.seatNumber +
            " | Time: " + t.bookingTime
        );
    }
}
