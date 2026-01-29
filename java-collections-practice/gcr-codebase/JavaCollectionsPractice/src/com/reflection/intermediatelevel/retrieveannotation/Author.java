package com.reflection.intermediatelevel.retrieveannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Annotation will be available at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}

