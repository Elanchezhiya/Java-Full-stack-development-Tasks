package com.Q1;

public class Main {
    public static void main(String[] args) {
        try {
            // Attempt to create Student object with valid and invalid data
            Student student1 = new Student(101, "John Doe", 20, "Computer Science");
            System.out.println("Student 1 Details:");
            student1.displayStudentInfo();

            // Uncomment the following lines one by one to see exception handling

            // Invalid age
             //Student student2 = new Student(102, "Alice Smith", 22, "Mathematics");

            // Invalid name
             Student student3 = new Student(103, "Mike123", 19, "Physics");


        } catch (AgeNotWithinRangeException e) {
            System.out.println("Age Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Name Exception: " + e.getMessage());
        }
    }
}