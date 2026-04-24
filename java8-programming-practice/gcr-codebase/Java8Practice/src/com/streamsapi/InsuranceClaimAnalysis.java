package com.streamsapi;

import java.util.List;

/*3. Insurance Claim Analysis
○ Scenario: Find the average claim amount for each claim type.
○ Task: Use groupingBy() and averagingDouble().*/

import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
	
	public static void main(String[] args) {
		record Claim(String claimType, double amount) {}
		var Claims = List.of(
				new Claim("Health", 6000.0),
				new Claim("Accident", 23000.0),
				new Claim("Vehicle", 12000.0),
				new Claim("Property", 8000.0),
				new Claim("Health", 4000.0),
				new Claim("Vehicle", 15000.0),
				new Claim("Property", 7000.0),
				new Claim("Death", 75000.0),
				new Claim("Death", 80000.0),
				new Claim("Accident", 20000.0),
				new Claim("Health", 5000.0)
				);
		
		System.out.println("Average claim amount for each claim type:\n");
		
		Claims.stream()
		.collect(Collectors.groupingBy(Claim:: claimType,
				Collectors.averagingDouble((Claim:: amount))))
		.forEach((type, avgAmount) -> 
			System.out.println("Claim Type: " + type + ", Average Amount: " + avgAmount));
	}

}
