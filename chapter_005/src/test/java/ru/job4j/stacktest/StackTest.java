package ru.job4j.stacktest;

import org.junit.Test;
import ru.job4j.stack.SimpleQueue;
import ru.job4j.stack.SimpleStack;

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
    public void iteratorTest() {
        simpleStack = new SimpleStack();

        simpleStack.push(1);
        simpleStack.push(2);
    }


    @Test
    public void iteratorTest3() {
        simpleStack = new SimpleStack();

        simpleStack.push(1);
        simpleStack.push(2);
        simpleStack.pop();
        simpleStack.pop();
        result = simpleStack.pop();
        expected = null;

        assertThat(result, is(expected));
    }
}
