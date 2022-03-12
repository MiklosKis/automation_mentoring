package com.example.java.model;

public class Product {
    private String name;
    private int price;

    //constructor method for the class

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //Getter and setter method for all three fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //toString() method for debugging.

    @Override
    public String toString() {
        return "Product {" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
