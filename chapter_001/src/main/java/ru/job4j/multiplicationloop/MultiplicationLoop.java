package ru.job4j.multiplicationloop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int f = 1;

        for (int i = a; i < b; i++) {
            f *= i;
        }

        return f;
    }
}
