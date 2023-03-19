package ru.job4j.shiftrightcirclefourdignum;

public class Task42 {
    public static void rightCircleShift(int number) {
        int num1, num2, num3, num4 = 0;

        num4 = number % 10;
        num3 = number % 100/10;
        num2 = number % 1000/100;
        num1 = number / 1000 ;

        if (num2 != 0 && num3 != 0 && num1 != 0 && num4 != 0) {
            System.out.println(num4 + "" + num1 + "" + num2 + "" + num3);
        } else if (num1 != 0 && num2 != 0 && num3 == 0 && num4 == 0) {
            System.out.println(num1 + "" + num2 + "" + 0);
        } else if (num1 == 1 && num2 == 0 && num3 == 0 && num4 == 0) {
            System.out.println(num1 + "" + 0 + "" + 0 );
        } else if (num1 == 1 && num2 == 0 && num3 != 0 && num4 == 0) {
            System.out.println(num1 +  "" + 0 + "" + num3);
        } else if (num1 == 1 && num2 == 0 && num3 == 0 && num4 != 0) {
            System.out.println(num4 + "" + num1 + "" + 0 + "" + 0);
        }
    }
}
