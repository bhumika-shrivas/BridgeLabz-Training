package com.inheritance.singleinheritance.librarymanagement;

// Subclass
public class Author extends Book {

    private String authorName;
    private String bio;

    public Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + authorName);
        System.out.println("Author Bio: " + bio);
    }
}
