package com.Q3;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        // Array of weekday names
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            // Ask for day position
            System.out.print("Enter day position (0-6): ");
            int dayIndex = scanner.nextInt();

            // Print corresponding day name
            System.out.println("Day: " + weekdays[dayIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle index out of range
            System.out.println("Invalid day position! Please enter a value between 0 and 6.");
        } finally {
            scanner.close();
        }
    }
}
