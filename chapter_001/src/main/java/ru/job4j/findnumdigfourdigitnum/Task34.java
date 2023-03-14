package ru.job4j.findnumdigfourdigitnum;

public class Task34 {
    public static void evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;

        num1 = number % 10;
        num2 = number % 100/10;
        num3 = number % 1000/100;
        num4 = number /1000 ;

        if (num1 % 2 == 0 || num1 == 0) {
            counter++;
        } if (num2 % 2 == 0 || num2 == 0) {
            counter++;
        } if (num3 % 2 == 0 || num3 == 0) {
            counter++;
        } if (num4 % 2 == 0 || num4 == 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
