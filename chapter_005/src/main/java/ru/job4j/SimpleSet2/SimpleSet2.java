package ru.job4j.SimpleSet2;

import ru.job4j.LinkedListContainer.LinkedListContainer;
import java.util.Iterator;

/**
 * Created by Comp on 25.09.2017.
 */
public class SimpleSet2<E> implements Iterator<E> {
    private LinkedListContainer<E> list;
    private int size;
    private Iterator<E> inIterator;

    public SimpleSet2() {
    }

    public SimpleSet2(LinkedListContainer<E> list, int size, Iterator<E> inIterator) {
        this.list = list;
        this.size = size;
        this.inIterator = inIterator;
    }

    public LinkedListContainer<E> getList() {
        return list;
    }

    public void setList(LinkedListContainer<E> list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Iterator<E> getInIterator() {
        return inIterator;
    }

    public void setInIterator(Iterator<E> inIterator) {
        this.inIterator = inIterator;
    }

    /*
     * Реализовать коллекцию SimpleSet.
     * Коллекция должна обеспечивать void add(E e) и реализовывать Iterator<E>.
     * Коллекция не должна хранить дубликаты.
     * Set - внутри для хранения данных использует связный список.
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
