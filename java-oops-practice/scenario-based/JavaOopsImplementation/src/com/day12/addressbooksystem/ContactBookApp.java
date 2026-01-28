package com.day12.addressbooksystem;

import java.util.*;

public class ContactBookApp {

    static List<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Address Book System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City/State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> editContact();
                case 3 -> deleteContact();
                case 4 -> searchContact();
                case 5 -> displayContacts();
                case 6 -> {
                    System.out.println("Exiting Address Book");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    // Add Contact with Duplicate Validation
    static void addContact() {
        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();

        if (findContact(fn, ln) != null) {
            System.out.println("Contact already exists!");
            return;
        }

        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();

        contacts.add(new Contact(fn, ln, phone, email,
                new Address(city, state, zip)));

        System.out.println("Contact added successfully");
    }

    // Edit Contact
    static void editContact() {
        Contact c = getContactByName();
        if (c == null) return;

        System.out.print("New Phone: ");
        String phone = sc.nextLine();
        System.out.print("New Email: ");
        String email = sc.nextLine();
        System.out.print("New City: ");
        String city = sc.nextLine();
        System.out.print("New State: ");
        String state = sc.nextLine();
        System.out.print("New Zip: ");
        String zip = sc.nextLine();

        c.updateContact(phone, email, new Address(city, state, zip));
        System.out.println("Contact updated");
    }

    // Delete Contact
    static void deleteContact() {
        Contact c = getContactByName();
        if (c != null) {
            contacts.remove(c);
            System.out.println("Contact deleted");
        }
    }

    // Search by City or State
    static void searchContact() {
        System.out.print("Enter City or State: ");
        String key = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(key)
                    || c.getAddress().getState().equalsIgnoreCase(key)) {
                System.out.println(c);
            }
        }
    }

    // Display Sorted Contacts
    static void displayContacts() {
        contacts.sort(Comparator.comparing(Contact::getFullName));

        System.out.println("\nContact List:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    // Helpers
    static Contact getContactByName() {
        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();

        Contact c = findContact(fn, ln);
        if (c == null) {
            System.out.println("Contact not found!");
        }
        return c;
    }

    static Contact findContact(String fn, String ln) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(fn)
                    && c.getLastName().equalsIgnoreCase(ln)) {
                return c;
            }
        }
        return null;
    }
}