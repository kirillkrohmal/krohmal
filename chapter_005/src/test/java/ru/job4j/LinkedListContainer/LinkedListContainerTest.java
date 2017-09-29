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
        E[] item = null;
        //LinkedListContainer listContainer = new LinkedListContainer();
        E[] expected = null;
        //listContainer.add(item);
        //result = listContainer.add(item);
        assertThat(result, is(expected));
    }
}
