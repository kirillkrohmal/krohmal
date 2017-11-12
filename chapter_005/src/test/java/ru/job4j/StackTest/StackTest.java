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
    public void iteratorTest2() {
        simpleStack = new SimpleStack();
        simpleStack.push(1);
        simpleStack.push(2);
    }

    @Test
    public void iteratorTest3() {
        assertThat(simpleStack.peek(), is(2));
    }

    @Test
    public void iteratorTest4() {
        assertThat(simpleStack.pop(), is(0));
    }

    @Test
    public void iteratorTest5() {
        simpleQueue = new SimpleQueue();
        simpleQueue.push(1);
        simpleQueue.push(2);
    }

    @Test
    public void iteratorTest6() {
        assertThat(simpleQueue.poll(), is(2));
    }
}
