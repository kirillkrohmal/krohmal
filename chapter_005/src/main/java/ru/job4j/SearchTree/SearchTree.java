package ru.job4j.SearchTree;


import java.util.Iterator;

/**
 * Created by Comp on 23.10.2017.
 */
public class SearchTree<E extends Comparable<E>> implements Iterator {
    private Node left;
    private Node right;

    private Node node;
    private int size = 0;

    public SearchTree(Node<E> left, Node<E> right) {
        this.left = left;
        this.right = right;
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        node = add(e, node);
    }

    public Node<E> add(E e, Node<E> node) {
        if (node == null) {
            if (left == null) {
                left = new Node<E>(node.value);
            } else if (right == null) {
                right = new Node<E>(node.value);
            }
        }
        if (node != null) {

        }

        return node;
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
        return false;
    }

    @Override
    public Object next() {
        int result = 0;

        return null;
    }
}
