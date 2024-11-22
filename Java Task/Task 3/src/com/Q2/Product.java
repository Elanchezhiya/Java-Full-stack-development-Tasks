package com.Q2;

class Product implements Taxable {
    // Attributes
    private int pid;
    private double price;
    private int quantity;

    // Constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate sales tax on unit price
    @Override
    public double calcTax() {
        return price * salesTax;  // Sales tax on unit price
    }

    // Display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + pid);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Sales Tax (per unit): " + calcTax());
    }
}
