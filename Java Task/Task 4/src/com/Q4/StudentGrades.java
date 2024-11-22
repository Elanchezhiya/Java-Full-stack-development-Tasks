package com.Q4;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    // HashMap to store student names and grades
    private HashMap<String, Integer> students = new HashMap<>();

    // Method to add a new student
    public void addStudent(String name, int grade) {
        students.put(name, grade);
        System.out.println("Student added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (students.containsKey(name)) {
            students.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (students.containsKey(name)) {
            int grade = students.get(name);
            System.out.println("Grade for " + name + " is: " + grade);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display student grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    studentGrades.addStudent(nameToAdd, grade);
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    studentGrades.removeStudent(nameToRemove);
                    break;

                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    studentGrades.displayGrade(nameToDisplay);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
