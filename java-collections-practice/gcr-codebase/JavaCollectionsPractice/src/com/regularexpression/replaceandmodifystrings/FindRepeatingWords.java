package com.regularexpression.replaceandmodifystrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
	static void findRepeatingWords(String text) {
		Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(text);
		while (m.find())
			System.out.println(m.group(1));
	}

	public static void main(String[] args) {
		String text = "This is is a repeated repeated test";
		Matcher m = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(text);

		while (m.find())
			System.out.println(m.group(1));
	}
}