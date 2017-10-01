package ru.job4j.LinkedListContainer;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Comp on 24.09.2017.
 */
public class LinkedListContainer<E> implements Iterable<E> {
    Node<E> next;
    Node<E> prev;
    E item;
    Node head;
    int size;

    public LinkedListContainer(E element) {
        this.item = element;
        this.next = null;
    }

    public LinkedListContainer() {
        this.head = null;
        this.prev = null;
        this.size = 0;
    }

    public void add(E value) {
        E node = (E) new Node<E>(value);
        if (this.next != null && this.head != null) {
            this.head = (Node) node;
            next = prev;
        } else {
            this.prev = (Node<E>) node;
        }
        this.size++;
    }

    public E get(int index) {
        if (prev.equals(index)) {
            return (E) prev;
        } else if (next.equals(index)) {
            return (E) next;
        }
        return (E) head;
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new LinkedListContainer<E>();
    }
}
