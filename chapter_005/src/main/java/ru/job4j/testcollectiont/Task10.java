package ru.job4j.testcollectiont;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextInt();
        double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("%.1f", celsius);
    }
}
