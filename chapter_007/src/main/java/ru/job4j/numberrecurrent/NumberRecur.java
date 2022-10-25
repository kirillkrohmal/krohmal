package ru.job4j.numberrecurrent;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class NumberRecur {

    public static void recurs(int t) {
        IntStream.iterate(t, g-> (int)Math.abs(g + 1)).limit(20).forEach(g-> System.out.println(g));


    }

    public static void main(String[] args) {
        recurs(5);
    }
}
