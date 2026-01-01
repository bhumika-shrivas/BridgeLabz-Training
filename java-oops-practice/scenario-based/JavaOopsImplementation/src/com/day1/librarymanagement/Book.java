package com.day1.librarymanagement;

// Custom Class
public class Book 
{

    private String title;
    private String author;

    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void displayBook() 
    {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}
