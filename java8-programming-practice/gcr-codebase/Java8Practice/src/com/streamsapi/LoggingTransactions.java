package com.streamsapi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
 Logging Transactions
Given a list of transaction IDs, use forEach() to log each transaction to the console with a
timestamp.
 */

public class LoggingTransactions {
	
	public static void main(String[] args) {
		
		record Transaction(int id, LocalDateTime time) {}
		
		List<Transaction> transactionIds = List.of(
				new Transaction(1, LocalDateTime.now()),
				new Transaction(2, LocalDateTime.now()),
				new Transaction(3, LocalDateTime.now()),
				new Transaction(4, LocalDateTime.now()),
				new Transaction(5, LocalDateTime.now()),
				new Transaction(6, LocalDateTime.now()),
				new Transaction(7, LocalDateTime.now()),
				new Transaction(8, LocalDateTime.now()),
				new Transaction(9, LocalDateTime.now()),
				new Transaction(10, LocalDateTime.now()));
		
		transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
				
	}

}
