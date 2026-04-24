package com.lambdaexpression.ecommerce;

/*
 Custom Sorting in E-Commerce
○ Scenario: An online shop wants to sort products differently based on sales
campaigns (by price, rating, discount).
○ Task: Use a lambda with Comparator to sort products dynamically.
 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "Laptop", 70000, 4.5, 10));
		products.add(new Product(2, "Phone", 50000, 4.7, 15));
		products.add(new Product(3, "Headphones", 3000, 4.2, 25));
		products.add(new Product(4, "Monitor", 15000, 4.4, 5));
		
		System.out.println("Sort by Price");
		
		CampaignSorter.sortProducts(products, Comparator.comparing(p -> p.getPrice()));
		products.forEach(System.out::println);
		
		System.out.println("Sort by Rating");
        CampaignSorter.sortProducts(
                products,
                Comparator.comparing((Product p) -> p.getRating()).reversed()
        );
        products.forEach(System.out::println);

        System.out.println("Sort by Discount");
        CampaignSorter.sortProducts(
                products,
                Comparator.comparing((Product p) -> p.getDiscount()).reversed()
        );
        products.forEach(System.out::println);		
	}
}
