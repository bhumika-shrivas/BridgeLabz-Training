package com.day3.examproctor;

import java.util.HashMap;

class QuestionBank {

    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    // add correct answer
    void addCorrectAnswer(int qId, String answer) {
        correctAnswers.put(qId, answer);
    }

    // fetch correct answer
    String getCorrectAnswer(int qId) {
        return correctAnswers.get(qId);
    }

    boolean containsQuestion(int qId) {
        return correctAnswers.containsKey(qId);
    }
}
