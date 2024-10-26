package Super;

class Employee extends Person {
    // Additional attributes for Employee
    private int employeeID;
    private double salary;

    // Constructor to initialize both Person and Employee attributes
    public Employee(String name, int age, int employeeID, double salary) {
        // Using super to initialize name and age from Person class
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details (includes Person details)
    public void displayEmployeeDetails() {
        // Display the Person details using the method from Person class
        displayPersonDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 30, 12345, 50000.0);

        // Displaying the Employee details (including Person details)
        emp.displayEmployeeDetails();
    }
}
