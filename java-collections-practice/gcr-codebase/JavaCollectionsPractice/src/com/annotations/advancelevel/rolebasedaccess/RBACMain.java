package com.annotations.advancelevel.rolebasedaccess;

public class RBACMain {

    public static void main(String[] args) {

        AdminService service = new AdminService();

        System.out.println("Current Role: " + CurrentUser.role);

        SecurityManager.execute(service, "deleteUser");
    }
}

