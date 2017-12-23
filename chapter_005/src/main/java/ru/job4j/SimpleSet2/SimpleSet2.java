package ru.job4j.SimpleSet2;

import ru.job4j.LinkedListContainer.LinkedListContainer;

import java.util.Iterator;

/**
 * Created by Comp on 25.09.2017.
 */
public class SimpleSet2<E> implements Iterator<E> {
    private LinkedListContainer<E> list = new LinkedListContainer<>();
    private int size = 0;
    private int counter = 0;
    private Iterator<E> inIterator;

    /*
     * Реализовать коллекцию SimpleSet.
     * Коллекция должна обеспечивать void add(E e) и реализовывать Iterator<E>.
     * Коллекция не должна хранить дубликаты.
     * Set - внутри для хранения данных использует связный список.
     *
     */
    public void add(E e) {
        if (!isDuplicate(e)) {
            list.add(e);
            size++;
        }
        this.inIterator = this.list.iterator();
    }

    private boolean isDuplicate(E e) {
        boolean duplicate = false;
        for (int i = 0; i < size; i++) {
            if (list.get(i).equals(e)) {
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }

    @Override
    public boolean hasNext() {
        return inIterator.hasNext();
    }

    @Override
    public E next() {
        return inIterator.next();
    }
}
