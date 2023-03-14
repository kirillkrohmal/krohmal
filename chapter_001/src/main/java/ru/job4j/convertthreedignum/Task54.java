package ru.job4j.convertthreedignum;

public class Task54 {
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;

        if ((num1 % 2) == 0 && (num2 % 2) == 0 && (num3 % 2) == 0) {
            System.out.println("Да");
        }
        else System.out.println("Нет");
    }
}
