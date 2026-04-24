package com.streamsapi;

/*
 IoT Sensor Readings
○ Scenario: Print all readings above threshold.
○ Task: Use streams with forEach().
 */

import java.util.List;
import java.util.Scanner;

public class SensorReadings {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		record SensorReading(String sensorId, String type, double value) {}
		
		List<SensorReading> readings = List.of(
				new SensorReading("S-101", "Temperature", 24.5),
				new SensorReading("S-102", "Pressure", 60.2),
				new SensorReading("S-103", "Temperature", 101.3),
				new SensorReading("S-104", "Gas", 0.03),
				new SensorReading("S-105", "Light", 450.0),
				new SensorReading("S-106", "Humidity", 55.8),
				new SensorReading("S-107", "Temperature", 31.6),
				new SensorReading("S-108", "Temperature", 28.1),
				new SensorReading("S-109", "Motion", 1.0),
				new SensorReading("S-110", "Pressure", 100.9),
				new SensorReading("S-111", "Temperature", 26.4),
				new SensorReading("S-112", "Humidity", 63.1),
				new SensorReading("S-113", "Light", 0.05),
				new SensorReading("S-114", "Gas", 0.05),
				new SensorReading("S-115", "Temperature", 29.9));
				
		System.out.println("Enter the threshold value: ");
		double threshold = input.nextInt();
		
		readings.stream().filter(r -> r.value>threshold).forEach(System.out::println);
		input.close();
	}
}
