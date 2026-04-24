package com.streamsapi;

/*
 Transforming Names for Display
Given a list of customer names, use .map() to convert them to uppercase and
.sorted() to display them alphabetically.
 */

import java.util.List;

public class TransformNames {
	
	public static void main(String[] args) {
		
		List<String> names = List.of(
				"Bhumika Shrivas",
				"Arya Mishra",
				"Aryan Khan",
				"Disha Gujar",
				"Shradha Pal",
				"Yukta Choudhary",
				"Riya Singh",
				"Vivek Kumar",
				"Rashi Raj",
				"Harsh Raj Singh");
		
		names.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
		
	}
}
