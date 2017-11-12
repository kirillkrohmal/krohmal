package ru.job4j.SimpleSet2;

import ru.job4j.LinkedListContainer.LinkedListContainer;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Created by Comp on 25.09.2017.
 */
public class SimpleSet2<E> implements Iterator<E> {
    Set<E> value = new LinkedHashSet<>();
    Node<E> head;
    Node<E> tail;
    int size = 0;
    Node<E> e = head;
    LinkedListContainer list;

    /*
     * Реализовать коллекцию SimpleSet.
     * Коллекция должна обеспечивать void add(E e) и реализовывать CrudServlet<E>.
     * Коллекция не должна хранить дубликаты.
     * Set - внутри для хранения данных использует связный список.
     */
    public void add(E e) {
        if (!isDuplicate()) {
            list.add(e);
        }
    }

    @Override
    public boolean hasNext() {
        if (e != null) {
            return true;
        }
        return false;
    }

    public boolean isDuplicate () {

        return false;
    }

    @Override
    public E next() {
        E element;
        if (hasNext() == true) {
            element = e.value;
            e = e.getNextElement();
        } else throw new NoSuchElementException();

        return element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleSet2<?> that = (SimpleSet2<?>) o;

        if (size != that.size) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (head != null ? !head.equals(that.head) : that.head != null) return false;
        return tail != null ? tail.equals(that.tail) : that.tail == null;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (head != null ? head.hashCode() : 0);
        result = 31 * result + (tail != null ? tail.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }
}
