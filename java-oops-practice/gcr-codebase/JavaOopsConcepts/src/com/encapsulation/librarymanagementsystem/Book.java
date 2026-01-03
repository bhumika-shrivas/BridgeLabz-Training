package com.encapsulation.librarymanagementsystem;

class Book extends LibraryItem implements Reservable {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14; // days
    }

    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved successfully");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}
