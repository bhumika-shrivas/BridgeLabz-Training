package com.constructor.level1;

import java.util.Scanner;

public class HotelBookingMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Guest Name : ");
		String guestName = sc.nextLine();
		
		System.out.println("Enter Room Type(Classic,Deluxe, Suite) : ");
		String roomType = sc.next();
		
		System.out.println("Enter number of nights to stay : ");
		int nights = sc.nextInt();
		
		HotelBooking obj = new HotelBooking(guestName, roomType , nights);
		HotelBooking obj1 = new HotelBooking(obj);
		
		obj.display();
		obj1.display();
		
	}

}
