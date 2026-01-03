package com.encapsulation.librarymanagementsystem;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;
    private String borrowerName; // sensitive data

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation
    protected void setBorrower(String name) {
        this.borrowerName = name;
        this.isAvailable = false;
    }

    protected void returnItem() {
        this.borrowerName = null;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    abstract int getLoanDuration(); // Abstraction

    public void getItemDetails() {
        System.out.println(
            "ID: " + itemId +
            ", Title: " + title +
            ", Author: " + author +
            ", Available: " + isAvailable
        );
    }
}
