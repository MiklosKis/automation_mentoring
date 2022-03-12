package com.epam.training.testautomation.animals;

public class Cat extends Pet {
    public Cat(String petName) {
        this.petName = petName;
    }

    @Override
    public void makeSound() {
        System.out.println(petName + " is meowing.");
    }

    public void lookForMice() {
        System.out.println(petName + " is looking for mice.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "petName='" + petName + '\'' +
                '}';
    }
}
