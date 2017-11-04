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
    private Class<? extends Object> expected;

    @Test
    public void iteratorTest() {
        simpleQueue = new SimpleQueue();
        Object expected = null;
        assertThat(simpleQueue.poll(), is(expected));
    }

    @Test
    public void iteratorTest2() {
        Object value = new Integer(7);
        simpleQueue = new SimpleQueue();
        simpleQueue.push(value);
        Object expected = value;
        assertThat(value, is(expected));
    }

    @Test
    public void iteratorTest3() {
        Object value = null;
        simpleStack = new SimpleStack();
        simpleStack.pop(value);
        Object expected = null;
        assertThat(value, is(expected));
    }

    @Test
    public void iteratorTest4() {
        Object value = null;
        simpleStack = new SimpleStack();
        Object expected = value;
        assertThat(simpleStack.push(), is(expected));
    }
}
