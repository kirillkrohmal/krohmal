package ru.job4j.SimpleTreeBinary;

import java.util.LinkedList;

/**
 * Created by Comp on 08.10.2017.
 */
public class Node<E> {
    E value;
    LinkedList<Node<E>> childen;
    boolean result;

    public Node(E value, LinkedList<Node<E>> childen, boolean result) {
        this.value = value;
        this.childen = childen;
        this.result = result;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public LinkedList<Node<E>> getChilden() {
        return childen;
    }

    public void setChilden(LinkedList<Node<E>> childen) {
        this.childen = childen;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}