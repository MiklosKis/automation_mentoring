package com.example.java.model;

public class Book extends Product {

    private String title;
    private String author;

    //constructor method

    public Book(String name, int price, String title, String author) {
        super(name, price);
        this.title = title;
        this.author = author;
    }

    //Getter and setter method for title and author

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    //toString() method for debugging.

    @Override
    public String toString() {
        return "Book {" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
