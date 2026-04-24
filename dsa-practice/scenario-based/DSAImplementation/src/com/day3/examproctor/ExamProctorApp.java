package com.day3.examproctor;

/*ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits.
Requirements:
● Track navigation with stack.
● Store answers in a map.
● Evaluate using functions for scoring logic.
*/

import java.util.Scanner;

public class ExamProctorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamProctor proctor = new ExamProctor();
        QuestionBank bank = new QuestionBank();

        while (true) {
            System.out.println("""
            1. Add Question (Correct Answer)
            2. Visit Question
            3. Submit Answer
            4. Go Back (Undo Navigation)
            5. View Submitted Answers
            6. Submit Exam (Evaluate)
            7. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Question ID: ");
                    int qId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Correct Answer: ");
                    bank.addCorrectAnswer(qId, sc.nextLine());
                }

                case 2 -> {
                    System.out.print("Question ID to visit: ");
                    proctor.visitQuestion(sc.nextInt());
                }

                case 3 -> {
                    System.out.print("Question ID: ");
                    int qId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Your Answer: ");
                    proctor.submitAnswer(qId, sc.nextLine());
                }

                case 4 -> proctor.goBack();

                case 5 -> proctor.showAnswers();

                case 6 -> {
                    int score = proctor.evaluateScore(bank);
                    System.out.println("Final Score: " + score);
                }

                case 7 -> {
                    System.out.println("Exam submitted. System closed.");
                    return;
                }
            }
        }
    }
}
