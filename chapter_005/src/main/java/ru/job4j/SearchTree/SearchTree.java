package ru.job4j.SearchTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        Node<E> elem = root;

        @Override
        public boolean hasNext() {
            boolean isPresent = false;
            if (elem != null) {
                isPresent = true;
            }
            return isPresent;
        }

        @Override
        public E next() {
            Queue<E> element = new LinkedList<E>();
            element.add(root.key);

            if (hasNext()) {
                element.poll();
                if(node.left != null) {
                    elem = root.left;
                    element.poll();
                }
                if(node.right != null) {
                    elem = root.right;
                    element.poll();
                }
            }

            else throw new NullPointerException();

            return elem.key;
        }
    }

    @Override
    public Iterator iterator() {
        return new TreeIterator();
    }
}
