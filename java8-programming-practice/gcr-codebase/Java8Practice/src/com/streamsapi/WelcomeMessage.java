package com.streamsapi;

/*Event Attendee Welcome Message
○ Scenario: Print a welcome message for all attendees.
○ Task: Use forEach() with a lambda.*/

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class WelcomeMessage {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		List<String> attendeesNames = new ArrayList<>();
		
		System.out.println("How many attendees you want to enroll? ");
		int numberOfAttendees = input.nextInt();
		input.nextLine();
		
		while (numberOfAttendees != 0) {
			
			System.out.println("Enter the name: ");
			String name = input.nextLine();
			attendeesNames.add(name);
			numberOfAttendees--;
		}
			
			
		attendeesNames.stream().forEach(attendee -> System.out.println("Welcome " + attendee + "!"));

			input.close();
		}
		
		
}
	
