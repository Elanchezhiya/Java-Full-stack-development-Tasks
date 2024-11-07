package com.Q2;

public class Main {
    public static void main(String[] args) {
        try {
            // Attempt to create a Voter object with valid and invalid ages
            Voter voter1 = new Voter(101, "Alice Smith", 25);
            System.out.println("Voter 1 Details:");
            voter1.displayVoterInfo();

            // Uncomment the following line to test with an invalid age
            Voter voter2 = new Voter(102, "Bob Johnson", 16);

        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}