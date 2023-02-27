package ru.job4j.outputdiffproducttwo;

import java.util.StringJoiner;

public class Task32 {
    public static void calculate(int num1, int num2) {
        int number = 0;

        if (num1 > num2 || num1 < num2) {
            number = Math.abs(num1 - num2);
        } else {
            number = num1 * num2;
        }
        System.out.println(number);
    }
}
