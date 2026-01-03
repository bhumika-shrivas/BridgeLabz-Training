package com.encapsulation.librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3;
    }

    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved successfully");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}
