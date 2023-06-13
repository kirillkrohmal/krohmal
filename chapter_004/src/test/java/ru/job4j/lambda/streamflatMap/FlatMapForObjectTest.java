package ru.job4j.lambda.streamflatMap;

import org.junit.Test;
import ru.job4j.stream.streamflatMap.FlatMapForObject;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlatMapForObjectTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3, 4),
                FlatMapForObject.flatMap(List.of(
                        List.of(1, 2),
                        List.of(3, 4)
                ))
        );
    }
}