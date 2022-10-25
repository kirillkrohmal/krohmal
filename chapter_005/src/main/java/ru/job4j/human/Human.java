package ru.job4j.human;

public class Human {
    int age;
    String name;
    String secondName;
    String favoriteSport;

    public Human() {
    }

    public Human(int age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }

    public Human(int age, String name, String secondName, String favoriteSport) {
        this(age, name, secondName);
        this.favoriteSport = favoriteSport;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", favoriteSport='" + favoriteSport + '\'' +
                '}';
    }
}
