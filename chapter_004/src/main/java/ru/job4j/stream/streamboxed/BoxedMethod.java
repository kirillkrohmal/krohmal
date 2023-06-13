package ru.job4j.stream.streamboxed;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoxedMethod {
    public static List<Integer> boxed(int[] data) {
        List<Integer> nums = Arrays.stream(data).boxed().collect(Collectors.toList());

        return nums;
    }
}
