package ru.job4j.SimpleTreeBinary;

import ru.job4j.SimpleTree.Node;
import ru.job4j.SimpleTree.SimpleTree;

import java.util.*;


/**
 * Created by Comp on 03.10.2017.
 */
public class BinaryTree<E extends Comparable<E>> implements SimpleTree<E> {
    private Node<E> node;
    private int i;


    public BinaryTree(Node<E> node) {
        this.node = node;
    }

    public BinaryTree(E i) {

    }

    public BinaryTree(int i) {
    }

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

        if (isDuplicate(parent) && compare(parent, child) == 0) {
            node.childen.add((Node<E>) node.value);
            isPresent = true;
        }

        return isPresent;
    }

    public boolean isBinary() {
        List<Node<E>> r = new LinkedList<>();
        boolean isBinaryTree = false;

        for (int i = 0; i < r.size(); i++) {
            if (node.childen.equals(i)) {
                isBinaryTree = true;
            }
        }

        return isBinaryTree;
    }

    @Override
    public Optional<Node<E>> findBy(E value) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.node);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.eqValue(value)) {
                rsl = Optional.of(el);
                break;
            }
            for (Node<E> child : el.getChilden()) {
                data.offer(child);
            }
        }
        return rsl;
    }

    private int compare(E first, E second) {
        List<Node<E>> list = new LinkedList<>();
        int element = 0;
        while (node.childen != null) {
            if (list.contains(first)) {
                element = 1;
            }
            if (!list.contains(second)) {
                element = 1;
            }
        }

        return element;
    }

    public boolean isDuplicate(E first) {
        boolean duplicate = false;

        if (findBy(first) != null) {
            duplicate = true;

        }
        return duplicate;
    }

    @Override
    public Iterator<E> iterator() {
        return new BinaryTree.ArrIterator();
    }

    class ArrIterator implements Iterator<E> {

        @Override
        public boolean hasNext() {
            E elem = node.value;

            boolean isPresent = false;
            if (elem != null) {
                isPresent = true;
            }
            return isPresent;
        }

        @Override
        public E next() {
            List<E> element = null;

            if (hasNext()) {
                element.add(node.value);

            } else throw new NullPointerException();
            return (E) element;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinaryTree<?> that = (BinaryTree<?>) o;

        if (i != that.i) return false;
        return node != null ? node.equals(that.node) : that.node == null;
    }

    @Override
    public int hashCode() {
        int result = node != null ? node.hashCode() : 0;
        result = 31 * result + i;
        return result;
    }
}
