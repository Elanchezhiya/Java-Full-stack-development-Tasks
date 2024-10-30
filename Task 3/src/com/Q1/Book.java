package com.Q1;

class Book {
    // Attributes of Book
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, a book is available when added
    }

    // Getters
    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Set availability status
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}
