package com.Q1;

import java.util.ArrayList;

class Library {
    // List to store Book objects
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Method to remove a book by book ID
    public void removeBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                books.remove(book);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    // Method to search for a book by book ID
    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null; // If book not found
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}

