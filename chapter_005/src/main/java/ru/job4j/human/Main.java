package ru.job4j.human;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human(15, "Michael", "Frolov", "football");
        Human human3 = new Human(20, "Ira", "Ivanova");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
