package com.inputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ByteToCharStream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take file path from user
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        // Read file using InputStreamReader (UTF-8)
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
