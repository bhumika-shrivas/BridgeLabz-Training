package com.annotations.beginnerlevel.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation will be available at runtime (needed for Reflection)
@Retention(RetentionPolicy.RUNTIME)

// Annotation can be applied only on methods
@Target(ElementType.METHOD)
public @interface ImportantMethod {

    // Optional parameter with default value
    String level() default "HIGH";
}

