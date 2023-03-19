package ru.job4j.linearleftshiftthreedignum;

public class Task37 {
    public static void leftShift(int number) {
        int num1, num2, num3;

        num1 = number % 1000 / 100;
        num2 = number % 100 / 10;
        num3 = number % 10;

        if (num1 == 0) {
            System.out.println(num2 + "" + num3 + "" + 0);
        } else if (num2 == 0 && num3 == 0) {
            System.out.println(0);
        } else if (num2 == 0) {
            System.out.println(num3 + "" + 0);
        } else {
            System.out.println(num2 + "" + num3 + "" + 0);
        }
    }
}
