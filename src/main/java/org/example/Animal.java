package org.example;

public abstract class Animal {
    public String name;

    public abstract void makeSound();

    public static void main(String[] args) {
        Cat tihon = new Cat("Тихон");
        Dog raf = new Dog("Deny");

        System.out.println("Кот Тихон говорит так:");
        tihon.makeSound();

        System.out.println("Пёс Раф говорит так:");
        raf.makeSound();

    }
}