package com.annotations.intermediatelevel.fieldvalidation;

public class FieldValidationMain {

    public static void main(String[] args) {

        try {
            User user1 = new User("Arya123");
            System.out.println("User created: " + user1.getUsername());

            User user2 = new User("VeryLongUsername");
            System.out.println("User created: " + user2.getUsername());

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Failed: " + e.getMessage());
        }
    }
}


