package ru.job4j.TestTask2;

import java.util.Comparator;

/**
 * Created by Comp on 30.08.2017.
 */
public class SolutionCodeComparator implements Comparator<FirmsCode> {

    PrimaryCodeComparator primaryCodeComparator = new PrimaryCodeComparator();
    SecondaryCodeComparator secondaryCodeComparator = new SecondaryCodeComparator();
    private int result;

    @Override
    public int compare(FirmsCode o1, FirmsCode o2) {
        int compare = primaryCodeComparator.compare(o1, o2);

        return compare != 0 ? compare : compare2(o1, o2);
        //int compare = o1.code.equals(o2.code);
        //return compare != 0 ? compare : Integer.compare(o1.code, o2.code);
    }

    private int compare2(FirmsCode o1, FirmsCode o2) {
        secondaryCodeComparator.compare(o1, o2);
        return result;
    }
}
