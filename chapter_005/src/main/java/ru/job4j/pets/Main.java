package ru.job4j.pets;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHello();

        Cat cat = new Cat();
        cat.sayHello();

        dog.catchCat(cat);

    }
}
