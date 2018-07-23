package ru.job4j.TestTask;

import ru.job4j.Stack.Node;

/**
 * Created by Comp on 27.05.2018.
 */
public class TestTask2 {
    public boolean showAlgorithm(String[] word, String[] word1, String[] word2) {

        String temp;
        for (int i = 0; i < word.length; i++) {
            for (int j = 1; j < word1.length; j++) {

                temp = word2[j-1];
                word2[j-1] = word2[j];
                word2[j] = temp;
            }
        }
        return false;
    }
}

/*
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     * @return the head of this queue, or {@code null} if this queue is empty

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


     * Retrieves, but does not remove, the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty

    public void push(T value) {
        Node<T> node = new Node<T>(value);

        if (node.value == null) {
            head = node;
        } else {
            tail.setNextElement(node);
        }
        tail = node;
        size++;
*/
