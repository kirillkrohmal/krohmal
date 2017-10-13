package ru.job4j.LinkedListContainer;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 21.09.2017.
 */

public class LinkedListContainerTest<E> {

    private String result;
    LinkedListContainer<Integer> container;


    @Before
    public void iteratorTest5() {
        container = new LinkedListContainer();

        container.add(1);
        container.add(2);
        container.add(3);
        container.add(4);
        container.add(5);
        container.add(6);
    }

    @Test
    public void iteratorTest6() {

        Iterator<Integer> iterator = container.iterator();
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(1) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(2) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(3) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(4) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(5) );
        assertThat(iterator.hasNext(), is(true) );
        assertThat(iterator.next(), is(6) );
        assertThat(iterator.hasNext(), is( false) );

    }
}
