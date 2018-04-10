package ru.job4j.SearchTree;


import java.util.Iterator;

/**
 * Created by Comp on 23.10.2017.
 */
public class SearchTree<E extends Comparable<E>> implements Iterator {
    private Node line;

    private Node node;
    private int size = 0;

    public SearchTree(Node<E> line) {
        this.line = line;
    }

    public int size() {
        return size;
    }

    public Node<E> add(E e) {
        if (e == null) {
            return null;
        } else if (line.left != null) {
            Node<E> p = line.right;
            while (p.left != null)
                p = p.left;
            return p;
        } else {
            Node<E> p = line.parent;
            Node<E> ch = line;
            while (p != null && ch == p.right) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
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
