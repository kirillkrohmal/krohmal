package ru.job4j.diffnumoftensnumofunits;

public class Task30 {
    public static void difference(int number) {
        int num1, num2;
        int num3 = 0;
        num1 = number / 10;
        num2 = number % 10;

        if (num1 > num2){
            num3 = num1 - num2;
        } else if (num2 > num1) {
            num3 = num2 - num1;
        } else {
            num3 = num2 - num1;
        }

        System.out.println(Math.abs(num3));
    }
}
