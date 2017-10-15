package ru.job4j.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleStack<T> {
    Stack<T> ts = new Stack<>();
    T head;
    T tail;
    Node node;
    int top = 0;
    /**
     * Pushes an item onto the top of this stack. This has exactly
     * the same effect as: addElement(item)
     */
    public T push() {
        top = ts.size() - 1;
        if (top != 0) {
            ts.addElement(tail);
        }

        return null;
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
        top = ts.size() - 1;
        if (top != 0) {
            ts.remove(tail);
        }
    }
}