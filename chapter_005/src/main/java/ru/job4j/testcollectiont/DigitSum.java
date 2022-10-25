package ru.job4j.testcollectiont;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;

        while(num > 0) {
            sum = num % 10 + sum;
            num = num / 10;
        }

        return sum;


    }
}
