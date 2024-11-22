package com.Q2;

class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor with age validation
    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException();  // Throw custom exception if age < 18
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Method to display voter details
    public void displayVoterInfo() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}