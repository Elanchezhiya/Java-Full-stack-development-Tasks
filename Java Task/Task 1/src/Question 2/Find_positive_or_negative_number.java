//Write a program that find a given number is negative or positive
import java.util.Scanner;

public class Find_positive_or_negative_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Positive or Negative : ");
        long number = obj.nextLong();
        //to check the given number is positive or negative
        if (number >= 0) {
            System.out.println("The Given Number is in Positive");
        } else {
            System.out.println("The Given Number is in Negative");
        }
    }
}
