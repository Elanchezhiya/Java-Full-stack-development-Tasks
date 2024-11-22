public class Person {
    private int age;
    private String name;

    // Default constructor (age is set to 18 by default)
    public Person(String name) {
        this.name = name;
        this.age = 18;  // Default age
    }

    // Parameterized constructor to initialize name and age
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    // Method to display name and age of the person
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Creating a person with the default age of 18
        Person person1 = new Person("Elan");
        person1.displayDetails(); // Output: Name: Elan, Age: 18

        // Creating a person with custom age
        Person person2 = new Person("Chezhiyan", 25);
        person2.displayDetails(); // Output: Name: Chezhiyan, Age: 25
    }
}
