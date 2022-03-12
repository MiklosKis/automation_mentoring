package com.epam.training.testautomation;

import com.epam.training.testautomation.animals.*;
import com.epam.training.testautomation.collections.Brainstorming;
import com.epam.training.testautomation.collections.CountryCodes;
import com.epam.training.testautomation.collections.Order;
import com.epam.training.testautomation.collections.TelephoneBook;

import java.util.ArrayList;
import java.util.List;
//import com.epam.training.testautomation.products.Car;
//import com.epam.training.testautomation.products.Plane;
//import com.epam.training.testautomation.products.VacuumCleanerRobot;

public class Test {

    public static void main(String[] args) {

        /* Homework Task 3: You can implement the steps here. */
        List<Order> orderList = new ArrayList<>();
        Order orderFirst = new Order(1001, "Bales of Cotton");
        Order orderSecond = new Order(1002, "Fistful of Steel");
        Order orderThird = new Order(2001, "Kings of Leon");
        orderList.add(orderFirst);
        orderList.add(orderSecond);
        orderList.add(orderThird);
        orderList.remove(orderFirst);
        System.out.println(orderList);
        System.out.println();


        /* Homework Task 4: You can try out your implementation by running these lines. */
        TelephoneBook hunTelBook = new TelephoneBook(CountryCodes.HUNGARY.getCode());
        TelephoneBook norTelBook = new TelephoneBook(CountryCodes.NORWAY.getCode());
        hunTelBook.add("Lajos Kovacs", "301111111");
        hunTelBook.add("Pal Toth", "302222222");
        hunTelBook.add("Maria Molnar", "303333333");
        hunTelBook.add("Maria Molnar", "303333333");
        norTelBook.add("Jorgssen Jorger", "123456789");
        norTelBook.add("asd", null);
        hunTelBook.add(null, "2674315453");
        hunTelBook.add("Steve Jobbs", "304444444");
        hunTelBook.add("Steve Jobs", "304444444");  // Correcting the name
        hunTelBook.remove("303333333");
        hunTelBook.remove("705555555");
        hunTelBook.printBook();
        norTelBook.printBook();
        System.out.println();

        /* Homework Task 5: You can try out your implementation by running these lines. */
        Brainstorming ideasForHalloween = new Brainstorming();
        ideasForHalloween.addIdea("Cherry juice as blood");
        ideasForHalloween.addIdea("Fluorescent plastic skeletons");
        ideasForHalloween.addIdea("Vampiric music");
        ideasForHalloween.addIdea("Fluorescent plastic skeletons"); // Duplicated
        System.out.println(ideasForHalloween);
        System.out.println("We have this amount of ideas: " + ideasForHalloween.getNumberOfIdeas());
        ideasForHalloween.removeIdea("Vampiric music");
        ideasForHalloween.removeIdea("Test removal");
        ideasForHalloween.removeIdea("cherry juice as blood"); //lowercase in the idea so it is not the same
        System.out.println(ideasForHalloween);
        System.out.println("We have this amount of ideas: " + ideasForHalloween.getNumberOfIdeas());
        System.out.println(ideasForHalloween.toString());
        ideasForHalloween.removeIdea("Cherry juice as blood");
        ideasForHalloween.removeIdea("Fluorescent plastic skeletons");
        System.out.println(ideasForHalloween.toString());
        ideasForHalloween.removeIdea(null);
        System.out.println(ideasForHalloween.toString());
        ideasForHalloween.addIdea(null);
        System.out.println(ideasForHalloween.toString());
        System.out.println();

        /* Homework Task 6-8: You can try out your implementation by running these lines. */
        Cat narancs = new Cat("Nari");
        System.out.println(narancs.toString());
        narancs.makeSound();
        narancs.lookForMice();
        System.out.println();

        Pet omlas = new Cat("Omlas");       // To answer the question below: Because it is upcasting.
                                                    // Cat is lower in the hierarchy than Pet and omlas' type is
                                                    // Pet and instantiated with Cat class constructor
                                                    // To be able to use Cat's implemented lookForMice method I need to
                                                    // cast the object
        System.out.println(omlas.toString());
        omlas.makeSound();
        // omlas.lookForMice();             // Think about why you cannot use this method this way, and...
        ((Cat) omlas).lookForMice();        // you why need to do casting here?
        System.out.println();

        Dog firstDogInSpace = new Dog("Lajka");
        System.out.println(firstDogInSpace.toString());
        firstDogInSpace.makeSound();
        System.out.println();

    }

}
