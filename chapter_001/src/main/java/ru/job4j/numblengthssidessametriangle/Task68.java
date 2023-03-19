package ru.job4j.numblengthssidessametriangle;

public class Task68 {
    public static void isTriangle(int a, int b, int c) {
        int num3 = a + b;
        int num4 = b + c;
        int num5 = a + c;

        if (num3 > a && num4 > a  && num5 > a || num3 > b && num4 > b && num5 > b || num3 > c && num4 > c &&num5 > c) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
