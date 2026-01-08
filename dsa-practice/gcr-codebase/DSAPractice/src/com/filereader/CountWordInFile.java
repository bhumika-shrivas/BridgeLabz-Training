package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordInFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take file path from user
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        // Take target word from user
        System.out.print("Enter word to search: ");
        String targetWord = sc.nextLine();

        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println(
                "The word \"" + targetWord + "\" appears " + count + " times."
            );

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
