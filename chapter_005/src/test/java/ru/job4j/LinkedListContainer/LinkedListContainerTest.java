package ru.job4j.LinkedListContainer;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class LinkedListContainerTest<E> {

    private String result;

    @Test
    public void iteratorTest() {
        Object item = 5;
        int index = 5;
        LinkedListContainer listContainer = new LinkedListContainer();
        listContainer.add(item);
        Object expected = 5;
        assertThat(listContainer.get(index), is(expected));
    }

    @Test
    public void iteratorTest2() {
        Object item = 5;
        int index = 5;
        LinkedListContainer listContainer = new LinkedListContainer();
        listContainer.add(item);
        Object expected = 5;
        listContainer.get(index);
        assertThat(listContainer.get(index), is(expected));
    }
}
