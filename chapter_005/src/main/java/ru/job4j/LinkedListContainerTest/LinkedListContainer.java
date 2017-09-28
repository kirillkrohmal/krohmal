package ru.job4j.LinkedListContainerTest;

import ru.job4j.Node.Node;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Comp on 24.09.2017.
 */
public class LinkedListContainer<E> implements Iterable<E> {

    //E[] item;
    Node<E> prev;
    Node<E> value;
    Node<E> next;
    LinkedList linkedList;

    public LinkedListContainer(Node<E> prev, Node<E> value, Node<E> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    public LinkedListContainer(E[] item) {
    }

    public void add(E value) {
        value = (E) prev;
        value = (E) next;
    }

    public E get(int index) {
        return (E) value;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
