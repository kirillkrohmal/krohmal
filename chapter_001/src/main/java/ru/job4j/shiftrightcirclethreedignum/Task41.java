package ru.job4j.shiftrightcirclethreedignum;

public class Task41 {
    public static void rightCircleShift(int number) {
        int num1, num2, num3;

        num1 = number % 1000 / 100;
        num2 = number % 100 / 10;
        num3 = number % 10;

        if (num1 != 0 && num2 != 0 && num3 != 0) {
            System.out.println(num3 + "" + num1 + "" + num2);
        } else if (num1 != 0 && num2 != 0 && num3 == 0) {
            System.out.println(num1 + "" + num2);
        } else if (num1 == 1 && num2 == 0 && num3 == 0) {
            System.out.println(num1 + "" + 0);
        } else if (num1 == 1 && num2 == 0 && num3 != 0) {
            System.out.println(num3 + "" + num1 + "" + 0);
        }
    }
}
