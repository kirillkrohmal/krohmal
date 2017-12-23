package ru.job4j.Stack;

/**
 * Created by Comp on 29.09.2017.
 */
public class Node<E> {
    private Node<E> nextElement;
    E value;

    public Node(Node<E> nextElement, E value) {
        this.nextElement = nextElement;
        this.value = value;
    }

    Node<E> getNextElement() {
        return nextElement;
    }

    void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }

    public Node(E value) {
        this(null, value);
    }
}
