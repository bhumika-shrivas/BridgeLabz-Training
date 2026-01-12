package com.day1.bookshelf;

import java.util.*;

class Library {
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    private HashSet<String> bookTracker = new HashSet<>();

    // Add book
    void addBook(String genre, String title, String author) {
        String key = genre + title + author;

        if (bookTracker.contains(key)) {
            System.out.println("Duplicate book not allowed");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(new Book(title, author));
        bookTracker.add(key);

        System.out.println("Book added");
    }

    // Borrow book
    void borrowBook(String genre, String title) {
        LinkedList<Book> books = catalog.get(genre);

        if (books == null) {
            System.out.println("Genre not found");
            return;
        }

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equalsIgnoreCase(title)) {
                it.remove();
                bookTracker.remove(genre + b.title + b.author);
                System.out.println("Book borrowed");
                return;
            }
        }
        System.out.println("Book not found");
    }

    // Display catalog
    void display() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println(" - " + b);
            }
        }
    }
}
