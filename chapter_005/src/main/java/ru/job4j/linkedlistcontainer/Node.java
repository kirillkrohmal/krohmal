package ru.job4j.linkedlistcontainer;

/**
 * Created by Comp on 29.09.2017.
 */
public class Node<E> {
    Node<E> nextElement;
    E value;

    public Node(Node<E> nextElement, E value) {
        this.value = value;
        this.nextElement = nextElement;
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
