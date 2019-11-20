package ru.job4j.PasteSet;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by Comp on 14.10.2017.
 */
public class PasteIt2<E> {
    private Set<Integer> set;

    public PasteIt2(Set<Integer> set) {
        this.set = set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public void add(int value) {
        set.addAll(Arrays.asList(4, 6, 1));
    }

    public void paste(int value) {
        set.addAll(Arrays.asList(4, 6, 1));
    }


}
