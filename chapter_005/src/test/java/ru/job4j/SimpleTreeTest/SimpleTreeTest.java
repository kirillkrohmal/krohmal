package ru.job4j.SimpleTreeTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.SimpleTree.SimpleTree;
import ru.job4j.SimpleTree.*;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleTreeTest<E> {

    @Test
    public void iteratorTest() {

        Node<String> parent = new Node<>("A");

        Tree<String> underTest = new Tree<>(parent);

        Node<String> childOne = new Node<>("B");
        Node<String> childTwo = new Node<>("C");
        Node<String> childThree = new Node<>("D");

        underTest.add(parent, childOne);
        underTest.add(parent, childTwo);
        underTest.add(parent, childThree);

        underTest.add(childOne, new Node<>("E"));
        underTest.add(childOne, new Node<>("F"));
        underTest.add(childTwo, new Node<>("G"));
        underTest.add(childThree, new Node<>("H"));

        Iterator<Node<String>> iter = underTest.iterator ();

        String result = "";
        while (iter.hasNext()) {
            result = result + iter.next().getValue();
        }
        assertThat(result, is("EFBGCHDA"));
    }

    @Before
    public void iteratorTest2() {

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
      /*  Iterator<Iterator<Iterator<Integer>>> iterator = (Iterator<Iterator<Iterator<Integer>>>) tree;
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
        assertThat(iterator.hasNext(), is(false));*/
    }
}
