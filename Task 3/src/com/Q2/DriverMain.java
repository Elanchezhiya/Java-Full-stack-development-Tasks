package com.Q2;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept Employee information
        System.out.println("Enter Employee details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object and display tax
        Employee employee = new Employee(empId, name, salary);
        System.out.println("\nEmployee Information:");
        employee.displayEmployeeDetails();

        // Accept Product information
        System.out.println("\nEnter Product details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Price per unit: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        // Create Product object and display tax
        Product product = new Product(pid, price, quantity);
        System.out.println("\nProduct Information:");
        product.displayProductDetails();

        scanner.close();
    }
}
