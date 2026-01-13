package com.day3.examproctor;

import java.util.*;

class ExamProctor {

    // Stack to track navigation (last visited question)
    private Stack<Integer> navigationStack = new Stack<>();

    // Store answers: questionId → answer
    private HashMap<Integer, String> answers = new HashMap<>();

    // Visit question
    void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Go back to last visited question
    void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        int last = navigationStack.pop();
        System.out.println("Moved back from Question: " + last);
    }

    // Answer question
    void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // Function to evaluate score
    int evaluateScore(QuestionBank bank) {
        int score = 0;

        for (int qId : answers.keySet()) {
            if (bank.containsQuestion(qId)) {
                if (answers.get(qId)
                        .equalsIgnoreCase(bank.getCorrectAnswer(qId))) {
                    score++;
                }
            }
        }
        return score;
    }

    // Show answered questions
    void showAnswers() {
        if (answers.isEmpty()) {
            System.out.println("No answers submitted yet");
            return;
        }
        System.out.println("Submitted Answers:");
        for (int q : answers.keySet()) {
            System.out.println("Q" + q + " → " + answers.get(q));
        }
    }
}
