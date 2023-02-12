package ru.job4j.pupdesks;

public class Task28 {
    public static void isEnough(int pupils, int desks) {
        if (pupils == desks || pupils <= desks) {
            System.out.println("Да");
        } else if (pupils != desks || pupils > desks) {
            System.out.println("Нет");
        }
    }
}
