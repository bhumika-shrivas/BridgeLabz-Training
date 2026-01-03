package com.encapsulation.librarymanagementsystem;

class Magazine extends LibraryItem implements Reservable {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7;
    }

    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved successfully");
        }
    }

    public boolean checkAvailability() {
        return isAvailable();
    }
}
