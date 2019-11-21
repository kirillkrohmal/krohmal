package ru.job4j.testtask2.comparators;

import ru.job4j.testtask2.FirmsCode;

import java.util.Comparator;

/**
 * Created by Comp on 30.08.2017.
 */
public class PrimaryCodeComparator implements Comparator<FirmsCode> {
    @Override
    public int compare(FirmsCode o1, FirmsCode o2) {
        if (o1.primaryKey.hashCode() > o2.primaryKey.hashCode()) {
            return 1;
        } else if (o1.primaryKey.hashCode() < o2.primaryKey.hashCode()) {
            return -1;
        }
        return 0;
    }
}
