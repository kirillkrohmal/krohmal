package ru.job4j.testcollectiont;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
    public static String join(List<String> strings) {
        return List.of(strings.toString()).stream().collect(Collectors.joining(System.lineSeparator(), "[", "]"));
    }
}

