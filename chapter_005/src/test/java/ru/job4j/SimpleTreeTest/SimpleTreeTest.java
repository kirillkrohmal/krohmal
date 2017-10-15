package ru.job4j.SimpleTreeTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.SimpleTree.SimpleTree;
import ru.job4j.SimpleTree.*;


import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleTreeTest<E> {

    SimpleTree tree = new Tree();
    @Test
    public void iteratorTest() {
        tree = new Tree();
        Object e = null;
        //boolean result = tree.add();
        Object expected = null;
        //assertThat(result, is(true));
    }

    @Before
    public void iteratorTest2() {
        tree = new Tree();

     /*   tree.add();
        tree.add();
        tree.add();
        tree.add();
        tree.add();
        tree.add();
        tree.add();
        tree.add();*/
    }

    @Test
    public void iteratorTest3() {
        Iterator<Iterator<Iterator<Integer>>> iterator = (Iterator<Iterator<Iterator<Integer>>>) tree;
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(1));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(2));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(3));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(4));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(5));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(6));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(7));
        assertThat(iterator.hasNext(), is(true));
        assertThat(iterator.next(), is(8));
        assertThat(iterator.hasNext(), is(false));
    }
}
