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

    public Node(Node first, Node two, Node third, Node four) {
        this.first = first;
        this.two = two;
        this.third = third;
        this.four = four;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getTwo() {
        return two;
    }

    public void setTwo(Node two) {
        this.two = two;
    }

    public Node getThird() {
        return third;
    }

    public void setThird(Node third) {
        this.third = third;
    }

    public Node getFour() {
        return four;
    }

    public void setFour(Node four) {
        this.four = four;
    }

    public Node(T i) {
        this.value = i;
    }

    public boolean hasCycle(Node first) {
        if (first == null) {
            return false;
        }

        boolean hasCycle = value == first && first == two && two == third && third == four;

        if (first.next != null) {
            first = first.next;
            first.next = two.next;
            two.next = third.next;
            third.next = four.next;
            four.next = first;
        }

        return hasCycle;
    }
}
