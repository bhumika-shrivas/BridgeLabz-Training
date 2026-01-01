package com.objectmodelling.aggregationproblem;

public class Book {
	// Attributes
	private String title;
	private String author;
	
	// Constructor
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
	// Method to display book details
	public void displayBook()
	{
		System.out.println("Title: " + title + ", Author: " + author);
	}
}
