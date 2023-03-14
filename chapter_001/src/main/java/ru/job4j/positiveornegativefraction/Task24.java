package ru.job4j.positiveornegativefraction;

public class Task24 {
    public static void isPositive(int num1, int num2) {
        if (num1 > 0 && num2 > 0) {
            System.out.println("Да");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Да");
        } else if (num1 > 0 && num2 < 0) {
            System.out.println("Нет");
        } else if (num1 < 0 && num2 > 0) {
            System.out.println("Нет");
        }
    }
}
