package ru.job4j.largestdigitnumber;

import java.util.StringJoiner;

public class Task38 {
    public static void maxDigit(int number) {
        int num1 = number / 10;
        int num2 = number % 10;

        StringJoiner sj = new StringJoiner(" ");
        if (num1 > num2) {
            sj.add(Integer.toString(num1));
            System.out.println(sj);
        } else if (num1 < num2) {
            sj.add(Integer.toString(num2));
            System.out.println(sj);
        } else if (num1 == num2){
            System.out.println("Равны");
        }
    }
}