package com.annotations.advancelevel.customserializationannotation;

import java.util.Scanner;

public class JsonMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter password: ");
        sc.nextLine(); // consume leftover newline
        String password = sc.nextLine();

        // Create object using user input
        User user = new User(username, age, password);

        // Convert to JSON using custom serializer
        String json = JsonSerializer.toJson(user);

        System.out.println("\nGenerated JSON:");
        System.out.println(json);

        sc.close();
    }
}

