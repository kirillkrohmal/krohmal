package ru.job4j.determineexisttrianglesides;

public class Task56 {
    public static void isTriangle(int a, int b, int c) {
        if (b + c > a && a + c > b && a + b > c) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
