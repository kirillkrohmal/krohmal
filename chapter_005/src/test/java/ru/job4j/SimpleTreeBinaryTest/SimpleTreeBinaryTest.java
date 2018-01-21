package ru.job4j.SimpleTreeBinaryTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.SimpleTree.Tree;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleTreeBinaryTest<E> {
    String parent = "A";
    Tree<String> underTest = new Tree<>(parent);
    String childOne = "B";
    String childTwo = "C";
    String childThree = "D";

    @Test
    public void iteratorTest() {
        underTest.add(parent, childOne);
        underTest.add(parent, childTwo);
        underTest.add(parent, childThree);

        underTest.add(childOne, "E");
        underTest.add(childOne, "F");
        underTest.add(childTwo, "G");
        underTest.add(childThree, "H");

        Iterator<String> iter = underTest.iterator ();

        String result = "";
        while (iter.hasNext()) {
            result = result + iter.next();
        }
        assertThat(result, is("EFBGCHDA"));
    }

    @Before
    public void iteratorTest2() {
        underTest.add(parent, childOne);
        underTest.add(parent, childTwo);
        underTest.add(parent, childThree);

    }

    @Test
    public void iteratorTest3() {
        Iterator<Iterator<Iterator<Integer>>> iterator = (Iterator<Iterator<Iterator<Integer>>>) underTest;
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
