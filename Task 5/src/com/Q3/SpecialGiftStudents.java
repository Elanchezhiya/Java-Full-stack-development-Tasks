package com.Q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGiftStudents {
    public static void main(String[] args) {
        // List of student names
        List<String> students = Arrays.asList("Alice", "Bob", "Andrew", "Catherine", "Ava", "David", "Aaron", "Eve", "Amy", "Michael");

        // Filter students whose names start with "A"
        List<String> studentsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the list of students eligible for special gifts
        System.out.println("Students eligible for special gifts: " + studentsWithA);
    }
}
