package ru.job4j.SimpleTree;

import java.util.List;

/**
 * Created by Comp on 08.10.2017.
 */
public class Node<E> {
    List<Node<E>> childen;
    E value;

    public Node(List<Node<E>> childen, E value) {
        this.childen = childen;
        this.value = value;
    }

    public Node(E child) {

    }

    public List<Node<E>> getChilden() {
        return childen;
    }

    public void setChilden(List<Node<E>> childen) {
        this.childen = childen;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}