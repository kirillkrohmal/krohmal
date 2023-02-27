package ru.job4j.permutationfirstalast;

public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;

        String s = String.valueOf(number);
        int num = 0;

        num1 = Integer.parseInt(s.substring(s.length() - 1, 1));
        num2 = Integer.parseInt(s.substring(1, s.length() - 2));
        num3 = Integer.parseInt(s.substring(0, 1));
        if (s.length() > 1) {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);

        }


    }

    public static void main(String[] args) {
        firstLastChange(451);
    }
}

