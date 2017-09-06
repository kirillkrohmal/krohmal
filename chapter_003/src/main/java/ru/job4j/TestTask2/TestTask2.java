package ru.job4j.TestTask2;

import java.util.*;

/**
 * Created by Comp on 30.08.2017.
 */
public class TestTask2 {
    public List<FirmsCode> codeArray() {
        List<FirmsCode> codes = new ArrayList<FirmsCode>();
        codes.add(new FirmsCode("K1", "K1\\SK1", "K1\\SK1\\SSK1"));
        codes.add(new FirmsCode("K2", "K2\\SK1", "K2\\SK1\\SSK2"));
        codes.add(new FirmsCode("K3", "K3\\SK1", "K3\\SK1\\SSK2"));

        codes.sort(new SolutionCodeComparator());
        codes.forEach(System.out::println);

        return codes;
    }

    public List<FirmsCode> codeArray2() {
        List<FirmsCode> codes = new ArrayList<FirmsCode>();
        codes.add(new FirmsCode("K1", "K1\\SK1", "K1\\SK1\\SSK1"));
        codes.add(new FirmsCode("K2", "K2\\SK1", "K2\\SK1\\SSK2"));
        codes.add(new FirmsCode("K3", "K3\\SK1", "K3\\SK1\\SSK2"));

        codes.sort(new PrimaryCodeComparator());
        codes.forEach(System.out::println);

        return codes;
    }
}

