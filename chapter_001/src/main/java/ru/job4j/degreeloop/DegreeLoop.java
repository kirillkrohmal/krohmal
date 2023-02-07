package ru.job4j.degreeloop;

public class DegreeLoop {
    public static int calculate(int a, int n) {

        int i;

        for (i = 0; i < a; i++) {
            i = (int) Math.pow(a, n);
            break;
        }
        return i;
    }
}
