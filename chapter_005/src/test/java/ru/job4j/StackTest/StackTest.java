package ru.job4j.StackTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.LinkedListContainer.LinkedListContainer;
import ru.job4j.Stack.SimpleQueue;
import ru.job4j.Stack.SimpleStack;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 23.10.2017.
 */
public class StackTest {
    SimpleQueue simpleQueue;
    SimpleStack simpleStack;

    @Test
    public void iteratorTest() {
        simpleQueue = new SimpleQueue();
        simpleQueue.poll();
        //assertThat(container.get(index), is(expected));
    }

    @Test
    public void iteratorTest2() {
        Object value = null;
        simpleQueue = new SimpleQueue();
        simpleQueue.push(value);
    }

    @Test
    public void iteratorTest3() {
        Object value = null;
        simpleStack = new SimpleStack();
        simpleStack.pop(value);
        //assertThat(container.get(index), is(expected));
    }

    @Test
    public void iteratorTest4() {
        Object value = null;
        simpleStack = new SimpleStack();
        simpleStack.push();
    }
}
