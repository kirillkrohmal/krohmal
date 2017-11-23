package ru.job4j.Stack;


/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleQueue<T> {
    Node<T> head;
    Node<T> tail;
    int size = 0;

    /**
     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    public T poll() {
        if (size == 0) {
            return null;
        }
        T obj = head.value;
        head = head.getNextElement();

        if (head == null) {
            tail = null;
        }
        size--;
        return obj;
    }

    /**
     * Retrieves, but does not remove, the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    public void push(T value) {
        Node<T> node = new Node<T>(value);
        if (node.value == null) {
            head = node;
        } else {
            tail.setNextElement(node);
        }
        tail = node;
        size++;
    }
}


