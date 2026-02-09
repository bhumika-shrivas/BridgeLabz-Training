package com.librarymanagementsystem;
interface User extends Observer {
    void showRole();
    int getBorrowLimit();
}