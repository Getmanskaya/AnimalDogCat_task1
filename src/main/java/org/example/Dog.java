package org.example;

public class Dog extends Animal {
    public Dog(String name) {
        super.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}

