package ru.job4j.numevendig;

import java.util.StringJoiner;

public class Task32 {
    public static void evenAmount(int number) {
        int num1, num2, counter = 0;

        num1 = number / 10;
        num2 = number % 10;

        StringJoiner sj = new StringJoiner(" ");
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            counter = counter + 2;
            sj.add(Integer.toString(counter));
        } else if (num1 % 2 == 0) {
            counter++;
            sj.add(Integer.toString(counter));
        } else if (num2 % 2 == 0) {
            counter++;
            sj.add(Integer.toString(counter));
        } else if (num2 == 0 || num1 == 0) {
            counter++;
            sj.add(Integer.toString(counter));
        } else {
            sj.add(Integer.toString(counter));
        }

        System.out.println(sj);
    }

}
