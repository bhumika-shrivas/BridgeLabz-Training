package com.lambdaexpression.nameuppercasing;

/*
 *Name Uppercasing
○ Scenario: Convert all employee names in uppercase for an HR letter.
○ Task: Use String::toUpperCase in a stream.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Bhumika"),
				new Employee("Arya"),
				new Employee("Shraddha"));
		
		System.out.println("Names in uppercase");
		
		List<String> upperCaseNames = employees.stream()
				.map(Employee::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
				
		upperCaseNames.forEach(System.out::println);
				
	}
}
