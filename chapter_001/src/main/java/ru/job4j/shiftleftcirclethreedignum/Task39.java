package ru.job4j.shiftleftcirclethreedignum;

public class Task39 {
    public static void leftCircleShift(int number) {
        int num1, num2, num3;

        num1 = number % 1000/100;
        num2 = number % 100/10;
        num3 = number % 10;

        if (num1 != 0 && num2 != 0) {
            System.out.println(num2 + "" + num3 + "" + num1);
        } else if (num2 == 0 && num3 == 0){
            System.out.println(num1);
        } else if (num2 == 0) {
            System.out.println(num3 + "" + num1);
        }
    }
}
