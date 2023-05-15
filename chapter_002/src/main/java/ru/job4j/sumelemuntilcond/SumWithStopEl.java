package ru.job4j.sumelemuntilcond;

import java.util.StringJoiner;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {

                if (sum < el) {
                    sum = data[i] + data[i + 1];
                } else if (sum < el && sum % 2 == 0) {
                    sum = 0;
                }
            }

        return sum;
    }
}


