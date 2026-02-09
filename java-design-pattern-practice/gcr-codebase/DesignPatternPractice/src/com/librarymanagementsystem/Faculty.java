package com.librarymanagementsystem;
class Faculty implements User {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Faculty.");
    }

    public int getBorrowLimit() {
        return 30; // extended days
    }

    public void update(String msg) {
        System.out.println("Faculty " + name + " notified: " + msg);
    }
}