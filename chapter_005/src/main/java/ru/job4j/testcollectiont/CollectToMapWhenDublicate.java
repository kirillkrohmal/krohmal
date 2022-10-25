package ru.job4j.testcollectiont;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMapWhenDublicate {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        Map<Integer, Integer> map = List.of(1, 2, 1).stream().collect(Collectors.toMap(k -> k, v -> v, (prev, curr) -> prev, TreeMap::new));
        return map;
    }
}
