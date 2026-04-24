/*
Exercise 2: Transaction Management
Implement a banking system with:
• Transfer money between accounts (use transactions)
• Check balance
• Transaction history
*/
package com.jdbcpractice;

import java.sql.*;
import java.util.Scanner;

public class BankingJDBC {

    // database details
    static String url = "jdbc:mysql://localhost:3306/banking_system";
    static String user = "root";
    static String password = "your_password"; 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // step 1: load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // step 2: create connection
            Connection con = DriverManager.getConnection(url, user, password);

            int choice;

            do {
                System.out.println("\n1. Transfer Money");
                System.out.println("2. Check Balance");
                System.out.println("3. Transaction History");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        transferMoney(con, sc);
                        break;

                    case 2:
                        checkBalance(con);
                        break;

                    case 3:
                        transactionHistory(con);
                        break;

                    case 4:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 4);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // method to transfer money
    public static void transferMoney(Connection con, Scanner sc) {

        try {
            System.out.print("Enter From Account ID: ");
            int from = sc.nextInt();

            System.out.print("Enter To Account ID: ");
            int to = sc.nextInt();

            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();

            // start transaction
            con.setAutoCommit(false);

            // deduct amount
            PreparedStatement ps1 = con.prepareStatement(
                    "update accounts set balance = balance - ? where account_id = ? and balance >= ?");
            ps1.setDouble(1, amt);
            ps1.setInt(2, from);
            ps1.setDouble(3, amt);

            int r1 = ps1.executeUpdate();

            if (r1 == 0) {
                System.out.println("Insufficient balance");
                con.rollback();
                return;
            }

            // add amount
            PreparedStatement ps2 = con.prepareStatement(
                    "update accounts set balance = balance + ? where account_id = ?");
            ps2.setDouble(1, amt);
            ps2.setInt(2, to);
            ps2.executeUpdate();

            // insert transaction
            PreparedStatement ps3 = con.prepareStatement(
                    "insert into transactions(from_account, to_account, amount) values(?,?,?)");
            ps3.setInt(1, from);
            ps3.setInt(2, to);
            ps3.setDouble(3, amt);
            ps3.executeUpdate();

            // commit
            con.commit();
            System.out.println("Transfer successful");

        } catch (Exception e) {
            try {
                con.rollback();
            } catch (Exception ex) {
            }
            System.out.println("Error: " + e);
        }
    }

    // method to check balance
    public static void checkBalance(Connection con) {

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select account_holder, balance from accounts");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " : " + rs.getDouble(2));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // method to view transaction history
    public static void transactionHistory(Connection con) {

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from transactions");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("transaction_id") + " "
                                + rs.getInt("from_account") + " -> "
                                + rs.getInt("to_account") + " : "
                                + rs.getDouble("amount"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
