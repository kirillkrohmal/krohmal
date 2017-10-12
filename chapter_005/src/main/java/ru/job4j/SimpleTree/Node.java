package ru.job4j.SimpleTree;

import java.util.List;

/**
 * Created by Comp on 08.10.2017.
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

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        if (nextElement != null ? !nextElement.equals(node.nextElement) : node.nextElement != null) return false;
        return value != null ? value.equals(node.value) : node.value == null;
    }

    @Override
    public int hashCode() {
        int result = nextElement != null ? nextElement.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}