package com.jsondatahandling.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper; // Jackson library for JSON
import java.util.*;

public class StudentJson {
    public static void main(String[] args) throws Exception {
    	
        Scanner sc = new Scanner(System.in); // Scanner to take user input
        ObjectMapper mapper = new ObjectMapper(); // ObjectMapper to handle JSON

        // Take student's name
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        // Take student's age
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Take subjects as comma-separated values and split into array
        System.out.print("Enter subjects (comma separated): ");
        String[] subjects = sc.nextLine().split(",");

        // Create a Map to represent JSON object
        Map<String, Object> student = new LinkedHashMap<>();
        student.put("name", name);
        student.put("age", age);
        student.put("subjects", Arrays.asList(subjects)); // convert array to list

        // Convert map to JSON string with pretty formatting
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println("JSON Output:\n" + jsonString);
    }
}


