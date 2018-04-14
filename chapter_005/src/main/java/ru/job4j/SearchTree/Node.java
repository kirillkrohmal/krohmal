package ru.job4j.SearchTree;


/**
 * Created by Comp on 29.09.2017.
 */
public class Node<E> {
    E value, key;
    Node<E> left, right;

    public Node() {
    }

    public Node(Node<E> left, Node<E> right) {
        this.left = left;
        this.right = right;
    }

    public Node(E value, E key) {
        this.value = value;
        this.key = key;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        if (value != null ? !value.equals(node.value) : node.value != null) return false;
        if (key != null ? !key.equals(node.key) : node.key != null) return false;
        if (left != null ? !left.equals(node.left) : node.left != null) return false;
        return right != null ? right.equals(node.right) : node.right == null;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
