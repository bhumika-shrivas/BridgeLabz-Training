package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("data.txt"));
			
			String line;
			System.out.println("File contents : ");
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch (IOException e) {
			// Handles FileNotFoundException also (child of IOException)
			System.out.println("File not found");
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch (IOException e) {
				System.out.println("Error while closing the file");
			}
		}

	}

}
