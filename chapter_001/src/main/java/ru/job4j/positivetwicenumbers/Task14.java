package ru.job4j.positivetwicenumbers;

import java.util.StringJoiner;

public class Task14 {
    public static void loop(int a, int b) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (a > 0) {
                    stringJoiner.add("" + i + "" + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        loop(-3, 4);

    }
}

