package ru.job4j.threedignumsamedig;

public class Task61 {
    public static void hasEqualDigits(int number) {
        int num1, num2, num3 = 0;

        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;

        if (num1 == num2 && num3 == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
