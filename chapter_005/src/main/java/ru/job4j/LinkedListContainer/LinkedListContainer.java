package ru.job4j.LinkedListContainer;

import java.util.Iterator;

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
            //this.tail = new Node<E>(value);
            //node.nextElement = null;
        } else if (this.head != null) {
            while (node.nextElement != null) {
                this.head = node.getNextElement();
            }
        }
        this.size++;
    }

    /*
     * для реализации метода get - можете например в цикле for отсчитывать количество
     * пройденных элементов и когда он станет равен переданному параметру возвратить указанный узел.
    */
    public E get(int index) {
        if (index > 0 && index < size) {
            return (E) node.value;
        }

        return (E) node;
    }

    class ArrIterator implements Iterator<E> {
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
        return new ArrIterator();
    }
}
