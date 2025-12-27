package com.constructor.level1;
import java.util.Scanner;

public class LibraryBookMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter title of book : ");
		String title = input.nextLine();
		
		System.out.println("Enter author name : ");
		String author = input.nextLine();
		
		System.out.println("Enter price of book : ");
		double price = input.nextDouble();
		
		System.out.println("Enter if book is available or not : ");
		boolean available = input.nextBoolean();
		
		LibraryBook lb = new LibraryBook(title,author,price , available);
		
		lb.display();
		lb.borrowBook();

	}

}
