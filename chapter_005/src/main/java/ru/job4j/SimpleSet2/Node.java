package ru.job4j.SimpleSet2;

/**
 * Created by Comp on 29.09.2017.
 */
public class Node<E> {
    Node<E> nextElement;
    E value;

    public Node(Node<E> nextElement, E value) {
        this.nextElement = nextElement;
        this.value = value;
    }

    public Node<E> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }

    public Node(E value) {
        this(null, value);
    }
}
