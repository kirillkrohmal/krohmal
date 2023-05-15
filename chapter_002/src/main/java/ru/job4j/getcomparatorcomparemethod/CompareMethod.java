package ru.job4j.getcomparatorcomparemethod;

import java.util.Comparator;

public class CompareMethod {

    public static Comparator<Integer> comp;

    public static int ascendingCompare(int first, int second) {
        return comp.compare(first, second);
    }

    public static int descendingCompare(int first, int second) {
        return comp.compare(second, first);
    }
}
