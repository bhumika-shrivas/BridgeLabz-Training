package com.day5.edumentor;

import java.util.Scanner;

public class EduMentorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Learner
        System.out.print("Enter learner name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter user ID: ");
        int id = sc.nextInt();

        System.out.print("Is full-time learner? (true/false): ");
        boolean fullTime = sc.nextBoolean();
        sc.nextLine();

        Learner learner = new Learner(name, email, id, fullTime);

        // Select quiz difficulty
        System.out.print("Select quiz difficulty (easy/hard): ");
        String difficulty = sc.nextLine();

        Quiz quiz = new Quiz(difficulty);

        // Attempt quiz
        int qNo = 1;
        for (String question : quiz.getQuestions()) {
            System.out.println("Q" + qNo + ": " + question);
            System.out.print("Your answer: ");
            quiz.submitAnswer(sc.nextLine());
            qNo++;
        }

        quiz.evaluate();

        System.out.println("Quiz Percentage: " + quiz.getPercentage() + "%");

        // Polymorphism
        learner.generateCertificate();
    }
}
