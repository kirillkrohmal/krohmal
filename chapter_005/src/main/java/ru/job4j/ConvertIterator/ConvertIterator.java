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
                Object temp = it.hasNext();
                while (!temp.equals(0)) {
                    return true;
                }
                if (selectIterator().equals(it)) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Integer next() {
                if (hasNext() == true) {
                    value++;
                }
                return (Integer) container[value];
            }
            /*
             * selectIterator(), в котором бы осуществлялся выбор следующего итератора по условию.
             */
            public Iterator<Iterator<Integer>> selectIterator() {
                while (it.hasNext()) {
                    if (it.equals(it.next())) {

                    } else {

                    }
                }


                return (Iterator<Iterator<Integer>>) container[value];
            }
        };
    }
}
