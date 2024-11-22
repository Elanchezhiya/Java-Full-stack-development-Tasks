package com.Q5;

import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
        } else {
            System.out.println("Stack is empty. No element to pop.");
        }
    }

    // Method to check if the stack is empty
    public void isStackEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();

        // Push elements onto the stack
        integerStack.pushElement(10);
        integerStack.pushElement(20);
        integerStack.pushElement(30);

        // Check if stack is empty
        integerStack.isStackEmpty();

        // Pop elements from the stack
        integerStack.popElement();
        integerStack.popElement();
        integerStack.popElement();

        // Try to pop from an empty stack
        integerStack.popElement();

        // Check if stack is empty again
        integerStack.isStackEmpty();
    }
}

