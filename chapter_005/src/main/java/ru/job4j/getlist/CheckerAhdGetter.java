package ru.job4j.getlist;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        if (list.isEmpty()) {
            return new String("");
        } else {
            return list.get(0);
        }
    }
}
