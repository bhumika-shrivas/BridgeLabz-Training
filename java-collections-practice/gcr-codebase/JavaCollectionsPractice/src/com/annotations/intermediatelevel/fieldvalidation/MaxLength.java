package com.annotations.intermediatelevel.fieldvalidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Field-level annotation to define max allowed length
@Retention(RetentionPolicy.RUNTIME)   // needed at runtime for reflection
@Target(ElementType.FIELD)             // can be applied only on fields
public @interface MaxLength {
    int value();   // maximum allowed length
}

