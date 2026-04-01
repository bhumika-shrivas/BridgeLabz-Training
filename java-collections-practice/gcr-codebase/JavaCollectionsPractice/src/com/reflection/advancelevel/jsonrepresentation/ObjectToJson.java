package com.reflection.advancelevel.jsonrepresentation;

import java.lang.reflect.Field;

public class ObjectToJson {

	// Convert object to JSON-like string
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");
        try {
            Class<?> cls = obj.getClass(); // get class of object
            Field[] fields = cls.getDeclaredFields(); // get all fields

            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true); // allow access to private fields
                json.append("\"").append(fields[i].getName()).append("\": "); // field name
                Object value = fields[i].get(obj); // get field value
                if (value instanceof String) json.append("\"").append(value).append("\""); // add quotes for string
                else json.append(value); // numeric or boolean
                if (i != fields.length - 1) json.append(", ");
            }

        } catch (Exception e) {
            System.out.println("Error converting to JSON");
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // User input for fields
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Create object
        Person p = new Person();
        p.name = name;
        p.age = age;

        // Convert to JSON and print
        System.out.println("JSON: " + toJson(p));

        sc.close();
    }
}
