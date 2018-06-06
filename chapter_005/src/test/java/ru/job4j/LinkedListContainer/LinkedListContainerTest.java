package ru.job4j.LinkedListContainer;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */
public class LinkedListContainerTest<E> {
    private LinkedListContainer<Integer> container;

    public LinkedListContainerTest(LinkedListContainer<Integer> container) {
        this.container = container;
    }

    @Test
    public void iteratorTest() {
        int index = 0;
        Integer expected = 4;
        container.add(4);

        assertThat(container.get(index), is(expected));
    }

    @Test
    public void iteratorTest2() {
        container.add(1);
        container.add(2);
        container.add(3);
        container.add(4);
        container.add(5);
        container.add(6);

        assertThat(container.iterator().hasNext(), is(true));
        assertThat(container.iterator().next(), is(1));
        assertThat(container.iterator().hasNext(), is(true));
        assertThat(container.iterator().next(), is(2));
        assertThat(container.iterator().hasNext(), is(true));
        assertThat(container.iterator().next(), is(3));
        assertThat(container.iterator().hasNext(), is(true));
        assertThat(container.iterator().next(), is(4));
        assertThat(container.iterator().hasNext(), is(true));
        assertThat(container.iterator().next(), is(5));
        assertThat(container.iterator().hasNext(), is(true));
        assertThat(container.iterator().next(), is(6));
        assertThat(container.iterator().hasNext(), is(false));
    }
}

