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
    Node<E> child2;
    Node<E> child3;
    Node<E> child4;
    Node<E> child5;
    Node<E> child6;

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

    public Node<E> getChild2() {
        return child2;
    }

    public void setChild2(Node<E> child2) {
        this.child2 = child2;
    }

    public Node<E> getChild3() {
        return child3;
    }

    public void setChild3(Node<E> child3) {
        this.child3 = child3;
    }

    public Node<E> getChild4() {
        return child4;
    }

    public void setChild4(Node<E> child4) {
        this.child4 = child4;
    }

    public Node<E> getChild5() {
        return child5;
    }

    public void setChild5(Node<E> child5) {
        this.child5 = child5;
    }

    public Node<E> getChild6() {
        return child6;
    }

    public void setChild6(Node<E> child6) {
        this.child6 = child6;
    }

    public Node(Node left, Node right, Node<E> parent, Node<E> child, Node<E> child2, Node<E> child3, Node<E> child4, Node<E> child5, Node<E> child6) {
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.child = child;
        this.child2 = child2;
        this.child3 = child3;
        this.child4 = child4;
        this.child5 = child5;
        this.child6 = child6;
    }
}