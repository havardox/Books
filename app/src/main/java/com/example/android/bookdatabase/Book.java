package com.example.android.bookdatabase;

public class Book {
    private String title, author, year, price;

    public Book() {}

    public Book(String title, String author, String year, String price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getPrice() {
        return price;
    }
}
