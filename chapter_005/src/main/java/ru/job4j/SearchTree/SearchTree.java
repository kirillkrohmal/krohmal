package ru.job4j.SearchTree;


import java.util.Iterator;

/**
 * Created by Comp on 23.10.2017.
 */
public class SearchTree<E extends Comparable<E>> implements Iterator {
    private Node node;
    private E key;

    private Node<E> left;
    private Node<E> right;
    private Node<E> parent;

    private int size = 0;

    public SearchTree(Node node, Node<E> left, Node<E> right) {
        this.node = node;
        this.left = left;
        this.right = right;
    }
    public int size() {
        return size;
    }

    public Node<E> add(E e) {
        if (e == null) {
            return null;
        } else if (left != null) {
            Node<E> p = right;
            while (p.left != null)
                p = p.left;
            return p;
        } else {
            Node<E> p = parent;
            Node<E> ch = node;
            while (p != null && ch == p.right) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
    }

    public Node<E> remove(E e) {

        return null;
    }

    public Node<E> get(E e) {

        return null;
    }

    private boolean searcNode(E e, Node data) {
        if (node == null) {
            return false;
        }
        return false;
    }

    public boolean contains(E e) {
        return node == null || searcNode(e, node);
    }

    @Override
    public boolean hasNext() {
        Node<E> elem = node;

        boolean isPresent = false;
        if (elem != null) {
            isPresent = true;
        }
        return isPresent;
    }

    @Override
    public E next() {
        Node<E> element;

        if (hasNext()) {
            element = node.getNextElement();
        } else throw new NullPointerException();
        return (E) element;
    }
}
