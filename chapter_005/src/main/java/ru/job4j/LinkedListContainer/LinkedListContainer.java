package ru.job4j.LinkedListContainer;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Comp on 24.09.2017.
 */
public class LinkedListContainer<E> implements Iterable<E> {

    //public Node<E> item;
    Node<E> next;
    Node<E> prev;
    E item;
    Node head;


    public LinkedListContainer(Node<E> prev, E element, Node<E> next) {
        this.prev = prev;
        this.item = element;
        this.next = next;
    }

    public void add(E value) {
        E node = (E) new Node<E>(value);
        if (this.next == next) {
            this.prev = (Node) node;
            next = prev;

        }
    }

    public E get(int index) {
        return (E) head;
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new LinkedListContainer<E>(prev, item, next);
    }
}
