package ru.job4j.SearchTree;


/**
 * Created by Comp on 29.09.2017.
 */
public class Node<E> {
    Node<E> parent;
    Node<E> left;
    Node<E> right;

    E value;

    public Node(Node<E> parent, E value) {
        this.value = value;
        this.parent = parent;
    }

    public Node(Node<E> parent, Node<E> left, Node<E> right) {
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public Node<E> getNextElement() {
        return parent;
    }

    public void setNextElement(Node<E> parent) {
        this.parent = parent;
    }

    public Node(E value) {
        this(null, value);
    }

    public Node<E> getParent() {
        return parent;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
