package ru.job4j.ConvertIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 21.09.2017.
 */
public class ConvertIterator {
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {

            Iterator<Iterator<Integer>> iterator = it;
            Iterator<Iterator<Integer>> iterator2 = iterator;

            @Override
            public boolean hasNext() {
                boolean isPresent = false;
                if (iterator2.next() == null && iterator.hasNext()) {
                    isPresent = true;
                }
                return isPresent;
            }

            @Override
            public Integer next() {
                if (hasNext() == true) {
                    iterator.hasNext();
                } else throw new NoSuchElementException();

                return null;
            }
        };
    }
}

/*
* selectIterator(), в котором бы осуществлялся выбор следующего итератора по условию.
* У тебя метод next должен возвращать значения из тех итераторов, которые ему были переданы.
* Если в первом итераторе больше нет чисел, то переключиться на второй и возвращать его числа и т.д.
* пока не закончатся итераторы. Метод hasNext должен проверять есть ли у текущего итератора следующий элемент,
* если есть возвращать true, если нет, то проверить есть ли следующий итератор и переключиться на него и проверять
* есть ли числа у него и т.д., если чисел больше нет или итераторов больше нет, то возвратить false.
* Текущая реализация полностью не верная, более того она падает с NPE.
*/


