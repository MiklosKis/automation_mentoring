package com.example.java.model;

public class Booking extends PaymentItem{
    private String description;
    private int fee;

    //constructor method

    public Booking(String description, int fee) {
        this.description = description;
        this.fee = fee;
    }

    //Getter and setter

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    //toString method

    @Override
    public String toString() {
        return "Booking {" +
                "description='" + description + '\'' +
                ", fee=" + fee +
                '}';
    }

    public void printPaymentInstructions() {
        double calculatePrice = fee * 0.1 + 1000;
        int toBePaid = (int) calculatePrice;
        System.out.println("In order to complete your reservation you need to transfer a deposit of: " +
                toBePaid + " HUF to the following account xxx");
    }
}
