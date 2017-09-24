package ru.job4j.Node;

/**
 * Created by Comp on 24.09.2017.
 */
public class Node<T> {
    T value;
    Node<T> next;

    Node first = new Node(1);
    Node two = new Node(2);
    Node third = new Node(3);
    Node four = new Node(4);

    public Node(int i) {
    }

    /*first.next = two;
    two.next = third;
    third.next = four;
    four.next = first;*/
}
