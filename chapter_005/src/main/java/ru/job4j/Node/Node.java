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

        Node fast = first.next.next;
        /*Node fast2 = two.next.next.next;
        Node fast3 = third.next.next;
        Node fast4 = four.next;*/
        Node slow = first;

        while (fast != null && fast.next != null && slow != null) {
            if (fast == slow) {
                return true;
            }

            fast = fast.next.next;
            //fast2 = fast.next;
            //fast3 = fast;

            slow = slow.next;
        }
        return false;
    }
}
