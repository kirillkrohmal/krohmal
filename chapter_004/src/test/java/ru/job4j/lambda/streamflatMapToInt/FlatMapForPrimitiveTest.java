package ru.job4j.lambda.streamflatMapToInt;

import org.junit.Test;
import ru.job4j.stream.streamflatMapToInt.FlatMapForPrimitive;

import static org.junit.Assert.assertEquals;

public class FlatMapForPrimitiveTest {
    @Test
    public void test() {
        assertEquals(
                15,
                FlatMapForPrimitive.sum(new int[][] {
                        {1, 2, 3},
                        {4, 5}
                })
        );
    }
}