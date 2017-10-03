package ru.job4j.LinkedListContainer;

/**
 * Created by Comp on 29.09.2017.
 */
public class Node<E> {

    Node<E> nextElement;
    Node<E> prevElement;
    E currentElement;

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

    public E getCurrentElement(E value) {
        return currentElement;
    }

    public void setCurrentElement(E currentElement) {
        this.currentElement = currentElement;
    }

    public Node(E value) {

    }

    public Node(Node<E> nextElement, Node<E> prevElement, E currentElement) {
        this.nextElement = nextElement;
        this.prevElement = prevElement;
        this.currentElement = currentElement;
    }
}
