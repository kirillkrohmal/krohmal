package ru.job4j.ConvertIterator;

import java.util.Iterator;

/**
 * Created by Comp on 21.09.2017.
 */
public class ConvertIterator {
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            Object[] container;
            int value = 0;

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {

                return null;
            }
        };
    }
}
