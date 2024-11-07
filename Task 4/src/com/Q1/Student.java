package com.Q1;

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor to initialize com.Q1.Student attributes
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        setName(name); // Validate name
        setAge(age);   // Validate age
        this.course = course;
    }

    // Setter for age with validation
    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range (15-21): " + age);
        }
        this.age = age;
    }

    // Setter for name with validation
    public void setName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z\\s]+")) {  // Only letters and spaces allowed
            throw new NameNotValidException("Name contains invalid characters: " + name);
        }
        this.name = name;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
