package ru.job4j.checksymmetrythreedignum;

public class Task39 {
    public static void isSymmetric(int number) {
        int num1, num3 = 0;

        num1 = number / 100;
        num3 = number % 10;

        if (num1 == num3) {
            System.out.println("Да");
        } else if (num1 != num3) {
            System.out.println("Нет");
        }
    }
}
