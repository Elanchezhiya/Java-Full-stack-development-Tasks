package com.Q2;

class Employee implements Taxable {
    // Attributes
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate income tax on yearly salary
    @Override
    public double calcTax() {
        return salary * incomeTax;  // Income tax on salary
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Income Tax: " + calcTax());
    }
}
