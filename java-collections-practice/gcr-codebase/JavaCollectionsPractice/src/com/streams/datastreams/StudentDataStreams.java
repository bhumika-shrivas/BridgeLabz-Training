package com.streams.datastreams;

import java.io.*;

public class StudentDataStreams {

    public static void main(String[] args) {

        String filePath = "src/com/streams/datastreams/students.dat";

        // Writing Data to File
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {

            // Example student details
            int[] rollNumbers = {101, 102, 103};
            String[] names = {"Arya", "Riya", "Karan"};
            double[] gpas = {8.5, 9.1, 7.8};

            for (int i = 0; i < rollNumbers.length; i++) {
                dos.writeInt(rollNumbers[i]);       // write integer
                dos.writeUTF(names[i]);             // write string
                dos.writeDouble(gpas[i]);           // write double
            }

            System.out.println("Student data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }

        // Reading Data from File
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {

            System.out.println("\nStudent Details from File:");

            // Read until EOFException
            while (true) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }

        } catch (EOFException e) {
            // End of file reached
            System.out.println("\nAll student data retrieved successfully!");
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}

