package com.librarymanagementsystem;
class Librarian implements User {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Librarian.");
    }

    public int getBorrowLimit() {
        return 0; // cannot borrow
    }

    public void update(String msg) {
        System.out.println("Librarian " + name + " notified: " + msg);
    }
}