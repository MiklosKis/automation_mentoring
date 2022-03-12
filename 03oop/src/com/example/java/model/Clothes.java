package com.example.java.model;

public class Clothes extends Product{
    private int size;
    private String colour;

    //constructor method

    public Clothes(String name, int price, int size, String colour) {
        super(name, price);
        this.size = size;
        this.colour = colour;
    }

    //Getter and setter method for title and author

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    //toString() method for debugging.

    @Override
    public String toString() {
        return "Clothes {" +
                "name='" + getName() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
