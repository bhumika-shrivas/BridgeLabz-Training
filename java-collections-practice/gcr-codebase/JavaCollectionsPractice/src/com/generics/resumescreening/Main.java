package com.generics.resumescreening;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<JobRole> roles = new ArrayList<>();

        System.out.print("Enter Candidate Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        int experience = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter number of skills: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] skills = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter skill " + (i + 1) + ": ");
            skills[i] = sc.nextLine();
        }

        System.out.println("Choose Job Role:");
        System.out.println("1. Software Engineer");
        System.out.println("2. Data Scientist");
        System.out.println("3. Product Manager");

        int choice = sc.nextInt();

        JobRole role = null;

        switch (choice) {
            case 1: role = new SoftwareEngineer(); break;
            case 2: role = new DataScientist(); break;
            case 3: role = new ProductManager(); break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        Resume<JobRole> resume = new Resume<>(name, experience, skills, role);

        int score = ResumeAI.calculateScore(resume);
        System.out.println("AI Score: " + score);

        if (ResumeAI.isShortlisted(resume)) {
            System.out.println("Status: Shortlisted");
        } else {
            System.out.println("Status: Rejected");
        }

        roles.add(role);
        ScreeningPipeline pipeline = new ScreeningPipeline();
        pipeline.processResumes(roles);

        sc.close();
    }
}
