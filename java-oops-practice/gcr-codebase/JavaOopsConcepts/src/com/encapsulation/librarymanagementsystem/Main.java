package com.encapsulation.librarymanagementsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java Basics", "James"));
        items.add(new Magazine(2, "Tech Today", "Editorial"));
        items.add(new DVD(3, "OOP Concepts", "Oracle"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days\n");
        }
    }
}
