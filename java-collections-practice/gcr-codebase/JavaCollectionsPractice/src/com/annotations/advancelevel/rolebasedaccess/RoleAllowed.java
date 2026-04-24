package com.annotations.advancelevel.rolebasedaccess;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Class-level annotation for role-based access
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)   // applied on class
public @interface RoleAllowed {
    String value();         // role name like ADMIN, USER
}
