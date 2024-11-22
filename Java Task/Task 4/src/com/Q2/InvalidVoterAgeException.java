package com.Q2;

class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException() {
        super("invalid age for voter");
    }
}