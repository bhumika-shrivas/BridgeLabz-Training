package com.day4;
/*HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
		Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
		assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
		small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
		memory.
		Key Concepts:
		● Bubble Sort for small datasets
		● In-place comparison
		● Swapping adjacent patient records*/
		
import java.util.Scanner;

public class BubbleSort {
	
	static Scanner input = new Scanner(System.in);
	
	// Array create
	static String [] patientNames = new String[20];
	static int [] criticality = new int[20];
	
	static int count = 0;
	
	// Method to Bubble Sort
	static void bubbleSort() {
		
		if (count == 0) {
			System.out.println("No patients to sort.\n");
			return;
		}
		
		for (int j=0; j<count; j++) {
			for (int i=0; i<count-1-j; i++) {
				
				if(criticality[i]<criticality[i+1]) {
					
					// Swap criticality
					int tempC = criticality[i];
					criticality[i]=criticality[i+1];
					criticality[i+1]=tempC;
					
					// Swap patient names
					String tempN = patientNames[i];
					patientNames[i]=patientNames[i+1];
					patientNames[i+1]=tempN;
				}
			}
		}
		System.out.println("Patients sorted by criticality (Descending):\n");
		displayPatients();
	}
		
	// Method to add Patients 
	static void addPatient() {
		System.out.println("How many patients do you want to add: ");
		int noOfPatient = input.nextInt(); 
		input.nextLine();
		for (int i=0; i<noOfPatient; i++) {
			if (count >= patientNames.length) {
				System.out.println("Patient list is full");
			}
			
			System.out.println("Enter patient name: ");
			patientNames[i] = input.nextLine();
			
			System.out.println("Enter critical level (1-10): ");
			criticality[i] = input.nextInt();
			input.nextLine();
			
			count++;
		}	
	}
	
	// Method to discharge Patients
	static void dischargePatient() {
		if (count == 0) {
			System.out.println("No patients to discharge");
			return;
		}
		
		input.nextLine();
		System.out.println("Enter patient name to discharge: ");
		String name = input.nextLine();
		
		int index = -1;
		
		for (int i = 0; i < count; i++) {
			if (patientNames[i].equalsIgnoreCase(name)) {
				index = i;
				break;
			}
		}
		
		if (index == -1) {
			System.out.println("Patient not found.");
			return;
		}
		
		// Shift elements
        for (int i = index; i < count - 1; i++) {
            patientNames[i] = patientNames[i + 1];
            criticality[i] = criticality[i + 1];
        }

        count--;
        System.out.println("Patient discharged successfully.\n");
	}
	
	// Method to display Patients (unsorted)
	static void displayPatients() {
        if (count == 0) {
            System.out.println("No patients available.\n");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(patientNames[i] + " → " + criticality[i]);
        }
    }
	public static void main(String [] args) {
		
		System.out.println("Welcome\n");
		
		int choice;
		do {
			System.out.println("1. Add Patient \n2. Discharge Patient \n3. Show Patient list (unsorted) \n4. Show sorted list of patients \n5. Exit\n");
			choice = input.nextInt();
			
			switch (choice) {
			case 1:
				addPatient();
				break;
			case 2: 
				dischargePatient();
				break;
			case 3:
				displayPatients();
				break;
			case 4:
				bubbleSort();
				break;
			case 5:
				System.out.println("You are out of the program, Thank you!\n");
				break;
			default:
				System.out.println("Enter a valid option\n");
			}
		}
		while (choice!=5);
		
		input.close();
	}

}
