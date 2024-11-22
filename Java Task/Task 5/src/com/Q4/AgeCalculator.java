package com.Q4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for birthdate input
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String birthdateInput = scanner.nextLine();

        // Parse the birthdate input
        LocalDate birthdate = LocalDate.parse(birthdateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate today = LocalDate.now();

        // Calculate the period between birthdate and current date
        Period age = Period.between(birthdate, today);

        // Output the age in years, months, and days
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        scanner.close();
    }
}
