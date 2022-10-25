package ru.job4j.ternariansport;

public class SportCenter {

    public static int determineGroup(int age) {
        return age >= 7 && age <= 13 ? 1 : age >= 14 && age <= 17 ? 2 : age >= 18 && age <= 64 ? 3 : -1;
    }

    public static void main(String[] args) {
        System.out.println(determineGroup(6));
        System.out.println(determineGroup(15));
    }
}
