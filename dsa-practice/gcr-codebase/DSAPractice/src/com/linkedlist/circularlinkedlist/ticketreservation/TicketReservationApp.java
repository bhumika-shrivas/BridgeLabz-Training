package com.linkedlist.circularlinkedlist.ticketreservation;

import java.util.Scanner;

public class TicketReservationApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketCircularList list = new TicketCircularList();
        int choice;

        do {
            System.out.println("\n1.Book Ticket");
            System.out.println("2.Remove Ticket");
            System.out.println("3.Display Tickets");
            System.out.println("4.Search by Customer");
            System.out.println("5.Search by Movie");
            System.out.println("6.Count Tickets");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Customer Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Movie Name: ");
                    String mname = sc.nextLine();
                    System.out.print("Seat Number: ");
                    String seat = sc.nextLine();
                    System.out.print("Booking Time: ");
                    String time = sc.nextLine();

                    list.addTicket(
                        new TicketNode(id, cname, mname, seat, time)
                    );
                    break;

                case 2:
                    System.out.print("Enter Ticket ID: ");
                    list.removeTicket(sc.nextInt());
                    break;

                case 3:
                    list.displayTickets();
                    break;

                case 4:
                    System.out.print("Customer Name: ");
                    list.searchByCustomer(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Movie Name: ");
                    list.searchByMovie(sc.nextLine());
                    break;

                case 6:
                    list.countTickets();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
