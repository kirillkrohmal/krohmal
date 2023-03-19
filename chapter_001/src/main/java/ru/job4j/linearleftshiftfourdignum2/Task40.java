package ru.job4j.linearleftshiftfourdignum2;

public class Task40 {
    public static void leftCircleShift(int number) {
        int num1, num2, num3, num4 = 0;

        num4 = number % 10;
        num3 = number % 100/10;
        num2 = number % 1000/100;
        num1 = number / 1000 ;

        if (num2 != 0 && num3 != 0 && num1 != 0 && num4 != 0) {
            System.out.println(num2 + "" + num3 + "" + num4 + "" + num1);
        } else if (num2 != 0 && num1 != 0) {
            System.out.println(num2 + "" + num3 + "" + num4 + "" + num1);
        } else if (num1 == 1 && num2 == 0 && num3 == 0 && num4 == 6) {
            System.out.println(num4 + "" + num1);
        } else if (num1 == 1 && num2 == 0 && num3 == 6 && num4 == 0) {
            System.out.println(num3 +  "" + 0 + "" + num1);
        } else if (num1 == 1) {
            System.out.println(num1);
        } else if (num3 == 0) {
            System.out.println(num2 + "" + 0 + "" + 0 + "" + 0);
        }
    }
}
