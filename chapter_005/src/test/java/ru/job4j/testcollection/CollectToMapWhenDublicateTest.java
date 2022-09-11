package ru.job4j.testcollection;

import org.junit.Test;
import testcollection.CollectToMapWhenDublicate;

import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class CollectToMapWhenDublicateTest {
    @Test
    public void test() {
        List<Integer> data = List.of(2, 3, 3);
        Map<Integer, Integer> expect = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> result = CollectToMapWhenDublicate.collect(data.stream());
        assertEquals(expect, result);
    }
}
