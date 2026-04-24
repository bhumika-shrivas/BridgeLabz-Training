package com.annotations.intermediatelevel.fieldvalidation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)   // username must not exceed 10 characters
    private String username;

    // Constructor validates field length using annotation
    public User(String username) {
        validate(username);
        this.username = username;
    }

    // Validation logic
    private void validate(String usernameValue) {
        try {
            // Get the field 'username'
            Field field = this.getClass().getDeclaredField("username");

            // Check if @MaxLength is present
            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                int allowedLength = maxLength.value();

                // Validate length
                if (usernameValue.length() > allowedLength) {
                    throw new IllegalArgumentException(
                        "Username length should not exceed " + allowedLength +
                        " characters. Given: " + usernameValue.length()
                    );
                }
            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}

