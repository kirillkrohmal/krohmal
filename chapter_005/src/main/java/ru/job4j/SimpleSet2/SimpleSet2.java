package ru.job4j.SimpleSet2;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleSet2<?> that = (SimpleSet2<?>) o;

        if (size != that.size) return false;
        if (list != null ? !list.equals(that.list) : that.list != null) return false;
        if (iterator != null ? !iterator.equals(that.iterator) : that.iterator != null) return false;
        return simpleSet != null ? simpleSet.equals(that.simpleSet) : that.simpleSet == null;
    }

    @Override
    public int hashCode() {
        int result = list != null ? list.hashCode() : 0;
        result = 31 * result + (iterator != null ? iterator.hashCode() : 0);
        result = 31 * result + (simpleSet != null ? simpleSet.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }
}
