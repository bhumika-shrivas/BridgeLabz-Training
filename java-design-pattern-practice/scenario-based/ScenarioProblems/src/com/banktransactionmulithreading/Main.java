package com.banktransactionmulithreading;

public class Main {
	public static void main(String[] args) {

		Bank bank = new Bank();

		Thread c1 = new Customer("Customer-1", bank, 101);
		Thread c2 = new Customer("Customer-2", bank, 101);
		Thread c3 = new Customer("Customer-3", bank, 102);

		c1.start();
		c2.start();
		c3.start();

		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\nFinal Balance of 101: " + bank.getBalance(101));
		System.out.println("Final Balance of 102: " + bank.getBalance(102));
	}
}