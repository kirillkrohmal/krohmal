package ru.job4j.SimpleSet2;

import ru.job4j.LinkedListContainer.LinkedListContainer;
import ru.job4j.SimpleSet.SimpleSet;

import java.util.*;

/**
 * Created by Comp on 25.09.2017.
 */
public class SimpleSet2<E> implements Iterator<E> {
    LinkedList<E> list;
    Iterator<E> iterator;
    SimpleSet simpleSet;
    int size = 0;

    /*
     * Реализовать коллекцию SimpleSet.
     * Коллекция должна обеспечивать void add(E e) и реализовывать Iterator<E>.
     * Коллекция не должна хранить дубликаты.
     * Set - внутри для хранения данных использует связный список.
     */
    public void add(E e) {
        if (!simpleSet.isDuplicate()) {
            list.add(e);
        }
    }

    @Override
    public boolean hasNext() {
        if (iterator.hasNext()) {
            return true;
        }
        return false;
    }


    @Override
    public E next() {
        E element;
        if (hasNext()) {
            element = iterator.next();
        } else throw new NoSuchElementException();

        return element;
    }
}
