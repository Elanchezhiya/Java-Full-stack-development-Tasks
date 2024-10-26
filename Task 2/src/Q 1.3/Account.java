public class Account {
    // Data member
    private double balance;

    // No-argument constructor (default balance is 0)
    public Account() {
        this.balance = 0;
    }

    // Constructor with balance initialization
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Create an Account object with no argument constructor
        Account account1 = new Account();
        account1.displayBalance(); // Output: Current balance: 0.0

        // Deposit and withdraw operations
        account1.deposit(1000);
        account1.displayBalance(); // Output: Current balance: 1000.0

        account1.withdraw(500);
        account1.displayBalance(); // Output: Current balance: 500.0

        account1.withdraw(700); // Output: Insufficient balance for withdrawal

        // Create an Account object with an initial balance
        Account account2 = new Account(2000);
        account2.displayBalance(); // Output: Current balance: 2000.0

        // Perform transactions
        account2.deposit(1500);
        account2.displayBalance(); // Output: Current balance: 3500.0

        account2.withdraw(1000);
        account2.displayBalance(); // Output: Current balance: 2500.0
    }
}