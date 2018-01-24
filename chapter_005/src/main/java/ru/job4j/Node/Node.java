package ru.job4j.Node;

/**
 * Created by Comp on 24.09.2017.
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    private Node first;
    private Node two;
    private Node third;
    private Node four;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node(Node first, Node two, Node third, Node four) {
        this.first = first;
        this.two = two;
        this.third = third;
        this.four = four;
    }

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

    public Node(T i) {
        this.value = i;
    }

    public boolean hasCycle(Node first) {
        if (first == null) {
            return false;
        }

        Node fast = first.next;
        Node slow = first;

        while (fast != null && fast.next != null && slow != null) {
            if (fast == slow) {
                return true;
            }

            fast = fast.next.next;
            slow = fast.next;
        }
        return false;
    }
}
