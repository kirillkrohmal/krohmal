package ru.job4j.DynamicList;

import java.util.Iterator;

/**
 * Created by Comp on 03.10.2017.
 */
public class DynamicList<E> implements Iterable {
    E[] container = (E[]) new Object[1000];
    int size = 0;

    /*
     * код не верный:
     * 1) где инициализация поля container?
     * 2) почему в методе add нет проверки выхода за границы массива и обработки этой ситуации?
     * 3) в методе get не проверяется индекс
     * 4) реализация итератора не верна, почему вы массив приводит к типу Iterator?
     */
    public void add(E value) {
        if (size < container.length) {
            container[size++] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public E get(int index) {
        if (container.length == index) {
            return container[index];
        }
        return container[index];
    }

    class ArrayIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
    @Override
    public Iterator<E> iterator() {

        return new ArrayIterator();
    }
}
