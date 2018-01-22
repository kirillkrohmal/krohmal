package ru.job4j.SimpleTreeTest;

import org.junit.Test;
import ru.job4j.SimpleTree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class SimpleTreeTest<E> {
   /* String parent = "A";
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

        Iterator<String> iter = underTest.iterator();

        String result = "";
        while (iter.hasNext()) {
            result = result + iter.next();
        }
        assertThat(result, is("EFBGCHDA"));
    }*/

    @Test
    public void iteratorTest3() {
        List<Integer> expected = Arrays.asList(50, 60, 70, 10, 5, 80, 100, 150);
        List<Integer> result = new ArrayList<>();

        Tree<Integer> tree = new Tree<>(50);

        tree.add(50, 60);
        tree.add(50, 70);
        tree.add(60, 10);
        tree.add(60, 5);
        tree.add(60, 70);
        tree.add(70, 80);
        tree.add(70, 100);
        tree.add(100, 150);
        tree.add(100, 10);
        tree.add(50, 150);
        tree.add(100, 10);

        tree.forEach(result::add);

        assertThat(result, containsInAnyOrder(expected.toArray()));
    }
/*
    @Before
    public void iteratorTest2() {
        underTest.add(parent, childOne);
        underTest.add(parent, childTwo);
        underTest.add(parent, childThree);

    }

    @Test
    public void iteratorTest4() {
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
    }*/
}
