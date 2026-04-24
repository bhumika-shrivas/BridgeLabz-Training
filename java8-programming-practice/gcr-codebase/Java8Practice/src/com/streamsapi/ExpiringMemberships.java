package com.streamsapi;
/*Filtering Expiring Memberships
Given a list of gym members with their membership expiry dates, use Stream API to filter
out members whose membership expires within the next 30 days.*/

import java.time.LocalDate;
import java.util.List;

public class ExpiringMemberships {
	
	public static void main(String[] args) {
		record GymMember(String name, LocalDate expiryDate) {}

		List<GymMember> members = List.of(
		    new GymMember("Amit Sharma", LocalDate.of(2026, 3, 15)),
		    new GymMember("Bhumi Patel", LocalDate.of(2026, 2, 28)),
		    new GymMember("Rahul Verma", LocalDate.of(2026, 1, 20)),
		    new GymMember("Sneha Iyer", LocalDate.of(2026, 4, 10)),
		    new GymMember("Rohan Mehta", LocalDate.of(2026, 2, 5)),
		    new GymMember("Neha Singh", LocalDate.of(2026, 3, 30)),
		    new GymMember("Karan Malhotra", LocalDate.of(2026, 1, 31)),
		    new GymMember("Anjali Desai", LocalDate.of(2026, 5, 18)),
		    new GymMember("Vikram Rao", LocalDate.of(2026, 2, 12)),
		    new GymMember("Pooja Nair", LocalDate.of(2026, 4, 25)),
		    new GymMember("Arjun Kapoor", LocalDate.of(2026, 3, 8)),
		    new GymMember("Meera Joshi", LocalDate.of(2026, 1, 27)),
		    new GymMember("Siddharth Kulkarni", LocalDate.of(2026, 6, 1)),
		    new GymMember("Kavya Reddy", LocalDate.of(2026, 2, 18)),
		    new GymMember("Nitin Gupta", LocalDate.of(2026, 3, 22))
		);
		
		System.out.println("Members with memberships expiring in the next 30 days: \n");
		
		// Define the time window [today, today + 30 days]
        LocalDate today = LocalDate.now();
        LocalDate cutoff = today.plusDays(30);

        members.stream()
            // keep members whose expiry date is within [today, cutoff]
            .filter(member -> {
                LocalDate expiry = member.expiryDate();
                return !expiry.isBefore(today) && !expiry.isAfter(cutoff);
            })
            // show soonest expiring first
            .sorted((a, b) -> a.expiryDate().compareTo(b.expiryDate()))
            .forEach(member -> {
                System.out.println("Name: " + member.name() + ", Expiry Date: " + member.expiryDate());
            });
    }
}