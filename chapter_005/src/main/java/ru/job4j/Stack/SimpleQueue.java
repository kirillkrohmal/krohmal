package ru.job4j.Stack;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleQueue<T> {
    Queue<T> ts = new ArrayDeque<>();
    Node<T> head;
    Node<T> tail;
    Node node;
    /**
     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    public T poll() {
        if (this.head == null) {
            node = head.getNextElement();
            return (T) this.node;
        }
        if (this.head != null) {
            node = head.getNextElement();
            ts.remove(node);
        }

        return (T) node;
    }
    /**
     * Retrieves, but does not remove, the head of this queue,
     * or returns {@code null} if this queue is empty.
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    public void peek(T value) {
        if (this.head == null) {
            node = head.getNextElement();
            //return (T) this.node.value;
        }
        if (this.head != null) {
            node = head.getNextElement();
        }
    }
}

