package com.streams.bytearray;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {

    public static void main(String[] args) {

        String filePath = "src/com/streams/bytearray/employees.dat";

        // -------- Create Employee List --------
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Arya", "AI", 55000));
        empList.add(new Employee(102, "Riya", "HR", 42000));
        empList.add(new Employee(103, "Karan", "Finance", 48000));

        // -------- Serialization --------
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(empList);
            System.out.println("Employees saved successfully!");

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        // -------- Deserialization --------
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filePath))) {

            List<Employee> savedList = (List<Employee>) ois.readObject();

            System.out.println("\nEmployees retrieved from file:");
            for (Employee e : savedList) {
                System.out.println(e);
            }

        } catch (IOException e) {
            System.out.println("Deserialization IO Error: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}

