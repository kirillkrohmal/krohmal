package ru.job4j.pupdesks;

public class Task28 {
    public static void isEnough(int pupils, int desks) {
        int pup = pupils / 2;

        if (pup == desks || pup <= desks) {
            System.out.println("Да");
        } else if (pup != desks || pup > desks) {
            System.out.println("Нет");
        }
    }
}
