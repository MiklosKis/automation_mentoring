package com.epam.training.testautomation.animals;

public class Dog extends Pet {
    public Dog(String petName) {
        this.petName = petName;
    }

    @Override
    public void makeSound() {
        System.out.println(petName + " is barking.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "petName='" + petName + '\'' +
                '}';
    }
}
