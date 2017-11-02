package ru.job4j.DynamicListThread.LinkedListContainer;


import net.jcip.annotations.ThreadSafe;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Created by Comp on 24.09.2017.
 */
@ThreadSafe
public class LinkedListContainer<E> implements Runnable {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;
    private Node node;

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
            //tail.getNextElement();
        }
        this.size++;
    }

    private Node<E> node(int index) {
        Node<E> tmp = head;

        if (index < size / 2) {
            for (int i = 0; i < index; i++) {
                tmp = tmp.getNextElement();
            }
        }
        return tmp;
    }

    public E get(int index) {
        if (index < 0) {
            return null;
        }

        Node<E> tmp = head;

        if (index < size / 2) {
            for (int i = 0; i < index; i++) {
                tmp = tmp.getNextElement();
            }
        }
        return (E) tmp;
    }

    @Override
    public void run() {

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
