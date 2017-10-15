package ru.job4j.SimpleTree;

import java.util.*;

/**
 * Created by Comp on 03.10.2017.
 */
public class Tree<E extends Comparable<E>> implements SimpleTree<E> {
    Node<E> node;
    List<Node<E>> childen;
    List<Node<E>> parent;
    /*
     * метод add - Должен находить элемент parent в дереве по условию compare(node, parent) == 0 и добавлять
     * в него дочерний элемент. node.children.add(child); В дереве не могут быть дубликатов.
     * Итератор должен собрать все элементы в List и возвращать данные из скопированной коллекции.
     */

    @Override
    public boolean add(E parent, E child) {

        //node = new Node<E>(child);
        if (node.getValue().equals(parent) && parent.compareTo(child) == 0) {
            parent = (E) childen;
            return true;
        }

        return false;
    }

    /*
     * Добавить метод boolean isBinary().
     * Метод должен проверять количество дочерних элементов в дереве. Если их <= 2 - то дерево бинарное.
     * метод должен циклически пройти по всем элементам дерева.
     */
    public boolean isBinary() {
        List<Node<E>> r = childen;

        for (int i = 0; i < childen.size(); i++) {
            if (i <= 2) {
                return true;
            }
        }
        return false;
    }

    class ArrIterator implements Iterator<E> {
        List<Node<E>> e = childen;

        @Override
        public boolean hasNext() {
            if (e != null) {
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            Node<E> element = null;
            if (hasNext() == true) {

                element = node.nextElement;
            }
            return (E) element;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrIterator();
    }
}