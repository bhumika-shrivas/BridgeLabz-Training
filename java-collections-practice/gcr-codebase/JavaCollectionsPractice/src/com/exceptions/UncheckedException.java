package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter numerator : ");
			int a = sc.nextInt();
			
			System.out.println("Enter denominator : ");
			int b = sc.nextInt();
			
			int result = a/b;
			System.out.println("Result = " +result);
			
		}catch(ArithmeticException e ) {
			System.out.println("Cannot divide by zero");
			
		}catch (InputMismatchException e) {
            System.out.println("Please enter only numeric values");

        } finally {
            sc.close();
        }

	}

}
