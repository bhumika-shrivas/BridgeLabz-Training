package com.inheritance.singleinheritance.librarymanagement;

// Main class
public class LibraryTest {
    public static void main(String[] args) {

        Author bookAuthor = new Author(
            "Clean Code",
            2008,
            "Robert C. Martin",
            "Software engineer and author"
        );

        bookAuthor.displayInfo();
    }
}
