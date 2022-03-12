package com.example.java;

import com.example.java.model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order anOrder=new Order();
        Book b1=new Book("Java in a Box", 100, "Java in a Box", "Bruce Eckel");
        Book b2=new Book("Thinking in Java", 180, "Thinking in Java", "Bruce Eckel");
        Clothes c1=new Clothes("Shearling and Lambskin Jacket", 1295, 10,"Chocolate/light citrus");
        Clothes c2=new Clothes("Pintuck Detail Silk Lame Shirt Dress", 464251, 10,"Silver");
        Product f1=new Product ("Acacia Honey 850 g", 2299);
        anOrder.add(b1,1);
        anOrder.add(b2);
        anOrder.add(c1,1);
        anOrder.add(c2,2);
        anOrder.add(f1,10);
        anOrder.modify(f1.getName(),15);

        anOrder.remove("Shearling and Lambskin Jacket");

        anOrder.placeOrder();


        Order anotherOrder=new Order();
        anotherOrder.add(c1,10);

        anotherOrder.placeOrder();

        Booking booking1=new Booking("Tenerife trip", 19000);
        Booking booking2=new Booking("Honolulu trip", 21000);

        booking1.printPaymentInstructions();

        PaymentItem[] p=new PaymentItem[4];
        p[0]=anOrder;
        p[1]=anotherOrder;
        p[2]=booking1;
        p[3]=booking2;

        for (int i=0; i<p.length; i++)
            p[i].printPaymentInstructions();
    }
}
