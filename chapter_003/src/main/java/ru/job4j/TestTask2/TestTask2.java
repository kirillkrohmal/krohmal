package ru.job4j.TestTask2;

import java.util.*;

/**
 * Created by Comp on 30.08.2017.
 */
public class TestTask2 {
    public Map<String, Integer> codeArray(FirmsCode code) {
        //FirmsCode firmsCode = new FirmsCode();
        FirmsContainer<FirmsCode> codes = new FirmsContainer<>(new FirmsCode("K1", "SK1", "SSK1"));
        ListIterator<FirmsCode> litr = codes.listIterator();

        while (litr.hasNext()) {
            System.out.println(litr.next().getCompleteName());
        }

        return null;
    }
}
