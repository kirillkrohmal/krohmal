package ru.job4j.LinkedListContainer;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Comp on 24.09.2017.
 */
public class LinkedListContainer<E> implements Iterable<E> {
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

    /*
     * для реализации метода get - можете например в цикле for отсчитывать количество
     * пройденных элементов и когда он станет равен переданному параметру возвратить указанный узел.
     * Метод get реализован не верно. Нужно проходить по узлам, сейчас же просты ты получаешь следующий
     * элемент head'а и все. Вот это приведение типов тоже не верно E object = (E) pointer;
     *
     * Нужно проходить по узлам, сейчас же просты ты получаешь следующий элемент head'а и все.
     * Вот это приведение типов тоже не верно E object = (E) pointer;
    */
    public E get(int index) {
        if (index < 0) {
            return null;
        }
        Node<E> pointer = head;

        for (int i = 0; i < size; i++) {
            if (head.value.equals(index)) {
                pointer = (Node<E>) head.value;
            } else {
                pointer = pointer.nextElement;

            }
            head = pointer;
        }

        return head.value;
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
