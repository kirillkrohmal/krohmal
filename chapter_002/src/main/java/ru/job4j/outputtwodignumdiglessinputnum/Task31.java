package ru.job4j.outputtwodignumdiglessinputnum;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        int count2 = 1;

        int num1 = count % 10;
        for (int i = 10; i <= 20; i++) {

            if (count > 9) {
                count2++;
            }

            if (count2 * count < num) {
                if (count > 9) {
                    num1++;
                } sj.add("" + i);

            }
            count++;

        }

        System.out.println(sj);
    }
}
