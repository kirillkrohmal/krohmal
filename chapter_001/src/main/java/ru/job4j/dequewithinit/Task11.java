package ru.job4j.dequewithinit;

import java.util.Deque;
import java.util.LinkedList;

public class Task11 {
    Deque deque = new LinkedList<Integer>();

    public void init() {
        deque.add(3);
        deque.add(2);
        deque.add(1);
    }
}
