package ru.job4j.twodignumsamedig;


public class Task36 {
    public static void sameNums(int number) {
        int num1 = number / 10;
        int num2 = number % 10;

        if (num1 == num2) {
            System.out.println("Да");
        } else if (num1 != num2) {
            System.out.println("Нет");
        }
    }
}
