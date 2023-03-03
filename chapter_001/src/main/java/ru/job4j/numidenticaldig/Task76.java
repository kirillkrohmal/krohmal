package ru.job4j.numidenticaldig;

public class Task76 {
    public static void sameNumAmount(int num) {
        int num1, num2, num3, counter = 0;

        num1 = num / 100;
        num2 = num / 10 % 10;
        num3 = num % 10;

        if (num1 == num2) {
            counter = counter+2;
        } if (num2 == num3){
            counter = counter+2;
        } if (num1 == num2 && num2 == num3 && num1 == num3){
            counter = counter+3;
        }
        System.out.println(counter);
    }
}
