package com.banktransactionmulithreading;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	private Map<Integer, Account> accounts = new HashMap<>();

	public Bank() {
		// initial accounts
		accounts.put(101, new Account(1000));
		accounts.put(102, new Account(2000));
	}

	// Account-level locking
	public void deposit(int accountNumber, int amount) {
		Account acc = accounts.get(accountNumber);

		synchronized (acc) {
			acc.deposit(amount);
			System.out.println(
					Thread.currentThread().getName() + " deposited " + amount + " | Balance: " + acc.getBalance());
		}
	}

	public void withdraw(int accountNumber, int amount) {
		Account acc = accounts.get(accountNumber);

		synchronized (acc) {
			if (acc.withdraw(amount)) {
				System.out.println(
						Thread.currentThread().getName() + " withdrew " + amount + " | Balance: " + acc.getBalance());
			} else {
				System.out.println(
						Thread.currentThread().getName() + " failed to withdraw " + amount + " | Insufficient balance");
			}
		}
	}

	public int getBalance(int accountNumber) {
		return accounts.get(accountNumber).getBalance();
	}
}