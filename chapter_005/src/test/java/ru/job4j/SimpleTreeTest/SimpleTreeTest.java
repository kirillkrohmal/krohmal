package ru.job4j.SimpleTreeTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.SimpleTree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleTreeTest {

    Tree<Integer> tree = new Tree<>(50);

    @Test
    public void iteratorTest() {
        List<Integer> expected = Arrays.asList(50, 60, 70, 10, 5, 80, 100, 150);
        List<Integer> result = new ArrayList<>();

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

    @Before
    public void prepareTree() {
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
    }

    @Test
    public void iteratorTest3() {
        boolean expected = tree.isBinary();
        assertThat(expected, is(false));
    }

    @Before
    public void prepareTree2() {
        Tree<Integer> tree = new Tree<>(50);
        tree.add(50, 70);
        tree.add(50, 80);
        tree.add(70, 90);
        tree.add(70, 100);
        tree.add(90, 110);
        tree.add(90, 120);
        tree.add(100, 180);
        tree.add(100, 190);
        tree.add(100, 290);
        tree.add(180, 200);
        tree.add(180, 210);
        tree.add(190, 211);
        tree.add(190, 215);
        tree.add(190, 217);
    }

    @Test
    public void iteratorTest2() {
        boolean expected = tree.isBinary();
        assertThat(expected, is(false));
    }
}
