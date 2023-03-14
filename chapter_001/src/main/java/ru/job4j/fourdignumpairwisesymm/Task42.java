package ru.job4j.fourdignumpairwisesymm;

public class Task42 {
    public static void isPairSymmetric(int number) {
        int num1, num2, num3, num4 = 0;

        num1 = number % 10;
        num2 = number % 100/10;
        num3 = number % 1000/100;
        num4 = number /1000 ;

        String first = num1 + "" + num2;
        String last = num3 + "" + num4;

        if (first.equals(last)) {
            System.out.println("Да");
        } else if (!first.equals(last)) {
            System.out.println("Нет");
        }
    }
}
