package com.annotations.advancelevel.rolebasedaccess;

@RoleAllowed("ADMIN")   // Only ADMIN can access this class
public class AdminService {

    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }
}
