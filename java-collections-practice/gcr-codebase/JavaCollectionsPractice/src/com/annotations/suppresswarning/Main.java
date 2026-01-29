package com.annotations.suppresswarning;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

        // Suppressing unchecked warnings for using a raw ArrayList
        @SuppressWarnings("unchecked")
        ArrayList list = new ArrayList(); // No generics used

        // Adding different types of elements
        list.add("Hello");
        list.add(100);
        list.add(45.67);

        // Printing the elements
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
