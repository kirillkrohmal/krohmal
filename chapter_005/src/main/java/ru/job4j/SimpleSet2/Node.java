package ru.job4j.SimpleSet2;

/**
 * Created by Comp on 29.09.2017.
 */
public class Node<E> {
    Node<E> nextElement;
    Node<E> prevElement;
    E value;

    public Node(Node<E> nextElement, Node<E> prevElement) {
        this.nextElement = nextElement;
        this.prevElement = prevElement;
    }

    public Node<E> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }

    public Node<E> getPrevElement() {
        return prevElement;
    }

    public void setPrevElement(Node<E> prevElement) {
        this.prevElement = prevElement;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node(E value) {
        this.value = value;
    }
}
