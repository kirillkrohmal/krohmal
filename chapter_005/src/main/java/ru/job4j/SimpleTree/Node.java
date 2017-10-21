package ru.job4j.SimpleTree;

import java.util.List;

/**
 * Created by Comp on 08.10.2017.
 */
public class Node<E> {

    Node left;
    Node right;
    Node<E> parent;
    Node<E> child;
    List<Node<E>> childen;

    public Node(Node<E> child) {
        this.child = child;
    }

    void addChildren () {
        Node<E> node = new Node<>(child);
        childen.add(node);
    }

    public Node(Node left, Node right, Node<E> parent, Node<E> child) {
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.child = child;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node<E> getParent() {
        return parent;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public Node<E> getChild() {
        return child;
    }

    public void setChild(Node<E> child) {
        this.child = child;
    }
}