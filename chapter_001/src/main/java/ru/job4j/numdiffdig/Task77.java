package ru.job4j.numdiffdig;

public class Task77 {
    public static void diffNumAmount(int num) {
        int num1, num2, num3, counter = 0;

        num1 = num / 100;
        num2 = num / 10 % 10;
        num3 = num % 10;

        if (num1 != num2 && num2 != num3 && num1 != num3){
            counter = counter+3;
        } else if (num1 != num2) {
            counter = counter+2;
        } else if (num2 != num3){
            counter = counter+2;
        }
        System.out.println(counter);
    }
}
