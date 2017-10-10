package ru.job4j.SimpleTree;

import java.util.List;

/**
 * Created by Comp on 08.10.2017.
 */
public class Node<E> {
    List<Node<E>> childen;
    List<Node<E>> parent;

    E value;

    public Node(List<Node<E>> childen, List<Node<E>> parent, E value) {
        this.childen = childen;
        this.parent = parent;
        this.value = value;
    }

    public List<Node<E>> getChilden() {
        return childen;
    }

    public void setChilden(List<Node<E>> childen) {
        this.childen = childen;
    }

    public List<Node<E>> getParent() {
        return parent;
    }

    public void setParent(List<Node<E>> parent) {
        this.parent = parent;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}