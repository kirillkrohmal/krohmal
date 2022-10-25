package ru.job4j.poweroftwo;

public class PowerOfTwo {
    public static boolean mathoftwo(int one) {
        return Integer.bitCount(Math.abs(one)) == 1;
    }

    public static void main(String[] args) {
        System.out.println(mathoftwo(0));
        System.out.println(mathoftwo(1));
        System.out.println(mathoftwo(3));
    }
}
