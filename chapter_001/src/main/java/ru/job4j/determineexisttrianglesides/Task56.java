package ru.job4j.determineexisttrianglesides;

public class Task56 {
    public static void isTriangle(int a, int b, int c) {
        int num3 = a + b;
        int num4 = b + c;
        int num5 = a + c;

        if (a < num3 && a < num4 && a < num5 || b < num3 && b < num4 && b < num5 || c < num3 && c < num4 && c < num5) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
