package com.constructor.level1;

public class Book {

	String title;
	String author;
	double price;
	
	public Book () {
		
	}
	
	public Book(String title, String author , double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}	
