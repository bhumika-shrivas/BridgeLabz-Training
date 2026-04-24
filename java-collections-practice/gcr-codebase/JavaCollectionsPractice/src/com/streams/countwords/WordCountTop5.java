package com.streams.countwords;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class WordCountTop5 {

    public static void main(String[] args) {

        String filePath = "src/com/streams/countwords/input.txt";

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Remove punctuation and split by whitespace
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");

                for (String word : words) {
                    if (word.isEmpty()) continue;
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            System.out.println("File reading error: " + e.getMessage());
            return;
        }

        // Sort the map by values in descending order
        List<Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());

        sortedList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Display total words
        System.out.println("Total unique words: " + wordCount.size());

        // Display top 5 words
        System.out.println("\nTop 5 most frequent words:");
        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            Entry<String, Integer> entry = sortedList.get(i);
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
