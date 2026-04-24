package com.reflection.advancelevel.customobjectmapper;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectMapperDemo {

	// Generic method to create an object from a Map
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        T obj = null;
        try {
            // Create new instance of the class
            obj = clazz.getDeclaredConstructor().newInstance();

            // Iterate over each entry in the map
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                Field field = clazz.getDeclaredField(entry.getKey()); // get field by name
                field.setAccessible(true); // allow access to private fields
                field.set(obj, entry.getValue()); // set field value
            }

        } catch (Exception e) {
            System.out.println("Error creating object");
        }
        return obj;
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take input from user
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Create a map of field names and values
        Map<String, Object> data = new HashMap<>();
        data.put("name", name);
        data.put("age", age);

        // Create object dynamically from map
        Person person = toObject(Person.class, data);

        // Display values
        person.show();

        sc.close();
    }
}
