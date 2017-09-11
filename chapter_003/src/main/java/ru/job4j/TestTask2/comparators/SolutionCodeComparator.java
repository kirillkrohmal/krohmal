package ru.job4j.TestTask2.comparators;

import ru.job4j.TestTask2.FirmsCode;

import java.util.Comparator;

/**
 * Created by Comp on 30.08.2017.
 */
public class SolutionCodeComparator implements Comparator<FirmsCode> {
    @Override
    public int compare(FirmsCode o1, FirmsCode o2) {
        return -(o1.getCompleteName().compareTo(o2.getCompleteName()));
    }
}
