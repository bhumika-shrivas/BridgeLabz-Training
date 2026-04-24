package com.streamsapi;

/*Hospital Doctor Availability
○ Scenario: Find doctors available on weekends and sort by specialty.
○ Task: Use streams with filter() and sorted().*/

import java.util.List;

public class DoctorAvailability {
	
	public static void main(String[] args) {
		record Doctor(String name, String speciality, boolean availableOnWeekend) {}
		var Doctors = List.of(
				new Doctor("Dr. Disha", "Cardiologist", true),
				new Doctor("Dr. Yukta", "Dermatologist", false),
				new Doctor("Dr. Arya", "Physician", true),
				new Doctor("Dr. Bhumika", "Phyciatrist", false),
				new Doctor("Dr. Rashi", "Neurologist", true),
				new Doctor("Dr. Shraddha", "Opthamologist", false));
		
		
		System.out.println("Doctors available on weekends sorted by specialty");
		// Using streams to filter and sort doctors
		Doctors.stream()
		.filter(Doctor:: availableOnWeekend)
		.sorted((d1, d2) -> d1.speciality().compareTo(d2.speciality()))
		.forEach(doctor -> System.out.println("Name: " +doctor.name() + ", Specialty:" + doctor.speciality()));
	}

}
