package ru.job4j.SimpleTreeBinary;

import ru.job4j.SimpleTree.Node;
import ru.job4j.SimpleTree.SimpleTree;

import java.util.*;


/**
 * Created by Comp on 03.10.2017.
 */
public class BinaryTree<E extends Comparable<E>> implements SimpleTree<E> {
    private Node<E> node;
    private int size;
    private Node child;
    private Node right;
    private Object root;

    public BinaryTree() {

    }

    public BinaryTree(E e) {
        node = new Node<E>(e);
    }

    public BinaryTree(String root, Comparator<Node<String>> comparator) {
    }

    private int size() {
        return size;
    }


    public Node getChildOf() {
        return child;
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
                findBy(parent).get().childen.add(node);
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

    public Object getRoot() {
        return root;
    }

    public List<ru.job4j.SimpleTreeBinary.Node<String>> getChildOf(Object root) {
        return null;
    }

    class ArrIterator implements Iterator<E> {
        E elem = node.value;
        Queue<Node<E>> data = new LinkedList<>();
        Optional<Node<E>> rsl = Optional.empty();

        @Override
        public boolean hasNext() {
            Node<E> el = data.poll();

            boolean isPresent = false;
            if (el != null) {
                rsl = Optional.of(el);
            }

            return isPresent;
        }

        @Override
        public E next() {
            if (hasNext()) {
                findBy(elem).get().getChilden().iterator();

            } else throw new NullPointerException();
            return elem;
        }
    }

    public boolean isBinary(Node<E> node) {
        boolean isBinaryTree = false;

        List<Node> child = getChildOf().getChilden();

        for (Node node1 : child) {
            if (node1.getChilden().size() > 2) {
                isBinaryTree = true;
            }
        }

        return isBinaryTree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinaryTree<?> that = (BinaryTree<?>) o;

        if (size != that.size) return false;
        return node != null ? node.equals(that.node) : that.node == null;
    }

    @Override
    public int hashCode() {
        int result = node != null ? node.hashCode() : 0;
        result = 31 * result + size;
        return result;
    }
}
