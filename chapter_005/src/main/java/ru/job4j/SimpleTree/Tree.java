package ru.job4j.SimpleTree;

import java.util.*;

/**
 * Created by Comp on 03.10.2017.
 */
public class Tree<E extends Comparable<E>> implements SimpleTree<E> {
    private Node<E> node;

    public Tree(Node<E> parent) {
    }
    // TreeSet treeSet;

    /*
     * метод add - Должен находить элемент parent в дереве по условию compare(node, parent) == 0 и добавлять
     * в него дочерний элемент. node.children.add(child); В дереве не могут быть дубликатов.
     * Итератор должен собрать все элементы в List и возвращать данные из скопированной коллекции.
     */
    @Override
    public boolean add(Node<E> parent, Node<E> child) {
        if (compare(parent, node) == 0) {
            node.childen.add(child);
        }

        return false;
    }

    private int compare(Node<E> first, Node<E> second) {
        return compare(first, second);
    }

    @Override
    public Iterator<Node<E>> iterator() {
        return new ArrIterator();
    }

    class ArrIterator implements Iterator<Node<E>> {

        Iterator<Node<E>> iterator = node.childen.iterator();


        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Node<E> next() {
            return null;
        }
    }


}