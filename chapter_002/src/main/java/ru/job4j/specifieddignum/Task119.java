package ru.job4j.specifieddignum;

public class Task119 {
    public static void loop(int num, int digit) {
        int num1, num2, num3;

        num1 = num / 100;
        num2 = num / 10 % 10;
        num3 = num % 10;

        if (digit == num1 || digit == num2 || digit == num3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
