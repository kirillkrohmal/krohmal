package ru.job4j.testcollectiont;

import java.util.function.Predicate;


public class PredicateCheckPositive {

    public static boolean verification(int num) {
        return check(i -> (i > 0), num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
