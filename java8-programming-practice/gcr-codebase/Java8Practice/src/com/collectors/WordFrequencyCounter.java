package com.collectors;

/*
Word Frequency Counter
○ Scenario: Analyze a paragraph for word occurrence.
○ Task: Use Collectors.toMap().
 */

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	
	public static void main(String[] args) {
		String paragraph = "This is a Paragraph , Paragraph this is";

        Map<String, Integer> wordCount =
            Arrays.stream(paragraph.split("\\s+"))
                  .collect(Collectors.toMap(
                      word -> word,        // key
                      word -> 1,           // value
                      Integer::sum         // merge if duplicate
                  ));

        System.out.println(wordCount);
    }
}