package ru.job4j.stream.streamfilterstr;

import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(n -> n.startsWith("A") && n.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
