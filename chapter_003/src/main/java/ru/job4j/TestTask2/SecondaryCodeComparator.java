package ru.job4j.TestTask2;

import java.util.Comparator;

/**
 * Created by Comp on 30.08.2017.
 */
public class SecondaryCodeComparator implements Comparator<FirmsCode> {
    @Override
    public int compare(FirmsCode o1, FirmsCode o2) {
        if(o1.secondaryKey.hashCode() > o2.secondaryKey.hashCode()) {
            return 1;
        }
        else if(o1.secondaryKey.hashCode() < o2.secondaryKey.hashCode()) {
            return -1;
        }
        return 0;
    }
}
