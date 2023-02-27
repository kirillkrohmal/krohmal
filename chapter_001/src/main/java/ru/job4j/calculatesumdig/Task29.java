package ru.job4j.calculatesumdig;

public class Task29 {
    public static void numSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
