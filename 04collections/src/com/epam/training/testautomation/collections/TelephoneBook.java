package com.epam.training.testautomation.collections;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    private int countryCode;
    private Map<String, String> telephoneBook = new HashMap<>();
    private static final String PRINTED_BY_TEXT = "This telephone book was printed by Not A Number, Co. ";

    // Constructor method for Telephonebook with Countrycode

    public TelephoneBook(int countryCode) {
        this.countryCode = countryCode;
    }

    // add method implementation

    public void add(String name, String number) {
        if (name != null && number != null) {
            if (telephoneBook.containsKey(number)) {
                telephoneBook.remove(number);
            }
            telephoneBook.put(number, name);
        }
    }

    public void remove(String number) {
        if (telephoneBook.containsKey(number)) {
            telephoneBook.remove(number);
        }
    }

    // iterator for the telephonebook to store all key-value pairs

    private String iterateUserAndPhone() {
        String allUserNameAndPhone = "";
        for (String currentKey: telephoneBook.keySet()) {
            String selectedPhoneNumber = currentKey.toString();
            String selectedName = telephoneBook.get(currentKey).toString();
            allUserNameAndPhone += selectedName + ": +" + countryCode + selectedPhoneNumber + " ";
        }
        return allUserNameAndPhone;
    }

    // Implement printBook method

    public void printBook() {
        System.out.println(PRINTED_BY_TEXT + iterateUserAndPhone());
    }

    // toString method
    @Override
    public String toString() {
        return "TelephoneBook{" +
                "countryCode=" + countryCode +
                ", telephoneBook=" + telephoneBook +
                '}';
    }
}
