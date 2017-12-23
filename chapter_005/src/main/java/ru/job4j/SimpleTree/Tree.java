package ru.job4j.SimpleTree;

import java.util.*;

/**
 * Created by Comp on 03.10.2017.
 */
public class Tree<E extends Comparable<E>> implements SimpleTree<E> {
    private Node<E> node;
    private int i;

    /*
     * метод add - Должен находить элемент parent в дереве по условию compare(node, parent) == 0 и добавлять
	 * в него дочерний элемент. node.children.add(child); В дереве не могут быть дубликатов.
	 * Итератор должен собрать все элементы в List и возвращать данные из скопированной коллекции.
	 */
    @Override
    public boolean add(E parent, E child) {
        boolean isPresent = false;
        if (parent == null && child == null) {
            return false;
        }

        if (compare(parent, child) == 0) {

            //node.childen.add(child);
            isPresent = true;
        }

        return isPresent;
    }


    private int compare(E first, E second) {

        List<Node<E>> list = new LinkedList<>();
        int element = 0;
        while (node.childen != null) {

            if (list.contains(first)) {
                element = 1;
            }
            if (!list.contains(first)) {
                element = -1;
            }
        }

        return element;
    }

    public boolean isDuplicate(Node<E> first) {
        boolean duplicate = false;
        for (Object o : node.childen) {
            if (o.equals(node.value)) {
                duplicate = true;
            }
        }
        return duplicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tree<?> tree = (Tree<?>) o;

        return i == tree.i && (node != null ? node.equals(tree.node) : tree.node == null);
    }

    @Override
    public int hashCode() {
        int result = node != null ? node.hashCode() : 0;
        result = 31 * result + i;
        return result;
    }

    @Override
    public Iterator<Node<E>> iterator() {
        return new ArrIterator();
    }

    public Optional<Object> findBy(E e) {

        return null;
    }

    class ArrIterator implements Iterator<Node<E>> {

        @Override
        public boolean hasNext() {

            E elem = node.value;
            int counter = 0;

            boolean isPresent = false;
            if (elem != null) {
                isPresent = true;
            }
            return isPresent;
        }

        @Override
        public Node<E> next() {
            node = iterator().next();
            Node<E> element = node;

            if (hasNext()) {
                return element;
            } else throw new NullPointerException();
        }
    }
}