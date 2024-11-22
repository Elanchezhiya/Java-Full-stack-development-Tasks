//Write a java program that takes the purchase amount as input and calculates the final payable amount after applying the discount

import java.util.Scanner;

public class PurchaseAndDiscount {
    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner obj = new Scanner(System.in);

        // Ask the user to enter the purchase amount
        System.out.println("Enter your Purchase Amount: ");
        float amount = obj.nextFloat();  // Store input in 'amount'
        float discount = 0;  // Variable to store discount value

        // Calculate discount based on purchase amount
        if (amount < 500) {
            System.out.println("No Discount is applied");
        }
        else if (amount >= 500 && amount <= 1000) {
            System.out.println("10% Discount is applied");
            discount = amount * 0.10f;  // 10% discount
        }
        else if (amount > 1000) {
            System.out.println("20% Discount is applied");
            discount = amount * 0.20f;  // 20% discount
        }

        // Calculate the final payable amount after applying discount
        float finalAmount = amount - discount;

        // Display the final payable amount
        System.out.println("The Final Payable Amount after Discount is: " + finalAmount);
    }
}

