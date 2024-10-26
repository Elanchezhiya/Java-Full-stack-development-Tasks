import java.util.Scanner;

public class XYZ {
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 5 Product objects
        Product[] products = new Product[5];

        // Accept product information from user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Enter product id: ");
            int pid = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            // Create Product object and store in the array
            products[i] = new Product(pid, price, quantity);
        }

        // Find the product with the highest price
        int highestPricePid = products[0].pid;
        double highestPrice = products[0].price;

        for (Product product : products) {
            if (product.price > highestPrice) {
                highestPrice = product.price;
                highestPricePid = product.pid;
            }
        }

        // Display the PID of the product with the highest price
        System.out.println("\nProduct ID with the highest price: " + highestPricePid);

        // Calculate the total amount spent on all products
        double totalAmountSpent = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);


    }
    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.price * product.quantity;  // amount = price * quantity
        }
        return totalAmount;
    }
}
