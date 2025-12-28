package com.constructor.level1;

public class Ebook extends BookTwo {

    private double fileSize; // in MB

    public Ebook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Display EBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN      : " + ISBN);     // public
        System.out.println("Title     : " + title);    // protected
        System.out.println("Author    : " + getAuthor()); // private via getter
        System.out.println("File Size : " + fileSize + " MB");
        System.out.println();
    }
}
