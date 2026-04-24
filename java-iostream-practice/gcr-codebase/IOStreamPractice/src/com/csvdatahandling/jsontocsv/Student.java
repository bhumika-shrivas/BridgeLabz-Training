package com.csvdatahandling.jsontocsv;

//POJO class for Student
public class Student {

 private int id;
 private String name;
 private int age;

 // Default constructor (required for Jackson)
 public Student() {}

 // Parameterized constructor
 public Student(int id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }

 // Getters and Setters
 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }
}
