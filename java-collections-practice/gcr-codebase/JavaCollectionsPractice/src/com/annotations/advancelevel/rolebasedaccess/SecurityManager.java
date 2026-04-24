package com.annotations.advancelevel.rolebasedaccess;

public class SecurityManager {

    // Validates role before method execution
    public static void execute(Object obj, String methodName) {

        Class<?> clazz = obj.getClass();

        // Check if class has @RoleAllowed
        if (clazz.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = clazz.getAnnotation(RoleAllowed.class);
            String requiredRole = roleAllowed.value();

            // Compare with current user role
            if (!requiredRole.equals(CurrentUser.role)) {
                System.out.println("Access Denied!");
                return;
            }
        }

        // If allowed, execute method
        try {
            clazz.getMethod(methodName).invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

