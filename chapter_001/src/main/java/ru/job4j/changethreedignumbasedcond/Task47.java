package ru.job4j.changethreedignumbasedcond;

public class Task47 {
    public static void changeNum(int number) {
        int num1, num2, num3;

        num1 = number % 1000/100;
        num2 = number % 100/10;
        num3 = number % 10;

        if (number > 500) {
            if (num3 == 0 && num2 == 0) {
                System.out.println(num1);
            } else if (num3 == 0) {
                System.out.println(num2 + "" + num1);
            } else {
                System.out.println(num3 + "" + num2 + "" + num1);
            }
        } else {
            System.out.println(num1 + "" + num3 + "" + num2);
        }
    }
}
