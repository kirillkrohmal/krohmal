package ru.job4j.largestlastdigtwonum;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int num3 = num1 % 10;
        int num4 = num2 % 10;

        if (num3 > num4) {
            System.out.println(num3);
        } else if (num3 < num4) {
            System.out.println(num4);
        } else {
            System.out.println("Одинаковые");
        }
    }

    public static void main(String[] args) {
        maxLastDigit(24, 657);
    }
}
