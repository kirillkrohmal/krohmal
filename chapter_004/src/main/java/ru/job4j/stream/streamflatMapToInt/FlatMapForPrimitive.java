package ru.job4j.stream.streamflatMapToInt;

import java.util.Arrays;

public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(array -> Arrays.stream(array))
                .sum();
    }
}
