package com.generics.resumescreening;

public class ResumeAI {

    public static <T extends JobRole> int calculateScore(Resume<T> resume) {

        int score = 0;

        if (resume.getExperience() >= resume.getJobRole().getMinExperience()) {
            score += 50;
        }

        for (String required : resume.getJobRole().getRequiredSkills()) {
            for (String skill : resume.getSkills()) {
                if (required.equalsIgnoreCase(skill)) {
                    score += 15;
                }
            }
        }
        return score;
    }

    public static <T extends JobRole> boolean isShortlisted(Resume<T> resume) {
        return calculateScore(resume) >= 70;
    }
}
