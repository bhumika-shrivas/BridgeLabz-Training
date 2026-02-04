package com.streamsapi;

/*
  Email Notifications
Given a list of user emails, use forEach() to send a notification email to each user.
 */

import java.util.*;

public class EmailNotifications {
	
	public static void main(String[] args) {
		
		List<String> emails = new ArrayList<>();
		emails.add("bhumika@gmail.com");
		emails.add("arya@gmail.com");
		emails.add("yukta@gmail.com");
		emails.add("disha@gmail.com");
		emails.add("shraddha@gmail.com");
		emails.add("rashi@gmail.com");
		
		emails.stream().forEach(email -> sendEmailNotification(email));
	}

	static void sendEmailNotification(String email) {
		System.out.println("This is a Notification email for: " + email);
	}

}
