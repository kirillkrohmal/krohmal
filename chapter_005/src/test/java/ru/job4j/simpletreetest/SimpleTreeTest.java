package ru.job4j.simpletreetest;

import org.junit.Test;
import ru.job4j.simpletree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SimpleTreeTest {
    private Tree<Integer> tree = new Tree<>(50);

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

    @Test
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

        assertThat(tree.isBinary(), is(true));
    }

    @Test
    public void prepareTree2() {
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

        assertThat(tree.isBinary(), is(false));
    }

    @Test
    public void shouldReturnTrue() {
        tree.add(50, 70);
        tree.add(50, 80);
        tree.add(70, 90);
        tree.add(70, 100);
        tree.add(90, 110);
        tree.add(90, 120);
        tree.add(120, 200);
        tree.add(200, 250);
        tree.add(200, 270);

        assertThat(tree.isBinary(), is(true));
    }
}
