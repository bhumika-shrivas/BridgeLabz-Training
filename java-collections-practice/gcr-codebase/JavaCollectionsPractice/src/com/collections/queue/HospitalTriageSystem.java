package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Scanner;

class Patient {
	 String name;
	 int severity;

	 Patient(String name, int severity) {
	     this.name = name;
	     this.severity = severity;
	 }
}

class TriageSystem {

	 private PriorityQueue<Patient> pq;
	
	 TriageSystem() {
	     // Higher severity treated first (Max Heap)
	     pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);
	 }
	
	 // Add patient
	 void addPatient(String name, int severity) {
	     pq.add(new Patient(name, severity));
	     System.out.println("Patient added successfully.");
	 }
	
	 // Treat patient
	 void treatPatient() {
	     if (pq.isEmpty()) {
	         System.out.println("No patients in queue.");
	         return;
	     }
	     Patient p = pq.poll();
	     System.out.println("Treating: " + p.name + " (Severity " + p.severity + ")");
	 }
	
	 // View all waiting patients
	 void showPatients() {
	     if (pq.isEmpty()) {
	         System.out.println("No patients waiting.");
	         return;
	     }
	
	     // Copy queue to avoid destroying original
	     PriorityQueue<Patient> temp = new PriorityQueue<>(pq);
	
	     System.out.println("Patients waiting (High → Low severity):");
	     while (!temp.isEmpty()) {
	         Patient p = temp.poll();
	         System.out.println(p.name + " (Severity " + p.severity + ")");
	     }
	 }
}

public class HospitalTriageSystem {

	 static Scanner sc = new Scanner(System.in);
	
	 public static void main(String[] args) {
	
	     TriageSystem triage = new TriageSystem();
	
	     while (true) {
	
	         System.out.println("\n===== HOSPITAL TRIAGE MENU =====");
	         System.out.println("1. Add Patient");
	         System.out.println("2. Treat Next Patient");
	         System.out.println("3. View Waiting List");
	         System.out.println("0. Exit");
	         System.out.print("Enter choice: ");
	
	         int choice = sc.nextInt();
	
	         switch (choice) {
	
	             case 1:
	                 addPatient(triage);
	                 break;
	
	             case 2:
	                 triage.treatPatient();
	                 break;
	
	             case 3:
	                 triage.showPatients();
	                 break;
	
	             case 0:
	                 System.out.println("Exiting system. Stay safe!");
	                 return;
	
	             default:
	                 System.out.println("Invalid choice!");
	         }
	     }
	 }
	 
	 // input for adding patient 
	 static void addPatient(TriageSystem triage) {
	
	     System.out.print("Enter patient name: ");
	     String name = sc.next();
	
	     System.out.print("Enter severity (1 to 10): ");
	     int severity = sc.nextInt();
	
	     triage.addPatient(name, severity);
	 }
}
