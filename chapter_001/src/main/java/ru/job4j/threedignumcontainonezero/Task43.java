package ru.job4j.threedignumcontainonezero;

public class Task43 {
    public static void containsZero(int number) {
        int num1, num2, num3 = 0;

        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
