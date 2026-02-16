/*
Exercise 3: Advanced Features
Build a library management system with:
• Book inventory
• Student borrowing records
• Fine calculation
• Search functionality with multiple filters
*/
package com.jdbcpractice;

import java.sql.*;
import java.util.Scanner;

public class LibraryJDBC {

    // database details
    static String url = "jdbc:mysql://localhost:3306/library_db";
    static String user = "root";
    static String password = "your_password"; 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            Connection con = DriverManager.getConnection(url, user, password);

            int choice;

            do {
                System.out.println("\n1. Borrow Book");
                System.out.println("2. Return Book");
                System.out.println("3. Search Books");
                System.out.println("4. View Borrow History");
                System.out.println("5. Check Inventory");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        borrowBook(con, sc);
                        break;

                    case 2:
                        returnBook(con, sc);
                        break;

                    case 3:
                        searchBooks(con, sc);
                        break;

                    case 4:
                        viewHistory(con);
                        break;

                    case 5:
                        checkInventory(con);
                        break;

                    case 6:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 6);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // borrow book using transaction
    public static void borrowBook(Connection con, Scanner sc) {

        try {
            System.out.print("Enter Student ID: ");
            int sid = sc.nextInt();

            System.out.print("Enter Book ID: ");
            int bid = sc.nextInt();

            con.setAutoCommit(false);

            // insert record
            PreparedStatement ps1 = con.prepareStatement(
                    "insert into borrow_records(student_id, book_id, borrow_date) values(?,?,curdate())");
            ps1.setInt(1, sid);
            ps1.setInt(2, bid);
            ps1.executeUpdate();

            // update inventory
            PreparedStatement ps2 = con.prepareStatement(
                    "update books set available_copies = available_copies - 1 where book_id=? and available_copies>0");
            ps2.setInt(1, bid);

            int r = ps2.executeUpdate();

            if (r == 0) {
                System.out.println("Book not available");
                con.rollback();
                return;
            }

            con.commit();
            System.out.println("Book borrowed");

        } catch (Exception e) {
            try {
                con.rollback();
            } catch (Exception ex) {
            }
            System.out.println(e);
        }
    }

    // return book and fine
    public static void returnBook(Connection con, Scanner sc) {

        try {
            System.out.print("Enter Record ID: ");
            int rid = sc.nextInt();

            // update return date
            PreparedStatement ps1 = con.prepareStatement(
                    "update borrow_records set return_date=curdate() where record_id=?");
            ps1.setInt(1, rid);
            ps1.executeUpdate();

            // fine calculation
            PreparedStatement ps2 = con.prepareStatement(
                    "update borrow_records set fine = IF(datediff(return_date, borrow_date)>7,"
                            + "(datediff(return_date, borrow_date)-7)*5,0) where record_id=?");
            ps2.setInt(1, rid);
            ps2.executeUpdate();

            // get book id
            PreparedStatement ps3 = con.prepareStatement(
                    "select book_id from borrow_records where record_id=?");
            ps3.setInt(1, rid);
            ResultSet rs = ps3.executeQuery();

            if (rs.next()) {
                int bid = rs.getInt(1);

                PreparedStatement ps4 = con.prepareStatement(
                        "update books set available_copies = available_copies + 1 where book_id=?");
                ps4.setInt(1, bid);
                ps4.executeUpdate();
            }

            System.out.println("Book returned");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // search with multiple filters
    public static void searchBooks(Connection con, Scanner sc) {

        try {
            System.out.print("Enter title keyword: ");
            String title = sc.nextLine();

            System.out.print("Enter author keyword: ");
            String author = sc.nextLine();

            System.out.print("Enter category: ");
            String cat = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                    "select * from books where title like ? and author like ? and category=?");

            ps.setString(1, "%" + title + "%");
            ps.setString(2, "%" + author + "%");
            ps.setString(3, cat);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("book_id") + " "
                        + rs.getString("title") + " "
                        + rs.getString("author") + " "
                        + rs.getString("category"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // borrow history
    public static void viewHistory(Connection con) {

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                    "select s.name, b.title, br.borrow_date, br.return_date, br.fine "
                            + "from borrow_records br "
                            + "join students s on br.student_id=s.student_id "
                            + "join books b on br.book_id=b.book_id");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " "
                        + rs.getString(2) + " "
                        + rs.getDate(3) + " "
                        + rs.getDate(4) + " "
                        + rs.getDouble(5));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // check inventory
    public static void checkInventory(Connection con) {

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                    "select title, available_copies from books");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " : "
                        + rs.getInt(2));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
