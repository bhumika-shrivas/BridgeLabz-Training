package com.linkedlist.doublylinkedlist.librarymanagement;

class BookNode {
    int bookId;
    String title, author, genre;
    boolean available;
    BookNode next, prev;

    BookNode(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}
