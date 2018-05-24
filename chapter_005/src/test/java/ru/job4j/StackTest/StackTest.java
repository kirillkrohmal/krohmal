package ru.job4j.StackTest;


import org.junit.Test;
import ru.job4j.Stack.SimpleQueue;
import ru.job4j.Stack.SimpleStack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 23.10.2017.
 */
public class StackTest {
    private SimpleQueue simpleQueue;
    private SimpleStack simpleStack;

    private Object result;
    private Object expected;

    @Test
    public void iteratorTest2() {
        simpleStack = new SimpleStack();
        simpleStack.push(1);
        simpleStack.push(2);
    }

    @Test
    public void iteratorTest3() {
        simpleStack = new SimpleStack();
        assertThat(simpleStack.peek(), is(2));
    }

    @Test
    public void iteratorTest4() {
        simpleStack = new SimpleStack();
        simpleStack.push(1);
        simpleStack.push(2);
        simpleStack.pop();
        simpleStack.pop();
        result = simpleStack.pop();
        expected = null;

        assertThat(result, is(expected));
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
