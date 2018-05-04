package ru.job4j.SearchTree;

import java.util.*;

/**
 * Created by Comp on 23.10.2017.
 */
public class SearchTree<E extends Comparable<E>> implements Iterable {
    private Node node;
    private Node<E> root;

    private int size = 0;

    public int size() {
        return size;
    }

    public void add(E key) {
        Node<E> x = root, y = null;

        while (x != null) {
            int cmp = key.compareTo(x.key);

            if (cmp == 0) {
                node.key = key;
                return;
            } else {
                y = x;
                if (cmp < 0) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
        }

        Node<E> newNode = new Node<E>(key);
        if (y == null) {
            root = newNode;
        } else {
            if (key.compareTo(y.key) < 0) {
                y.left = newNode;
            } else {
                y.right = newNode;
            }
        }
    }

    public void remove(E key) {
        Node<E> x = root, y = null;

        while (key != null) {
            int cmp = key.compareTo(x.key);

            if (cmp == 0) {
                break;
            } else {
                y = x;
                if (cmp < 0) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
        }

        if (x == null) {
            return;
        }

        if (x.right == null) {
            if (y == null) {
                root = x.left;
            } else {
                if (x == y.left) {
                    y.left = x.left;
                } else {
                    y.right = x.left;
                }
            }
        } else {
            Node<E> leftMost = x.right;

            y = null;

            while (leftMost.left != null) {
                y = leftMost;
                leftMost = leftMost.left;
            }

            if (y != null) {
                y.left = leftMost.right;
            } else {
                x.right = leftMost.right;
            }
            x.key = leftMost.key;
        }
    }

    public E containsKey(E key) {
        Node<E> node = root;
        while (key != null) {
            int cmp = key.compareTo(node.key);

            if (cmp == 0) {
                return node.key;
            }
            if (cmp < 0) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return null;
    }

    class TreeIterator implements Iterator<E> {
        Queue<Node<E>> nodes = new LinkedList<Node<E>>(Arrays.asList(root));

        @Override
        public boolean hasNext() {
            return !nodes.isEmpty();
        }

        @Override
        public E next() {
            Node<E> element = nodes.poll();
            if (hasNext()) {
                if (element.left != null) {
                    nodes.offer(element.left);
                }
                if (element.right != null) {
                    nodes.offer(element.right);
                }
            }
            return element.getKey();
        }
    }

    @Override
    public Iterator iterator() {
        return new TreeIterator();
    }
}
