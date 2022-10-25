package ru.job4j.testcollectiont;

public class Task4 {
    public static int factorial (int f) {
        int result = 1;

        for (int i = 0; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
