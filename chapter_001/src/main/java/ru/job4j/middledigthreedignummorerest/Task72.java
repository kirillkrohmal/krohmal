package ru.job4j.middledigthreedignummorerest;

public class Task72 {
    public static void midDigitMore(int num) {
        int num1, num2, num3;
        num1 = num / 100;
        num2 = num / 10 % 10;
        num3 = num % 10;

        if (num1 < num2 && num3 < num2) {
            System.out.println("Да");
        } else if (num1 > num2 && num3 > num2) {
            System.out.println("Нет");
        } else {
            System.out.println("Нет");
        }
    }
}
