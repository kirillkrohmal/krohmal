package ru.job4j.twiceeventhreedigitnum;

public class Task40 {
    public static void isDoubleEven(int number) {
        int num1, num2, num3 = 0;

        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;

        int num4 = num1 + num2 + num3;

        if (number % 2 == 0 && num4 % 2 == 0) {
            System.out.println("Да");
        } else if (number % 2 != 0 && num4 % 2 != 0) {
            System.out.println("Нет");
        } else {
            System.out.println("Нет");
        }
    }
}
