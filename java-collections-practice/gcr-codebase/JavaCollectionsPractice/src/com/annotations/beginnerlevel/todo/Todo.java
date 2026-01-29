package com.annotations.beginnerlevel.todo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Make annotation available at runtime (needed for Reflection)
@Retention(RetentionPolicy.RUNTIME)

// Can be applied only to methods
@Target(ElementType.METHOD)
public @interface Todo {

    // Description of pending task
    String task();

    // Developer responsible
    String assignedTo();

    // Priority with default value
    String priority() default "MEDIUM";
}
