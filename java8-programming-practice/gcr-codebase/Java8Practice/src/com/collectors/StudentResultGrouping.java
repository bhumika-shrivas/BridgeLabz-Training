package com.collectors;
/*
Student Result Grouping
○ Scenario: Group students by grade level and collect names.
○ Task: Use Collectors.groupingBy().
 */
import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {

    static class Student {
        private String name;
        private String grade;

        Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        String getName() {
            return name;
        }

        String getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {

        List<Student> students = List.of(
            new Student("Bhumika", "A"),
            new Student("Arya", "B"),
            new Student("Disha", "A")
        );

        Map<String, List<String>> groupedResult =
            students.stream()
                    .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())
                    ));

        System.out.println(groupedResult);
    }
}
