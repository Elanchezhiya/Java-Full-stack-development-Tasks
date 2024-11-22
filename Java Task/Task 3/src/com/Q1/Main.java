package com.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Main menu
        do {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add book
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(id, title, author);
                    library.addBook(newBook);
                    break;

                case 2:
                    // Remove book
                    System.out.print("Enter Book ID to remove: ");
                    int removeID = scanner.nextInt();
                    library.removeBook(removeID);
                    break;

                case 3:
                    // Search for a book
                    System.out.print("Enter Book ID to search: ");
                    int searchID = scanner.nextInt();
                    Book foundBook = library.searchBook(searchID);

                    if (foundBook != null) {
                        System.out.println("Book found:");
                        foundBook.displayBook();
                    } else {
                        System.out.println("Book with ID " + searchID + " not found.");
                    }
                    break;

                case 4:
                    // Display all books
                    System.out.println("Displaying all books in the library:");
                    library.displayBooks();
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

    }
}