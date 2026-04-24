package com.collections.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordFrequencyCounter {

	public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Change file path as needed
        String filePath = "O:\\Java Programming Workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsPractice\\src\\com\\collections\\map\\input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // convert to lowercase
                line = line.toLowerCase();

                // remove punctuation (keep only letters and space)
                line = line.replaceAll("[^a-z ]", "");

                // split into words
                String[] words = line.split("\\s+");

                // count frequency
                for (String word : words) {

                    if (word.length() == 0) continue;

                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }

            System.out.println("Word Frequency:");
            System.out.println(map);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
