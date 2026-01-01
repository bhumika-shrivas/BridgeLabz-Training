package com.objectmodelling.aggregationproblem;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display library books
    public void showBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book book : books) {
            book.displayBook();
        }
    }
}
