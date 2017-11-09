package ru.job4j.Node;

import java.util.LinkedList;

/**
 * Created by Comp on 24.09.2017.
 */
public class Node<T> {
    T value;
    Node<T> next;

    Node first;
    Node two;
    Node third;
    Node four;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(Node first, Node two, Node third, Node four) {
        this.first = first;
        this.two = two;
        this.third = third;
        this.four = four;
    }

    public Node(T i) {
        this.value = i;
    }

    public boolean hasCycle(Node first) {
        if (first == null) {
            return false;
        }

        Node head = first;
        Node tail = first;

        while (head == null && tail == null) {
            head = head.next;
            tail = tail.next.next;

            if (head == null && tail == null) {
                return false;
            }

            if (head == tail) {
                return false;
            }
        }
        return false;
    }
}
