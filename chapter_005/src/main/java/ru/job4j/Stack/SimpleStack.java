package ru.job4j.Stack;

import ru.job4j.LinkedListContainer.LinkedListContainer;

import java.util.EmptyStackException;

/**
 * Created by Comp on 24.09.2017.
 */
public class SimpleStack<T> extends LinkedListContainer<T> {
    /**
     * Pushes an item onto the top of this stack. This has exactly
     * the same effect as: addElement(item)
     */
    public void push(T value) {
        add(value);
    }
    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return  The object at the top of this stack (the last item
     *          of the <tt>Vector</tt> object).
     * @throws  EmptyStackException  if this stack is empty.
     */
    public T pop() {
        T result = (T) get(size() - 1);
        remove(size() - 1);
        return result;
    }

    public T peek() {
        return get(size() - 1);
    }
}