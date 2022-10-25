package ru.job4j.testcollectiont;

public class Task22 {
    public static void haveRoots(int a, int b, int c) {
        int n = b^2 - 4*a*c;

        if (n < 0) {
            System.out.println("Да");
        } else if (n > 0) {
            System.out.println("Нет");
        }
    }
}
