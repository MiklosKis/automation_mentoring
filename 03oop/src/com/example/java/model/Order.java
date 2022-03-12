package com.example.java.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Order extends PaymentItem{

    int indexedNumber = 0;
    private OrderItem[] orderedItems = new OrderItem[0];

    //implementation of add method with product and quantity

    public void add(Product product, int quantity) {
        OrderItem[] addedOrderedItem = new OrderItem[orderedItems.length + 1];
        OrderItem addItem = new OrderItem(product, quantity);
        addedOrderedItem[indexedNumber] = addItem;
        for (int i = 0; i < orderedItems.length; i++) {
            addedOrderedItem[i] = orderedItems[i];
        }
        orderedItems = addedOrderedItem;
        indexedNumber++;
    }

    //implementation of add method with only product and quantity=1

    public void add(Product product) {
        OrderItem[] addedOrderedItem = new OrderItem[orderedItems.length + 1];
        OrderItem addItem = new OrderItem(product, 1);
        addedOrderedItem[indexedNumber] = addItem;
        for (int i = 0; i < orderedItems.length; i++) {
            addedOrderedItem[i] = orderedItems[i];
        }
        orderedItems = addedOrderedItem;
        indexedNumber++;
    }

    //implementation of the modify method

    public OrderItem[] modify(String name, int quantity) {
        for (OrderItem oneItem : orderedItems) {
            Product selectedProduct = oneItem.getProduct();
            if (selectedProduct.getName().equals(name)) {
                oneItem.setQuantity(quantity);
            }
        }
        return orderedItems;
    }

    //implementation of the remove method

    public void remove(String name) {
        int indexOfRemovable = -1;
        OrderItem[] removedOrderedItems = new OrderItem[orderedItems.length - 1];
        for (OrderItem oneItem : orderedItems) {
            indexOfRemovable++;
            Product selectedProduct = oneItem.getProduct();
            if (selectedProduct.getName().equals(name)) {
                break;
            } else if (indexOfRemovable == 4) {
                indexOfRemovable = -1;
            }
        }
        for (int k = 0; k < orderedItems.length; k++) {
            int newIndex = 0;
            if (k == newIndex) {
                continue;
            }
            removedOrderedItems[newIndex++] = orderedItems[k];
        }
    }

    //implementation of the place order method

    int totalPayment = 0;

    public void placeOrder() {
        for (OrderItem oneItem : orderedItems) {
            Product selectedProduct = oneItem.getProduct();
            int priceMultipliedByQuantity = selectedProduct.getPrice() * oneItem.getQuantity();
            totalPayment += priceMultipliedByQuantity;
            System.out.println("You want to order: " + selectedProduct.getName() +
                    ", quantity: " + oneItem.getQuantity() +
                    ", price: " + priceMultipliedByQuantity + " HUF");
        }
        System.out.println("Total price: " + totalPayment + " HUF");
    }

    //implementation of the print payment instructions method

    public void printPaymentInstructions() {
        int toBePaid = totalPayment;
        System.out.println("Please transfer: " + toBePaid +
                " HUF to the following account: xxx");
    }
}
