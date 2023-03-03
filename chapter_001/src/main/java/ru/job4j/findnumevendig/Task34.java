package ru.job4j.findnumevendig;

public class Task34 {
    public static void evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;

        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;

        System.out.println(num1 + " " + num2 + " " + num3);
    }

    public static void main(String[] args) {
        evenAmount(463);
    }
}
