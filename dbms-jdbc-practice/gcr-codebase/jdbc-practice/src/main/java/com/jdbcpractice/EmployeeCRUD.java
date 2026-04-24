/*
Exercise 1: Simple CRUD Application
Create a console-based Employee Management System with:
• Add employee
• View all employees
• Update employee salary
• Delete employee
• Search employee by name
*/
package com.jdbcpractice;

import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {

    // database details
    static String url = "jdbc:mysql://localhost:3306/Employee_Management_System_Db";
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
                System.out.println("\n1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Search Employee");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {

                    case 1:
                        addEmployee(con, sc);
                        break;

                    case 2:
                        viewEmployees(con);
                        break;

                    case 3:
                        updateSalary(con, sc);
                        break;

                    case 4:
                        deleteEmployee(con, sc);
                        break;

                    case 5:
                        searchEmployee(con, sc);
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

    // add employee
    public static void addEmployee(Connection con, Scanner sc) {

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            PreparedStatement ps = con.prepareStatement(
                    "insert into Employee(Emp_Name, Department, Emp_Salary) values(?,?,?)");

            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);

            ps.executeUpdate();
            System.out.println("Employee added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // view employees
    public static void viewEmployees(Connection con) {

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Employee");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("Emp_Id") + " "
                                + rs.getString("Emp_Name") + " "
                                + rs.getString("Department") + " "
                                + rs.getDouble("Emp_Salary"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // update salary
    public static void updateSalary(Connection con, Scanner sc) {

        try {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Salary: ");
            double salary = sc.nextDouble();

            PreparedStatement ps = con.prepareStatement(
                    "update Employee set Emp_Salary=? where Emp_Name=?");

            ps.setDouble(1, salary);
            ps.setString(2, name);

            int r = ps.executeUpdate();

            if (r > 0)
                System.out.println("Salary updated");
            else
                System.out.println("Employee not found");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // delete employee
    public static void deleteEmployee(Connection con, Scanner sc) {

        try {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                    "delete from Employee where Emp_Name=?");

            ps.setString(1, name);

            int r = ps.executeUpdate();

            if (r > 0)
                System.out.println("Employee deleted");
            else
                System.out.println("Employee not found");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // search employee
    public static void searchEmployee(Connection con, Scanner sc) {

        try {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                    "select * from Employee where Emp_Name=?");

            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(
                        rs.getInt("Emp_Id") + " "
                                + rs.getString("Emp_Name") + " "
                                + rs.getString("Department") + " "
                                + rs.getDouble("Emp_Salary"));
            } else {
                System.out.println("Employee not found");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
