package com.epam.training.testautomation.collections;

public class Order {
    private final int id;
    private final String description;

    // Constructor
    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    // toString override
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
