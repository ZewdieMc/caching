package com.example.caching;

public class Book {
    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.title = title;
        this.isbn = isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Book{ isbn: " + this.isbn + " title: " + this.title + " }";
    }
}
