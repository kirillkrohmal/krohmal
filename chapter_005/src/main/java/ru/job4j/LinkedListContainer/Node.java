package ru.job4j.LinkedListContainer;

/**
 * Created by Comp on 29.09.2017.
 */
public class Node<E> {

    Node<E> nextElement;
    E value;

    public Node<E> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }


    public Node(E value) {

    }

    public Node(Node<E> nextElement, Node<E> prevElement, E currentElement) {
        this.nextElement = nextElement;
    }
}
