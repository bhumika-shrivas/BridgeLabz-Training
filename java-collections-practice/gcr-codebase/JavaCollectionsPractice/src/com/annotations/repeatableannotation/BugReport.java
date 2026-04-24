package com.annotations.repeatableannotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Step 1: Container annotation (needed for repeatable)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// Step 2: Repeatable annotation
@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport {
    String description();   // bug description
}

