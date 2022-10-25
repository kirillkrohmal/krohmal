package ru.job4j.testcollectiont;

public class Task27 {
    public static void isEnough(int pupils, int chairs) {
        if (pupils == chairs || pupils < chairs) {
            System.out.println("Да");
        } else if (pupils != chairs) {
            System.out.println("Нет");
        }
    }
}

