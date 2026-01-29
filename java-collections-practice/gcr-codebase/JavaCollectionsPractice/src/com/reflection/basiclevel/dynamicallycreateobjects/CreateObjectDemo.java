package com.reflection.basiclevel.dynamicallycreateobjects;

public class CreateObjectDemo {

	public static void main(String[] args) {

        try {
            // Load class using name
            Class<?> cls = Class.forName("com.reflection.basiclevel.dynamicallycreateobjects.Student");

            // Create object dynamically
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Type casting
            Student s = (Student) obj;

            s.display();

        } catch (Exception e) {
            System.out.println("Error while creating object");
        }
    }
}

