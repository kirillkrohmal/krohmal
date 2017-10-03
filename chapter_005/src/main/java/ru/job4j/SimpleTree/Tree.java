package ru.job4j.SimpleTree;

import java.util.*;

/**
 * Created by Comp on 03.10.2017.
 */
class Tree<E extends Comparable<E>> implements SimpleTree<E> {
    class Node<E> {
        List<Node<E>> childen;
        E value;
    }
    /*
     * метод add - Должен находить элемент parent в дереве по условию compare(node, parent) == 0 и добавлять
     * в него дочерний элемент. node.children.add(child); В дереве не могут быть дубликатов.
     * Итератор должен собрать все элементы в List и возвращать данные из скопированной коллекции.
     */
    @Override
    public boolean add(E parent, E child) {

        TreeMap<E, E> treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object node, Object o2) {
                return compare(node, parent);
            }
        });

        return false;
    }


    /*
     * Добавить метод boolean isBinary().
     * Метод должен проверять количество дочерних элементов в дереве. Если их <= 2 - то дерево бинарное.
     * метод должен циклически пройти по всем элементам дерева.
     */
    public boolean isBinary() {
        return false;
    }




    @Override
    public Iterator<E> iterator() {
        return null;
    }
}