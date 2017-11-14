package ru.job4j.SimpleTreeBinary;

import ru.job4j.SimpleTree.Node;
import ru.job4j.SimpleTree.SimpleTree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Comp on 03.10.2017.
 */
public class BinaryTree<E extends Comparable<E>> implements SimpleTree<E> {
    public Node<E> node;

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

    int compare(Node<E> o1, Node<E> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }

    /*
     * Добавить метод boolean isBinary().
     * Метод должен проверять количество дочерних элементов в дереве. Если их <= 2 - то дерево бинарное.
     * метод должен циклически пройти по всем элементам дерева.
     */
    public boolean isBinary() {
        List<Node<E>> r;


        return false;
    }

    @Override
    public Iterator<Node<E>> iterator() {
        return null;
    }

    class ArrIterator implements Iterator<E> {


        @Override
        public boolean hasNext() {

            return false;
        }

        @Override
        public E next() {
            Node<E> element = null;

            return (E) element;
        }
    }


}