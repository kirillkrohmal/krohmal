package ru.job4j.permutationfirstalast;

public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;

        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;

        if (num3 < 1 && num2 < 1) {
            System.out.println(num1);
        } else if (num2 < 1) {
            System.out.println(num3 + "" + num1);
        } else if (num2 < 1 && num1 < 1) {
            System.out.println(num3);
        }  else if (num3 < 1) {
            System.out.println(num2 + "" + num1);

        } else System.out.println(num3 + "" + num2 + "" + num1);
    }
    
}

