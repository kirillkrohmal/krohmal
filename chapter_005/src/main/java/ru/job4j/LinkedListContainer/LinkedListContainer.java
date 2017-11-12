package ru.job4j.LinkedListContainer;


import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Created by Comp on 24.09.2017.
 */

public class LinkedListContainer<E> implements Iterable<E> {
    private Node<E> head;
    private int size = 0;

    public LinkedListContainer() {
        this.size = 0;
    }

    public void add(E value) {
        final Node<E> node = new Node<E>(value);
        if (this.head == null) {
            this.head = node;
        } else if (this.head != null) {
            Node<E> pointer = head;
            while (pointer.getNextElement() != null) {
                pointer = pointer.nextElement;
            }
            pointer.setNextElement(node);
        }
        this.size++;
    }

    public int size () {
        return this.size;
    }

    public E get(int index) {
        if (index < 0) {
            return null;
        }

        Node<E> tmp = head;

        for (int i = 0; i < index; i++) {
            tmp = tmp.getNextElement();
        }

        return tmp.value;
    }

    public void remove (int index) {
        if (index < 0) {
            return;
        }
        Node<E> tmp = head;
        for (int i = 0; i < index; i++) {
            if (head.getNextElement() != null && tmp != null) {
                head.getNextElement();
                tmp = null;
            }
        }
        size--;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrIterator();
    }

    class ArrIterator implements Iterator<E> {
        Node<E> e = head;

        @Override
        public boolean hasNext() {
            if (e != null) {
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            E element = null;
            if (hasNext() == true) {
                element = e.value;
                e = e.nextElement;
            } else throw new NoSuchElementException();
            return element;
        }
    }
}
