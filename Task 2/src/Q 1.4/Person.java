package Super;

class Person {
    // Attributes of Person
    protected String name;
    protected int age;

    // Constructor to initialize Person attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}