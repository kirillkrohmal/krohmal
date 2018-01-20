package ru.job4j.SimpleTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Comp on 08.10.2017.
 */
public class Node<E> {
    public E value;
    public List<Node<E>> childen = new ArrayList<>();
    public boolean result;

    public Node(E value, LinkedList<Node<E>>childen, boolean result) {
        this.value = value;
        this.childen = childen;
        this.result = result;
    }

    public Node(E value) {
        this.value = value;
    }

    public E getValue() {
        return this.value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public List<Node<E>> getChilden() {
        return childen;
    }

    public void setChilden(List<Node<E>> childen) {
        this.childen = childen;
    }

    public void setChilden(LinkedList<Node<E>> childen) {
        this.childen = childen;
    }

    public boolean isResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

	public boolean eqValue(E that) {
        return this.value.equals(that);
    }

   }