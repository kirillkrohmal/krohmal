package ru.job4j.LinkedListContainer;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Comp on 24.09.2017.
 */
public class LinkedListContainer<E> implements Iterable<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    public LinkedListContainer() {
        this.head = null;
        this.size = 0;
    }

  /*  public void add(E value) {
        *//*prev = lastNode;
        prev.setCurrentElement(value);
        lastNode = new Node<E>(null, prev, null);
        prev.setNextElement(lastNode);
        this.size++;*//*
        E node = (E) new Node<E>(value);
        if (this.next != null && this.head != null) {
            this.head = (Node) node;
            next = prev;
        } else {
            this.prev = (Node<E>) node;
        }
        this.size++;
    }
    *//*
     * для реализации метода get - можете например в цикле for отсчитывать количество
     * пройденных элементов и когда он станет равен переданному параметру возвратить указанный узел.
     *//*
    public E get(int index) {
        for (int i = 0; i < index; i++) {
            if (prev.equals(index)) {
                return (E) prev;
            }
        }
        return (E) head;
    }*/

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new LinkedListContainer<E>();
    }
}
