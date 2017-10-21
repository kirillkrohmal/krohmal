package ru.job4j.LinkedListContainer;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 24.09.2017.
 */
public class LinkedListContainer<E> implements Iterable<E> {
    Node<E> head;
    Node<E> tail;
    int size = 0;
    Node node;

    public LinkedListContainer() {
        this.head = null;
        this.size = 0;
    }

    public void add(E value) {
        final Node<E> node = new Node<E>(value);
        if (this.head == null) {
            this.head = node;
            node.nextElement = null;
        } else if (this.head != null) {
            Node<E> pointer = head;
            while (pointer.getNextElement() != null) {
                pointer = pointer.nextElement;
            }
            pointer.setNextElement(node);
            //tail.getNextElement();
        }
        this.size++;
    }

    /*
     * для реализации метода get - можете например в цикле for отсчитывать количество
     * пройденных элементов и когда он станет равен переданному параметру возвратить указанный узел.
    */
    public E get(int index) {
        E node = null;

        for (int i = 0; i < size; i++) {
            node.equals(index);
            if (index >= 0 && index < size) {
                node = (E) head.nextElement;
            }
        }
        return node;
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

    @Override
    public Iterator<E> iterator() {
        return new ArrIterator();
    }
}
