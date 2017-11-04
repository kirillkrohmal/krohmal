package ru.job4j.Node;

import java.util.LinkedList;

/**
 * Created by Comp on 24.09.2017.
 */
public class Node<T> {
    T value;
    Node<T> next;
    Node head;
    LinkedList linkedList = new LinkedList();

    Node first;
    Node two;
    Node third;
    Node four;

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
        if (next == null) {
            return false;
        }

        boolean hasCycle = value == first.next && first == two.next && two == third.next && third == four.first;

        while (first.two.third != null)
        if (hasCycle == true) {
            return hasCycle;
        } else {
            hasCycle = false;
        }
        return hasCycle;
    }
}
