package com.day1.librarymanagement;

// Main class
public class LibraryApp {
    public static void main(String[] args) {

        Library library = new Library();

        // Adding books
        library.addBook(new Book("Clean Code", "Robert Martin"));
        library.addBook(new Book("Clean Architecture", "Robert Martin"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));
        library.addBook(new Book("Java Concurrency", "Brian Goetz"));

        library.showAllBooks();
        library.showBooksByAuthor("Robert Martin");
    }
}
