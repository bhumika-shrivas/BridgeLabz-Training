package com.jsondatahandling.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

// Define a simple Student class
class Student {
	
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters required by Jackson for serialization
    public String getName() { 
    	return name; 
    }
    public int getAge() { 
    	return age; 
    }
}

public class ListToJsonConversion {
	
    public static void main(String[] args) throws Exception {
    	
        // Create ObjectMapper instance from Jackson
        ObjectMapper mapper = new ObjectMapper();

        // Create a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Arya", 23));
        students.add(new Student("Bhumi", 21));
        students.add(new Student("Riyuu", 22));
        students.add(new Student("Dishu", 22));

        // Convert the list to a JSON array string with pretty formatting
        String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);

        // Print the JSON array
        System.out.println(jsonArray);
    }
}
