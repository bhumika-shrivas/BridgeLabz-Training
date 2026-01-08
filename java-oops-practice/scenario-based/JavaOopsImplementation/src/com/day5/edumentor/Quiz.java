package com.day5.edumentor;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    // 🔒 Internal question bank (private)
    private final List<String> questions = new ArrayList<>();
    private final List<String> correctAnswers = new ArrayList<>();

    // Learner answers (cannot be modified)
    private final List<String> learnerAnswers = new ArrayList<>();

    private int score;

    // Constructor loads system questions (difficulty-based)
    public Quiz(String difficulty) {

        if (difficulty.equalsIgnoreCase("easy")) {
            questions.add("What is Java?");
            correctAnswers.add("Programming Language");

            questions.add("What is JVM?");
            correctAnswers.add("Java Virtual Machine");

        } else if (difficulty.equalsIgnoreCase("hard")) {
            questions.add("Explain OOP concept in Java?");
            correctAnswers.add("Encapsulation Inheritance Polymorphism Abstraction");

            questions.add("What is multithreading?");
            correctAnswers.add("Concurrent execution of threads");
        }
    }

    // Only getter for questions (read-only)
    public List<String> getQuestions() {
        return questions;
    }

    // Submit answers (no modification allowed later)
    public void submitAnswer(String answer) {
        learnerAnswers.add(answer);
    }

    // Scoring using operators
    public void evaluate() {
        score = 0;
        for (int i = 0; i < correctAnswers.size(); i++) {
            if (i < learnerAnswers.size()
                    && learnerAnswers.get(i).equalsIgnoreCase(correctAnswers.get(i))) {
                score++; // ++ operator
            }
        }
    }

    public double getPercentage() {
        return (score * 100.0) / correctAnswers.size();
    }
}
