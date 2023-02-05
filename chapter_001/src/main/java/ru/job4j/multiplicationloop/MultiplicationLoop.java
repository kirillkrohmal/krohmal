package ru.job4j.multiplicationloop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int f = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i < j) {
                    f = a * b;
                }
            }
        }
        return f;
    }
}
