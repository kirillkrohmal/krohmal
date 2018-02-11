package ru.job4j.SimpleTree;

import java.util.*;

/**
 * Created by Comp on 03.10.2017.
 */
public class Tree<E extends Comparable<E>> implements SimpleTree<E> {
    private Node<E> node;
    private int size;

    public Tree(E e) {
        node.value = e;
    }

    private int size() {
        return size;
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

        if (findBy(parent).isPresent()) {
            if (!findBy(child).isPresent()) {
                Node<E> node = new Node<E>(child);
                node.getValue();
                findBy(parent).get();

            }
            isPresent = true;
            size++;

        } else {
            isPresent = false;
        }
        return isPresent;
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

    @Override
    public Iterator<E> iterator() {
        return new ArrIterator();
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
                element = (List<E>) element.iterator().next();

            } else throw new NullPointerException();
            return (E) element;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tree<?> tree = (Tree<?>) o;

        if (size != tree.size) return false;
        return node != null ? node.equals(tree.node) : tree.node == null;
    }

    @Override
    public int hashCode() {
        int result = node != null ? node.hashCode() : 0;
        result = 31 * result + size;
        return result;
    }
}