package ru.job4j.SimpleTreeBinary;

import ru.job4j.SimpleTree.Node;

/**
 * Created by Comp on 03.10.2017.
 */
public interface SimpleTree<E extends Comparable<E>> extends Iterable<E> {
    /**
     * Добавить элемент child в parent.
     * Parent может иметь список child.
     * @param parent parent.
     * @param child child.
     * @return
     */
    boolean add(Node<E> parent, Node<E> child);
}

