package com.constructor.level1;

public class HotelBooking {

	String guestName;
	String roomType;
	int nights;
	
	public HotelBooking(){
		
	}
	
	public HotelBooking(String guestName, String roomType, int nights){
		
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	public HotelBooking(HotelBooking hb){
		
		this.guestName = hb.guestName;
		this.roomType = hb.roomType;
		this.nights = hb.nights;
	}
	
	public void display() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights to stay : " + nights);
    }
	
}
