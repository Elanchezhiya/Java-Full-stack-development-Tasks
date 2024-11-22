//Write down the program to reverse the given number using loops
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner obj = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter your number: ");
        int number = obj.nextInt();  // Store input number
        int reverse = 0;  // Variable to store the reversed number

        // Loop to reverse the number digit by digit
        for (; number != 0; number /= 10) {
            int digit = number % 10;  // Extract the last digit
            reverse = reverse * 10 + digit;  // Add the digit to the reverse
        }

        // Print the reversed number
        System.out.println("Reverse of the number is: " + reverse);
    }
}

