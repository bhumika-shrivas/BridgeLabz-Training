package com.streams.inputfromconsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveUserInfoToFile {

    public static void main(String[] args) {

        String filePath = "src/com/streams/inputfromconsole/userinfo.txt";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;

        try {
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            writer = new FileWriter(filePath); // creates file if not exists

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("User information saved successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (writer != null)
                    writer.close();
                br.close();
            } catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}
