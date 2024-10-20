//Write a program to below pattern
//5 5 5 5 5
//5 4 4 4 4
//5 4 3 3 3
//5 4 3 2 2
//5 4 3 2 1
public class PrintPattern {
    public static void main(String[] args) {
        // Outer loop controls the rows, starting from 5 down to 1
        for(int i = 5; i >= 1; i--) {
            // First inner loop prints decreasing numbers from 5 to (i+1)
            for(int j = 5; j > i; j--) {
                // Print the number with a space
                System.out.print(j + " ");
            }

            // Second inner loop prints the number 'i' multiple times
            for(int k = i; k >= 1; k--) {
                // Print the current row number with a space
                System.out.print(i + " ");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

