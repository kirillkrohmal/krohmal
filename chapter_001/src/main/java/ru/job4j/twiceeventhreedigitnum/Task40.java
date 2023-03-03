package ru.job4j.twiceeventhreedigitnum;

public class Task40 {
    public static void isDoubleEven(int number) {
        int num1, num2, num3, counter = 0;

        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;

        if (num1 % 2 == 0 || num1 == 0) {
            System.out.println(counter);
        } else if (num2 % 2 == 0 || num2 == 0) {
            System.out.println(counter);
        }
        System.out.println(counter);
    }
}
