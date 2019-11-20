package ru.job4j.ConvertIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 21.09.2017.
 */
public class ConvertIterator {
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            private Iterator<Integer> iterator = it.next();

            void moveIterator() {
                if (iterator != null && it.hasNext()) {
                    iterator = it.next();
                }
            }

            @Override
            public boolean hasNext() {
                boolean isPresent = false;
                if (it != null) {
                    if (iterator != null && iterator.hasNext()) {
                        isPresent = true;
                    } else {
                        this.moveIterator();
                        if (iterator != null && iterator.hasNext()) {
                            isPresent = true;
                        }
                    }
                }
                return isPresent;
            }

            @Override
            public Integer next() {
                Integer elem;
                if (it != null && iterator.hasNext()) {
                    elem = iterator.next();
                } else throw new NoSuchElementException();

                return elem;
            }
        };
    }
}
