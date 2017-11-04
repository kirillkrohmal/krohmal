package ru.job4j.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleStack<T> {
    Stack<T> ts = new Stack<>();
    Node<T> head;
    Node<T> tail;
    Node node;
    int top = 0;
    int size = 0;

    /**
     * Pushes an item onto the top of this stack. This has exactly
     * the same effect as: addElement(item)
     */
    public T push() {
        T obj = head.value;
        top = size - 1;
        if (top != 0) {
            head.setNextElement(node);
        }
        size++;
        return obj;
    }
    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return  The object at the top of this stack (the last item
     *          of the <tt>Vector</tt> object).
     * @throws  EmptyStackException  if this stack is empty.
     */
    public void pop(T value) {
        ts.addElement(value);
        top = ts.size() - 1;
        if (top != 0) {
            ts.remove(tail);
        }
        size--;
    }
}