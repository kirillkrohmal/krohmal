package testcollection;

import java.util.Arrays;

public class FlatMapForPrimitive {
    public void sum(int[][] matrix) {
        Arrays.stream(new int[][]{{1, 2, 3}, {4, 5}})
                .flatMapToInt(subArray -> Arrays.stream(subArray))
                .forEach(el -> System.out.println(el));
    }
}


