package ru.job4j.testcollectiont;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToAnyMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        Map<Integer, Integer> map = List.of(1, 2, 1).stream().collect(Collectors.toMap(k -> k, v -> v, (prev, curr) -> prev, LinkedHashMap::new));

        return map;
    }
}
