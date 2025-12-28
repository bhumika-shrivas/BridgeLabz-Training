package com.constructor.level1;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first product name:");
        String name1 = sc.nextLine();

        System.out.println("Enter first product price:");
        double price1 = sc.nextDouble();
        sc.nextLine(); // clear buffer

        Product p1 = new Product(name1, price1);

        // Second product
        System.out.println("Enter second product name:");
        String name2 = sc.nextLine();

        System.out.println("Enter second product price:");
        double price2 = sc.nextDouble();

        Product p2 = new Product(name2, price2);

        System.out.println("\n--- Product Details ---");
        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
	}

}
