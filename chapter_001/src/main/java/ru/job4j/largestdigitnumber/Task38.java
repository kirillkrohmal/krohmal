package ru.job4j.largestdigitnumber;

public class Task38 {
    public static void maxDigit(int number) {
        int max = 0;
        if (number % 10 > max) {
            max = (number % 10);
            number /= 10;
            System.out.println(number);
        }
    }
}