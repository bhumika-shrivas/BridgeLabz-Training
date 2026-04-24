package com.jsondatahandling.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Scanner;

public class MergeJsonObjects {
    public static void main(String[] args) throws Exception {
    	
        Scanner sc = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        // First JSON object
        ObjectNode obj1 = mapper.createObjectNode();
        System.out.println("First Json Object");
        System.out.print("Enter name: ");
        obj1.put("name", sc.nextLine());
        System.out.print("Enter age: ");
        obj1.put("age", sc.nextInt());
        sc.nextLine(); // consume newline

        // Second JSON object
        ObjectNode obj2 = mapper.createObjectNode();
        System.out.println("Second Json Object");
        System.out.print("Enter email: ");
        obj2.put("email", sc.nextLine());
        System.out.print("Enter city: ");
        obj2.put("city", sc.nextLine());

        // Merge obj2 into obj1
        obj1.setAll(obj2);

        // Print merged JSON
        System.out.println("Merged JSON:\n" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1));
    }
}

