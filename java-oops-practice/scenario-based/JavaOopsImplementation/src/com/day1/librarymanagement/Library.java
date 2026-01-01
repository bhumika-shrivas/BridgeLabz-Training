package com.day1.librarymanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Uses HashMap<String, List<Book>>
public class Library {

    // Key: Author, Value: List of Books
    private Map<String, List<Book>> booksByAuthor = new HashMap<>();

    public void addBook(Book book) {
        booksByAuthor
            .computeIfAbsent(book.getAuthor(), k -> new ArrayList<>())
            .add(book);
    }

    public void showAllBooks() {
        System.out.println("\nAll Books:");
        for (List<Book> books : booksByAuthor.values()) {
            for (Book b : books) {
                b.displayBook();
            }
        }
    }

    public void showBooksByAuthor(String author) {
        System.out.println("\nBooks by " + author + ":");
        List<Book> books = booksByAuthor.get(author);

        if (books == null) {
            System.out.println("No books found.");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }
}
